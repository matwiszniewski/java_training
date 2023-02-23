public class user {

    public String username;
    public String password;

    public user () {

    }

    public user (String user, String pass) {
        System.out.println("Hello z konstruktora");
        this.username = user;
        this.password = pass;

    }


    public void sayHello () {
        System.out.println("Hello my name is " + username);
    }


}
