import java.util.GregorianCalendar;
import java.util.Scanner;
import java.util.Calendar;
public class Main {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        Calendar takvim=Calendar.getInstance();
        Ogrenciler[] ogrenci=new Ogrenciler[10];

        int sayac=0;
        while(true){
            System.out.println("Yapmak istediğiniz işlemi girin:");
            System.out.println("Öğrenci eklemek için -> 'e' ");
            System.out.println("Öğrenci silmek için -> 's' ");
            System.out.println("Öğrenci aramak için -> 'a' ");
            System.out.println("Öğrenci listelemek için -> 'l' ");
            System.out.println("Mezuniyet yılı öğrenmek için -> 'm'  ");

            String secim=scan.next();
            switch (secim){
                case "e":
                 System.out.println("Eklemek istediğiniz öğrencinin adını girin : ");
                 String isim;
                 ogrenci[sayac].getAd();


            }
        }
    }
}