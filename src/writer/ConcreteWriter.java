
package writer;
import parser.Chemin;

import java.io.*;
import java.util.List;

public class ConcreteWriter implements Writer<List<List<Chemin>>> {

	
	public void write(String filename, List<List<Chemin>> output) {
		
        try {
        BufferedWriter out = new BufferedWriter(new FileWriter(filename));

        String newStr = null;
		System.out.println("output.size() = " + output.size());
		for (int i = 0; i < output.size(); i++) {
			for (int j = 0; j < output.get(i).size(); j++) {
				newStr += output.get(i).get(j) + " ";

			}
			out.write( newStr +"\n");

		}
		out.close();
        } catch (IOException e) {}


		
	}

}

