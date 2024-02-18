/*

Bu derste YurtDisiKurallari adında bir Interface oluşturacağız ve içerisine 3 adet metod yazacağız.
Sonrasında ise Yolcu isimli bir class oluşturarak bu YurtDisiKurallari interfacini implement edeceğiz.
Eğer Yolcu, interface içerisindeki metodların koşullarının 2 tanesini bile yerine getirmezse yurtdışına çıkamayacak.

 */

public class Main {

    public static void main(String[] args) throws InterruptedException { /* throws kısmı kafa karıştırmasın. Aşağıda
                                                                            Main.javayı Threads.sleep ile 3 sn liğine durdurduk
                                                                            ve exception yaptığımızda main metodunun
                                                                            devamına otomatik olarak "throws InterruptedException"
                                                                            ekledi. */ //  21

        // 2. derse geçtik. Programı tamamlayıp çalıştıracağız ve test edeceğiz. //  16

        System.out.println("Sabiha Gökçen Havalimanına Hoşgeldiniz...");

        String sartlar = "Yurtdışı Çıkış Kuralları...\n"
                         +"Herhangi bir siyasi yasağınızın bulunmaması gerekmektedir...\n"
                         +"15 TL harç bedelinizi tam olarak yatırmanız gerekmektedir...\n"
                         +"Gideceğiniz ülkeye vizenizin bulunması gerekmektedir...";

        String message = "Yurtdışı şartlarının hepsini sağlamanız gerekmektedir...";

        while(true) { //  17

            System.out.println("**********************************************************");
            System.out.println(sartlar);
            System.out.println("**********************************************************");

            Yolcu yolcu = new Yolcu(); /* Yolcu class'ında boş olarak tanımladığımız constructor devreye girecek ve kullanıcıdan
                                          değerleri almaya başlayacak. */ //  18

            // Bu aşamada kullanıcıdan bilgiler alındı ve kontrol kısmına geçiş yapıyoruz. //  19

            System.out.println("Harç Bedeli Kontrol Ediliyor..."); /* Programın gerçekten harç bedelini kontrol
                                                                      ediyormuşcasına 3 sn durmasını istiyoruz.*/ //  20

            Thread.sleep(3000); /* 3000 ms cinsinden Main.java'yı 3 sn durdurmuş olduk. Bu konuyu ileride daha
                                         detaylı göreceğiz. */ //  21

            if (yolcu.yurtdisiHarciKontrol() == false) { //  22

                System.out.println(message); // Şartların yer aldığı mesajı kullanıcıya okutuyoruz.
                continue; /* Döngünün en başına gitmek için bu anahtar kelimemizi kullandık. Eğer true değer ise program hemen
                             alt satırdan devam edecek.*/ //  23
            }
            System.out.println("Siyasi Yasak Kontrol Ediliyor...");  //  24

            Thread.sleep(3000); //  25

            if (yolcu.siyasiYasakKontrol() == false) { //  26
                System.out.println(message);
                continue;
            }
            System.out.println("Vize Durumu Kontrol Ediliyor..."); //  27

            Thread.sleep(3000); //  28

            if (yolcu.vizeDurumuKontrol() == false) { //  28
                System.out.println(message);
                continue;
            }
            // Tüm kontroller true döndü ve şartların hepsini sağladık. Programa en son yazı yazdırıp bitiriyoruz. //  29
            System.out.println("İşlemleriniz Tamam! Yurtdışına çıkabilirsiniz... İyi yolculuklar!"); //  30
            break; // Programı sonlandırdık. //  31


        }


    }

}
