package part_1;

//Даны три точки А(х1,у1), В(х2,у2) и С(х3,у3). Определить, будут ли они расположены на одной прямой.
public class Task_9 {
    public static void main(String[] args) {
        double x1 = 1;
        double y1 = 1;
        double x2 = 10;
        double y2 = 3;
        double x3 = 15;
        double y3 = 3;
        double t1 = y1 / x1;//угол наклона прямой
        double t2 = y2 / x2;//угол наклона прямой
        double t3 = y3 / x3;//угол наклона прямой
        if (t1 == t2 && t1 == t3 && t2 == t3) {
            System.out.println("Три точки лежат на одной прямой");
        } else if (x1 == x2 && x1 == x3 && x2 == x3 || y1 == y2 && y2 == y3 && y1 == y3) {
            System.out.println("Три точки лежат на одной прямой");
        } else {
            System.out.println("Три точки не лежат на одной прямой");
        }

    }
}
