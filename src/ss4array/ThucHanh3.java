package ss4array;

import java.util.Scanner;

public class ThucHanh3 {
    // Tìm giá trị lớn nhất trong mảng
    public static void main(String[] args) {

        // Khai báo các biến, nhập và kiểm tra kích thước mảng
        int size;
        int[] array;
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println("nhap vao size: ");
            size = scanner.nextInt();
            if (size > 20) {
                System.out.println("khong duoc vuot qua 20");
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

        // In ra danh sách tài sản đã nhập
        System.out.println("Danh sách tài sản: ");
        for (int j = 0; j < array.length; j++) {
            System.out.println(array[j] + "\t");
        }

        // Duyệt các phần tử trong mảng để tìm GTLN và vị trí
        int max = array[0];
        int index = 1;
        for (int j = 0; j < array.length; j++) {
            if (array[j] > max) {
                max = array[j];
                index = j + 1;
            }
        }
        System.out.println("gia tri lon nhat trong danh sach la " + max + " tai vi tri " + index);
    }
}
