package ss4_Array;

import java.util.Arrays;
import java.util.Scanner;

public class Bt1_XoaPhanTu {
    // Bước 1: Khai báo và khởi tạo mảng số nguyên gồm N phần tử cho trước
    // Bước 2: Nhập X là phần tử cần xoá
    // Bước 3: Tìm X xem có xuất hiện trong mảng không. Nếu xuất hiện chỉ ra vị trí của X. Giả sử vị trí này là: index_del
    // Bước 4: Thực hiện xoá phần tử X khỏi mảng
    //         Duyệt mảng từ vị trí cần xoá (index_del) đến cuối mảng (array.length-1)
    //         Gán phần tử ở vị trí index cho phần tử ở vị trí index + 1
    // Bước 5: Kết thúc duyệt mảng. In ra mảng.
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // khai bao va khoi tao mang
        System.out.print("nhap so luong phan tu trong mang: ");
        int N = scanner.nextInt();
        int[] array = new int[N];

        System.out.println("nhap cac phan tu cua mang: ");
        for (int i = 0; i < array.length; i++) {
            System.out.println("phan tu thu: " + (i + 1) + " : ");
            array[i] = scanner.nextInt();
        }

        // nhap phan tu can xoa
        System.out.println("nhap phan tu can xoa: ");
        int X = scanner.nextInt();

        // tim va chi ra vi tri cua X
        int index_del = -1;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == X) {
                index_del = i;
                break;
            }
        }

        if (index_del != -1) {
            System.out.println("Phần tử " + X + " xuất hiện tại vị trí " + index_del);
        } else {
            System.out.println("Phần tử " + X + " không xuất hiện trong mảng");
            System.exit(0);
        }

        // xoa phan tu X khoi mang
        for (int i = index_del; i < array.length-1; i++) {
            array[i] = array[i+1];
        }
        N--;

        // in ra mang
        System.out.println("mang sau khi xoa la " + X + ":");
        System.out.println(Arrays.toString(array));
    }
}
