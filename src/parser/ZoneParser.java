package parser;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;


public class ZoneParser implements Parser<Chemin> {

	/*
	 * CONSTANTES
	 */
	public static final int LIGNE_NB_SOMMETS = 1; 
	public static final int LIGNE_VAL_INFINI = 2;
	public static final int LIGNE_SOMMET_DEPART = 3;
	
	/*
	 * VARIABLES
	 */
	private int ligne = 0;
	
	/*
	 * (non-Javadoc)
	 * @see parser.Parser#parse(java.lang.String)
	 */
	@SuppressWarnings("null")
	@Override
	public Chemin parse(String filename) {
			
		BufferedReader in = null;
		try{

		    @SuppressWarnings("resource")
			BufferedReader br = new BufferedReader(new FileReader(filename));
		    String strLine;
		    //Read File Line By Line
		    ligne = 1;
		    while ((strLine = br.readLine()) != null)   {
		    	// Print the content on the console
		    	System.out.println (strLine);
		    }
			//Close the input stream
			in.close();
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
