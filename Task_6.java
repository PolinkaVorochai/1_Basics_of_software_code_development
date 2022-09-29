package part_1;

//Для данной области составить линейную программу, которая печатает true,
// если точка с координатами (х, у) принадлежит
// закрашенной области, и false — в противном случае:
//график
public class Task_6 {
    public static void main(String[] args) {
        int x = 0; // координата точки по оси абсцисс
        int y = -2; //координата точки по оси ординат
        if (x >= -4 && x <= 4 && y >= -3 && y <= 0) {
            System.out.println("true");
        } else if (x <= -2 && x <= 2 && y <= 4 && y >= 0) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }
    }
}
