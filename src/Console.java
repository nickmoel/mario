/**
 * Created by Nick on 6/30/2017.
 */
public class Console implements Printer {
    public Console() {
    }

    @Override
    public void print(Pyramid pyramid){
        System.out.print(pyramid.toString());
    }
}