package transformer;

import org.junit.Ignore;
import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.*;

public class PrimeFactorsTest {

    @Test
    public void factors_of_one() throws Exception {
        assertEquals(Arrays.asList(), PrimeFactors.generate(1));
    }

    @Test
    public void factors_of_two() throws Exception {
        assertEquals(Arrays.asList(2), PrimeFactors.generate(2));
    }

    @Test
    public void factors_of_three() throws Exception {
        assertEquals(Arrays.asList(3), PrimeFactors.generate(3));
    }
}