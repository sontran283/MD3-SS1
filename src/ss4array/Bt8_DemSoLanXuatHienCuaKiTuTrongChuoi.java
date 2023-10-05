package ss4_Array;

import java.util.Scanner;

public class Bt8_DemSoLanXuatHienCuaKiTuTrongChuoi {
    // Bước 1: Khai báo một chuỗi và gán cho nó một giá trị
    // Bước 2: Khai báo một biến ký tự và gán hoặc nhập từ bàn phím một giá trị.
    // Bước 3: Khai báo biến count và gán giá trị 0, để lưu số ký tự đếm được trong chuỗi
    // Bước 4: Sử dụng vòng lặp duyệt từng ký tự trong chuỗi. Trong quá trình duyệt: so
    // sánh nếu ký tự trong chuỗi bằng ký tự nhập vào thì tăng biến đếm lên 1
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // khai bao bien
        String chuoi;
        char kyTu = 'a';
        int count = 0;

        // cho nguoi dung nhap chuoi abt ki
        System.out.println("nhap vao chuoi bat ki: ");
        chuoi = scanner.nextLine();

        // duyet tu dau den cuoi chuoi
        for (int i = 0; i < chuoi.length(); i++) {
            // neu ki tu tai vi tri i bang 'a' thi tang count len 1
            if (chuoi.charAt(i) == kyTu) {
                count++;
            }
        }

        // in ra ket qua
        System.out.println("so lan xuat hien cua ki tu " + kyTu + " trong chuoi  [" + chuoi + "]  la:  " + count);
    }
}
