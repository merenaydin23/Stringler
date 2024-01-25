import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
      // Palindromik cümle olup olmadığını tespit eden program

        Scanner klavye=new Scanner(System.in);

        System.out.println("Lütfen palindromik durumu incelenecek cümleyi giriniz");
        String cümle = klavye.nextLine();
        System.out.println("Girilen kelime "+cümle.length()+" karakterden oluşmaktadır");

        // Bu döngünde baştan ve sondan başlıyarak karakter karşılaştırması yaptık.
        for (int i=0;i<cümle.length();i++){
        if (cümle.charAt(i)!=cümle.charAt(cümle.length()-1-i)){
            System.out.println(cümle+ " cümlesi Palindromik değildir");
            System.exit(23);
        }
        }
        System.out.println(cümle+ " cümlesi" + " Palindromikdir");
    }
}