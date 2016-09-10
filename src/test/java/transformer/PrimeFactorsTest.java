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

    @Test
    public void factors_of_four() throws Exception {
        assertEquals(Arrays.asList(2, 2), PrimeFactors.generate(4));
    }

    @Test
    public void factors_of_five() throws Exception {
        assertEquals(Arrays.asList(5), PrimeFactors.generate(5));
    }

    @Test
    public void factors_of_six() throws Exception {
        assertEquals(Arrays.asList(2, 3), PrimeFactors.generate(6));
    }

    @Test
    public void factors_of_a_lot_of_things() throws Exception {
        assertEquals(Arrays.asList(7), PrimeFactors.generate(7));
        assertEquals(Arrays.asList(2, 2, 2), PrimeFactors.generate(8));
        assertEquals(Arrays.asList(3, 3), PrimeFactors.generate(9));
        assertEquals(Arrays.asList(2, 5), PrimeFactors.generate(10));
        assertEquals(Arrays.asList(11), PrimeFactors.generate(11));
        assertEquals(Arrays.asList(2, 2, 3), PrimeFactors.generate(12));
        assertEquals(Arrays.asList(13), PrimeFactors.generate(13));
        assertEquals(Arrays.asList(2, 7), PrimeFactors.generate(14));
        assertEquals(Arrays.asList(3, 5), PrimeFactors.generate(15));
        assertEquals(Arrays.asList(2, 2, 2, 2), PrimeFactors.generate(16));
        assertEquals(Arrays.asList(17), PrimeFactors.generate(17));
        assertEquals(Arrays.asList(2, 3, 3), PrimeFactors.generate(18));
        assertEquals(Arrays.asList(19), PrimeFactors.generate(19));
        assertEquals(Arrays.asList(2, 2, 5), PrimeFactors.generate(20));
        assertEquals(Arrays.asList(3, 7), PrimeFactors.generate(21));
        assertEquals(Arrays.asList(2, 11), PrimeFactors.generate(22));
        assertEquals(Arrays.asList(23), PrimeFactors.generate(23));
        assertEquals(Arrays.asList(2, 2, 2, 3), PrimeFactors.generate(24));
        assertEquals(Arrays.asList(5, 5), PrimeFactors.generate(25));
        assertEquals(Arrays.asList(2, 13), PrimeFactors.generate(26));
        assertEquals(Arrays.asList(3, 3, 3), PrimeFactors.generate(27));
    }
}