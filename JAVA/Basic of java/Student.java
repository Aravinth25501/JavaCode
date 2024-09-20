class Student{


     String name;
     int rollNo;
     int[] marks;


    Student(String name,int rollNo ,int[] marks){
 
          this.name = name;

          this.rollNo = rollNo;

          this.marks = marks;

    }
    int markTotal(){
    
   int total=0;
    for(int mark: marks){
     

         total +=mark;


    }
return total;
    }
   public static void main(String []args){


    int[] marks1={12,12,12};

      Student student1= new Student( "usnwu",1,marks1);
        String name1="Hari";      
      int totalmarks1=student1.markTotal();
      System.out.println(name1);
      System.out.println("mark:  "+ totalmarks1);





   }


}