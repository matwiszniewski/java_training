import java.util.Scanner;

public class Exercise_calculator {
    public static void main(String[] args) {
        //first number
        Scanner scanner1 = new Scanner(System.in);
        System.out.println("Prosze podaj pierwsza liczbe");
        int firstNumber = scanner1.nextInt();

        //second number
        Scanner scanner2 = new Scanner(System.in);
        System.out.println("Prosze podaj druga liczbe");
        int secondNumber = scanner2.nextInt();

/*        //mathematical operations
        int addition = firstNumber + secondNumber;
        int subtraction = firstNumber - secondNumber;
        int multiplication = firstNumber * secondNumber;
        int division = firstNumber / secondNumber;
        int mod = secondNumber%firstNumber; //modulo to reszta z dzielenia

        System.out.println("Wyniki dodawania "+ addition);
        System.out.println("Wyniki odejmowania "+ subtraction);
        System.out.println("Wyniki mnozenia "+ multiplication);
        System.out.println("Wyniki dzielenia "+ division);
        System.out.println("Wyniki modulo "+ mod);
*/
        //mathematical operations

        Calculator dzialanie = new Calculator();

        dzialanie.addition(firstNumber,secondNumber);
        dzialanie.subtraction(firstNumber,secondNumber);
        dzialanie.multiplication(firstNumber,secondNumber);
        dzialanie.division(firstNumber,secondNumber);
        dzialanie.modulo(firstNumber,secondNumber);



    }
}
