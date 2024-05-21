package project;

import java.io.Serializable;
import java.util.Date;

public class Loan implements Serializable {
    private static final long serialVersionUID = 1L;

    public int id;
    public User korisnik;
    public Book knjiga;
    public Date datumIznajmljivanja;
    public Date datumVracanja;

    public Loan(int id, User korisnik, Book knjiga, Date datumIznajmljivanja, Date datumVracanja){
        this.id = id;
        this.korisnik = korisnik;
        this.knjiga = knjiga;
        this.datumIznajmljivanja = datumIznajmljivanja;
        this.datumVracanja = datumVracanja;
    }

    public int getId() {
        return id;
    }

    public Book getKnjiga() {
        return knjiga;
    }

    public Date getDatumIznajmljivanja() {
        return datumIznajmljivanja;
    }

    public Date getDatumVracanja() {
        return datumVracanja;
    }

    public User getKorisnik() {
        return korisnik;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setDatumIznajmljivanja(Date datumIznajmljivanja) {
        this.datumIznajmljivanja = datumIznajmljivanja;
    }

    public void setDatumVracanja(Date datumVracanja) {
        this.datumVracanja = datumVracanja;
    }

    public void setKnjiga(Book knjiga) {
        this.knjiga = knjiga;
    }

    public void setKorisnik(User korisnik) {
        this.korisnik = korisnik;
    }

    @Override
    public String toString() {
        return "Loan{" +
                "id=" + id +
                ", korisnik='" + korisnik + '\'' +
                ", knjiga=" + knjiga +
                ", datumIznajmljivanja=" + datumIznajmljivanja +
                ", datumVracanja=" + datumVracanja +
                '}';
    }
    public void kreirajPozajmicu(){
        knjiga.iznajmi();
    }
    public void zatvoriPozajmicu(){
        knjiga.vrati();
    }
}
