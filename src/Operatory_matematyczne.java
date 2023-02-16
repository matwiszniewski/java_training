public class Operatory_matematyczne {
    public static void main(String[] args) {
        int firstNumber = 4;
        int secondNumber = 6;
        float thirdNumber = 4.0F;

        int addition = firstNumber + secondNumber;
        int subtraction = firstNumber - secondNumber;
        int multiplication = firstNumber * secondNumber;
        float division = thirdNumber / secondNumber;
        int mod = secondNumber%firstNumber; //modulo to reszta z dzielenia

        System.out.println("Wyniki dodawania "+ addition);
        System.out.println("Wyniki odejmowania "+ subtraction);
        System.out.println("Wyniki mnozenia "+ multiplication);
        System.out.println("Wyniki dzielenia "+ division);
        System.out.println("Wyniki modulo "+ mod);
    }
}
