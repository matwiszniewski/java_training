public class conditional_statement_else_if {
    public static void main(String[] args) {
        int number = 5;
        
        if (number == 0) {
            System.out.println("Liczba rowna zero");
        } else if (number>0) {
            System.out.println("Liczba dodatnia");
        } else if (number<0) {
            System.out.println("Liczba ujemna");
        } else if (number < -5) {
            System.out.println("Liczba mniejsza od -5");
        }else {
            System.out.println("Zaden warunek nie jest spelniony");
        }
    }
}
