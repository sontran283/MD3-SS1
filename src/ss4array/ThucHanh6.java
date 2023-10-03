package ss4array;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class ThucHanh6 {
    // viet chuong trinh tao 1 mang 1 chieu gom cac phan tu la so nguyen, co n phan tu ngau nhien, n do ng dung nhap vao
    // xuat cac gia tri trong mang
    // dao nguoc mang, va xuat mang sau khi dao nguoc
    // sap xep mang tang dan
    // tinh tong cac phan tu trong mang
    // cho ng dung nhap so bat ki, kiem tra so do co ton tai trong mang hay khong, neu co xaut ra vi tri index cua so do trong mang
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        System.out.println("moi nhap vao phan tu cua mang: ");
        int number = scanner.nextInt();

        // tao mang gom n phan tu
        int[] array = new int[number];
        System.out.println(Arrays.toString(array));

        // tao cac phan tu ngau nhien cho mang
        for (int i = 0; i < array.length; i++) {
            int ngauNhien = random.nextInt(99);
            array[i] = ngauNhien;
        }

        // xuat cac gia tri trong mang
        System.out.println("mang ngau nhien vua tao ra la: ");
        System.out.println(Arrays.toString(array));

        for (int i = 0, j = array.length - 1; i < j; i++, j--) {
            int temp = array[i];
            array[i] = array[j];
            array[j] = temp;
        }

        // xuat mang sau khi dao nguoc
        System.out.println("mang sau khi dao dao nguoc la: ");
        System.out.println(Arrays.toString(array));

        // sap xep mang tang dan
        Arrays.sort(array);
        System.out.println("mang sau khi sap xep la: ");
        System.out.println(Arrays.toString(array));

        // tinh tong cac phan tu trong mang
        int sum = 0;
        for (int pt : array) {
            sum += pt;
        }
        System.out.println("tong cac phan tu trong mang la " + sum);

        // kiem tra xem co ton tai trong mang hay khong
        System.out.println("nhap vao so bat ki");
        int so = scanner.nextInt();
        boolean check = false;
        String viTri = "";
        for (int i = 0; i < array.length; i++) {
            if (array[i] == so) {
                check = true;
                viTri += (i + "");  // kiem tra array[i] == so, lay gia tri index
            }
        }
        if (check) {
            System.out.println(so + " ton tai trong mang voi vi tri index la: " + viTri + ",");
        } else {
            System.out.println(" khong ton tai trong mang");
        }
    }
}
