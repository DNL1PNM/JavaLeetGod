package main.java.Array_1;

public class Task20_1572_1MX {
        public static void main(String[] args) {
            int[][] mat = {
                    {1, 2, 3},
                    {4, 5, 6},
                    {7, 8, 9}
            };

            System.out.println(diagonalSum(mat));
        }

        public static int diagonalSum(int[][] mat) {
            int sum = 0;
            int n = mat.length;

            for (int i = 0; i < n; i++) {
                sum += mat[i][i]; // Суммируем элементы на главной диагонали
                sum += mat[i][n - i - 1]; // Суммируем элементы на побочной диагонали
            }

            if (n % 2 != 0) {
                // Если размер матрицы нечетный, вычитаем центральный элемент, так как он был посчитан дважды
                sum -= mat[n / 2][n / 2];
            }

            return sum;
        }
    }
