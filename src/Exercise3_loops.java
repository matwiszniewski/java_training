import java.util.Arrays;

public class Exercise3_loops {
    public static void main(String[] args) {

// wypisanie liczb z zakresu 1-100 podzielnych przez 3

        for (int i = 3; i<100; i=i+3)
        {
            System.out.println(i);
        }

        for (int j=1; j<100; j++) {
            if (j%3==0) {
                System.out.println(j);
            }
        }

// odwracanie tablicy /nowa tablica
        int[] tablica = new int[] {1,3,5};
        System.out.println(Arrays.toString(tablica));

        for (int i = 0; i < tablica.length; i++) {
            System.out.println(tablica[i]);
        }
        int[] tablica2 = new int[3];
        for (int i = 0; i<tablica2.length;i++) {
            tablica2[i] = tablica[(tablica.length - 1 - i)];
            System.out.println(tablica2[i]);
        }

// odwracanie tablicy /uzycie zmiennej tymczasowej

        int tmp;
        int l = tablica.length;

        System.out.print("Przed odwróceniem: ");
        for (int i: tablica) System.out.print(i+" ");

        for (int i=0; i < l/2; i++){
            tmp = tablica[i];
            tablica[i] = tablica[l-1-i];
            tablica[l-1-i]=tmp;
        }
        System.out.print("Po odwróceniu: ");
        for (int i: tablica) System.out.print(i+" ");

    }
}



