public class FriefoxDriver implements WebDriver{
    @Override
    public void get() {
        System.out.println("Otwieramy przegladarke za pomoc FirefoxDrivera");
    }

    @Override
    public void findElementBy() {
        System.out.println("Znajdujemy element za pomoca przegladarki Firefox");
    }
}
