package part_1;

//Вычислить значение выражения по формуле (все переменные принимают действительные значения):
//(sin x+cos y)/(cos x-sin y)*tg xy
public class Task_3 {
    public static void main(String[] args) {
        double x = 5, y = -10;
        double a = (Math.sin(x) + Math.cos(y)) / (Math.cos(x) - Math.sin(y)) * Math.tan(x * y);
        System.out.println("Значение выражения равно " + a);
    }
}
