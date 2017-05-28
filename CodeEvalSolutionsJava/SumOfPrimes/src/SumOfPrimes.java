/**
 * Created by kenny on 5/27/17.
 *
 * Adding Prime numbers of given RANGE.
 *
 *
 */
public class SumOfPrimes {
    public static void main(String[] args) {
        add_prime_range(5, 20);                // Get SUM of 20 prime numbers
    }                                          // STARTING from 5

    /*
     * @params START :  the starting number from which the program will check for prime numbers.
     * @params AMT   :  the amount of prime numbers to be added.
     * example: START=10; AMT=5 will ADD first 5 prime numbers FROM 10
     */
    public static void add_prime_range(int START, int AMT){
        int start = 0;
        int stop  = 0;

        start = START < 2  ? 2  : START;      // Default START range is 2;
        stop  = AMT   < 10 ? 10 : AMT;        // Default AMT   range is 10;

        int counter     = 1;
        int i           = 2;
        int z           = 1;
        boolean isPrime = true;

        int sumOfPrimes = 0;

        for(z=start; z > 0; z++){
            isPrime = true;                        // Default boolean value of isPrime = true
            for(i=2; i<=z/2; i++){
                if(z % i == 0){                    // IF TRUE, Number is NOT PRIME and
                    isPrime = false;               // isPrime becomes FALSE
                    break;
                }
            }
            if(isPrime){                           // IF Number is PRIME keep ADDING itself.
                sumOfPrimes += z;
                counter++;
            }
            if(counter > stop) break;
        }
        System.out.println(sumOfPrimes);           // Print sum of ALL PRIMES of given range.
    }
}
