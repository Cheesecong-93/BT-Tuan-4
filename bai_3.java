import java.util.Scanner;

public class bai_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhap so thu nhat: ");
        double so1 = sc.nextDouble();

        System.out.print("Nhap so thu hai: ");
        double so2 = sc.nextDouble();

        System.out.println("Chon phep tinh:");
        System.out.println("1. Cong");
        System.out.println("2. Tru");
        System.out.println("3. Nhan");
        System.out.println("4. Chia");

        System.out.print("Lua chon cua ban: ");
        int choice = sc.nextInt();

        double ketQua;

        switch (choice) {
            case 1:
                ketQua = so1 + so2;
                System.out.println("Ket qua: " + so1 + " + " + so2 + " = " + ketQua);
                break;
            case 2:
                ketQua = so1 - so2;
                System.out.println("Ket qua: " + so1 + " - " + so2 + " = " + ketQua);
                break;
            case 3:
                ketQua = so1 * so2;
                System.out.println("Ket qua: " + so1 + " * " + so2 + " = " + ketQua);
                break;
            case 4:
                if (so2 != 0) {
                    ketQua = so1 / so2;
                    System.out.println("Ket qua: " + so1 + " / " + so2 + " = " + ketQua);
                } else {
                    System.out.println("Loi: Khong the chia cho 0");
                }
                break;
            default:
                System.out.println("Lua chon khong hop le");
        }
        sc.close();
    }
}
