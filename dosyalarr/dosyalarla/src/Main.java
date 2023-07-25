import java.io.File;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        File file=new File("C:\\Users\\ELİFCAN\\OneDrive\\Masaüstü\\java\\Package\\students.txt");
        try {
          if(file.createNewFile()){
              System.out.println("Dosya oluşturuldu");
          }
          else{
              System.out.println("Dosya zaten mevcut");
          }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}