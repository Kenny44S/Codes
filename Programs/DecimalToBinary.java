public class DecimalToBinary {

    public static void main(String[] args)
    {
        String binary;
        binary = DecimalToBinary(22032);
        
        System.out.println(binary);
    }



    public static String DecimalToBinary(int num)
    {
        String binaryRepresentation = "";

        while (num > 0) {
            binaryRepresentation = (num % 2) + binaryRepresentation;
            num = num/2;
        }
        return binaryRepresentation;
    }
}