public class TryCatch {

    public static void main(String [] args){

        int i=2;
        int j=0;

        try{

            j=18/i; 
            
            System.out.println(j);
        }

            catch(ArithmeticException e){

                System.out.println("Cannot divisible by Zero.....");
            }

    
    }
    
}







