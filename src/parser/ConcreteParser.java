package parser;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;


public class ConcreteParser implements Parser<E> {


		@SuppressWarnings("null")
		@Override
		public E parse(String filename) {
			
			BufferedReader in = null;
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
