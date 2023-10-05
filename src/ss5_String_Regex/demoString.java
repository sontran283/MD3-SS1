package ss5_String_Regex;

public class String {
    public static void main(java.lang.String[] args) {
        //  compareTo   va   compareToIgnoreCase
        java.lang.String s1 = "java";
        java.lang.String s2 = "JAVA";

        System.out.println("ket qua so sanh s1, s2 la: " + s1.compareTo(s2));
        System.out.println("ket qua so sanh s1, s2 neu ko phan biet hoa thuong la: " + s1.compareToIgnoreCase(s2));

        //  endsWith     va    contains
        java.lang.String s = "hello java";
        System.out.println("kiem tra s co ket thuc bang s1 hay khong: " + s.endsWith(s1));
        System.out.println("kiem tra s co chua s1 hay ko: " + s.contains(s1));
        System.out.println("kiem tra s co chua s2 hay ko: " + s.toUpperCase().contains(s2.toUpperCase()));

        // StringBuilder
        StringBuilder stringBuilder = new StringBuilder("hello");
        stringBuilder.append(" ");
        stringBuilder.append("java");
        stringBuilder.insert(6, "python, ");   // insert  chen chu vao giua
        stringBuilder.delete(6, 14);
        System.out.println(stringBuilder.reverse().toString());
    }
}
