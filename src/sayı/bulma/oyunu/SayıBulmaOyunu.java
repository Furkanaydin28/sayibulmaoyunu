package sayı.bulma.oyunu;
import java.util.Scanner;
public class SayıBulmaOyunu {
    public static boolean OyunKapansinmi(){
        Scanner scanner = new Scanner (System.in);
        String acmakapama = scanner.nextLine();
        if(acmakapama.equals("q")){
            return true;
        }
        else{
            return false;
            }
        }

    public static void main(String[] args) throws InterruptedException{
        
        long baslama;
        Scanner scanner = new Scanner (System.in);
        System.out.println("---------Sayı Bulma Oyununa Hoşgeldiniz---------");
        Thread.sleep(1000);
        System.out.println("*************************");
        System.out.println("Zorluk Derecesi=>\n"
                + "1.Çok Kolay => 0-10\n"
                + "2.Kolay => 0-50\n"
                + "3.Orta => 0-100\n"
                + "4.Zor => 0-500\n"
                + "5.HARDCORE => 0-1000\n"
                + "6.Free Oyun => 0-Sen Ne Kadar Girersen :)");
        System.out.println("*************************");
        System.out.print("Zorluk Derecesi Giriniz =>");
        String derece=scanner.nextLine();
        System.out.println("*************************");
        //Kullanıcı 1.yi Seçerse 
        if (derece.equals("1")){
            int maxsayi = 10;
             double sayi = (Math.random()*((int)maxsayi));
                System.out.println("Oyun Başlıyor...");
                //Zaman Başlangıcı
                baslama = System.currentTimeMillis();
                while(true){
                    System.out.print("Bir Sayı Giriniz =>");
                    int girilensayi = scanner.nextInt();
                        if (girilensayi==((int)sayi)){
                            System.out.println("Bravo Buldunuz!");
                            break;
                        }else if (girilensayi < (int)sayi){
                            System.out.println("Daha Büyük Bir Sayı Giriniz!");
                        }else {
                            System.out.println("Daha Küçük Bir Sayı Giriniz!");
                        }
            }
                    long bitis = System.currentTimeMillis();
                    long gecensüre = bitis - baslama;
                    double saniye = (double)gecensüre/1000;
                    System.out.println("Geçen Süre:" + (int)saniye);
                    if (saniye < 5) {
                        System.out.println("Puanınız =>100");
                    }else if (saniye < 7) {
                        System.out.println("Puanınız =>90");
                    }else if (saniye < 9) {
                        System.out.println("Puanınız =>80");
                    }else if (saniye < 11) {
                        System.out.println("Puanınız =>70");
                    }else{
                        System.out.println("Ne Yazıkki Puan Alamadınız. Tekrar Deneyiniz!");
                    }
        //Kullanıcı 2.yi Seçerse            
        }else if(derece.equals("2")){
            int maxsayi = 50;
             double sayi = (Math.random()*((int)maxsayi));
                System.out.println("Oyun Başlıyor...");
                baslama = System.currentTimeMillis();
                while(true){
                    System.out.print("Bir Sayı Giriniz =>");
                    int girilensayi = scanner.nextInt();
                        if (girilensayi==((int)sayi)){
                            System.out.println("Bravo Buldunuz!");
                            break;
                        }else if (girilensayi < (int)sayi){
                            System.out.println("Daha Büyük Bir Sayı Giriniz!");
                        }else {
                            System.out.println("Daha Küçük Bir Sayı Giriniz!");
                        }
            }
                    long bitis = System.currentTimeMillis();
                    long gecensüre = bitis - baslama;
                    double saniye = (double)gecensüre/1000;
                    System.out.println("Geçen Süre:" + (int)saniye);
                    if (saniye < 7) {
                        System.out.println("Puanınız =>100");
                    }else if (saniye < 9) {
                        System.out.println("Puanınız =>90");
                    }else if (saniye < 11) {
                        System.out.println("Puanınız =>80");
                    }else if (saniye < 14) {
                        System.out.println("Puanınız =>70");
                    }else{
                        System.out.println("Ne Yazıkki Puan Alamadınız. Tekrar Deneyiniz!");
                    }
        //Kullanıcı 3.yü Seçerse            
        }else if(derece.equals("3")){
            int maxsayi = 100;
             double sayi = (Math.random()*((int)maxsayi));
                System.out.println("Oyun Başlıyor...");
                baslama = System.currentTimeMillis();
                while(true){
                    System.out.print("Bir Sayı Giriniz =>");
                    int girilensayi = scanner.nextInt();
                        if (girilensayi==((int)sayi)){
                            System.out.println("Bravo Buldunuz!");
                            break;
                        }else if (girilensayi < (int)sayi){
                            System.out.println("Daha Büyük Bir Sayı Giriniz!");
                            
                        }else {
                            System.out.println("Daha Küçük Bir Sayı Giriniz!");
                        }
            }long bitis = System.currentTimeMillis();
                    long gecensüre = bitis - baslama;
                    double saniye = (double)gecensüre/1000;
                    System.out.println("Geçen Süre:" + (int)saniye);
                    if (saniye < 11) {
                        System.out.println("Puanınız =>100");
                    }else if (saniye < 14) {
                        System.out.println("Puanınız =>90");
                    }else if (saniye < 17) {
                        System.out.println("Puanınız =>80");
                    }else if (saniye < 21) {
                        System.out.println("Puanınız =>70");
                    }else{
                        System.out.println("Ne Yazıkki Puan Alamadınız. Tekrar Deneyiniz!");
                    }
        //Kullanıcı 4.yü Seçerse            
        }else if(derece.equals("4")){
            int maxsayi = 500;
             double sayi = (Math.random()*((int)maxsayi));
                System.out.println("Oyun Başlıyor...");
                baslama = System.currentTimeMillis();
                while(true){
                    System.out.print("Bir Sayı Giriniz =>");
                    int girilensayi = scanner.nextInt();
                        if (girilensayi==((int)sayi)){
                            System.out.println("Bravo Buldunuz!");
                            break;
                        }else if (girilensayi < (int)sayi){
                            System.out.println("Daha Büyük Bir Sayı Giriniz!");
                        }else {
                            System.out.println("Daha Küçük Bir Sayı Giriniz!");
                        }
            }
                    long bitis = System.currentTimeMillis();
                    long gecensüre = bitis - baslama;
                    double saniye = (double)gecensüre/1000;
                    System.out.println("Geçen Süre:" + (int)saniye);
                    if (saniye < 13) {
                        System.out.println("Puanınız =>100");
                    }else if (saniye < 15) {
                        System.out.println("Puanınız =>90");
                    }else if (saniye < 17) {
                        System.out.println("Puanınız =>80");
                    }else if (saniye < 19) {
                        System.out.println("Puanınız =>70");
                    }else{
                        System.out.println("Ne Yazıkki Puan Alamadınız. Tekrar Deneyiniz!");
                    }
        //Kullanıcı 5.yi Seçerse            
        }else if(derece.equals("5")){
            int maxsayi = 1000;
             double sayi = (Math.random()*((int)maxsayi));
                System.out.println("Oyun Başlıyor...");
                baslama = System.currentTimeMillis();
                while(true){
                    System.out.print("Bir Sayı Giriniz =>");
                    int girilensayi = scanner.nextInt();
                        if (girilensayi==((int)sayi)){
                            System.out.println("Bravo Buldunuz!");
                            break;
                        }else if (girilensayi < (int)sayi){
                            System.out.println("Daha Büyük Bir Sayı Giriniz!");
                        }else {
                            System.out.println("Daha Küçük Bir Sayı Giriniz!");
                        }
                }
                    long bitis = System.currentTimeMillis();
                    long gecensüre = bitis - baslama;
                    double saniye = (double)gecensüre/1000;
                    System.out.println("Geçen Süre:" + (int)saniye);
                    if (saniye < 20) {
                        System.out.println("Puanınız =>100");
                    }else if (saniye < 25) {
                        System.out.println("Puanınız =>90");
                    }else if (saniye < 30) {
                        System.out.println("Puanınız =>80");
                    }else if (saniye < 35) {
                        System.out.println("Puanınız =>70");
                    }else{
                        System.out.println("Ne Yazıkki Puan Alamadınız. Tekrar Deneyiniz!");
                    }
        //Kullanıcı 6.yi Seçerse            
        }else if(derece.equals("6")){
            
            System.out.println("NOT: Bu derecede puanlama Yoktur!.. Ana menüye dönmek için q ya devam etmek için w ya bas...");
            if(OyunKapansinmi()==true){
                System.out.println("Programdan Çıkılıyor...");
                return;
            }
            else{
                System.out.println("Başlıyor...");
            }
                
            
            System.out.print("Maximum Sayıyı Sen Gir =>");
                int maxsayi = scanner.nextInt();
                 double sayi = (Math.random()*((int)maxsayi));
                    System.out.println("Oyun Başlıyor...");
                    while(true){
                        System.out.print("Bir Sayı Giriniz =>");
                        int girilensayi = scanner.nextInt();
                            if (girilensayi==((int)sayi)){
                                System.out.println("Bravo Buldunuz!");
                                break;
                            }else if (girilensayi < (int)sayi){
                                System.out.println("Daha Büyük Bir Sayı Giriniz!");
                            }else {
                                System.out.println("Daha Küçük Bir Sayı Giriniz!");
                            }
             }    
        }
        else{
               System.out.println("Geçersiz İşlem Girdiniz!");
        }   
    }
    
}
