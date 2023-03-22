package drivers;

public class WebDriverTest {

    public static void main(String[] args)  {
        WebDriver driver = getDriver(DriverType.FIREFOX);
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

    private static WebDriver getDriver(DriverType type)  {
        if (type==DriverType.CHROME) {
            return new ChromeDriver();
        }
            return new FirefoxDriver();


    }

}
