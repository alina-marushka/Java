package level1;

public class Task2 {
    public static void main(String[] args) {
        java.util.Scanner scanner = new java.util.Scanner(System.in);
        //
        System.out.println("Enter first number");
        double firstDoubleNumber = scanner.nextDouble();
        //
        System.out.println("Enter second number");
        double secondDoubleNumber = scanner.nextDouble();
        //
        double sumOfNumbers = firstDoubleNumber + secondDoubleNumber;
        double subtractionOfNumbers  = firstDoubleNumber - secondDoubleNumber;
        double multiplicationOfNumbers = firstDoubleNumber * secondDoubleNumber ;
        double divisionOfNumbers = firstDoubleNumber / secondDoubleNumber;
        //
        System.out.println(firstDoubleNumber + "+" + secondDoubleNumber + "=" + sumOfNumbers);
        System.out.println(firstDoubleNumber + "-" + secondDoubleNumber + "=" + subtractionOfNumbers);
        System.out.println(firstDoubleNumber + "*" + secondDoubleNumber + "=" + multiplicationOfNumbers);
        System.out.println(firstDoubleNumber + "/" + secondDoubleNumber + "=" + divisionOfNumbers);


    }
}
