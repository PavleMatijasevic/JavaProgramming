package rentAcar;

import java.io.File;
import java.io.IOException;
import java.util.Date;

public class Main {
    public static void main(String[] args) {
        // Kreiranje fajlova ako ne postoje
        try {
            File vozilaFile = new File("vozila.txt");
            File klijentiFile = new File("klijenti.txt");
            File rezervacijeFile = new File("rezervacije.txt");
            File iznajmljivanjaFile = new File("iznajmljivanja.txt");

            if (vozilaFile.createNewFile()) {
                System.out.println("Fajl 'vozila.txt' je kreiran.");
            }
            if (klijentiFile.createNewFile()) {
                System.out.println("Fajl 'klijenti.txt' je kreiran.");
            }
            if (rezervacijeFile.createNewFile()) {
                System.out.println("Fajl 'rezervacije.txt' je kreiran.");
            }
            if (iznajmljivanjaFile.createNewFile()) {
                System.out.println("Fajl 'iznajmljivanja.txt' je kreiran.");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        // Inicijalizacija rent-a-car sistema
        RentACar rentACar = new RentACar();

        // Dodavanje vozila
        Vozilo vozilo1 = new Vozilo(1, "Toyota", "Corolla", 2020, true);
        Vozilo vozilo2 = new Vozilo(2, "Volkswagen", "Golf", 2019, true);
        rentACar.dodajVozilo(vozilo1);
        rentACar.dodajVozilo(vozilo2);

        // Registracija klijenta
        Klijent klijent1 = new Klijent(1, "Petar", "Petrović", "petar@example.com", "123456789");
        rentACar.registrujKlijenta(klijent1);

        // Kreiranje rezervacije
        rentACar.kreirajRezervaciju(klijent1, vozilo1, new Date(), new Date());

        // Iznajmljivanje vozila
        rentACar.iznajmiVozilo(klijent1, vozilo2);

        // Pregled dostupnih vozila
        rentACar.pregledajDostupnaVozila();

        // Vraćanje vozila
        rentACar.vratiVozilo(vozilo2);

        // Pregled svih vozila
        rentACar.pregledajSveVozila();
    }
}
