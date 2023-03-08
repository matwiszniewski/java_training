public class PersonTest {
    public static void main(String[] args) {
        MathTeacher teacher = new MathTeacher( "Tom", 29,  "University");
//        teacher.name = "Mateusz";
//        teacher.age = 29;
//        teacher.school = "University";

        teacher.walk();
        teacher.eat();
        teacher.teachMath();
        teacher.sayHello();

        Footballer footballer = new Footballer( "Mike", 33, "Boca juniors");
//        footballer.name = "Mike";
//        footballer.age = 33;
        footballer.walk();
        footballer.eat();
//        footballer.footballClub = "Boca juniors";
        footballer.playFootball();
    }
}
