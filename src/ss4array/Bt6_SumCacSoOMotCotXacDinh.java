package ss4array;

public class Bt6_SumCacSoOMotCotXacDinh {
    public static void main(String[] args) {
        int[][] matrix = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

        int index = 1; // cot xac dinh
        int sum = 0;

        for (int i = 0; i < matrix.length; i++) {
            sum += matrix[i][index];
        }
        System.out.println("tong cac so o cot " + index + " la: " + sum);
    }

}
