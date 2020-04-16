/*вариант 5
Дана матрица A[n][n].
Сформировать вектор B из элементов строк, в которых находится минимальный элемент,
и столбцов, в которых находится максимальный элемент матрицы.
Отсортировать вектор B по возрастанию.
*/

import java.util.Arrays;
import java.util.Scanner;

public class lab2_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите размерность матрицы n x n. \nn = ");
        int n = sc.nextInt();
        while (n <= 0) {
            System.out.print("Размерность введена неверно. Введите n > 0.\nn = ");
            n = sc.nextInt();
        }
        int[][] A = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print("A[" + (i + 1) + "][" + (j + 1) + "] = ");
                A[i][j] = sc.nextInt();
            }
        }
        //int[][] A = {{1, 7, 8, 0, 5}, {1, 7, 3, 9, 7}, {11, 5, 13, 9, 7}, {16, 3, 18, 7, 0}, {21, 2, 23, 4, 7}};
        int max_i = 0;
        int max_j = 0;
        int min_i = 0;
        int min_j = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (A[i][j] > A[max_i][max_j]) {
                    max_i = i;
                    max_j = j;
                }
                if (A[i][j] < A[min_i][min_j]) {
                    min_i = i;
                    min_j = j;
                }
                System.out.print(A[i][j] + "\t");
            }
            System.out.println();
        }
        int[] B = new int[n + n];
        int t = 0;
        System.out.println("Полученный вектор:");
        for (int j = 0; j < n; j++) {
            B[t] = A[min_i][j];
            System.out.print(B[t] + "\t");
            t++;
        }
        for (int i = 0; i < n; i++) {
            B[t] = A[i][max_j];
            System.out.print(B[t] + "\t");
            t++;
        }
        System.out.print("\nСортировка: ");
        int count = 1;
        for (int i = 0; i < B.length - 1; i++) {
            for (int j = i + 1; j < B.length; j++) {
                if (B[i] < B[j]) {
                    int temp = B[i];
                    B[i] = B[j];
                    B[j] = temp;
                }
                System.out.println("\nШаг " + count);
                for (int k = 0; k < B.length; k++) {
                    System.out.print(B[k] + "\t");
                }
                count++;
            }
        }
        System.out.println("\n\nОтсортированный вектор методом пузырька: ");
        for (int k = 0; k < B.length; k++) {
            System.out.print(B[k] + "\t");
        }
        System.out.println("\n\nОтсортированный вектор методом sort(): ");
        Arrays.sort(B);
        for (int k = 0; k < B.length; k++) {
            System.out.print(B[k] + "\t");
        }
    }
}
