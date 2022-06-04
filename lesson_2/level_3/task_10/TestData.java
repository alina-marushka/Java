package lesson_2.level_3.task_10;

public class TestData {
    public static void main(String[] args) {
        java.util.Scanner scanner = new java.util.Scanner(System.in);
        System.out.println( " Input a radius circe");
        double radius = scanner.nextDouble();
        double perimeter = 2 * radius * 3.141592653589793;
        double area = 3.141592653589793 * radius * radius;
        //
        System.out.println("Perimeter is = " + perimeter);
        System.out.println("Area is = " + area);


    }
}
