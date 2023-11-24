//zadanie 2
/*

public class Hello {
    public static void main(String[  ] args)
    {
        System.out.println("Hello World!");
    }
}
 */


//zadanie 3
/*
public class Hello {
    public static void main(String[  ] args)
    {
        System.out.println("Imie: Jakub");
        System.out.println("Nazwisko: Dynakowski");
        System.out.println("Wiek: 26");
        System.out.println("Uczelnia: WSB-NLU");

    }
}
 */


//Zadanie 4
import java.util.Scanner;

public class Hello {
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Podaj imie studenta: ");
        String imie = scanner.nextLine();

        System.out.print("Podaj nazwisko studenta: ");
        String nazwisko = scanner.nextLine();

        System.out.print("Podaj wiek studenta: ");
        int wiek = scanner.nextInt();

        scanner.nextLine();

        System.out.print("Podaj numer indeksu studenta: ");
        String numerIndeksu = scanner.nextLine();

        System.out.println("Dane studenta:");
        System.out.println("Imię: " + imie);
        System.out.println("Nazwisko: " + nazwisko);
        System.out.println("Wiek: " + wiek);
        System.out.println("Numer indeksu: " + numerIndeksu);

        scanner.close();
    }
}


