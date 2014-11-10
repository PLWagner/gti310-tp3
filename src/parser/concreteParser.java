package parser;

import java.io.BufferedReader;
import java.io.FileReader;


public class concreteParser implements Parser {


		@Override
		public Object parse(String filename) {
			try{

			    BufferedReader br = new BufferedReader(new FileReader(filename));
			    String strLine;
			    //Read File Line By Line
			    while ((strLine = br.readLine()) != null)   {
			      // Print the content on the console
			      System.out.println (strLine);
			    }
			    //Close the input stream
			    in.close();
			    }catch (Exception e){//Catch exception if any
			      System.err.println("Error: " + e.getMessage());
			    }finally{
			     in.close();
			    }
			return null;
		}
}
