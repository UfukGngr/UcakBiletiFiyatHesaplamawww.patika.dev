import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int mesafe=0,yas,yolculukTipi;
        double biletFiyati = 0,indirim=0;
        String error="Hatalı veri girdiniz";

        Scanner scan=new Scanner(System.in);
        System.out.print("Mesafeyi km cinsinden giriniz: ");
        mesafe=scan.nextInt();

        System.out.print("Yaşınızı giriniz: ");
        yas=scan.nextInt();

        System.out.print("Yolculuk tipini giriniz (1=> Tek yön, 2=> Gidiş-Dönüş): ");
        yolculukTipi= scan.nextInt();


        if (yas>0 && mesafe>0) {
            biletFiyati=mesafe*0.1;
            if (yas < 12) {
                indirim = biletFiyati *1/2;
            } else if (yas >= 12 && yas < 24) {
                indirim = biletFiyati * 1 / 10;
            } else if (yas > 65) {
                indirim = biletFiyati * 3 / 10;
            }
            biletFiyati=biletFiyati-indirim;

            switch (yolculukTipi){
                case 1:
                    System.out.println(biletFiyati);
                    break;
                case 2:
                    indirim=biletFiyati*1/5;
                    biletFiyati=2*(biletFiyati-indirim);
                    System.out.println(biletFiyati);
                    break;
                default:
                    System.out.println(error);
            }

        }else
            System.out.println(error);
        
    }
}