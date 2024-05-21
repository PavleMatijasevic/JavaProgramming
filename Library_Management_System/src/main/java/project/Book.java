package project;

import java.io.Serializable;
import java.sql.SQLOutput;

public class Book implements Serializable {
    private static final long serialVersionUID = 1L;

    public int id;
    public String naslov;
    public String autor;
    public int godinaIzdanja;
    public String zanr;
    public boolean dostupnost;

    public Book(int id, String naslov, String autor, int godinaIzdanja, String zanr, boolean dostupnost){
        this.id = id;
        this.naslov = naslov;
        this.autor = autor;
        this.godinaIzdanja = godinaIzdanja;
        this.zanr = zanr;
        this.dostupnost = dostupnost;
    }

    public boolean isDostupnost() {
        return dostupnost;
    }

    public int getGodinaIzdanja() {
        return godinaIzdanja;
    }

    public int getId() {
        return id;
    }

    public String getAutor() {
        return autor;
    }

    public String getNaslov() {
        return naslov;
    }

    public String getZanr() {
        return zanr;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public void setDostupnost(boolean dostupnost) {
        this.dostupnost = dostupnost;
    }

    public void setGodinaIzdanja(int godinaIzdanja) {
        this.godinaIzdanja = godinaIzdanja;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setNaslov(String naslov) {
        this.naslov = naslov;
    }

    public void setZanr(String zanr) {
        this.zanr = zanr;
    }

    @Override
    public String toString() {
        return "Knjiga [id=" + id + ", naslov=" + naslov + ", autor=" + autor +
                ", godinaIzdanja=" + godinaIzdanja + ", zanr=" + zanr +
                ", dostupnost=" + dostupnost + "]";
    }
    public void iznajmi(){
        if(dostupnost){
            dostupnost = false;
        }
        else{
            System.out.println("Knjiga nije dostupna");
        }

    }
    public void vrati(){
        dostupnost = true;
    }
}
