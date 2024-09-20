import java.util.*;

enum DayOfWeek {

    MONDAY,TUESDAY,WEDNESDAY,THURSDAY,FRIDAY,SATURDAY,SUNDAY;
}     

public class Enum{

    public static void main(String[] args){
   Scanner sc= new Scanner(System.in);

   System.out.println("Enter the day to say its weeof or not : ");

   String days=sc.nextLine().toUpperCase();

        DayOfWeek day=DayOfWeek.valueOf(days);

       switch(day){

        case SUNDAY:
        System.out.println("its weekof");

        break;

        case SATURDAY:

        System.out.println("its not weekof");
       
    }
       
    }
}


