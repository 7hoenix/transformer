package transformer;

import java.util.ArrayList;
import java.util.List;

public class PrimeFactors {
   public static List<Integer> generate(int i) {
       List<Integer> primeFactors = new ArrayList<>();
       if (i == 2)
           primeFactors.add(2);
       return primeFactors;
    }
}
