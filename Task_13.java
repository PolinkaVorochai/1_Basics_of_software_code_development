package part_1;

import java.util.Scanner;

//Вычислить значения функции на отрезке [а,b] c шагом h:
public class Task_13 {
    public static void main(String[] args) {
        int y;
        Scanner in = new Scanner(System.in);
        System.out.print("Введите значение левой границы интервала: ");
        int a = in.nextInt();
        System.out.print("Введите значение правой границы интервала: ");
        int b = in.nextInt();
        System.out.print("Введите значение шага: ");
        int h = in.nextInt();
//        System.out.print("Введите значение аргумента: ");
//        int x = in.nextInt();
        for (int x = a; x <= b; x = x + h) {
            if (x > 2) {
                y = x;
                System.out.println(y);
            }
            if (x <= 2) {
                y = -x;
                System.out.println(y);
            }
        }
    }
}
