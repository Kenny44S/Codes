public class SwapNumbers {

// Simple Program to SWAP 2 numbers without using third vaiable
    public static void main(String[] args) {

        int x , y;
        x = 10;
        y = 15;

        System.out.println("Before Swapping, X: " + x);
        System.out.println("Before Swapping, Y: " + y);
        System.out.println("----Using Addition----");
//      Addition Way
        x = x + y;
        y = x - y;
        x = x - y;
        System.out.println("After Swapping, X: "+ x);
        System.out.println("After Swapping, Y: "+ y);
        System.out.println("\n");



        System.out.println("Before Swapping, X: " + x);
        System.out.println("Before Swapping, Y: " + y);
        System.out.println("----Using Multiplication----");
//      Addition Way
        x = x * y;
        y = x / y;
        x = x / y;
        System.out.println("After Swapping, X: "+ x);
        System.out.println("After Swapping, Y: "+ y);
        System.out.println("\n");


        System.out.println("Before Swapping, X: " + x);
        System.out.println("Before Swapping, Y: " + y);
        System.out.println("---Using Bitwise XOR---");
//      Using Bitwise XOR
        x = x * y;
        y = x / y;
        x = x / y;
        System.out.println("After Swapping, X: "+ x);
        System.out.println("After Swapping, Y: "+ y);
    }
}
