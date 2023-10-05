package ss4_Array;

import java.util.Scanner;

public class Bt7_SumDuongCheoChinhMaTrix {
    // Bước 1: Tính tổng các phần tử của một ma trận vuông có sẵn
    // Dùng một mảng hai chiều để phản ánh ma trận.
    // Dùng phương pháp khởi tạo nhanh để tạo ra một mảng có sẵn các phần tử. Sử dụng
    // vòng lặp để tính tổng tất cả các phần tử có tọa độ ở hàng ngang và cột dọc bằng
    // nhau. Thông báo cho người dùng.
    // Thực thi chương trình để kiểm tra kết quả, thử với một số giá trị khác nhau để xác
    // nhận rằng chương trình chạy đúng.
    // Bước 2: Thu thập mảng thực từ nhập liệu của người dùng và hoàn thành yêu cầu
    // Viết mã để thay thế mảng được tạo nhanh bằng mảng được tạo ra từ nhập liệu của
    // người dùng. Trước tiên hỏi để biết kích thước ma trận, sau đó sử dụng vòng lặp để
    // lần lượt hỏi từng giá trị của mảng.
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // khai bao bien
        int n;
        int sum = 0;

        System.out.println("nhap vao bac cua ma tran: ");
        n = scanner.nextInt();

        int A[][] = new int[n][n];

        System.out.println("nhap cac phan tu cho ma tran: ");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.println("A [" + i + "] [" + j + "]");
                A[i][j] = scanner.nextInt();
            }
        }

        System.out.println(" ma tran A vua nhap la: ");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.println(A[i][j] + "\t");
            }
            System.out.println("\n");
        }

        // cac phan tu nam tren duong cheo chinh la cac phan tu co chi so dong bang chi so cot
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i == j) {
                    sum += A[i][j];
                }
            }
        }

        // in ra ket qua
        System.out.println(" tong cac phan tu nam tren duong cheo chinh la : " + sum);
    }
}
