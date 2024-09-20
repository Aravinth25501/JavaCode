import java.util.*;
import java.text.SimpleDateFormat;
public class CalenderDemo {
    public static void main(String[] args){

        int month =8;
        int day = 20;
        int year = 2023;

        Calendar cal = Calendar.getInstance();

        cal.set(year,month-1,day);

        SimpleDateFormat sdf = new SimpleDateFormat("EEEE");
        

        System.out.println(sdf.format(getTime().toUpperCase()));
    }
}
