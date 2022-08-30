import java.util.Scanner;

public class miniproje7 {
    public static void main(String[] args){
        //Hesap makinesi programı

        Scanner scan = new Scanner(System.in);

        System.out.println("******************************************");
        String islemler = "1. toplama işlemi \n"
                        + "2. çıkarma işlemi \n"
                        + "3. çarpma işlemi \n"
                        + "4. bölme işlemi  ";
        System.out.println( islemler);
        System.out.println("******************************************");
        System.out.print("İşlem seçiniz: ");
        String islem = scan.nextLine();

        double a , b;
        System.out.print("birinci sayı: ");
        a = scan.nextDouble();

        System.out.print("İkinci sayı: ");
        b=scan.nextDouble();

        switch (islem) {
            case "1":
                System.out.println("toplama: " + (a+b));
                break;
            case "2":
                System.out.println("çıkarma: " + (a-b));
                break;
            case "3":
                System.out.println("çarpma: "+ (a*b));
                break;
            case "4":
                System.out.println("bölme: " + (a/b));
                break;
            default:
                System.out.println("Geçersiz işlem..... ");
                break;




        }
    }
}
