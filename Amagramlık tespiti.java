import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
/*
Parametre olarak verilen iki kelimenin anagram olup olmadığını bulan yordamı yazınız.
 Eğer iki kelime anagram ise aynı karakterleri herhangi bir sırada içerebilirler.
Örnek 1:
iklim - kilim, uyku - kuyu, ...
*/
        Scanner klavye=new Scanner(System.in);
        System.out.println("1. kelimeyi giriniz" );
        String kelime1=klavye.next();
        System.out.println("2. kelimeyi giriniz");
        String kelime2= klavye.next();
        boolean anagrammi=true;
        if (kelime1.length()!=kelime2.length()){
            anagrammi=false;
            System.out.println("Girdiğiniz kelimelerin uzunluları aynı olmadığından anagram kontolü yapılmaz");
        }
        else {
         if (kontrol(kelime1,kelime2)){
             System.out.println("Girdiğiniz kelimeler anagramdır");
         }
         else {
             System.out.println("Girdiğiniz kelimeler anagram değildir");
         }
        }
    }


    /*  Bu fonskiyonda girilen kelimeyi char tipine cevirdik
      Char tipi karakterlerin ascı kodlarını yazdık
     Ascı kodlarına göre yazılan dizi elemanlarını sıraladık
     Sıralana dizini eşit olup olmadığını kkontrol ettik
     Eşitse anagram dedik */

    public static boolean kontrol(String kelimea,String kelimeb){
        int [] dizi1=new int[kelimea.length()];
        int [] dizi2=new int[kelimeb.length()];
    for (int i=0;i<kelimea.length();i++) {
        char karakter=kelimea.charAt(i);
        dizi1[i]=(int)karakter;
    }
    for (int i=0;i<dizi1.length;i++){
        char karakter=kelimeb.charAt(i);
        dizi2[i]=(int) karakter;
    }
     // Ascı kodlarına cevrilen karakterler dizi şeklinde  sıralanacak
        for (int i=0;i<dizi1.length;i++) {
            for (int j = i + 1; j < dizi1.length; j++) {
                if (dizi1[i] > dizi1[j]) {
                    int temp = dizi1[j];
                    dizi1[j] = dizi1[i];
                    dizi1[i] = temp;
                }
            }
        }
        for (int i=0;i<dizi2.length;i++) {
            for (int j = i + 1; j < dizi2.length; j++) {
                if (dizi2[i] > dizi2[j]) {
                    int temp = dizi2[j];
                    dizi2[j] = dizi2[i];
                    dizi2[i] = temp;
                }
            }
        }
     if (Arrays.equals(dizi1,dizi2)){    // Dizilerde eşitlik durumunu Arrays.equals metotu ile kontrol ediyoruz.
         return true;
     }
     else {
         return  false;
     }
    }
}