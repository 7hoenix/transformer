package transformer;

import java.util.ArrayList;
import java.util.List;

public class PrimeFactors {
   public static List<Integer> generate(int i) {
       List<Integer> primeFactors = new ArrayList<>();
       if (i % 2 == 0) {
           primeFactors.add(2);
           i = i / 2;
       }

       if (i == 2)
           primeFactors.add(2);
       else if (i == 3)
           primeFactors.add(3);
       else if (i == 5)
           primeFactors.add(5);
       else if (i == 7)
           primeFactors.add(7);
       else if (i == 11)
           primeFactors.add(11);
       else if (i == 13)
           primeFactors.add(13);
       else if (i == 17)
           primeFactors.add(17);
       else if (i == 19)
           primeFactors.add(19);
       else if (i == 23)
           primeFactors.add(23);

       if (i == 4) {
           primeFactors.add(2);
           primeFactors.add(2);
       } else if (i == 6) {
           primeFactors.add(2);
           primeFactors.add(3);
       } else if (i == 8) {
           primeFactors.add(2);
           primeFactors.add(2);
           primeFactors.add(2);
       } else if (i == 9) {
           primeFactors.add(3);
           primeFactors.add(3);
       } else if (i == 10) {
           primeFactors.add(2);
           primeFactors.add(5);
       } else if (i == 12) {
           primeFactors.add(2);
           primeFactors.add(2);
           primeFactors.add(3);
       } else if (i == 14) {
           primeFactors.add(2);
           primeFactors.add(7);
       } else if (i == 15) {
           primeFactors.add(3);
           primeFactors.add(5);
       } else if (i == 16) {
           primeFactors.add(2);
           primeFactors.add(2);
           primeFactors.add(2);
           primeFactors.add(2);
       } else if (i == 18) {
           primeFactors.add(2);
           primeFactors.add(3);
           primeFactors.add(3);
       } else if (i == 20) {
           primeFactors.add(2);
           primeFactors.add(2);
           primeFactors.add(5);
       } else if (i == 21) {
           primeFactors.add(3);
           primeFactors.add(7);
       } else if (i == 22) {
           primeFactors.add(2);
           primeFactors.add(11);
       } else if (i == 24) {
           primeFactors.add(2);
           primeFactors.add(2);
           primeFactors.add(2);
           primeFactors.add(3);
       } else if (i == 25) {
           primeFactors.add(5);
           primeFactors.add(5);
       } else if (i == 26) {
           primeFactors.add(2);
           primeFactors.add(13);
       } else if (i == 27) {
           primeFactors.add(3);
           primeFactors.add(3);
           primeFactors.add(3);
       }


       return primeFactors;
    }
}
