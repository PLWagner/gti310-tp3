
package writer;
import parser.Chemin;

import java.io.*;
import java.util.List;

public class ConcreteWriter implements Writer<List<List<Chemin>>> {

	
	public void write(String filename, List<List<Chemin>> output) {
		
        try {
        BufferedWriter out = new BufferedWriter(new FileWriter(filename));
		//BufferedReader br = new BufferedReader(new FileReader((String) output)); //TODO

		
		for (int i = 0; i < output.size(); i++) {
			for (int j = 0; j < output.size(); j++) {
				out.write(output.get(i).get(j) + " "); //TODO output.getQqch()
			}
			System.out.println("\n");

		}
		out.close();
        } catch (IOException e) {}


		
	}

}

