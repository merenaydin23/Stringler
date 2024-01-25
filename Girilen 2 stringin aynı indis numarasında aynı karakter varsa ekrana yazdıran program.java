import java.util.*;
/*Girilen 2 stringin aynı olan karekter indis değerleri eşit ise ekrana
yazdıran programın java kodunu yazınız. (Örnek kalem – kelam -> klm)
 */
public class Main {
    public static void  main(String[] args) {
        Scanner klavye=new Scanner(System.in);

        /* nextLine kullanrak cümle girişinede izin verdik eğerki sadece kelime girilsin istiyor
         isek next kullanmak yeteerli */

        System.out.println("Sisteme incelencek 1. veriyi giriniz");
        String veri=klavye.nextLine();
        System.out.println("Sisteme incelencek 2. veriyi giriniz");
        String veri1=klavye.nextLine();

        // burada uzunluğu az olanı temp değişkenine atadık bu sayede fazladan kontorol yapmaktan kacındık
        int temp;
        if (veri.length()<=veri1.length()){
            temp=veri.length();
        }
        else  {
            temp=veri1.length();
        }
        // Aşağıda aynı indisde aynı olan karakter sayısını hesapladık
        int j=0;
        for (int i=0;i<temp;i++) {
            if (veri.charAt(i) == veri1.charAt(i)) {
                j++;
            }
        }
        /* Kurala uyan eleman sayısını bulduktan sonra char dizisi oluşturduk ve kurala uyan elemanları
        diziye yerleştirdik */
        char  []dizi=new char[j];
        int k=0;
        for (int i=0;i<temp;i++){
            if (veri.charAt(i) == veri1.charAt(i)) {
                dizi[k]=veri.charAt(i);
                k++;
            }
        }
        // Foreach yapısını kullanarak dizimizi yazdırdık
        for (char a:dizi){
            System.out.print(a);
        }
    }
}