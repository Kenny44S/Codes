public class Staircase {

    public static void main(String[] args)
    {
        int size = 10;
        int spacing = size-1;

        for(int i=1; i <= size; i++)
        {
            if(spacing > 0)
            {
                System.out.printf("%"+(spacing--)+"s", "");
            }
            for(int z=1; z<=i; z++)
            {
                System.out.print("#");
            }
            System.out.println();
        }
    }
}

