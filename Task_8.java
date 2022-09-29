package part_1;

//Найти max{min(a, b), min(c, d)}.
public class Task_8 {
    public static void main(String[] args) {
        double a = -1;
        double b = -5.125;
        double c = 58.2;
        double d = 84.3;
        double min1;
        double min2;
        double maximum;
        min1 = Math.min(a, b);
        min2 = Math.min(c, d);
        maximum = Math.max(min1, min2);
        System.out.println("" + maximum);
    }
}
