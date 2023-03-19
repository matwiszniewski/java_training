public class WebDrverTest {

    public static void main(String[] args) {
        ChromeDriver chrome = new ChromeDriver();
        chrome.get();
        chrome.findElementBy();

        FriefoxDriver firefox = new FriefoxDriver();
        firefox.get();
        firefox.findElementBy();
    }
}
