package Mario;

import java.io.*;

/**
 * Created by Nick on 6/30/2017.
 */
public class SaveFile implements Printer {

    public SaveFile() {
    }

    @Override
    public void print(Pyramid pyramid) {
        File file = new File("Mario.txt");
        try (BufferedWriter Bw = new BufferedWriter(new FileWriter(file.getAbsoluteFile()));) {
            Bw.write(pyramid.toString());
            System.out.print("File Saved");

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
