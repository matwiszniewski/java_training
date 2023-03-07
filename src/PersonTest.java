public class PersonTest {
    public static void main(String[] args) {
        MathTeacher teacher = new MathTeacher();
        teacher.name = "Mateusz";
        teacher.age = 29;
        teacher.school = "University";
        teacher.walk();
        teacher.eat();
        teacher.teachMath();
        teacher.sayHello();

        Footballer footballer = new Footballer();
        footballer.name = "Mike";
        footballer.age = 33;
        footballer.walk();
        footballer.eat();
        footballer.footballClub = "Boca juniors";
        footballer.playFootball();
    }
}
