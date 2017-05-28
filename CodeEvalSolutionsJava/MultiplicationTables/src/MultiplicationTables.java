/**
 * Created by kenny on 5/20/17.
 *
 * Objective: To print multiplication table of given number range.
 *
 * EG: Table from 1 - 3 upto  *12
 *     1   2   3   4   5   6   7   8   9  10  11  12
 *     2   4   6   8  10  12  14  16  18  20  22  24
 *     3   6   9  12  15  18  21  24  27  30  33  36
 *
 */


public class MultiplicationTables {
    public static void main(String[] args){

        multiplication_tables(1, 12, 12);
    }

    public static void multiplication_tables(int start, int end, int until){

        for(int i=start; i<=end; i++){
            for(int z=1; z<=until; z++){
                int result = i*z;
                System.out.format("%-4d", result);
            }
            System.out.println();
        }
    }
}
