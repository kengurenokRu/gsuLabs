package OOP;

import java.util.Scanner;


public class phototechniqueFabric {

    Scanner sc = new Scanner(System.in);

    public phototechnique createPhototechnique() {
        System.out.println(">>Меню<<");
        System.out.println("1 - Фотоаппарат");
        System.out.println("2 - Оъектив");
        System.out.println("0 - Возврат назад");
        System.out.print("Выберите пункт меню: ");
        int select = sc.nextInt();
        while ((select < 0) || (select > 2)) {
            System.out.print("выбран неверный пункт меню. Введите еще раз: ");
            select = sc.nextInt();
        }
        if (select == 1) {
            return createCamera();
        } else if (select == 2) {
            return createLens();
        }
        return null;

    }

    public Lens createLens() {

        String bayonet;
        Autofokcus autofokcus = Autofokcus.да;
        double minimalFocalLength;
        double apeture;
        int minimalDiafragm;
        String model;
        Manufacturer manufacturer = Manufacturer.Китай;
        int releaseYear;
        int temp;
        System.out.println("Введите страну происхождения (1 - Китай, 2 - Тайвань, 3 - Япония, 4 - США, 5 - Россия): ");
        temp = sc.nextInt();
        while ((temp < 1)||(temp > 5))
        {
            System.out.println("Выбрано неверно. Введите еще раз: ");
            temp = sc.nextInt();
        }
        switch (temp) {
            case 1:
                manufacturer = Manufacturer.Китай;
                break;
            case 2:
                manufacturer = Manufacturer.Тайвань;
                break;
            case 3:
                manufacturer = Manufacturer.Япония;
                break;
            case 4:
                manufacturer = Manufacturer.США;
                break;
            case 5:
                manufacturer = Manufacturer.Россия;
                break;
        }
        System.out.println("Введите год выпуска: ");
        releaseYear = sc.nextInt();
        System.out.println("Введите модель: ");
        sc.nextLine();
        model = sc.nextLine();
        System.out.println("Введите тип байонета: ");
        bayonet = sc.nextLine();
        System.out.println("Введите фокусное расстоение: ");
        minimalFocalLength = sc.nextDouble();
        System.out.println("Введите значение диафрагмы: ");
        minimalDiafragm = sc.nextInt();
        System.out.println("Введите светосилу объектива: ");
        apeture = sc.nextDouble();
        System.out.println("Есть автофокус (1 - да, 2 - нет): ");
        temp = sc.nextInt();
        while ((temp < 1) || (temp > 2)) {
            System.out.println("Выбрано неверно. Введите еще раз: ");
            temp = sc.nextInt();
        }
        switch (temp) {
            case 1:
                autofokcus = Autofokcus.да;
                break;
            case 2:
                autofokcus = Autofokcus.нет;
                break;
        }
        return new Lens(bayonet, minimalFocalLength, minimalDiafragm, apeture, model, releaseYear, manufacturer, autofokcus);
    }

    public Camera createCamera() {
        String model;
        Manufacturer manufacturer = Manufacturer.Китай;
        int releaseYear;
        int temp;
        String typeCamera;
        String sizeMatrix;
        String typeMatrix;
        double countMatrixPoint;
        System.out.println("Введите страну происхождения (1 - Китай, 2 - Тайвань, 3 - Япония, 4 - США, 5 - Россия): ");
        temp = sc.nextInt();
        while ((temp < 1)||(temp > 5))
        {
            System.out.println("Выбрано неверно. Введите еще раз: ");
            temp = sc.nextInt();
        }
        switch (temp) {
            case 1:
                manufacturer = Manufacturer.Китай;
                break;
            case 2:
                manufacturer = Manufacturer.Тайвань;
                break;
            case 3:
                manufacturer = Manufacturer.Япония;
                break;
            case 4:
                manufacturer = Manufacturer.США;
                break;
            case 5:
                manufacturer = Manufacturer.Россия;
                break;
        }
        System.out.println("Введите год выпуска: ");
        releaseYear = sc.nextInt();
        System.out.println("Введите модель: ");
        sc.nextLine();
        model = sc.nextLine();
        System.out.println("Введите тип камеры: ");
        typeCamera = sc.nextLine();
        System.out.println("Введите размер матрицы: ");
        sizeMatrix = sc.nextLine();
        System.out.println("Введите количество мегапикселей: ");
        countMatrixPoint = sc.nextDouble();
        System.out.println("Введите тип матрицы: ");
        typeMatrix = sc.nextLine();
        return new Camera(typeCamera, sizeMatrix, typeMatrix, countMatrixPoint, model, releaseYear, manufacturer);
    }
}
