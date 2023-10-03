package ss4array;

import java.util.Scanner;

public class DemSinhVien {
    // Ứng dụng đếm số lượng sinh viên thi đỗ
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int STT;
        int[] array;

        do {
            System.out.println("nhap vao STT: ");
            STT = scanner.nextInt();
            if (STT > 20) {
                System.out.println("khong duoc vuot qua 20");
            }
        } while (STT > 20);
        // nhap gia tri cho cac phan tu trong mang
        array = new int[STT];
        int i = 0;
        while (i < array.length) {
            System.out.println("nhap diem cho hoc sinh " + (i + 1) + " : ");
            array[i] = scanner.nextInt();
            i++;
        }

        // Sử dụng vòng lặp for để in ra danh sách điểm vừa nhập, đồng thời đếm số lượng sinh viên thi đỗ
        int count = 0;
        System.out.print("danh sach diem: ");
        for (int j = 0; j < array.length; j++) {
            System.out.print(array[j] + "\t");
            if (array[j] >= 5 && array[j] <= 10) ;
            count++;
        }
        System.out.print(" \n  so hoc sinh do la: " + count);
    }
}
