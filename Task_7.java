package part_1;

//Даны два угла треугольника (в градусах). Определить, существует ли такой
// треугольник, и если да, то будет ли он прямоугольным.
public class Task_7 {
    public static void main(String[] args) {
        int ugl_1 = 50; // угол треугольника в градусах
        int ugl_2 = 30; // угол треугольника в градусах
        int ugl_3 = 180 - ugl_1 - ugl_2;
        boolean proverka;
        proverka = (ugl_1 + ugl_2) < 180;
        System.out.println("Результат проверки существования треугольника " + proverka);
        if (proverka == true) {
            System.out.println("Третий угол треугольника равен " + ugl_3);
        }
        if (ugl_3 == 90 || ugl_1 == 90 || ugl_2 == 90) {
            System.out.println("Это прямоугольный треугольник");
        } else System.out.println("Это не прямоугольный треугольник");
    }
}
