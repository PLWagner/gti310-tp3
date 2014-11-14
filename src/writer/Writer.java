package writer;

/**
 * The Writer interface defines a method to write user-defined objects to file.
 * The classes implementing the Writer interface should explicitaly define the
 * object they will be wrinting to file.
 * <p/>
 * public class MyWriter implements Writer<MyObject> { ... }
 * <p/>
 * The caller will need to know what type of objects it will be writing. This
 * limits the run-time flexibility since two different implementations of the
 * Writer interface will write to file two different kinds of object.
 * <p/>
 * Writer<AnObject> writer = new AnObjectWriter();
 *
 * @param <T> The user-defined object that will be written to file.
 * @author Fran�ois Caron <francois.caron.7@ens.etsmtl.ca>
 */
public interface Writer<T> {

    /**
     * Write the given object's data to file.
     *
     * @param filename The complete path to the file that will be created.
     * @param output   The data which will be written to the file.
     */
    void write(String filename, T output);
}
