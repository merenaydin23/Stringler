//0 ile 999 arasında girilen sayının okunuşunu ekrana yazan programın Java kodunu yazınız.
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner klavye=new Scanner(System.in);
        int sayı;
        do {
            System.out.println("Lütfen sisteme 0-999 arası sayı giriniz ");
            sayı = klavye.nextInt();
        }while (sayı>999||sayı<0);
        toplam(sayı);
    }


 /* Bu metotda yazdığımız dizileri kullanarak  sayının birler onlar ve yüzler basammağını
  ince işçilik kullanrak yazdırdık.*/

    public static void toplam (int sayı){
    String[] dizi={"bir","iki","üç","dört","beş","altı","yedi","sekiz","dokuz"};
    String []dizi2={"on","yirmi","otuz","kırk","elli","altmış","yedmiş","seksen","doksan"};
    String[] dizi3={" ","iki","üç","dört","beş","altı","yedi","sekiz","dokuz"};
    if (sayı>99) {
        int birlik = sayı % 10;
        sayı = (sayı - birlik) / 10;
        int onluk = sayı % 10;
        sayı = (sayı - onluk) / 10;
        int yüzlük = sayı % 10;
        if (birlik > 0 && onluk > 0 && yüzlük > 0) {
            System.out.println(dizi3[yüzlük - 1] + " yüz " + dizi2[onluk - 1] +" " + dizi[birlik - 1]);
        }
        if (birlik == 0 && onluk == 0 && yüzlük > 0) {
            System.out.println(dizi3[yüzlük - 1] + " yüz ");
        }
        if (birlik == 0 && onluk > 0 && yüzlük > 0) {
            System.out.println(dizi3[yüzlük - 1] + " yüz " + dizi2[onluk - 1] + " ");
        }
        if (birlik > 0 && onluk == 0 && yüzlük > 0) {
            System.out.println(dizi3[yüzlük - 1] + " yüz " + dizi[birlik - 1]);
        }
    }
    else {
        int birlik = sayı % 10;
        sayı = (sayı - birlik) / 10;
        int onluk = sayı % 10;
        if (birlik>0&&onluk>0){
            System.out.println(dizi2[onluk-1]+" "+dizi[birlik-1]);
        }
        else if (birlik==0&&onluk>0){
            System.out.println(dizi2[onluk-1]);
        }
        else if (birlik>0&&onluk==0){
            System.out.println(dizi[birlik-1]);
        }
        else if (birlik==0&&onluk==0){
            System.out.println("Sıfır");
        }
    }
    }
}