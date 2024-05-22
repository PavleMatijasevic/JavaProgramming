package rentAcar;

import java.util.Date;
import java.util.List;

public class RentACar {
    private List<Vozilo> listaVozila;
    private List<Klijent> listaKlijenata;
    private List<Rezervacija> listaRezervacija;
    private List<Iznajmljivanje> listaIznajmljivanja;

    public RentACar() {
        this.listaVozila = Database.ucitajVozila();
        this.listaKlijenata = Database.ucitajKlijente();
        this.listaRezervacija = Database.ucitajRezervacije();
        this.listaIznajmljivanja = Database.ucitajIznajmljivanja();
    }

    public void dodajVozilo(Vozilo vozilo) {
        listaVozila.add(vozilo);
        Database.sacuvajVozila(listaVozila);
    }

    public void ukloniVozilo(Vozilo vozilo) {
        listaVozila.remove(vozilo);
        Database.sacuvajVozila(listaVozila);
    }

    public void kreirajRezervaciju(Klijent klijent, Vozilo vozilo, Date datumPreuzimanja, Date datumVracanja) {
        if (vozilo.isDostupnost()) {
            vozilo.iznajmi();
            Rezervacija rezervacija = new Rezervacija(listaRezervacija.size() + 1, klijent, vozilo, new Date(), datumPreuzimanja, datumVracanja);
            listaRezervacija.add(rezervacija);
            Database.sacuvajVozila(listaVozila);
            Database.sacuvajRezervacije(listaRezervacija);
        } else {
            System.out.println("Vozilo nije dostupno za rezervaciju.");
        }
    }

    public void iznajmiVozilo(Klijent klijent, Vozilo vozilo) {
        if (vozilo.isDostupnost()) {
            vozilo.iznajmi();
            Iznajmljivanje iznajmljivanje = new Iznajmljivanje(listaIznajmljivanja.size() + 1, klijent, vozilo, new Date(), null);
            listaIznajmljivanja.add(iznajmljivanje);
            Database.sacuvajVozila(listaVozila);
            Database.sacuvajIznajmljivanja(listaIznajmljivanja);
        } else {
            System.out.println("Vozilo nije dostupno za iznajmljivanje.");
        }
    }

    public void vratiVozilo(Vozilo vozilo) {
        vozilo.vrati();
        Database.sacuvajVozila(listaVozila);
        Database.sacuvajIznajmljivanja(listaIznajmljivanja);
    }

    public void pregledajDostupnaVozila() {
        for (Vozilo vozilo : listaVozila) {
            if (vozilo.isDostupnost()) {
                System.out.println(vozilo);
            }
        }
    }

        public void pregledajSveVozila () {
            for (Vozilo vozilo : listaVozila) {
                System.out.println(vozilo);
            }
        }
    public void registrujKlijenta(Klijent klijent) {
        listaKlijenata.add(klijent);
        Database.sacuvajKlijente(listaKlijenata);
    }
    }

