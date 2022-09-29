package part_1;

//Дано действительное число R вида nnn.ddd
// (три цифровых разряда в дробной и целой частях).
// Поменять местами дробную и целую части числа и вывести
// полученное значение числа.
public class Task_4 {
    public static void main(String[] args) {
        int n = 3;
        int d = 7;
        double R;
        double T;
        System.out.println();
        R = n * 100 + n * 10 + n + d * 0.1 + d * 0.01 + d * 0.001;
        T = d * 100 + d * 10 + d + n * 0.1 + n * 0.01 + n * 0.001;
        System.out.println("Ваше число " + R);
        System.out.println("\nЧисло после перемены мест дробной и целой частей " + T);
    }
}
