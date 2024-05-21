package project;

import java.io.Serializable;

public class User implements Serializable {
    private static final long serialVersionUID = 1L;
    public int id;
    public String ime;
    public String prezime;
    public String email;
    public int brojTelefona;

    public User(int id, String ime, String prezime, String email, int brojTelefona){
        this.id = id;
        this.ime = ime;
        this.prezime = prezime;
        this.email = email;
        this.brojTelefona = brojTelefona;
    }

    public int getId() {
        return id;
    }

    public int getBrojTelefona() {
        return brojTelefona;
    }

    public String getEmail() {
        return email;
    }

    public String getIme() {
        return ime;
    }

    public String getPrezime() {
        return prezime;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setIme(String ime) {
        this.ime = ime;
    }

    public void setPrezime(String prezime) {
        this.prezime = prezime;
    }

    public void setBrojTelefona(int brojTelefona) {
        this.brojTelefona = brojTelefona;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "Korisnik{" +
                "id=" + id +
                ", ime='" + ime + '\'' +
                ", prezime='" + prezime + '\'' +
                ", email='" + email + '\'' +
                ", brojTelefona=" + brojTelefona +
                '}';
    }
    public void registracija(){
        //todo
    }
    public void prijava(){
        //todo
    }

}
