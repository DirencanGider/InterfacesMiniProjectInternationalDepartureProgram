import java.sql.SQLOutput;
import java.util.Scanner;
public class Yolcu implements YurtDisiKurallari { // YurtDisiKurallari iterfaceini Implement ettik. //  4

    private int harc; // Özelliklerimizi ekledik. //  5
    private boolean siyasiYasak; // Özelliklerimizi ekledik. //  5
    private boolean vizeDurumu; // Özelliklerimizi ekledik. //  5

    public Yolcu() { // Contructor'u boş bıraktık. Yukarıdaki özellikleri kullanıcıdan bilgi alarak doldurtacağız. //  7

        Scanner scanner = new Scanner(System.in); // Scanner sınıfından bir scanner objesi tanımladık. //  8

        System.out.print("Yatırdığınız harç bedeli : "); //  9
        this.harc = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Herhangi bir siyasi yasağınız bulunuyor mu ? (evet ya da hayır) "); //  10

        String cevap = scanner.nextLine();

        if (cevap.equals("evet")) {

            this.siyasiYasak = true;
        }
        else {

            this.siyasiYasak = false;
        }

        System.out.print("Vizeniz bulunuyor mu ? (evet ya da hayır)"); //  11

        String cevap2 = scanner.nextLine();

        if (cevap2.equals("evet")) {

            this.vizeDurumu = true;
        }
        else {

            this.vizeDurumu = false;
        }

    }


    // Şimdi YurtDisiKurallar interface'inden implement ettiğimiz fonksiyonlarımızın içini dolduruyoruz. //  12


    @Override
    public boolean yurtdisiHarciKontrol() { //  Metodları interfaceten implement ettik. //  6

        // Yurtdışı harcını bedelinin 15 TL'den düşük olma durumunu kontrol edeceğiz. Düşükse return false dönecek. //  13

        if (this.harc < 15) {

            System.out.println("Lütfen yurtdışı çıkış harcını tam yatırınız...");
            return false;
        }
        else {
            System.out.println("Yurtdışı çıkış harcı işlemi tamamlanmıştır! İyi yolculuklar dileriz...");
            return true;

        }

    }

    @Override
    public boolean siyasiYasakKontrol() { //  Metodları interfaceten implement ettik. //  6

        // Sıra bu metodu doldurmaya geldi. //  14

        if (this.siyasiYasak == true) {

            System.out.println("Siyasi yasağınız bulunuyor. Yurtdışına çıkamazsınız...");
            return false;
        }
        else {
            System.out.println("Siyasi yasağınız bulunmuyor. Yurtdışına çıkabilirsiniz...");
            return true;

        }

    }

    @Override
    public boolean vizeDurumuKontrol() { //  Metodları interfaceten implement ettik. //  6

        // Sıra bu metodu doldurmaya geldi. //  15

        if(this.vizeDurumu == true) {

            System.out.println("Vize işlemleri tamamlanmıştır! İyi yolculuklar dileriz...");
            return true;
        }
        else {

            System.out.println("Gideceğiniz ülke için vizeniz bulunmamaktadır...");
            return false;

        }

    }


}
