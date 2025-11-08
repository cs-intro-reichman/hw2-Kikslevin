public class TimeCalc {
    public static void main(String[] args) {
        
        String giventime = args[0];
        String hoursgivenstr = giventime.substring(0 , 2);
        String minutesgivenstr = giventime.substring(3);

        int hoursgiven = Integer.parseInt(hoursgivenstr);
        int minutesgiven = Integer.parseInt(minutesgivenstr);
        
        int minutesadded = Integer.parseInt(args[1]);

        // Convert current time to total minutes or hours
        int totalminutes = hoursgiven * 60 + minutesgiven + minutesadded;
        int totalhours = (totalminutes / 60) ;

        // Calculate new time in hours and minutes
        int newhours = (totalhours % 24);
        int newminutes = totalminutes % 60;

        if (newhours < 10 && newminutes < 10) {
            System.out.println("0" + newhours + ":0" + newminutes);
        } else if (newhours < 10) {
            System.out.println("0" + newhours + ":" + newminutes);
        } else if (newminutes < 10){
            System.out.println(newhours + ":0" + newminutes);
        } else {
            System.out.println(newhours + ":" + newminutes);
        }
    }
}