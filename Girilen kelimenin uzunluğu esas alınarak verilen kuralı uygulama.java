import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
/*Aşağıda Yaz isimli String tipinde bir değişken yer almaktadır.
 Eğer dışarıdan girilen kelimenin değişkeninin uzunluğu tek ise her bir karakter bir satırda olacak şekilde
ekrana yazdırmaktadır. Eğer kelimenin uzunluğu çift ise
yine her bir karakter bir satırda olacak şekilde tersten yazdırılacaktır.
 */
        Scanner klavye =new Scanner(System.in);
        System.out.println("Lütfen bir kelime giriniz");
        String yaz=klavye.next();
        if (yaz.length()%2!=0){
            tek(yaz);
        }
        else {
          çift(yaz);
        }
    }
    public static void tek(String kelime){
        for (int i=0;i<kelime.length();i++){
            System.out.println(kelime.charAt(i));
        }
     }
    public static void çift(String kelime){
        for (int k=0;k<kelime.length();k++){
            System.out.println(kelime.charAt(kelime.length()-1-k));
        }
    }
}