public class MaxMin {

    public static  int max(int a, int b, int c){

     if(a>=b && a>=c){
    return a;}
     else if(b>=a && b>=c){
    return b;}
    else{
    return c;}
    }
     

     
    public static  int min(int a, int b, int c){

     if(a<b && a<c){
    return a;}
     else if(b<a && b<c){
    return b;}
    else{
    return c;}
    }

    

    public static void main(String[] args){

        
    int a=441;
    int b=245;
    int c =378
    ;

    int result =max(a,b,c);

    System.out.println("largest number" +  result);

    int result1=min(a, b, c);

    System.out.println("smallest number"+result1);
    }
    
}
