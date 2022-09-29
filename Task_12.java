package part_1;

import java.util.Scanner;
import java.util.stream.IntStream;

//Напишите программу, где пользователь вводит любое целое положительное число. А программа суммирует все числа от 1 до
// введенного пользователем числа.
public class Task_12 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите любое целое положительное число: ");
        int a = in.nextInt();
        int rez;
        rez = IntStream.rangeClosed(1, a).sum();
        System.out.println(rez);
        rez = 0;
        for (int i = 1; i <= a; i++) {
            rez += i;
        }
        System.out.println(rez);
    }
}
