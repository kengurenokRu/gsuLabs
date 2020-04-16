/*Найти в строке указанную подстроку и заменить ее на новую.
Строку, ее подстроку для замены и новую подстроку вводит пользователь.*/

import java.util.Scanner;

public class lab4_1 {
    public static void main(String[] args) {
        String str = "";
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите исходную строку: ");
        str = sc.nextLine();
        System.out.println("Введите подстроку, которую надо заменить: ");
        String oldStr = sc.nextLine();
        System.out.println("Введите подстроку на которую необходимо заменить: ");
        String newStr = sc.nextLine();
        System.out.println("Полученная строка: ");
        System.out.println(str.replace(oldStr, newStr));
    }
}
