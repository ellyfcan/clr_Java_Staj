import java.util.Scanner;
public class ogrenci {
    Scanner scanner=new Scanner(System.in);
    private String ad;
    private String soyad;
    private int okulNo;
    private int girisYili;
    public String getAd() {
        return ad;
    }
    public String getSoyad() {
        return soyad;
    }

    public int getOkulNo() {
        if (scanner.hasNextInt()) {
            int okulNo = scanner.nextInt();
            System.out.println("Okul no : " + okulNo);
        } else {
            System.out.println("Okul numarası sayı olmalıdır.");
        }

        return 0;
    }


    public int getGirisYili() {
        return girisYili;
    }

}
