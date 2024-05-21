package project;

public class Bibliotekar {
    public int id;
    public String ime;
    public String prezime;
    public String email;
    public int brojTelefona;

    public Bibliotekar(int id, String ime, String prezime, String email, int brojTelefona){
        this.id = id;
        this.ime = ime;
        this.prezime = prezime;
        this.email = email;
        this.brojTelefona = brojTelefona;
    }

    public int getBrojTelefona() {
        return brojTelefona;
    }

    public String getPrezime() {
        return prezime;
    }

    public String getEmail() {
        return email;
    }

    public String getIme() {
        return ime;
    }

    public int getId() {
        return id;
    }

    public void setBrojTelefona(int brojTelefona) {
        this.brojTelefona = brojTelefona;
    }

    public void setPrezime(String prezime) {
        this.prezime = prezime;
    }

    public void setIme(String ime) {
        this.ime = ime;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "Bibliotekar{" +
                "id=" + id +
                ", ime='" + ime + '\'' +
                ", prezime='" + prezime + '\'' +
                ", email='" + email + '\'' +
                ", brojTelefona=" + brojTelefona +
                '}';
    }
    public void dodajKnjigu(){

    }
    public void ukloniKnjigu(){

    }
    public void pregledajKnjige(){

    }
}
