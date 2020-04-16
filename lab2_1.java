/*вариант 5
Дан массив A[n]. Найти порядковые номера двух соседних элементов массива, сумма которых максимальна.
Если таких пар элементов несколько, то найти номера всех элементов
 */

import java.util.Scanner;

public class lab2_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.print("Введите размерность вектора.\nn = ");
        n = sc.nextInt();
        while (n <= 0) {
            System.out.print("Размерность введена неверно. Введите размерность вектора еще раз. n>=1.\nn = ");
            n = sc.nextInt();
        }
        int[] A = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.print("A[" + (i + 1) + "] = ");
            A[i] = sc.nextInt();
        }
        int sum_max = A[0] + A[1];
        for (int i = 2; i < n; i++) {
            int temp = A[i] + A[i - 1];
            if (temp > sum_max) {
                sum_max = temp;
            }
        }
        System.out.println("Максимальная сумма соседних элементов = " + sum_max);
        for (int i = 1; i < n; i++) {
            if ((A[i - 1] + A[i]) == sum_max) {
                System.out.println("элемент " + (i - 1) + " и " + i);
            }
        }
    }
}
