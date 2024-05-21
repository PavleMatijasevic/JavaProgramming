package project;
import java.io.File;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        // Kreiranje fajlova ako ne postoje
        try {
            File knjigeFile = new File("knjige.txt");
            File korisniciFile = new File("korisnici.txt");
            File iznajmljeneFile = new File("iznajmljene.txt");

            if (knjigeFile.createNewFile()) {
                System.out.println("Fajl 'knjige.txt' je kreiran.");
            }
            if (korisniciFile.createNewFile()) {
                System.out.println("Fajl 'korisnici.txt' je kreiran.");
            }
            if (iznajmljeneFile.createNewFile()) {
                System.out.println("Fajl 'iznajmljene.txt' je kreiran.");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        // Inicijalizacija biblioteke
        Biblioteka biblioteka = new Biblioteka();

        // Dodavanje knjiga
        Book knjiga1 = new Book(1, "Na Drini cuprija", "Ivo Andric", 1945, "Roman", true);
        Book knjiga2 = new Book(2, "Prokleta avlija", "Ivo Andric", 1954, "Roman", true);
        biblioteka.dodajKnjigu(knjiga1);
        biblioteka.dodajKnjigu(knjiga2);

        // Registracija korisnika
        User korisnik1 = new User(1, "Marko", "Marković", "marko@example.com", 123456789);
        biblioteka.registrujKorisnika(korisnik1);

        // Iznajmljivanje knjige
        biblioteka.iznajmiKnjigu(korisnik1, knjiga1);

        // Pregled dostupnih knjiga
        biblioteka.pregledajDostupneKnjige();

        // Vraćanje knjige
        biblioteka.vratiKnjigu(knjiga1);

        // Pregled svih knjiga
        biblioteka.pregledajSveKnjige();
    }
}
