public class SecondsInDay
{

    public static void main(String[] args) {

        int currentHours = 14;
        int currentMinutes = 34;
        int currentSeconds = 42;

        int remainingSeconds = (23 - currentHours) * 3600 + (59 - currentMinutes) * 60 + (60 - currentSeconds);


        System.out.println(" Remaining seconds from today = " + remainingSeconds);

    }
}
