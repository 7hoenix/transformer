package transformer;

import java.util.ArrayList;
import java.util.List;

public class PrimeFactors {
   public static List<Integer> generate(int i) {
       List<Integer> primeFactors = new ArrayList<>();

       return generateIter(i, primeFactors);
    }

    private static List<Integer> generateIter(int i, List<Integer> primeFactors) {
        if (i == 1) {
            return primeFactors;
        } else if (i % 2 == 0) {
            primeFactors.add(2);
            return generateIter(i / 2, primeFactors);
        } else {
            primeFactors.add(i);
            return primeFactors;
        }
    }
}
