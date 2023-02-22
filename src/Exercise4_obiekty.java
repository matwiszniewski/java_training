public class Exercise4_obiekty {
    public static void main(String[] args) {

        Student student_1 = new Student();
        student_1.imie = "Mateusz";
        student_1.nazwisko = "Nowak";
        student_1.numerIndeksu = 123456;
        student_1.email = "mateusz.nowak@gmail.com";
        student_1.nick = "Mati";

        Student student_2 = new Student();
        student_2.imie = "Lukasz";
        student_2.nazwisko = "Pipka";
        student_2.numerIndeksu = 666666;
        student_2.email = "lukasz.pipka@gmail.com";
        student_2.nick = "LUKI";

        Student student_3 = new Student();
        student_3.imie = "Julia";
        student_3.nazwisko = "Kowalska";
        student_3.numerIndeksu = 111222;
        student_3.email = "Julia.Kowalska@gmail.com";
        student_3.nick = "Jula";

        Student[] Studenci = new Student[]  {student_1, student_2, student_3};

        for (int i=0; i<Studenci.length;i++ ) {
            Studenci[i].przedstawSie();
            Studenci[i].podajEmail();
            Studenci[i].podajNrIndeksu();
            Studenci[i].zalogujSie();
        }
    }
}
