package rentAcar;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Database {
    private static final String VOZILA_FILE = "vozila.txt";
    private static final String KLIJENTI_FILE = "klijenti.txt";
    private static final String REZERVACIJE_FILE = "rezervacije.txt";
    private static final String IZNAJMLJIVANJA_FILE = "iznajmljivanja.txt";

    public static void sacuvajVozila(List<Vozilo> vozila) {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(VOZILA_FILE))) {
            oos.writeObject(vozila);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static List<Vozilo> ucitajVozila() {
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(VOZILA_FILE))) {
            return (List<Vozilo>) ois.readObject();
        } catch (IOException | ClassNotFoundException e) {
            return new ArrayList<>();
        }
    }

    public static void sacuvajKlijente(List<Klijent> klijenti) {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(KLIJENTI_FILE))) {
            oos.writeObject(klijenti);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static List<Klijent> ucitajKlijente() {
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(KLIJENTI_FILE))) {
            return (List<Klijent>) ois.readObject();
        } catch (IOException | ClassNotFoundException e) {
            return new ArrayList<>();
        }
    }

    public static void sacuvajRezervacije(List<Rezervacija> rezervacije) {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(REZERVACIJE_FILE))) {
            oos.writeObject(rezervacije);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static List<Rezervacija> ucitajRezervacije() {
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(REZERVACIJE_FILE))) {
            return (List<Rezervacija>) ois.readObject();
        } catch (IOException | ClassNotFoundException e) {
            return new ArrayList<>();
        }
    }

    public static void sacuvajIznajmljivanja(List<Iznajmljivanje> iznajmljivanja) {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(IZNAJMLJIVANJA_FILE))) {
            oos.writeObject(iznajmljivanja);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static List<Iznajmljivanje> ucitajIznajmljivanja() {
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(IZNAJMLJIVANJA_FILE))) {
            return (List<Iznajmljivanje>) ois.readObject();
        } catch (IOException | ClassNotFoundException e) {
            return new ArrayList<>();
        }
    }
}

