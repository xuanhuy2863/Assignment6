import java.util.Scanner;

public class SumAndAverage {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap so luong phan tu: ");
        int n = scanner.nextInt();
        int[] array = new int[n];

        System.out.print("Nhap cac phan tu: ");
        for (int i = 0; i < n; i++) {
            array[i] = scanner.nextInt();
        }

        int totalSum = 0;
        for (int num : array) {
            totalSum += num;
        }

        double average = (double) totalSum / n;
        System.out.println("Tong: " + totalSum);
        System.out.println("Trung binh: " + average);
    }
}