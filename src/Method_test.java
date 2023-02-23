public class Method_test {

    public static void main(String[] args) {

        Method metoda1 = new Method();
        metoda1.policzWynik();



        int result = metoda1.pobierzWynik();
        int result2 = result * 2;
        System.out.println("Rezultat przed mnozeniem to "+result);
        System.out.println("Rezultat po mnozeniu to "+result2);


        metoda1.policzWynikParam(5);
        metoda1.policzWynikParam(100);
        metoda1.policzWynikParam(23);


        int result3 = metoda1.add(2,3);
        System.out.println(result3);
        System.out.println(metoda1.add(0,5));




    }
}
