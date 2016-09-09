package transformer;

import java.util.ArrayList;
import java.util.List;

public class PrimeFactors {
   public static List<Integer> generate(int i) {
       ArrayList<Integer> factors = new ArrayList<>();
       if (i == 2)
           factors.add(2);
       return factors;
    }
}
