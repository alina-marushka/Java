package lesson_2.level_3.task_11;

public class Average {
    public static void main(String[] args) {
        java.util.Scanner scanner = new java.util.Scanner(System.in);
        //
        System.out.println("Enter first number");
        int firstNumber = scanner.nextInt();
        System.out.println("Enter second number");
        int secondNumber = scanner.nextInt();
        System.out.println("Enter third number");
        int thirdNumber = scanner.nextInt();
        //
        double average = ((double) firstNumber + (double) secondNumber + (double) thirdNumber) / 3;
        //
        System.out.println("Average is = " + average);
        }
}
