package parser;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class ZoneParser implements Parser<Zone> {

	/*
	 * CONSTANTES
	 */
	public static final int LIGNE_NB_SOMMETS = 1;
	public static final int LIGNE_VAL_INFINI = 2;
	public static final int LIGNE_SOMMET_DEPART = 3;

	/*
	 * VARIABLES
	 */
	private int ligne = 1;
	private Pattern pattern;
	private Matcher matcher;

	/*
	 * (non-Javadoc)
	 * @see parser.Parser#parse(java.lang.String)
	 */
	@Override
	public Zone parse(String filename) {

		Zone zone = new Zone();
		try {

			BufferedReader br = new BufferedReader(new FileReader(filename));
			String strLine;
			int rues = 0; // Compteur
			// Read File Line By Line
			while (!(strLine = br.readLine()).equalsIgnoreCase("$")
					|| (strLine = br.readLine()) != null) {
				// Print the content on the console
				if (ligne == LIGNE_NB_SOMMETS) {
					zone.setNbSommets(Integer.parseInt(strLine));
					System.out.println(zone.getNbSommets());
					ligne++;
				} else if (ligne == LIGNE_VAL_INFINI) {
					zone.setValPourInfini(Integer.parseInt(strLine));
					System.out.println(zone.getValPourInfini());
					ligne++;
				} else if (ligne == LIGNE_SOMMET_DEPART) {
					zone.setSommetDepart(Integer.parseInt(strLine));
					System.out.println(zone.getSommetDepart());
					ligne++;
				} else {

					this.pattern = Pattern.compile("(.*)\\t(.*)\\t(.*)");
					matcher = pattern.matcher(strLine);
					matcher.find();
					Chemin chemin = new Chemin(
							Integer.valueOf(matcher.group(1)),
							Integer.valueOf(matcher.group(2)),
							Integer.valueOf(matcher.group(3)));
					zone.setChemins(chemin);
					System.out
							.println(zone.getListeChemins().get(rues).pointSource
									+ "\t"
									+ zone.getListeChemins().get(rues).pointArrivee
									+ "\t"
									+ zone.getListeChemins().get(rues).poids);
					ligne++;
					rues++;
				}
			}
			// Close the input stream
			br.close();
		} catch (Exception e) {// Catch exception if any
			System.err.println("Error: " + e.getMessage());
		} 

		return zone;
	}
}
