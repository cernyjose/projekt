import java.util.ArrayList;
import java.util.Scanner;

public class Pojisteny {
    private Databaze databaze;
    // instance scanneru pro čtení vstupu z konzole
    private Scanner sc = new Scanner(System.in, "Windows-1250");

    public Pojisteny() {
        databaze = new Databaze();
    }

    public void pridejZaznam() {

        // získávání informací od uživatele
        System.out.println("Zadejte jméno pojištěného:");
        String jmeno = sc.nextLine();

        System.out.println("Zadejte příjmení pojištěného:");
        String prijmeni = sc.nextLine();

        System.out.println("Zadejte telefonní číslo:");
        String cislo = sc.nextLine();

        System.out.println("Zadejte věk:");
        Integer vek = Integer.parseInt(sc.nextLine());

        //vložení informací do DB
        databaze.pridejZaznam(jmeno, prijmeni, cislo, vek);

        System.out.println();
        System.out.println("Data byla uložena. Pokračujte klávesou enter. ");
        sc.nextLine();
    }

    public void vypsatZaznamy() {
        ArrayList<Zaznam> zaznamy = databaze.vratZaznamy();
        for (Zaznam z : zaznamy) {
            System.out.println(z);
        }
        System.out.println();
        System.out.println("Pokračujte klávesou enter. ");
        sc.nextLine();
    }

    public void vyhledatZaznamy() {
        // získávání informací od uživatele
        System.out.println("Zadejte jméno pojištěného:");
        String jmeno = sc.nextLine();

        System.out.println("Zadejte příjmení pojištěného:");
        String prijmeni = sc.nextLine();
        System.out.println();

        for (Zaznam polozkaDatabaze:databaze.vratZaznamy()){

            if (jmeno.equals(polozkaDatabaze.getJmeno()) && prijmeni.equals(polozkaDatabaze.getPrijmeni())) {
                System.out.println(polozkaDatabaze);
            }
        }
        System.out.println();
        System.out.println("Pokračujte klávesou enter. ");
        sc.nextLine();
    }

    public void vypisVyber() {
        System.out.println("-----------------------------");
        System.out.println("Evidence pojištěných");
        System.out.println("-----------------------------\n");

        System.out.println("Akce:");
        System.out.println("1 - Přidat nového pojištěného");
        System.out.println("2 - Vypsat včechny pojištěné");
        System.out.println("3 - Vyhledat pojištěného");
        System.out.println("4 - Konec");
        System.out.println();
        System.out.print("Vyberte si akci: ");
    }
}
