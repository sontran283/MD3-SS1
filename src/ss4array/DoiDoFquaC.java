package ss4_Array;

import java.util.Scanner;

public class DoiDoFquaC {
    // Chương trình chuyển đổi nhiệt độ
    // C = (5.0 / 9) * (F-32)
    // F = (9.0 / 5) * C + 32
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double F;
        double C;
        int choice;

        do {
            System.out.println("menu");
            System.out.println("1- doi do F xang C");
            System.out.println("2- doi do C xang F");
            System.out.println("0- exit");
            System.out.println("nhap lua chon cua ban: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("nhap do F: ");
                    F = scanner.nextDouble();
                    System.out.println("do F qua do C la: " + doFquaC(F));
                    break;
                case 2:
                    System.out.println("nhap do C: ");
                    C = scanner.nextDouble();
                    System.out.println("do C qua do F la: " + doCquaF(C));
                    break;
                case 0:
                    System.exit(0);
                    break;
            }
        } while (choice != 0);
    }

    public static double doFquaC(double C) {
        double F = (9.0 / 5) * C + 32;
        return F;
    }

    public static double doCquaF(double F) {
        double C = (5.0 / 9) * (F - 32);
        return C;
    }
}
