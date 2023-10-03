package ss4array;

import java.util.Arrays;

public class GanMang {
    public static void main(String[] args) {
        int[] mang ={1,2,3,45,6,34,47};
        // thay doi luon ca 2
//        int[] mang1 = mang;
        // mang 1 khong thay doi
        int[] mang1 = mang.clone();

        mang[0] = 111;
        System.out.println(Arrays.toString(mang));
        System.out.println(Arrays.toString(mang1));
    }
}
