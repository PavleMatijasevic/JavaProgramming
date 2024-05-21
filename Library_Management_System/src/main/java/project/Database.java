package project;
import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Database {
    private static final String KNJIGE_FILE = "knjige.txt";
    private static final String KORISNICI_FILE = "korisnici.txt";
    private static final String IZNAJMLJENE_FILE = "iznajmljene.txt";

    public static void sacuvajKnjige(List<Book> knjige) {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(KNJIGE_FILE))) {
            oos.writeObject(knjige);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static List<Book> ucitajKnjige() {
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(KNJIGE_FILE))) {
            return (List<Book>) ois.readObject();
        } catch (IOException | ClassNotFoundException e) {
            return new ArrayList<>();
        }
    }

    public static void sacuvajKorisnike(List<User> korisnici) {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(KORISNICI_FILE))) {
            oos.writeObject(korisnici);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static List<User> ucitajKorisnike() {
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(KORISNICI_FILE))) {
            return (List<User>) ois.readObject();
        } catch (IOException | ClassNotFoundException e) {
            return new ArrayList<>();
        }
    }

    public static void sacuvajIznajmljivanje(List<Loan> posudbe) {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(IZNAJMLJENE_FILE))) {
            oos.writeObject(posudbe);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static List<Loan> ucitajIznajmljivanje() {
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(IZNAJMLJENE_FILE))) {
            return (List<Loan>) ois.readObject();
        } catch (IOException | ClassNotFoundException e) {
            return new ArrayList<>();
        }
    }
}
