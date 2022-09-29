package part_1;

import java.util.Arrays;

//8. Даны два числа. Определить цифры, входящие в запись как первого так и второго числа.
public class Task_19 {
    public static void main(String[] args) {
        int a1 = 16307;
        int a2 = 369807;

        String s1 = Integer.toString(a1);
        int[] arr1 = new int[s1.length()];
        for (int i = s1.length() - 1; i >= 0; i--) {

            arr1[i] = a1 % 10;
            a1 /= 10;
        }
        System.out.println(Arrays.toString(arr1));

        String s2 = Integer.toString(a2);
        int[] arr2 = new int[s2.length()];
        for (int j = s2.length() - 1; j >= 0; j--) {
            arr2[j] = a2 % 10;
            a2 /= 10;
        }
        System.out.println(Arrays.toString(arr2));

        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr2.length; j++) {
                if (arr1[i] == arr2[j]) {
                    System.out.println("Повторяющиеся цифры: " + arr1[i]);
                    continue;
                }
            }
        }

    }
}
