public class Calculator {

    public int addition (int firstNumber, int secondNumber) {
        int result = firstNumber+secondNumber;
        System.out.println("Wynik dodawania to "+result);
        return result;
    }

    public int subtraction (int firstNumber, int secondNumber) {
        int result = firstNumber-secondNumber;
        System.out.println("Wynik odejmowania to "+result);
        return result;
    }

    public int multiplication (int firstNumber, int secondNumber) {
        int result = firstNumber*secondNumber;
        System.out.println("Wynik mnozenia to "+result);
        return result;
    }

    public int division (int firstNumber, int secondNumber) {
        int result = firstNumber/secondNumber;
        System.out.println("Wynik dzielenia to "+result);
        return result;
    }
    public int modulo (int firstNumber, int secondNumber) {
        int result = firstNumber%secondNumber;
        System.out.println("Reszta z dzielenia to "+result);
        return result;
    }
}
