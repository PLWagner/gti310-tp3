package parser;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
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
	private Pattern monPatObj;
	private Matcher monMatch;
	private String pattern,sType;
	private String[] chaineFinal;
	private int numSeq;
	private boolean valide;
	
	/*
	 * (non-Javadoc)
	 * @see parser.Parser#parse(java.lang.String)
	 */
	@SuppressWarnings("null")
	@Override
	public Zone parse(String filename) {
		
		Zone zone = new Zone();
		BufferedReader in = null;

		
		try{

		    @SuppressWarnings("resource")
			BufferedReader br = new BufferedReader(new FileReader(filename));
		    String strLine;
		    //Read File Line By Line
		    while (!(strLine = br.readLine()).equalsIgnoreCase("$") || (strLine = br.readLine()) != null)   {
		    	// Print the content on the console
		    	if (ligne == LIGNE_NB_SOMMETS){
		    		zone.setNbSommets(Integer.parseInt(strLine));
		    	   	System.out.println (zone.getNbSommets());
		    	   	ligne++;
		    	}
		    	else if (ligne == LIGNE_VAL_INFINI) {
		    		zone.setValPourInfini(Integer.parseInt(strLine));
		    	   	System.out.println (zone.getValPourInfini());
		    	   	ligne++;
				}
		    	else if (ligne == LIGNE_SOMMET_DEPART) {
		    		zone.setSommetDepart(Integer.parseInt(strLine));
		    	   	System.out.println (zone.getSommetDepart());
		    	   	ligne++;
				}	
		    	else{
		    		
		    		/**
		    		 * Each () = one pattern
		    		 * + = multiple , \\W = non word character , \\w = word character , \\s = white space , \\d = digit  */
		    		this.pattern = "(\\d+\\s+)<(.*)>(\\s+\\d+)(\\s+\\d+)(\\s+\\d+)((\\s+\\d+)|(\\s+))";
		    		this.monPatObj = Pattern.compile(pattern);
		    		
		    		monMatch = this.monPatObj.matcher(strLine);

		    		if (monMatch.find( )) {
		    			for(int i =1; i<monMatch.group().trim().split(" ").length-1; i++){
		    				chaineFinal[i] = monMatch.group(i+2).trim();
		    			}
		    			numSeq=Integer.parseInt(monMatch.group(1).trim());

		    		}else
		    			valide = false;
		    		
		    	}
		    }
			//Close the input stream
			br.close();
		}catch (Exception e){//Catch exception if any
			System.err.println("Error: " + e.getMessage());
		}finally{
			     try {
					in.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			    }
			return null;
		}
}
