import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // kullanıcın girdiği cümlede sectiği karakterden kaç adet olduğunu gösteren program

        Scanner klavye=new Scanner(System.in);
        System.out.println("Lütfen sisteme metni giriniz");
        String metin= klavye.nextLine();

        System.out.println("Girdiğiniz metin "+metin.length()+" karakterden oluşmaktadır");

        // sadece 1 adet içermeli bunun kontrolünü do while ile yapıyoruz
        int uzunluk;
        String istenilen;
        do {
            System.out.println("Sizin metinde sayısını görmek istediğiniz karakteri uygun bir şekilde giriniz.");
             istenilen = klavye.next();
            uzunluk = istenilen.length();
        }while (uzunluk!=1);

        int sayac=0;
        for (int i=0;i<metin.length();i++){
            if (metin.charAt(i)==istenilen.charAt(0)){
                sayac++;
            }
        }

    System.out.println("Girdiğiniz metinde '"+istenilen+"' karakterinden toplam "+sayac+" adet vardır");



    }
}