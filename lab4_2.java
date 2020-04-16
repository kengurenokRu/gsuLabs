/*Дана строка.
Если она начинается на 'abc', то заменить их на 'www', иначе добавить в конец строки 'zzz'
 */

import com.sun.jdi.Value;

import java.util.Scanner;

public class lab4_2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Исходная строка: ");
        String str = sc.nextLine();
        if (str.startsWith("abc"))
        {
            /*char[] strChar = str.toCharArray();
            strChar[0] = 'w';
            strChar[1] = 'w';
            strChar[2] = 'w';
            str = String.copyValueOf(strChar);*/
            str = str.replaceFirst("abc", "www");
    }
        else {
            str = str.concat("zzz");
        }
        System.out.println("Полученная строка: ");
        System.out.println(str);

    }
}
