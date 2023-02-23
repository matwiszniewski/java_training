import java.nio.file.attribute.UserPrincipal;

public class userTest {

    public static void main(String[] args) {
        //user user = new user();

        user user = new user("Tomek", "qwerty");

        /*user.username = "Mateusz";
        user.password = "QWERTY";*/

        System.out.println(user.username);
        System.out.println(user.password);
        user.sayHello();

    }
}
