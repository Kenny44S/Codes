public class HourMintueDegree {

    // Available functions: int::GetDegreeAtOneMinute, int::GetDegreeOfOneHour, 
    //                      int::GetOnlyMintueHandAngle, int::GetOnlyHourHandAngle, 
    //                      int::GetMinuteHourAngle


    private final int totalDegree = 360;

    private final int totalMinutes = 60;
    private final int totalHours = 12;

    private final int oneMinuteDegree = totalDegree / totalMinutes;
    private final int oneHourDegree = totalDegree / totalHours;


    public int GetDegreeAtOneMinute()
    {
        return this.oneMinuteDegree;
    }

    public int GetDegreeOfOneHour()
    {
        return this.oneMinuteDegree;
    }


    private int GetOnlyMintueHandAngle(int minutes)
    {
        if(minutes == 60 || minutes > 60)
            return 0;
        return oneMinuteDegree * minutes;
    }

    private int GetOnlyHourHandAngle(int hours)
    {
        if(hours == 12 || hours > 12)
            return 0;
        return oneHourDegree * hours;
    }

    public int GetMinuteHourAngle(int minutes, int hours)
    {
        int minutesAngle, hoursAngle = 0;

        minutesAngle = GetOnlyMintueHandAngle(minutes);
        hoursAngle = GetOnlyHourHandAngle(hours);

        return Math.abs(minutesAngle-hoursAngle);
    }
}


/*



*/