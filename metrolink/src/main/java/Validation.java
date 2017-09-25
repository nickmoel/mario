/**
 * Created by Nick on 9/19/2017.
 */

public class Validation {

    public static boolean validation(int user_input) {
        if (user_input> 0 && user_input < 37) {
            return true;
        } else {
            return false;
        }
    }
}
