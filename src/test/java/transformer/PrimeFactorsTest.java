package transformer;

import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.*;

public class PrimeFactorsTest {

    @Test
    public void factors_of_one() throws Exception {
        assertEquals(Arrays.asList(), PrimeFactors.generate(1));
    }
}