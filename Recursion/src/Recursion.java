/**
 * Created by kenny on 5/28/17.
 * Recursion programs demonstrating  Fibonacci Series & Factorial
 */
public class Recursion {
    public static void main(String[] args){
        RecursiveClass f = new RecursiveClass();
        f.print_fibonacci(0);                     // If argument passed is less than 10 it will default to 10.
        f.print_factorial(0);                     // If argument passed is less than 5  it will default to 5.
    }
}

/*
 *  We make a new class "RecursiveClass" which have two functions, ie: print_fibonacci(); & print_factorial();
 */

class RecursiveClass{
    private int START = 1;

    /*
     * @parms      startFrom :       The number from which the Fibonacci series will start.
     * example:    startFrom = 10    Result will be 10 +9....+2 +1 = 55
     */
    public void print_fibonacci(int startFrom){
        START = startFrom < 10 ? 10 : startFrom;                      //If startFrom < 10 it will default to 10.
        System.out.printf("Starting fibonacci from %d \n", START);
        System.out.println(get_fibonacci(START));                     // Print Fibonacci Series.
        System.out.println("------------------------------------------");
    }

    /*
     * @parms      startFrom :       The number from which the Factorial will start.
     * example:    startFrom = 5     Result will be 5 x 3 x 2 x 1 = 120
     */
    public void print_factorial(int startFrom){
        START = startFrom < 10 ? 5 : startFrom;                       //If startFrom < 5 it will default to 5.
        System.out.printf("Starting factorial from %d \n", START);
        System.out.println(get_factorial(START));                     // Print Factorial.
        System.out.println("------------------------------------------");
    }

    public int get_fibonacci(int a){
        int result;
        System.out.print(a);
        if(a==1){
            System.out.print(" = ");
            return 1;
        }
        System.out.print(" + ");
        result = a + get_fibonacci(a - 1);                           // ** RECURSION FUNCTION **
        return result;
    }

    public int get_factorial(int b){
        int result;
        System.out.print(b);
        if(b==1){
            System.out.print(" = ");
            return 1;
        }
        System.out.print(" x ");
        result = b * get_factorial(b - 1);                           //  ** RECURSION FUNCTION **
        return result;
    }
}

