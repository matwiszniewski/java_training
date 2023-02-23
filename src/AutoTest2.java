public class AutoTest2 {
    public static void main(String[] args) {

        Auto2 mercedes = new Auto2("Mercedes","Klasa S", 2021, 1000);
/*        mercedes.marka = "Mercedes";
        mercedes.model = "Klasa S";
        mercedes.rok = 2021;
        mercedes.przebieg = 1000;*/

        mercedes.jedz();
        mercedes.hamuj();
        mercedes.info();

        Auto2 audi = new Auto2();
        audi.marka = "Audi";
        audi.model = "A4";
        audi.rok = 2021;
        audi.przebieg = 4000;

        audi.jedz();
        audi.hamuj();
        audi.info();



    }
}
