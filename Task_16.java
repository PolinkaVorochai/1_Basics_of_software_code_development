package part_1;

import java.util.Scanner;

//Даны числовой ряд и некоторое число е. Найти сумму тех членов ряда, модуль которых больше или равен заданному е.
// Общий член ряда имеет вид:
//an = 1/2n + 1/3n
public class Task_16 {
    public static void main(String[] args) {
        double a;
        double result = 0;
        Scanner in = new Scanner(System.in);
        System.out.print("Введите число e: ");
        double e = in.nextDouble();
        System.out.print("Введите левую границу числового ряда: ");
        double left = in.nextDouble();
        System.out.print("Введите правую границу числового ряда: ");
        double right = in.nextDouble();
        in.close();
        double i;
        for (i = left; i <= right; i++) ;
        {
            a = 1 / Math.pow(2, i) + 1 / Math.pow(3, i);
            System.out.println(a);
            if (Math.abs(a) == e) {
                result += a;
            } else {
                System.out.println("No find");
            }
        }
        System.out.println(result);
    }
}
