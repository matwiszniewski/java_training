import java.util.Scanner;

public class Exercise2_Age_checker {
    public static void main(String[] args) {
        System.out.println("Prosze podac swoj wiek");

        Scanner sc = new Scanner(System.in);
        int age = sc.nextInt();

        if (age >= 18) {
            System.out.println("Dziekuje za zakupy");

        } else if (age <= 0) {
            System.out.println("Niepoprawna wartosc!");

        } else
        {System.out.println("Nie mozna kupic alkoholu gdy wiek < 18 lat");
        }

    }
}
