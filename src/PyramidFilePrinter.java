import java.io.*;

/**
 * Created by Nick on 6/21/2017.
 */
public class PyramidFilePrinter implements PyramidPrinter {

    public PyramidFilePrinter() {
    }

    @Override
    public void print(StringBuilder sb) {
        File file  = new File("Mario.txt");
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(file.getAbsoluteFile()));) {
            bw.write(sb.toString());
            System.out.print("File Saved");

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}