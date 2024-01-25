import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
 /* Girilen karakterinin sayı mı? , büyük harf mi?, özel karakter mi? küçük harf mi?
 gibi tespitleri yapan programı geliştirme.
Sayısal karakterler (0-9): ASCII kodları 48 ile 57 arasındadır.
Büyük harf karakterleri (A-Z): ASCII kodları 65 ile 90 arasındadır.
Küçük harf karakterleri (a-z): ASCII kodları 97 ile 122 arasındadır.
Kalan ASCI Tablodaki değerlre özel karakter
*/
        Scanner klavye=new Scanner(System.in);
      int uzunluk;
      String karakter;
      do {
          System.out.println("Sisteme türü tespit edilecek karakteri giriniz");
           karakter= klavye.next();
          uzunluk=karakter.length();
      }while (uzunluk!=1);

      char karakter1=karakter.charAt(0);
      int ascı=(int)karakter1;

      Tür(ascı,karakter);

    }
    public static void Tür(int ascı,String karakter){
        if (ascı<58&&ascı>47){
            System.out.println("'"+karakter+"' bir rakamdır ");
        }
       else if (ascı<91&&ascı>64){
            System.out.println("'"+karakter+"'bir büyük harfdir ");
        }
        else if (ascı<123&&ascı>96){
            System.out.println("'"+karakter+"' bir küçük harfdir ");
        }
        else {
            System.out.println("'"+karakter+"' özel bir karakderdir");
        }
    }
}