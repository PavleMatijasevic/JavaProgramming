package rentAcar;

import java.io.Serializable;

public class Vozilo implements Serializable {

    private static final long serialVersionUID = 1L;

    private int id;
    private String marka;
    private String model;
    private int godinaProizvodnje;
    private boolean dostupnost;

    public Vozilo(int id, String marka, String model, int godinaProizvodnje, boolean dostupnost){
        this.id = id;
        this.marka = marka;
        this.model = model;
        this.godinaProizvodnje = godinaProizvodnje;
        this.dostupnost = dostupnost;
    }

    public int getId() {
        return id;
    }

    public int getGodinaProizvodnje() {
        return godinaProizvodnje;
    }

    public String getMarka() {
        return marka;
    }

    public String getModel() {
        return model;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setDostupnost(boolean dostupnost) {
        this.dostupnost = dostupnost;
    }

    public void setGodinaProizvodnje(int godinaProizvodnje) {
        this.godinaProizvodnje = godinaProizvodnje;
    }

    public void setMarka(String marka) {
        this.marka = marka;
    }

    public void setModel(String model) {
        this.model = model;
    }

    @Override
    public String toString() {
        return "Vozilo{" +
                "id=" + id +
                ", marka='" + marka + '\'' +
                ", model='" + model + '\'' +
                ", godinaProizvodnje=" + godinaProizvodnje +
                ", dostupnost=" + dostupnost +
                '}';
    }
    public void iznajmi(){
        if(dostupnost){
            dostupnost = false;
        }
        else{
            System.out.println("Vozilo nije dostupno");
        }

    }
    public void vrati(){
        dostupnost = true;
    }
    public boolean isDostupnost(){
        return dostupnost;
    }

}
