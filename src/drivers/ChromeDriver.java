package drivers;

public class ChromeDriver implements WebDriver {


    @Override
    public void get() {
        System.out.println("Otwieramy przegladarke za pomoca Chromedrivera");
    }

    @Override
    public void findElementBy() {
        System.out.println("Znajdujemy element za pomoc przegladarki Chrome");
    }
}
