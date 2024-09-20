class Perimeter1{


    int a;

    Perimeter1(int a){

        this.a=a;

    }

    public class PerimeterOfSquare{


        public static void main(String[] args){

        int a=1;

        Perimeter1 area =new Perimeter1(a);
        int result=4*area.a;
        System.out.println("PerimeterOfSquare : "+result);


        }
    }
}