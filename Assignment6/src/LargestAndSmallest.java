import java.util.Scanner;

public class LargestAndSmallest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap so luong phan tu: ");
        int n = scanner.nextInt();
        int[] array = new int[n];

        System.out.print("Nhap cac phan tu: ");
        for (int i = 0; i < n; i++) {
            array[i] = scanner.nextInt();
        }

        int largest = array[0];
        int smallest = array[0];

        for (int num : array) {
            if (num > largest) {
                largest = num;
            }
            if (num < smallest) {
                smallest = num;
            }
        }

        System.out.println("Phan tu lon nhat: " + largest);
        System.out.println("Phan tu nho nhat: " + smallest);
    }
}