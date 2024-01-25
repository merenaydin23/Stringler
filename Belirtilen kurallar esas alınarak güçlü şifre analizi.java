import java.util.*;
/*
En az bir rakam, bir küçük harf, bir büyük harf ve bir özel karakter(!@#$%*&+) içeren şifreler güçlü şifrelerdir .
Parametre olarak gelen string bir şifrenin güçlülük derecesini bulan ve geri döndüren fonksiyonu yazınız.
(Özel karakter kontrolü için bir önceki
ASCII karşılıkları 0=48, 9=57, A=65, Z=90, a=97, z=122)

Örnek:     giriş: ‘1234’   çıktı:’25’ Sadece rakam içerdiğinden -> %25 Güçlü
Örnek:     giriş: ‘12#3a4’  çıktı: ‘75’ rakam, küçük harf ve özel karakter içerdiğinden -> %75 Güçlü
 */

public class Main {
    public static void main(String[] args) {
        Scanner klavye=new Scanner(System.in);
        System.out.println("Oluşturduğunuz şifrenin güçlülük derecesini öğrenmek için şifrenizi giriniz");
        String sifre= klavye.nextLine();

        // Girilen şifreyi char dizisine attık
        char []dizi=new char[sifre.length()];
        for (int i=0;i<dizi.length;i++){
            dizi[i]=sifre.charAt(i);

        }
        // char tipi oluşturduğumuz dizin elemanlarının ascı koduyla yeni bir dizi oluşturduk
        // Oluşturduğumuz bu dizi ile rakam,Büyük ve küçük harf,özel karakter sayısını tespit ettik
        int rakam=0,küçükh=0,büyükh=0,özelkarakter=0;
        int[]intdizisi=new int[sifre.length()];
        for (int i=0;i< intdizisi.length;i++){
            intdizisi[i]=(int)dizi[i];
        if (intdizisi[i]>47&&intdizisi[i]<58){
            ++rakam;
        }
        else if (intdizisi[i]>64&&intdizisi[i]<91){
                ++büyükh;
            }
            else if (intdizisi[i]>96&&intdizisi[i]<123){
                ++küçükh;
            }
         else {
            ++özelkarakter;
        }
        }
         // Tespit ettiğimiz değerlerde 0 yoksa güçlüdür
        if (rakam!=0&&büyükh!=0&&küçükh!=0&&özelkarakter!=0){
            System.out.println("Şifreniz güçlüdür istenilen tüm karakterleri içerir. Güçlülük derecesi =  %100");
        }
        // Tespit ettiğimiz değerlerde 0 olduğundan güçlük derecesini hesapladık
        else {
            System.out.print("Şifreniz ");
            int kontrol = 0;             // değiken istenilen karakterlerde 0 olmama durumuna göre artılırdı ve en son
            if (küçükh != 0) {           // güçlülük yüzdesi hesaplandı.
                kontrol++;
                System.out.print("küçük harf , ");
            }
            if (büyükh != 0) {
                kontrol++;
                System.out.print("büyük harf , ");
            }
            if (özelkarakter != 0) {
                kontrol++;
                System.out.print("özel karakter , ");
            }
            if (rakam != 0) {
                kontrol++;
                System.out.print("rakam ");
            }
            System.out.print("içerir. ");
            System.out.println();
            System.out.println("Şifreniz güçlülük derecesi =  %"+kontrol*25);
        }
    }
}