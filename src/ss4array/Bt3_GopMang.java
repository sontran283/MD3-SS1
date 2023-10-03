package ss4array;

import java.util.Arrays;
import java.util.Scanner;

public class Bt3_GopMang {

    // Bước 1: Tạo 2 mảng số với kích thước cho trước
    // Bước 2: Sử dụng vòng lặp nhập giá trị cho các phần tử trong mảng
    // Bước 3: Tạo mảng thứ 3 có kích thước bằng kích thước mảng 1 + kích thước mảng 2
    // Bước 4: Sử dụng vòng lặp để duyệt các phần tử trong mảng 1. Lấy từng phần tử
    // trong mảng 1 gán vào từng phần tử trong mảng thứ 3, tính từ phần tử đầu tiên.
    // Bước 5: Sử dụng vòng lặp để duyệt các phần tử trong mảng 2. Lấy từng phần tử
    // trong mảng 2 gán vào phần tử tiếp theo của mảng 3, tính từ phần tử
    // array3[array2.length]
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // tao mang 1
        System.out.println("nhap kich thuoc mang 1");
        int size1 = scanner.nextInt();
        int[] array1 = new int[size1];

        System.out.println("nhap phan tu cua array1: ");
        for (int i = 0; i < array1.length; i++) {
            System.out.println("phan tu thu " + (i + 1) + " :");
            array1[i] = scanner.nextInt();
        }

        // tao mang 2
        System.out.println("nhap kich thuoc mang 2: ");
        int size2 = scanner.nextInt();
        int[] array2 = new int[size2];

        System.out.println("nhap phan tu cua array2: ");
        for (int i = 0; i < array2.length; i++) {
            System.out.println("phan tu thu " + (i + 1) + " :");
            array2[i] = scanner.nextInt();
        }

        // tao mang 3
        int[] array3 = new int[size1 + size2];

        // gan cac phan tu trong mang 1 cho mang thu 3
        for (int i = 0; i < size1; i++) {
            array3[i] = array1[i];
        }

        // gan mang 2 cho mang 3
        for (int i = 0; i < size2; i++) {
            array3[size1 + i] = array2[i];
        }

        // xuat mang
        System.out.println("mang sau khi gop la: ");
        System.out.println(Arrays.toString(array3));
    }
}
