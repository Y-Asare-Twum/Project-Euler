/**
 * Question:
 * If we list all the natural numbers below 10 that are multiples of 3 or 5, we get 3, 5, 6 and 9. The sum of these multiples is 23.
 *
 * Find the sum of all the multiples of 3 or 5 below 1000.
 *
 * Source: ProjectEuler.net
 */

public class Multiples_Of_3_And_5 {





    /**
     * This method evaluates all natural numbers that are multiples of numbers "a" and "b" up to but excluding
     * number "c" and returns the sum of all multiples of "a" and "b"
     * e.g.   input = 3,5,10 => output = ( (0+3+6+9) + (0+5) ) = 23
     *
     * @param num1 one of the numbers to be evaluated
     * @param num2 one of the numbers to be evaluated
     * @param upToNum The number up to which numbers must be evaluated and summed. This number is excluded from
     *                evaluation.
     * @return
     */
    public static int sumOfAllMultiplesOfTwoNumbersUnder(int num1, int num2, int upToNum ){

       int startNum = Math.min(num1, num2);
       int totalSum = 0;

       for ( int i = startNum; i < upToNum; i++ ){

           if ( isDivisible( i, num1 ) || isDivisible( i, num2 ) ){
               totalSum += i;
           }
       }
       return totalSum;
   }

    /**
     * This method returns whether a number is divisible by another number
     * e.g. 6/3 = 0 => return true
     * e.g. 6/4 = 1.4 => return false
     * @param numerator the number to be divided
     * @param denominator the number that is to be divided by
     * @return "true" if it is divisible "false" if it is not
     */

   public static boolean isDivisible ( int numerator, int denominator ){
       return numerator % denominator == 0;
   }
}
