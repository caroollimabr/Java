package exemplostream1;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

public class ExemploStream1 {

       /**
        * @param args
        * @throws
        */
       public static void main(String[] args) {
             InputStream inputstream;
             try {
                    inputstream = new FileInputStream("C://Users//carol//entrada.txt");
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
       }
}
