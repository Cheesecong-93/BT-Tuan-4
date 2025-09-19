import java.util.Scanner;

public class bai_10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhap so phan tu ban dau: ");
        int n = sc.nextInt();
        int[] arr = new int[100];

        System.out.print("Nhap mang: ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.print("Mang ban dau: ");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();

        System.out.println("Nhap lua chon cua ban");
        System.out.println("1. Them phan tu");
        System.out.println("2. Xoa phan tu");
        int choice = sc.nextInt();

        switch (choice) {
            case 1:
                System.out.print("Nhap gia tri can them: ");
                int value = sc.nextInt();
                System.out.print("Nhap vi tri can them: ");
                int indexAdd = sc.nextInt();

                if (indexAdd >= 0 && indexAdd <= n) {
                    for (int i = n; i > indexAdd; i--) {
                        arr[i] = arr[i - 1];
                    }
                    arr[indexAdd] = value;
                    n++;
                    System.out.print("Mang sau khi them: ");
                    for (int i = 0; i < n; i++) {
                        System.out.print(arr[i] + " ");
                    }
                    System.out.println();
                } else {
                    System.out.println("Vi tri khong hop le!");
                }
                break;

            case 2:
                System.out.print("Nhap vi tri can xoa: ");
                int indexDel = sc.nextInt();

                if (indexDel >= 0 && indexDel < n) {
                    for (int i = indexDel; i < n - 1; i++) {
                        arr[i] = arr[i + 1];
                    }
                    n--;
                    System.out.print("Mang sau khi xoa: ");
                    for (int i = 0; i < n; i++) {
                        System.out.print(arr[i] + " ");
                    }
                    System.out.println();
                } else {
                    System.out.println("Vi tri khong hop le");
                }
                break;

            default:
                System.out.println("Lua chon khong hop le");
        }

        sc.close();
    }
}
