public class GradingStudents {

    static final int passingGrade = 40;

    public static int isCloseToMultipleOfFive(int num)
    {
        int balance =  num%5;
        return ( (num > 37) && (balance > 2)) ? (5 - balance) : 0;
    }

    public static int[] solve(int[] marks)
    {
        int extraMarks = 0;
        for(int i=0;i<marks.length;i++)
        {
            extraMarks = isCloseToMultipleOfFive(marks[i]);
            if(extraMarks > 0) marks[i] += extraMarks;
        }
        return marks;
    }

    public static void main(String[] args)
    {
        int[] marks = {28, 38, 48, 43, 24};
        solve(marks);

        for(int mark : marks)
        {
            System.out.println(mark);
        }
    }
}

