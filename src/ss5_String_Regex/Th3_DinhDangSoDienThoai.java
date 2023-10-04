package ss5_String_Regex;

import javafx.scene.transform.Scale;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Th4_DinhDangSoDienThoai {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhap so dien thoai");
        String input = scanner.nextLine();

        String regex = "^09\\d{8}$";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(input);

        if (matcher.find()) {
            System.out.println("sdt hop le");
        } else {
            System.out.println(" vui long nhap lai sdt");
        }
    }
}
