import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;
import java.util.Calendar;
public class Main {
    public static void main(String[] args) {
//        System.out.println("Yapmak istediğiniz işlemi seçiniz : ");
//        //Scanner scan=new Scanner(System.in);
//        ogrenci ogrenciler=new ogrenci();
//        while(true){
//
//        }
        Calendar takvim=Calendar.getInstance();
        System.out.println("Mezuniyet yılı : "+takvim.get(Calendar.YEAR)+takvim.get(Calendar.MONTH)+takvim.get(Calendar.DATE));
    }
}