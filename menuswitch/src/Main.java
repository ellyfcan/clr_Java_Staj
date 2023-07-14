import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String[] ogrenciler = new String[10];

        int sayac = 0;
        while (true) {



            System.out.println("Yapmak istediğiniz işlemi girin:");
            System.out.println("Öğrenci eklemek için -> 'e' ");
            System.out.println("Öğrenci silmek için -> 's' ");
            System.out.println("Öğrenci aramak için -> 'a' ");
            System.out.println("Öğrenci listelemek için -> 'l' ");




            String secim = scan.nextLine();
            switch (secim) {
                case "e":
                        System.out.println("Eklemek istediğiniz öğrenci adını girin:");
                        String eklenecek = scan.nextLine();
                        ogrenciler[sayac] = eklenecek;
                        System.out.println("Öğrenci : " + ogrenciler[sayac]);
                        System.out.println("Öğrenci başarıyla eklendi.");
                        sayac++;
                    break;
                case "s":
                    System.out.println("Silmek istediğiniz öğrenci adını girin:");
                    String sil = scan.nextLine();
                    boolean sildi=false;


                    for (int i = 0; i < ogrenciler.length; i++) {
                        String item = ogrenciler[i];
                        if (item != null && item.equals(sil)) {
                            ogrenciler[i] =null;
                            System.out.println("Öğrenci silindi : " + item);
                            sildi=true;
                            break;
                        }
                    }


                    if(!sildi){
                        System.out.println("Öğrenci bulunamadı.");
                    }
                    break;
                case "a":
                    System.out.println("Aramak istediğiniz öğrencinin adını girin:");
                    String ara = scan.nextLine();


                    boolean varMi=false;
                    for (int i = 0; i < ogrenciler.length; i++) {
                        String item=ogrenciler[i];
                        if (ara.equals(item)) {
                            varMi=true;
                            System.out.println("Öğrenci bulundu:"+item);

                        }
                    }

                    if(!varMi){
                        System.out.println("Öğrenci bulunamadı.");
                    }
                    break;
                case "l":
                    System.out.println("Öğrenci Listesi : ");
                    int j=0;
                    for (int i = 0; i < ogrenciler.length; i++) {
                        String item=ogrenciler[i];
                        if(item==null){
                            continue;
                        }
                            System.out.println(ogrenciler[i]);
                        j++;
                    }

                    if(j==0){
                        System.out.println("Liste boş.");
                    }
                    break;
                default:
                    System.out.println("Geçersiz bir seçim yaptınız.Lütfen tekrar deneyin.");
            }
        }
    }
}