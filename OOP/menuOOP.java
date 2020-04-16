package OOP;

import java.util.Scanner;

import OOP.phototechniqueFabric;

public class menuOOP {
    private static phototechniqueList fl = new phototechniqueList();

    public static void menuTextMain() {
        System.out.println(">>МЕНЮ<<");
        System.out.println("1 - Добавить элемент");
        System.out.println("2 - Изменить элемент");
        System.out.println("3 - Удалить элемент");
        System.out.println("4 - Распечатать все");
        System.out.println("5 - Распечатать по номеру элемента");
        System.out.println("6 - Сохранить в файл");
        System.out.println("7 - Загрузить из файла");
        System.out.println("0 - Выход");
    }

   /* public static void menuTextEditCamera() {
        System.out.println(">>МЕНЮ<<");
        System.out.println("1 - Страна происхождения");
        System.out.println("2 - Год выпуска");
        System.out.println("3 - Модель");
        System.out.println("4 - Тип камеры");
        System.out.println("5 - Размер матрицы");
        System.out.println("6 - Количество мегапикселей");
        System.out.println("7 - Тип матрицы");
        System.out.println("0 - Отмена");
    }
    public static void menuTextEditLens() {
        System.out.println(">>МЕНЮ<<");
        System.out.println("1 - Страна происхождения");
        System.out.println("2 - Год выпуска");
        System.out.println("3 - Модель");
        System.out.println("4 - Тип байонета");
        System.out.println("5 - Фокусное расстояние");
        System.out.println("6 - Значение даифрагмы");
        System.out.println("7 - Светосила объектива");
        System.out.println("8 - Автофокус");
        System.out.println("0 - Отмена");
    }*/

    public static boolean checkSelectItem(int item) {
        if ((item < 0) || (item > 7)) {
            System.out.println("Выбран неверный пункт меню. Выберите еще раз.");
            return false;
        } else {
            return true;
        }
    }

  /*  public static boolean checkSelectItemEdit(int item) {
        if ((item < 0) || (item > 8)) {
            System.out.println("Выбран неверный пункт меню. Выберите еще раз.");
            return false;
        } else {
            return true;
        }
    }*/

    public static void selectMenu() {
        System.out.println("");
        menuTextMain();
        System.out.print("\nВыберите пункт меню: ");
        Scanner sc = new Scanner(System.in);
        int item;
        item = sc.nextInt();
        while (checkSelectItem(item) != true) {
            item = sc.nextInt();
        }
        switch (item) {
            case 1:
                fl.createPhototechnique();
                break;
            case 2:
                //menuTextEdit();
                break;
            case 3:
                System.out.println("Введите номер элемента для удаления");
                int del = sc.nextInt();
                fl.deletePhototechnique(del);
                break;
            case 4:
                fl.printAll();
                break;
            case 5:
                System.out.println("Введите номер элемента для печати");
                int print = sc.nextInt();
                fl.printItem(print);
                break;
            case 6:
                break;
            case 7:
                break;
            case 0:
                System.exit(0);
                break;
        }
    }
}
