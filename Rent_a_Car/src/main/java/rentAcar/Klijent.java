package rentAcar;

import java.io.Serializable;

public class Klijent implements Serializable {

    private static final long serialVersionUID = 1L;

    private int id;
    private String ime;
    private String prezime;
    private String email;
    private String brojTelefona;

    public Klijent(int id, String ime, String prezime, String email, String brojTelefona){
        this.id = id;
        this.ime = ime;
        this.prezime = prezime;
        this.email = email;
        this.brojTelefona = brojTelefona;
    }

    public int getId() {
        return id;
    }

    public String getPrezime() {
        return prezime;
    }

    public String getIme() {
        return ime;
    }

    public String getEmail() {
        return email;
    }

    public String getBrojTelefona() {
        return brojTelefona;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setBrojTelefona(String brojTelefona) {
        this.brojTelefona = brojTelefona;
    }

    public void setIme(String ime) {
        this.ime = ime;
    }

    public void setPrezime(String prezime) {
        this.prezime = prezime;
    }

    public void registracija(){
        //todo
    }
    public void prijava(){
        //todo
    }

    @Override
    public String toString() {
        return "Klijent{" +
                "id=" + id +
                ", ime='" + ime + '\'' +
                ", prezime='" + prezime + '\'' +
                ", email='" + email + '\'' +
                ", brojTelefona='" + brojTelefona + '\'' +
                '}';
    }
}
