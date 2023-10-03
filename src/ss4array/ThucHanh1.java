package ss4array;

import java.util.Scanner;

public class ThucHanh1 {
    // Đảo ngược các phần tử của mảng
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Khai báo các biến, nhập và kiểm tra kích thước mảng
        int size;
        int[] array;
        do {
            System.out.println("nhap vao size: ");
            size = scanner.nextInt();
            if (size > 20) {
                System.out.println("Kích thước không vượt quá 20");
            }
        } while (size > 20);
        // Nhập giá trị cho các phần tử của mảng
        array = new int[size];
        int i = 0;
        while (i < array.length) {
            System.out.println("nhap phan tu " + (i + 1) + ":");
            array[i] = scanner.nextInt();
            i++;
        }

        // In ra mảng đã nhập
        System.out.printf("%-20s%s", "Elements in array: ", "");
        for (int j = 0; j < array.length; j++) {
            System.out.print(array[j] + "\t");
        }

        // Đảo ngược thứ tự các phần tử trong mảng
        // Sử dụng biến trung gian để hoán đổi giá trị giữa 2 phần tử
        for (int j = 0; j < array.length / 2; j++) {
            int temp = array[j];
            array[j] = array[size - 1 - j];
            array[size - 1 - j] = temp;
        }

        // In ra mảng sau khi đã đảo ngược thứ tự các phần tử
        System.out.printf("\n%-20s%s", "Reverse array: ", "");
        for (int j = 0; j < array.length; j++) {
            System.out.print(array[j] + "\t");
        }
    }
}
