/**
 * Created by kenny on 5/20/17.
 */
public class OddNumbers {

    public static void main(String[] args){

        print_odd_numbers(1, 99);
    }


    public static void print_odd_numbers(int start, int end){
        for(int i=start; i<=end; i++){
            if(i%2 != 0){
                System.out.println(i);
            }
        }
    }
}
