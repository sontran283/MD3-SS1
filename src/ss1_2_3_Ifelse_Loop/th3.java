import java.util.Scanner;

public class th3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true){
            System.out.println("Nhap so ban muon doc");
            int number = scanner.nextInt();
            if ((docHangTram(number) != "err") && (docHangChuc(number) != "err") && (docHangDV(number)) != "err") {
                System.out.println(docHangTram(number) + " " + docHangChuc(number) + " " + docHangDV(number));
            } else {
                System.out.println("Nhập sai mời nhập lại");
            }
        }
    }

    public static String docHangDV(int number) {
        int num = number%10;
        switch (num) {
            case 0:
                return "";
            case 1:
                return "mot";
            case 2:
                return "hai";
            case 3:
                return "ba";
            case 4:
                return "bon";
            case 5:
                return "năm";
            case 6:
                return "sáu";
            case 7:
                return "bảy";
            case 8:
                return "tám";
            case 9:
                return "chín";
            default:
                return "err";
        }
    }
    public static String docHangChuc(int number) {
        int num = number%100/10;
        switch (num) {
            case 0:
                return "";
            case 1:
                return "mười";
            case 2:
                return "hai mươi";
            case 3:
                return "ba mươi";
            case 4:
                return "bốn mươi";
            case 5:
                return "năm mươi";
            case 6:
                return "sáu mươi";
            case 7:
                return "bảy mươi";
            case 8:
                return "tám mươi";
            case 9:
                return "chín mươi";
            default:
                return "err";
        }
    }
    public static String docHangTram(int number) {
        int num = number/100;
        switch (num) {
            case 0:
                return "";
            case 1:
                return "Một trăm";
            case 2:
                return "hai trăm";
            case 3:
                return "ba trăm";
            case 4:
                return "bốn trăm";
            case 5:
                return "năm trăm";
            case 6:
                return "sáu trăm";
            case 7:
                return "bảy trăm";
            case 8:
                return "tám trăm";
            case 9:
                return "chín trăm";
            default:
                return "err";
        }
    }
}