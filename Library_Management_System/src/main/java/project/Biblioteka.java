package project;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;



public class Biblioteka {
    private List<Book> listaKnjiga;
    private List<User> listaKorisnika;
    private List<Loan> listaIznajmljenih;

    public Biblioteka() {
        this.listaKnjiga = Database.ucitajKnjige();
        this.listaKorisnika = Database.ucitajKorisnike();
        this.listaIznajmljenih = Database.ucitajIznajmljivanje();
    }

    public void dodajKnjigu(Book knjiga) {
        listaKnjiga.add(knjiga);
        Database.sacuvajKnjige(listaKnjiga);
    }

    public void ukloniKnjigu(Book knjiga) {
        listaKnjiga.remove(knjiga);
        Database.sacuvajKnjige(listaKnjiga);
    }

    public void iznajmiKnjigu(User korisnik, Book knjiga) {
        if (knjiga.isDostupnost()) {
            knjiga.iznajmi();
            Loan posudba = new Loan(listaIznajmljenih.size() + 1, korisnik, knjiga, new Date(), null);
            listaIznajmljenih.add(posudba);
            Database.sacuvajKnjige(listaKnjiga);
            Database.sacuvajIznajmljivanje(listaIznajmljenih);
        } else {
            System.out.println("Knjiga nije dostupna za iznajmljivanje.");
        }
    }

    public void vratiKnjigu(Book knjiga) {
        knjiga.vrati();
        // Pronađi odgovarajuću posudbu i zatvori je
        Database.sacuvajKnjige(listaKnjiga);
        Database.sacuvajIznajmljivanje(listaIznajmljenih);
    }

    public void registrujKorisnika(User korisnik) {
        listaKorisnika.add(korisnik);
        Database.sacuvajKorisnike(listaKorisnika);
    }

    public void prijaviKorisnika(String email, String brojTelefona) {
        // Logika za prijavu korisnika
    }

    public void pregledajDostupneKnjige() {
        for (Book knjiga : listaKnjiga) {
            if (knjiga.isDostupnost()) {
                System.out.println(knjiga);
            }
        }
    }

    public void pregledajSveKnjige() {
        for (Book knjiga : listaKnjiga) {
            System.out.println(knjiga);
        }
    }
}
