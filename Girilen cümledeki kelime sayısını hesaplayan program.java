import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner klavye =new Scanner(System.in);

        // Girilen cümledeki kelime sayısını hesaplayan program

        System.out.println("Lütfen cümle giriniz");
        String cümle= klavye.nextLine();

        System.out.println("Cümleniz toplam "+ cümle.length()+" karakterden oluşmaktadır");

        // Boşluk sayısına bakılıp kelimeler sayılacak
        // Ali ve ayşe okula geldi   4 boşluk 5 kelime yani  kelime = boşluk +1;
        int kelime=1;

        // Öncelikle girilen cümlenin indislerindeki harflerin char karşılığını bulduk
        // sonrasında bulduğumuz char veri tipine göre ascı kodlarını tespit ettik
        // boşluğun ascı kodu = 32 dir. Bu bilgiyi kullanrak boşluk saydık.

        for (int i=0;i<cümle.length();i++){
            char karakter=cümle.charAt(i);
            int karakterkod=(int) karakter;
            if (karakterkod==32){
                kelime++;
            }
        }

       /*  Eğerki biz  boşluk karakterinin ascı kodunu bilmeseydik aşağıdaki farklı yöntemi izleyebilridik

            for (int i=0;i<cümle.length();i++){
            if (cümle.charAt(i)==' '){
                kelime++;
            }
        }
*/

        System.out.println("Girilen '"+cümle+"' cümlesi "+kelime+" kelimeden oluşmaktadır");
    }
}