import java.util.Scanner;

public class bai_6 {
    public static int ucln(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return Math.abs(a); 
    }

    public static int bcnn(int a, int b) {
        return Math.abs(a * b) / ucln(a, b);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhap so thu nhat: ");
        int so1 = sc.nextInt();

        System.out.print("Nhap so thu hai: ");
        int so2 = sc.nextInt();

        System.out.println("UCLN cua " + so1 + " va " + so2 + " la: " + ucln(so1, so2));
        System.out.println("BCNN cua " + so1 + " va " + so2 + " la: " + bcnn(so1, so2));

        sc.close();
    }
}
