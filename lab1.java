import java.util.Scanner;

public class lab1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double c;
        double d;
        double a;
        double b;
        double u;
        double h;
        double res;
        double x;
        System.out.print("Введите начало отрезка для вычисления значения c = ");
        c = sc.nextDouble();
        System.out.print("Введите конец отрезка для вычисления значения d = ");
        d = sc.nextDouble();
        while (d <= c) {
            System.out.print("Конец отрезка введен неверно. Значение конца отрезка должно быть (d>" + c + ").\nВведите конец отрезка для вычисления значения d = ");
            d = sc.nextDouble();
        }
        System.out.print("Введите начало внутреннего отрезка a (a>=" + c + " and a<=" + d + ").\na = ");
        a = sc.nextDouble();
        while ((a < c) || (a > d)) {
            System.out.print("Начала внутреннего отрезка введено неверно. Начало отрезка долно быть (a>=" + c + " and a<=" + d + ").\na = ");
            a = sc.nextDouble();
        }
        System.out.print("Введите конец внутреннего отрезка b (b>=" + a + " and b<=" + d + "). b = ");
        b = sc.nextDouble();
        while ((b < c) || (b > d) || (b < a)) {
            System.out.print("Конец внутреннего отрезка введен неверно. Конец отрезка должен быть (b>=" + a + " and b<=" + d + ").\nb = ");
            b = sc.nextDouble();
        }
        System.out.print("Введите параметр u = ");
        u = sc.nextDouble();
        System.out.print("Введите шаг h = ");
        h = sc.nextDouble();
        c -= h;
        d -= h;
        x = c;
        while (x <= d) {
            x += h;
            if (x < a) {
                if ((x == 0) || ((x + u / (5 * x)) <= 0)) {
                    System.out.println("x = " + x + "  res = not res");
                    continue;
                }
                res = Math.log(x + u / (5 * x));
            } else if (x > b) {
                if ((-u * x + 5) <= 0) {
                    System.out.println("x = " + x + "  res = not res");
                    continue;
                }
                res = Math.log(-u * x + 5);
            } else {
                res = x * Math.abs(x + u);
            }
            System.out.println("x = " + x + "  res = " + res);
        }
        System.out.print("---------------------------");
    }
}

