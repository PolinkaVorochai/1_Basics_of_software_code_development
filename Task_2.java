package part_1;

//    Вычислить значение выражения по формуле (все переменные принимают действительные значения):
//  (𝑏+√(𝑏^2+4𝑎𝑐))/2𝑎−𝑎^3𝑐+𝑏^(-2)
public class Task_2 {
    public static void main(String[] args) {
        double b, c;
        int a = 5;
        b = 3.14;
        c = 2.5;
        double d = Math.sqrt(Math.pow(b, 2) + 4 * a * c);
        if (d < 0 || a == 0) {
            System.out.println("Значение выражения не существует");
        } else {
            double e = (b + d) / (2 * a) - Math.pow(a, 3) * c + Math.pow(b, -2);
            System.out.println("Значение выражения равно: " + e);
        }
    }
}
