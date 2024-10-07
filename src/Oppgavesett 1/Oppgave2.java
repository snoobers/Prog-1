public class Oppgave2 {
    public static void main(String[] args) {
        //Define the variables for hours, minutes and seconds
        int hours = 24;
        int min = 0;
        int sec;
        int seconds = 0;
        sec = hours * 3600 + min * 60 + seconds;

        System.out.println("When we convert " + hours + " hours and " + min + " minutes to seconds, we get " + sec + " seconds.");
        // We can test with other values
        hours = 7;
        min = 44;
        seconds = 5000;
        sec = hours * 3600 + min * 60 + seconds;
        System.out.println("When we convert the values of " + hours + " hours and " + min + " minutes as well as " + seconds + " to seconds, we get " + sec + " seconds.");
    }
}
