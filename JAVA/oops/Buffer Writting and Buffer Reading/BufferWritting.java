import java.io.*;

public class BufferWritting {

    public static void main(String[] args){

     try{

         FileWriter file= new FileWriter("abc.txt");
          BufferedWriter buffer = new BufferedWriter(file);

          buffer.write("Writing to a file.....");
          buffer.write("Im currently working on a application and thats create a new fuctionality to the world");
          buffer.write("==============================");

          buffer.close();

    }

    catch(IOException e){

        e.printStackTrace();
    
        
    }
}
}
