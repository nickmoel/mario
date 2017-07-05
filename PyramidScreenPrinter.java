package mario;

/**
 * Created by Nick on 6/21/2017.
 */
public class PyramidScreenPrinter implements PyramidPrinter {
    public PyramidScreenPrinter() {
    }

    @Override
    public void print(StringBuilder sb){
        System.out.print(sb.toString());
    }
}