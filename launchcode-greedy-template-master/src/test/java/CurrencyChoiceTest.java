/**
 * Created by Nick on 8/19/2017.
 */

import org.junit.Test;

import static junit.framework.Assert.assertEquals;


public class CurrencyChoiceTest {
    //Dollar Currency - $ - 1 dollar coins, .25, .10, .05, .01
    @Test
    public void zeroChangeGivesZeroCoins() throws Exception {
        String input_amount = "$0.00";
        int coin = CurrencyChoice.createCurrency(input_amount).calculateChange(input_amount);
        assertEquals(0, coin);
    }

    @Test
    public void testPennyGivesOneCoin() throws Exception {
        String input_amount = "$0.01";
        int coin = CurrencyChoice.createCurrency(input_amount).calculateChange(input_amount);
        assertEquals(1, coin);
    }

    @Test
    public void testNickelGivesOneCoin() throws Exception {
        String input_amount = "$0.05";
        int coin = CurrencyChoice.createCurrency(input_amount).calculateChange(input_amount);
        assertEquals(1, coin);
    }

    @Test
    public void testDimeGivesOneCoin() throws Exception {
        String input_amount = "$0.10";
        int coin = CurrencyChoice.createCurrency(input_amount).calculateChange(input_amount);
        assertEquals(1, coin);
    }

    @Test
    public void testQuarterGivesOneCoin() throws Exception {
        String input_amount = "$0.25";
        int coin = CurrencyChoice.createCurrency(input_amount).calculateChange(input_amount);
        assertEquals(1, coin);
    }

    @Test
    public void testDollarGivesOneCoin() throws Exception {
        String input_amount = "$1.00";
        int coin = CurrencyChoice.createCurrency(input_amount).calculateChange(input_amount);
        assertEquals(1, coin);
    }


    @Test
    public void testSixCentsGivesTwoCoins() throws Exception {
        String input_amount = "$0.06";
        int coin = CurrencyChoice.createCurrency(input_amount).calculateChange(input_amount);
        assertEquals(2, coin);//nickel and a penny
    }

    @Test
    public void testFifteenCentsGivesTwoCoins() throws Exception {
        String input_amount = "$0.15";
        int coin = CurrencyChoice.createCurrency(input_amount).calculateChange(input_amount);
        assertEquals(2, coin);//dime and a nickel
    }

    @Test
    public void testFortyFourCentsGivesSevenCoins() throws Exception {
        String input_amount = "$0.44";
        int coin = CurrencyChoice.createCurrency(input_amount).calculateChange(input_amount);
        assertEquals(7, coin);//quarter, dime, nickel and four pennies
    }

    @Test
    public void testTwoDollarsTwentyOneCentsGivesFiveCoins() throws Exception {
        String input_amount = "$2.21";
        int coin = CurrencyChoice.createCurrency(input_amount).calculateChange(input_amount);
        assertEquals(5, coin);//Two dollar coins, two dimes and a penny
    }

    @Test
    public void testFortyFourDollarsFortyFourCentsGivesFiftyOneCoins() throws Exception {
        String input_amount = "$44.44";
        int coin = CurrencyChoice.createCurrency(input_amount).calculateChange(input_amount);
        assertEquals(51, coin);//forty-four dollar coins,  1 quarter, 1 dime, 1 nickel and four pennies
    }


    //Euro Currency - € - 2 euro coins, 1 euro coins, .50 , .20, .10, .05, .02, .01


    @Test
    public void zeroChangeGivesZeroEuroCoins() throws Exception {
        String input_amount = "\u20ac0.00";
        int coin = CurrencyChoice.createCurrency(input_amount).calculateChange(input_amount);
        assertEquals(0, coin);
    }

    @Test
    public void testPennyGivesOneCoinEuro() throws Exception {
        String input_amount = "\u20ac0.01";
        int coin = CurrencyChoice.createCurrency(input_amount).calculateChange(input_amount);
        assertEquals(1, coin);
    }

    @Test
    public void testNickelGivesOneCoinEuro() throws Exception {
        String input_amount = "\u20ac0.05";
        int coin = CurrencyChoice.createCurrency(input_amount).calculateChange(input_amount);
        assertEquals(1, coin);
    }

    @Test
    public void testDimeGivesOneCoinEuro() throws Exception {
        String input_amount = "\u20ac0.10";
        int coin = CurrencyChoice.createCurrency(input_amount).calculateChange(input_amount);
        assertEquals(1, coin);
    }

    @Test
    public void testQuarterGivesTwoCoinsEuro() throws Exception {
        String input_amount = "\u20ac0.25";
        int coin = CurrencyChoice.createCurrency(input_amount).calculateChange(input_amount);
        assertEquals(2, coin); // .10 and .15
    }

    @Test
    public void testEuroGivesOneCoin() throws Exception {
        String input_amount = "\u20ac1.00";
        int coin = CurrencyChoice.createCurrency(input_amount).calculateChange(input_amount);
        assertEquals(1, coin);
    }

    @Test
    public void testTwoEuroGivesTwoCoins() throws Exception {
        String input_amount = "\u20ac2.00";
        int coin = CurrencyChoice.createCurrency(input_amount).calculateChange(input_amount);
        assertEquals(2, coin);
    }


    @Test
    public void testSixCentsGivesTwoCoinsEuro() throws Exception {
        String input_amount = "\u20ac0.06";
        int coin = CurrencyChoice.createCurrency(input_amount).calculateChange(input_amount);
        assertEquals(2, coin);//nickel and a penny
    }

    @Test
    public void testFifteenCentsGivesTwoCoinsEuro() throws Exception {
        String input_amount = "\u20ac0.15";
        int coin = CurrencyChoice.createCurrency(input_amount).calculateChange(input_amount);
        assertEquals(2, coin);//dime and a nickel
    }

    @Test
    public void testFortyFourCentsGivesFourCoinsEuro() throws Exception {
        String input_amount = "\u20ac0.44";
        int coin = CurrencyChoice.createCurrency(input_amount).calculateChange(input_amount);
        assertEquals(4, coin);//two .20 and two .02
    }

    @Test
    public void testTwoDollarsTwentyOneCentsGivesFourCoinsEuro() throws Exception {
        String input_amount = "\u20ac2.21";
        int coin = CurrencyChoice.createCurrency(input_amount).calculateChange(input_amount);
        assertEquals(4, coin);//Two dollar coins, two dimes and a penny
    }

    @Test
    public void testFortyFourDollarsFortyFourCentsGivesFiftyOneCoinsEuro() throws Exception {
        String input_amount = "\u20ac44.44";
        int coin = CurrencyChoice.createCurrency(input_amount).calculateChange(input_amount);
        assertEquals(26, coin);// twenty-two 2 euro coins, Two .20 cent and two .02
    }
}