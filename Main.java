import com.sun.source.tree.BinaryTree;

import java.util.Scanner;
public class Main {
    static int toplama(int a ,int b){
        int result  = a+b;
        System.out.print("Toplam : " + result);
        return result;
    }
    static int cikarma(int a, int b){
        int result = a-b;
        System.out.println("Sonuç :" + result );
        return result;
    }
    static int carp(int a , int b){
        int result = a * b;
        System.out.println("Sonuç : " + result);
        return result;
    }
    static int bolme(int a , int b ){
        if (b <= 0){
            System.out.print("Hatalı İşlem !");
            return 0;
        }
        int result = a / b;
        System.out.println("Sonuç : " + result);
        return result;
    }
    static int usluSayi(int a , int b){
        int result = 1 ;
        for (int i= 1; i<= b; i++){
         result *= a;
        }
        return result;

    }static int fac(int a , int b){
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int result = 1;
        for (int i =1; i<=n; i++){
            result *= i;
        }
        System.out.print("Sonuç : " + result);
            return result;
    }static int mod(int a , int b){
        int result = a % b;
        System.out.print("Sonuç : " + result);
        return result;
    }static void dikceval(int a, int b) {
        System.out.println("Çevresi : " + 2 * (a + b));
        System.out.println("Alan : " + a * b);

    }
    public static void main(String[] args) {
        int select ;
        Scanner input = new Scanner(System.in);

        String islemler = "1- Toplama İşlemi\n"
                +"2- Çıkarma İşlemi\n"
                +"3- Çarpma İşlemi\n"
                +"4- Bölme İşlemi\n"
                +"5- Üslü Sayı Hesaplama\n"
                +"6- Faktöriyel Hesaplama\n"
                +"7- Mod Alma\n"
                +"8- Dikdörtgen Alan ve Çevre Hesabı\n"
                +"0- Çıkış ";

        while (true){
            System.out.print(islemler);
            System.out.println();
            System.out.println("İşlem Seçiniz : ");
            select = input.nextInt();
            if (select==0){
                break;
            }
            System.out.print("İLK SAYI : ");
            int a = input.nextInt();
            System.out.print("İKİNCİ SAYI : ");
            int b = input.nextInt();

            switch (select){
                case 1:
                    toplama(a,b);
                    break;
                case 2:
                    cikarma(a,b);
                    break;
                case 3:
                    carp(a,b);
                    break;
                case 4:
                    bolme(a,b);
                    break;
                case 5:
                    usluSayi(a,b);
                    break;
                case 6:
                    fac(a,b);
                    break;
                case 7:
                    mod(a,b);
                    break;
                case 8:
                    dikceval(a,b);
                    break;
                default:
                    System.out.println("HATALI GİRİŞ !");
            }

        }
        System.out.println("GÜLE GÜLE :)");





    }
}