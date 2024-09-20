import java.util.Scanner;

public class GradeReviwer {
    
public static void main(String[] args){

    Scanner sc = new Scanner(System.in);

    System.out.println("Enter the Grade please : ");

    char grade=sc.next().charAt(0);

    
  
   switch(grade){

      case'A':
        
      System.out.println("Very Good ");

      break;

      case'B':
      
      System.out.println("Good job");
      break;

      case'C':

      System.out.println("Good but you need to work hard");
      break;

      case'D':

      System.out.println("Keep try to improve you ");
      break;

      case 'F':

      System.out.println("Its not good for your education and career");
      break;

      default:

      System.out.println("please enter any grade to review ");
       
      
    }
sc.close();
}

}
