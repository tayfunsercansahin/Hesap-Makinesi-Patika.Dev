import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int n1, select;
        double n2;

        Scanner input = new Scanner(System.in);

        System.out.print("Ilk sayiyi giriniz: ");
        n1 = input.nextInt();
        System.out.print("Ikinci sayiyi giriniz: ");
        n2 = input.nextInt();

        System.out.println("1.Toplama\n2.Cikarma\n3.Carpma\n4.Bolme");
        System.out.print("Hangi islemi secmek istiyorsunuz?: ");
        select = input.nextInt();

        if (select == 1){
            System.out.println(n1 + " + " + n2 + " = " + (n1 + n2));
        }
        else if (select == 2){
            System.out.println(n1 + " - " + n2 + " = " + (n1 - n2));
        }
        else if (select == 3){
            System.out.println(n1 + " * " + n2 + " = " + (n1 * n2));
        }
        else if (select == 4){
            if (n2 != 0) {
                System.out.println(n1 + " / " + n2 + " = " + (n1 / n2));
            }
            else {
                System.out.println("Bir sayi 0'a bolunemez!");
            }
        }
        else {
            System.out.println("Lutfen 1-4 arasinda bir islem giriniz!");
        }

        switch(select){
            case 1:
                System.out.println(n1 + " + " + n2 + " = " + (n1 + n2));
                break;
            case 2:
                System.out.println(n1 + " - " + n2 + " = " + (n1 - n2));
                break;
            case 3:
                System.out.println(n1 + " * " + n2 + " = " + (n1 * n2));
                break;
            case 4:
                if (n2!=0) {
                    System.out.println(n1 + " / " + n2 + " = " + (n1 / n2));
                }
                else {
                    System.out.println("Bir sayi 0'a bolunemez!");
                }
                break;
            default:
                System.out.println("Lutfen 1-4 arasinda bir islem giriniz!");
        }

    }
}
