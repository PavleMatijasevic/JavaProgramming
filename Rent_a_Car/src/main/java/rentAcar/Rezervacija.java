package rentAcar;

import java.io.Serializable;
import java.util.Date;

public class Rezervacija implements Serializable {
    private static final long serialVersionUID = 1L;

    private int id;
    private Klijent klijent;
    private Vozilo vozilo;
    private Date datumRezervacije;
    private Date datumPreuzimanja;
    private Date datumVracanja;

    public Rezervacija(int id, Klijent klijent, Vozilo vozilo, Date datumRezervacije, Date datumPreuzimanja, Date datumVracanja){
        this.id = id;
        this.klijent = klijent;
        this.vozilo = vozilo;
        this.datumPreuzimanja = datumPreuzimanja;
        this.datumVracanja = datumVracanja;
        this.datumRezervacije = datumRezervacije;

    }

    public Date getDatumVracanja() {
        return datumVracanja;
    }

    public int getId() {
        return id;
    }

    public Date getDatumPreuzimanja() {
        return datumPreuzimanja;
    }

    public Date getDatumRezervacije() {
        return datumRezervacije;
    }

    public Klijent getKlijent() {
        return klijent;
    }

    public Vozilo getVozilo() {
        return vozilo;
    }

    public void setDatumVracanja(Date datumVracanja) {
        this.datumVracanja = datumVracanja;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setDatumPreuzimanja(Date datumPreuzimanja) {
        this.datumPreuzimanja = datumPreuzimanja;
    }

    public void setDatumRezervacije(Date datumRezervacije) {
        this.datumRezervacije = datumRezervacije;
    }

    public void setKlijent(Klijent klijent) {
        this.klijent = klijent;
    }

    public void setVozilo(Vozilo vozilo) {
        this.vozilo = vozilo;
    }

    @Override
    public String toString() {
        return "Rezervacija{" +
                "id=" + id +
                ", klijent=" + klijent +
                ", vozilo=" + vozilo +
                ", datumRezervacije=" + datumRezervacije +
                ", datumPreuzimanja=" + datumPreuzimanja +
                ", datumVracanja=" + datumVracanja +
                '}';
    }
}
