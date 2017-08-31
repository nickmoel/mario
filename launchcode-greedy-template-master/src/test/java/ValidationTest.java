/**
 * Created by Nick on 8/29/2017.
 */

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class ValidationTest {
    @Test
    public void firstCharMustBe$or€() {
        assertThat(Greedy.Validation("$4.44"), is(true));

        assertThat(Greedy.Validation("€0.00"), is(true));

        assertThat(Greedy.Validation("0.00"), is(false));

        assertThat(Greedy.Validation("00.00"), is(false));

        assertThat(Greedy.Validation("@0.00"), is(false));
    }

    @Test
    public void amountIsValid() {
        assertThat(Greedy.Validation("€444.44"), is(true));

        assertThat(Greedy.Validation("€44.44"), is(true));

        assertThat(Greedy.Validation("$44.44"), is(true));

        assertThat(Greedy.Validation("$4.44"), is(true));

        assertThat(Greedy.Validation("$0.44"), is(true));

        assertThat(Greedy.Validation("$00.44"), is(true));

        assertThat(Greedy.Validation("$4.4"), is(false));

        assertThat(Greedy.Validation("$4"), is(false));

        assertThat(Greedy.Validation("€.44"), is(false));

        assertThat(Greedy.Validation("$.4"), is(false));

        assertThat(Greedy.Validation("$4.444"), is(false));
    }
}
