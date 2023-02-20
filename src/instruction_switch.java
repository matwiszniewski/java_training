public class instruction_switch {
    public static void main(String[] args) {
        String danie = "Pizza";

        switch (danie) {
            case "Pizza":
                System.out.println("Cena to 22zl");
                break;
            case "Losos":
                System.out.println("Cena to 35zl");
                break;
            case "Frytki":
                System.out.println("Cena to 15zl");
                break;
            default:
                System.out.println("Nie mamy takiego dania w karcie");
        }

    }
}
