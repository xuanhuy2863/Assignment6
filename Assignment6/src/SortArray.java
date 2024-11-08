import java.util.Arrays;
import java.util.Scanner;

public class SortArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap so luong phan tu: ");
        int n = scanner.nextInt();
        int[] array = new int[n];

        System.out.print("Nhap cac phan tu: ");
        for (int i = 0; i < n; i++) {
            array[i] = scanner.nextInt();
        }

        Arrays.sort(array);
        System.out.println("Mang sau khi sap xep: " + Arrays.toString(array));
    }
}