
public class Main {
    public static void main(String[] args) {
        String mesaj="Bugün hava çok güzel.";
        String  yeniMesaj=mesaj.substring(0,2);
        System.out.println(yeniMesaj);
        int sayi=topla(5,7);
        System.out.println(sayi);
    }
    public static void ekle(){
        System.out.println("Eklendi.");
    }
    public static void sil(){
        System.out.println("Silindi.");
    }
    public static void guncelle(){
        System.out.println("Güncellendi.");
    }

    public static int topla(int a,int b){
        return a+b;
    }
}