package transformer;

import java.util.ArrayList;
import java.util.List;

public class PrimeFactors {
   public static List<Integer> generate(int i) {
       List<Integer> primeFactors = new ArrayList<>();
       if (i > 1)
           primeFactors.add(i);
       return primeFactors;
    }
}
