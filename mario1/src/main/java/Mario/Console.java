package Mario;

/**
 * Created by Nick on 6/30/2017.
 */
public class Console implements Printer {

    private static Console console;

    public static Console getInstance(){
        if (console == null){
            console = new Console();
        }
        return console;
    }

    @Override
    public void print(Pyramid pyramid){
        System.out.print(pyramid.toString());
    }
}
