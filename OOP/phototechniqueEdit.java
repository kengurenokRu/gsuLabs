package OOP;

import java.util.Scanner;

public class phototechniqueEdit {
    Scanner sc = new Scanner(System.in);
    public void editCamera(int item, Camera obj) {
        switch (item) {
            case 1:
                System.out.println("Введите страну происхождения (1 - Китай, 2 - Тайвань, 3 - Япония, 4 - США, 5 - Россия): ");
                int temp = sc.nextInt();
                while ((temp < 1) || (temp > 5)) {
                    System.out.println("Выбрано неверно. Введите еще раз: ");
                    temp = sc.nextInt();
                }
                Manufacturer manufacturer = Manufacturer.Китай;
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
                obj.setManufacturer(manufacturer);
                break;
            case 2:
                System.out.println("Введите год выпуска: ");
                int releaseYear = sc.nextInt();
                obj.setReleaseYear(releaseYear);
                break;
            case 3:
                System.out.println("Введите модель: ");
                //sc.nextLine();
                String model = sc.nextLine();
                obj.setModel(model);
                break;
            case 4:
                System.out.println("Введите тип камеры: ");
                String typeCamera = sc.nextLine();
                obj.setTypeCamera(typeCamera);
                break;
            case 5:
                System.out.println("Введите размер матрицы: ");
                String sizeMatrix = sc.nextLine();
                obj.setSizeMatrix(sizeMatrix);
                break;
            case 6:
                System.out.println("Введите количество мегапикселей: ");
                double countMatrixPoint = sc.nextDouble();
                obj.setCountMatrixPoint(countMatrixPoint);
                break;
            case 7:
                System.out.println("Введите тип матрицы: ");
                String typeMatrix = sc.nextLine();
                obj.setTypeMatrix(typeMatrix);
                break;
        }
    }
    public void editLens(int item, Lens obj) {
        switch (item) {
            case 1:
                System.out.println("Введите страну происхождения (1 - Китай, 2 - Тайвань, 3 - Япония, 4 - США, 5 - Россия): ");
                int temp = sc.nextInt();
                Manufacturer manufacturer = Manufacturer.Китай;
                while ((temp < 1) || (temp > 5)) {
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
                obj.setManufacturer(manufacturer);
                break;
            case 2:
                System.out.println("Введите год выпуска: ");
                int releaseYear = sc.nextInt();
                obj.setReleaseYear(releaseYear);
                break;
            case 3:
                System.out.println("Введите модель: ");
                sc.nextLine();
                String model = sc.nextLine();
                obj.setModel(model);
                break;
            case 4:
                System.out.println("Введите тип байонета: ");
                String bayonet = sc.nextLine();
                obj.setBayonet(bayonet);
                break;
            case 5:
                System.out.println("Введите фокусное расстоение: ");
                double minimalFocalLength = sc.nextDouble();
                obj.setMinimalFocalLength(minimalFocalLength);
                break;
            case 6:
                System.out.println("Введите значение диафрагмы: ");
                int minimalDiafragm = sc.nextInt();
                obj.setMinimalDiafragm(minimalDiafragm);
                break;
            case 7:
                System.out.println("Введите светосилу объектива: ");
                double apeture = sc.nextDouble();
                obj.setApeture(apeture);
                break;
            case 8:
                System.out.println("Есть автофокус (1 - да, 2 - нет): ");
                temp = sc.nextInt();
                Autofokcus autofokcus = Autofokcus.да;
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
                obj.setAutofokcus(autofokcus);
                break;
        }
    }
}
