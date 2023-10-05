package ss4_Array;

import java.util.Arrays;
import java.util.Scanner;

public class Bt2_ThemPhanTu {
    // Bước 1: Khai báo và khởi tạo mảng số nguyên gồm N phần tử cho trước.
    // Bước 2: Nhập X là số cần chèn
    // Bước 3: Nhập vào vị trí index cần chèn X vào trong mảng
    // Bước 4: Nếu index <= -1 và index >= array.length – 1 thì hiển thị không chèn được phần tử vào mảng
    // Bước 5: Thực hiện chèn phần tử X ở vị trí index vào mảng
    // Bước 6: In ra mảng
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // khai bao va khoi tao mang
        System.out.println("nhap so luong phan tu cua mang: ");
        int N = scanner.nextInt();
        int[] array = new int[N];

        System.out.println("nhap cac phan tu cua mang: ");
        for (int i = 0; i < array.length; i++) {
            System.out.println("phan tu thu: " + (i + 1) + " : ");
            array[i] = scanner.nextInt();
        }

        // nhap phan tu X can chen vao mang
        System.out.println("nhap phan tu can them: ");
        int X = scanner.nextInt();


        // nhap vi tri can them
        System.out.println("nhap vi tri can them: ");
        int index = scanner.nextInt();


        // tim ra vi tri index
        if (index <= -1 || index >= array.length - 1) {
            System.out.println("phan tu " + X + " khong chen duoc phan tu vao mang ");
            System.exit(0);
        }

        // them phan tu X vao mang
        for (int i = N -1; i < index; i++) {
            array[i + 1] = array[i];
        }
        array[index] = X;
        N++;

        // in ra mang
        System.out.println("mang sau khi them la: ");
        System.out.println(Arrays.toString(array));
    }
}
