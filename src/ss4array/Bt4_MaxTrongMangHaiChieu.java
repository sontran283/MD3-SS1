package ss4array;

import java.util.Scanner;

public class Bt4_MaxTrongMangHaiChieu {
    // Bước 1: Tìm phần tử lớn nhất của ma trận có sẵn
    // Dùng mảng hai chiều để phản ánh ma trận.
    // Dùng phương pháp khởi tạo nhanh để tạo ra ma trận có sẵn các phần tử. Khai báo
    // một biến số thực để chứa giá trị lớn nhất tìm kiếm được, và hai số nguyên để chứa
    // tọa độ của giá trị lớn nhất tìm kiếm được, đặt cho những biến đó giá trị tương ứng
    // của một phần tử ở tọa độ bất kỳ trong ma trận. Sử dụng vòng lặp để duyệt qua hết
    // các phần tử của ma trận, cập nhật kết quả mỗi khi tìm thấy giá trị lớn hơn.
    // Thông báo cho người dùng kết quả tìm thấy được sau khi duyệt hết ma trận.
    // Thực thi chương trình để kiểm tra, thử với một số giá trị khác nhau để xác nhận rằng
    // chương trình chạy đúng

    // Bước 2: Thu thập đầu vào thực từ nhập liệu của người dùng và hoàn thành yêu cầu
    // Viết mã để thay thế ma trận được tạo nhanh bằng ma trận được tạo ra từ nhập liệu
    // của người dùng. Hỏi để biết kích thước ma trận, sau đó sử dụng vòng lặp để lần lượt
    // hỏi từng giá trị của ma trận.
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // nhap kich thuoc ma tran
        System.out.println("nhap so hang cua ma tran: ");
        int rows = scanner.nextInt();
        System.out.println("nhap so cot cua ma tran: ");
        int columns = scanner.nextInt();

        // tao ma tran co kich thuoc tu nguoi dung
        int[][] matrix = new int[rows][columns];

        // nhap phan tu cho tung cot, hang trong matrix
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                System.out.println("phan tu thu  [" + i + "] [" + j + "] : ");
                matrix[i][j] = scanner.nextInt();
            }
        }

        // tim phan tu lon nhat trong matrix
        int max = matrix[0][0];
        int maxRow = 0;
        int maxCol = 0;

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                if (matrix[i][j] > max) {
                    max = matrix[i][j];
                    maxRow = i;
                    maxCol = j;
                }
            }
        }

        // in ra ket qua
        System.out.println("phan tu lon nhat cua ma tran la: " + max);
        System.out.println("toa do cua phan tu lon nhat la [" + maxRow + "] [" + maxCol + "] : ");
    }
}
