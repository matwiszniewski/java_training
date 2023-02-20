public class Logic_operators {
    public static void main(String[] args) {

        boolean firstValue = true;
        boolean secondValue = false;
        boolean thirdValue = false;
        boolean fourthValue = true;

        // && -> true wtedy gdy wyrazenia sa rowne true

        System.out.println(firstValue && secondValue); //false
        System.out.println(firstValue && fourthValue); //true
        System.out.println(thirdValue && secondValue); //false


        // || lub -> true gdy jedno wyrazenie skladowe jest rowne true

        System.out.println(firstValue || secondValue); //true
        System.out.println(firstValue || fourthValue); //true
        System.out.println(thirdValue || secondValue); //false

        // ! negacja - zwraca wartosc przeciwna do wyrazenia przed ktorym sie znajduje

        System.out.println(!firstValue);//false
        System.out.println(!thirdValue);//true
        System.out.println(!(firstValue && secondValue)); //true

    }
}
