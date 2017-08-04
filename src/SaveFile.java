import java.io.*;

/**
 * Created by Nick on 6/30/2017.
 */
public class SaveFile implements Printer {

    private static SaveFile savefile;

    public static SaveFile getInstance(){

        if (savefile == null){
            savefile = new SaveFile();
        }
        return savefile;
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