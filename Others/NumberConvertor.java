public class NumberConvertor {

    public static void main(String[] args)
    {
        DecimalToBinary(22032);
    }





    public static void DecimalToBinary(int num)
    {
        String binaryRepresentation = "";

        while (num > 0) {
            binaryRepresentation = (num % 2) + binaryRepresentation;
            num = num/2;
        }
        System.out.println(binaryRepresentation);
    }
}
