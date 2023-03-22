package drivers;

public class NoValidBrowser extends Exception {
    public NoValidBrowser(String message) {
        super(message);
    }
}
