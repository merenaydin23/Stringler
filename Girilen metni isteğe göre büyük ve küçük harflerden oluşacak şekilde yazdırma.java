import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Girilen metni isteğe göre büyük ve küçük harflerden oluşacak şekilde yazdırma

        Scanner klavye=new Scanner(System.in);
        System.out.println("Lütfen metni giriniz");
        String metin = klavye.nextLine();
        System.out.println("Girilen metin "+metin.length()+ " karakterden oluşmaktadır ");

        int yön;
        do {
            System.out.println("Girilen metni büyük harflerle yazdırma için 1'i");
            System.out.println("Girilen metni küçük harflerle yazdırma için 2 yi tuşlayın");
            yön= klavye.nextInt();
        }while (yön!=1&&yön!=2);


        if (yön==1){
            System.out.println("İsteğini üzere metin büyük harfe çevrilmiştir ....");
            System.out.println(metin.toUpperCase());
        }
        else{
            System.out.println("İsteğini üzere metin küçük harfe çevrilmiştir ....");
            System.out.println(metin.toLowerCase());
        }
    }
}