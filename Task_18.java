package part_1;

import java.util.Scanner;

//Для каждого натурального числа в промежутке от m до n вывести все делители, кроме единицы и самого числа.
// m и n вводятся с клавиатуры.
public class Task_18 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите число m: ");
        int m = in.nextInt();
        System.out.print("Введите число n: ");
        int n = in.nextInt();
        for (int i = m; i <= n; i++) {
            System.out.println("\nЧисло равно " + i);
            System.out.print("Делитель равен ");
            for (int j = 2; j <= i; j++) {
                if (i % j == 0 && i != j) {
                    System.out.print(j + ", ");
                } else {
                    continue;
                }
            }
        }
    }
}
