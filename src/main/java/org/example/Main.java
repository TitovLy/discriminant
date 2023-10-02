import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        System.out.printf("Введите a: ");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        System.out.printf("Введите b: ");
        int b = sc.nextInt();
        System.out.printf("Введите c: ");
        int c = sc.nextInt();
        int d = b*b - 4 * a * c;
        if (d > 0){
            double x1 = (-b - Math.sqrt(d))/2*a;
            double x2 = (-b + Math.sqrt(d))/2*a;
            System.out.print("Корни: " + x1 + " и " + x2);
        }
        else if (d == 0){
            double x = (-b - Math.sqrt(d))/2*a;
            System.out.print("Корень: " + x);
        }
        else {
            System.out.print("Корней нет");
        }
    }
}
