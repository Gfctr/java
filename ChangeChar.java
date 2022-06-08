import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
  
public class ChangeChar {
       public static void main(String[] args) {
             InputStream inputstream;
             try {
                    inputstream = new FileInputStream("C:\\Users\\Gfctr\\Downloads\\Teste\\Teste.txt");
  
                    int data = inputstream.read();
                    while (data != -1) {
                           System.out.println(data);
  
                                  data = inputstream.read();
  
                    }
                    inputstream.close();
             } catch (FileNotFoundException e1) {
                    // TODO Auto-generated catch block
                    e1.printStackTrace();
             } catch (IOException e) {
                    // TODO Auto-generated catch block
                    e.printStackTrace();
             }

             try{
                 FileWriter arquivo = new FileWriter{
             
             }
             }
  
       }
  
}