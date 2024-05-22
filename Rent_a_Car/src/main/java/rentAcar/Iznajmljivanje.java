package rentAcar;

import java.io.Serializable;
import java.util.Date;

public class Iznajmljivanje implements Serializable {

    private static final long serialVersionUID = 1L;

    private int id;
    private Klijent klijent;
    private Vozilo vozilo;
    private Date datumIznajmljivanja;
    private Date datumVracanja;

    public Iznajmljivanje(int id, Klijent klijent, Vozilo vozilo, Date datumIznajmljivanja, Date datumVracanja){
        this.id = id;
        this.klijent = klijent;
        this.vozilo = vozilo;
        this.datumVracanja = datumVracanja;
        this.datumIznajmljivanja = datumIznajmljivanja;

    }

    public Klijent getKlijent() {
        return klijent;
    }

    public Date getDatumVracanja() {
        return datumVracanja;
    }

    public Vozilo getVozilo() {
        return vozilo;
    }

    public int getId() {
        return id;
    }

    public Date getDatumIznajmljivanja() {
        return datumIznajmljivanja;
    }

    public void setDatumVracanja(Date datumVracanja) {
        this.datumVracanja = datumVracanja;
    }

    public void setVozilo(Vozilo vozilo) {
        this.vozilo = vozilo;
    }

    public void setKlijent(Klijent klijent) {
        this.klijent = klijent;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setDatumIznajmljivanja(Date datumIznajmljivanja) {
        this.datumIznajmljivanja = datumIznajmljivanja;
    }

    @Override
    public String toString() {
        return "Iznajmljivanje{" +
                "id=" + id +
                ", klijent=" + klijent +
                ", vozilo=" + vozilo +
                ", datumIznajmljivanja=" + datumIznajmljivanja +
                ", datumVracanja=" + datumVracanja +
                '}';
    }
}
