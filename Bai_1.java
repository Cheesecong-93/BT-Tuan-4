import java.util.Scanner;


public class Bai_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        
        System.out.print("Nhap mot so: ");
        double so = scanner.nextDouble();

        if (so > 0) {
            System.out.println(so + " la so duong.");
        } else if (so < 0) {
            System.out.println(so + " la so am.");
        } else {
            System.out.println("So vua nhap bang 0.");
        }

        scanner.close();
    }
}

