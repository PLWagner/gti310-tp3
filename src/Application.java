import parser.ZoneParser;
import solver.ZoneSolver;
import writer.ConcreteWriter;


/**
 * The Application class defines a template method to call the elements to
 * solve the problem Unreal-Networks is facing.
 *
 * @author François Caron <francois.caron.7@ens.etsmtl.ca>
 */
public class Application {

    /**
     * The Application's entry point.
     * <p/>
     * The main method makes a series of calls to find a solution to the
     * problem. The program awaits two arguments, the complete path to the
     * input file, and the complete path to the output file.
     *
     * @param args The array containing the arguments to the files.
     */
    public static void main(String[] args) {
        //Integer myInt = 8;

        //System.out.println(Integer.valueOf(myInt.toString()));

		System.out.println("Unreal Networks Solver !");
		ZoneParser parser = new ZoneParser();
		ZoneSolver solver = new ZoneSolver();
		ConcreteWriter writer = new ConcreteWriter();
		writer.write(args[1], solver.solve(parser.parse(args[0])));
		
	}
}
