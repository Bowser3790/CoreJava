package PassingValuesArgs;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.util.Date;

public class DatesTime01 {
    public static void main(String[] args) {
        // print current date in local area

        Date currentDate = new Date();
        System.out.println(currentDate);

        System.out.println(currentDate.getTime());
        // print current time in local area

        LocalTime myTime = LocalTime.now();
        System.out.println(myTime);// you will not see date when you use this method LocalTime is the data type

        // print current date right now
        LocalDate myDate = LocalDate.now();// time right now
        System.out.println(myDate);

        //current local time and date

        LocalDateTime dateTime01 = LocalDateTime.now();
        System.out.println(dateTime01);

        // how to get specific component from date and time

        System.out.println(myDate.getMonthValue());//
        System.out.println(myDate.getMonth()); // February

        System.out.println(dateTime01.getDayOfWeek());// thursday

        // how to get time in another timezone

        System.out.println(dateTime01.now(ZoneId.of("Asia/Tokyo")));

        System.out.println(myDate.plusYears(1).plusMonths(3).plusDays(4));

        System.out.println(myTime.minusHours(3).minusMinutes(25));

        LocalDate myBirthday = LocalDate.of(1983,8,26);
        LocalDate childBirthday = LocalDate.of(1999,3,10);

        boolean isDifferenceBday = myBirthday.isAfter(childBirthday);
        System.out.println(isDifferenceBday);
        boolean isBday = myBirthday.isBefore(childBirthday);
        System.out.println(isBday);

        boolean equalBirthdays = myBirthday.isEqual(childBirthday);
        System.out.println(equalBirthdays);

        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("MMMM:dd:yyyy");
        // M => 1,2,3,4...
        //MM => 01,02,03,04...
        //MMM => Jan,Feb,Mar,Apr
        //MMMM => January,February,March, April...
        //dd => 01,02,03,04
        //d=> 1,2,3,4
        //yy => 83,84,85,86
        //yyyy => 1984, 1985, 1986, 1987



        String formatMyDate = dtf.format(myDate);
        System.out.println(formatMyDate);

        DateTimeFormatter dtf2 = DateTimeFormatter.ofPattern("hh:mm a");
        // HH => 24 hour system
        // hh => 12 hour system
        // after the time pattern leave a space and put a and will put "AM" or "PM"

        String formattedTime = dtf2.format(myTime);
        System.out.println(formattedTime);



    }

}
