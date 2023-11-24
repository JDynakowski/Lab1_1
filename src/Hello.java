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



import java.util.Scanner;
public class Hello {
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Wprowadz tekst: ");

        String wprowadzoneTekst = scanner.nextLine();

        System.out.print("Wprowadzony tekst: " + wprowadzonyTekst);

        Scanner.close();
    }

}

//nowy

