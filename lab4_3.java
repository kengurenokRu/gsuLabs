/*Отредактировать заданное предложение, удаляя из него слова, которые встречаются в предложении n раз.
 */

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class lab4_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Исходное предложение: ");
        String str = sc.nextLine();
        System.out.println("Введите n: ");
        int n = sc.nextInt();
        String[] strArr = str.split(" ");
        Arrays.sort(strArr);
        int count = 1;
        int i = 1;
        while (i < strArr.length) {
            for (int j = i; j < strArr.length; j++) {
                if (strArr[j - 1].equals(strArr[j])) {
                    count++;
                } else {
                    i = j;
                    break;
                }
            }
            if (count == n) {
                for (int j = 0; j < n; j++) {
                    int temp = str.indexOf(strArr[i - 1]);
                    str = new StringBuffer(str).delete(temp, temp + strArr[i - 1].length()).toString();
                }
            }
            count = 1;
            i++;
        }
        System.out.println("Полученная строка: ");
        System.out.println(str);
    }
}
