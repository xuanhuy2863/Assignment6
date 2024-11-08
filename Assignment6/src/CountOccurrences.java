import java.util.Scanner;

public class CountOccurrences {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap so luong phan tu: ");
        int n = scanner.nextInt();
        int[] array = new int[n];

        System.out.print("Nhap cac phan tu: ");
        for (int i = 0; i < n; i++) {
            array[i] = scanner.nextInt();
        }

        System.out.print("Nhap phan tu can dem: ");
        int element = scanner.nextInt();
        int count = 0;

        for (int num : array) {
            if (num == element) {
                count++;
            }
        }

        System.out.println("Phan tu " + element + " xuat hien " + count + " lan trong mang.");
    }
}