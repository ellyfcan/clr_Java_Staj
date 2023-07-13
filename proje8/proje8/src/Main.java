
public class Main {
    public static void main(String[] args) {
        String ogr1="Engin";
        String ogr2="Derin";
        String ogr3="Salih";
        String ogr4="Ahmet";

        System.out.println(ogr1);
        System.out.println(ogr2);
        System.out.println(ogr3);
        System.out.println(ogr4);
        System.out.println("---------------");

        String [] ogrenciler=new String[4];
        ogrenciler[0]="Engin";
        ogrenciler[1]="Derin";
        ogrenciler[2]="Salih";
        ogrenciler[3]="Ahmet";

        for(int i=0;i<ogrenciler.length;i++){
            System.out.println(ogrenciler[i]);
        }
        System.out.println("--------------");

        for(String ogrenci: ogrenciler){
            System.out.println(ogrenci);
        }
    }
}