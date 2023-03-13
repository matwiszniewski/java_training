public class AppChecker {
    public static void main(String[] args) {
        AndroidApp android = new AndroidApp("Calculator");
        android.appInfo();
        android.runAndroidApp();

        iphoneApp iphone = new iphoneApp("Calculator iphone");
        iphone.appInfo();
        iphone.runIphoneApp();

    }
}
