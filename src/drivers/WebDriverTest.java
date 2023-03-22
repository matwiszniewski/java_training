package drivers;

public class WebDriverTest {

    public static void main(String[] args) throws NoValidBrowser {
        WebDriver driver = getDriver("firefoxa");
        driver.get();
        driver.findElementBy();
        driver.findElementBy();
        driver.findElementBy();
        driver.findElementBy();
        driver.findElementBy();

//        FriefoxDriver firefox = new FriefoxDriver();
//        firefox.get();
//        firefox.findElementBy();
//        chrome.findElementBy();
//        chrome.findElementBy();
//        chrome.findElementBy();
//        chrome.findElementBy();
}

    private static WebDriver getDriver(String name) throws NoValidBrowser {
        if (name.equals("chrome")) {
            return new ChromeDriver();
        } else if (name.equals("firefox")) {
            return new FirefoxDriver();
        } throw new NoValidBrowser("No valid browser name");

    }

}
