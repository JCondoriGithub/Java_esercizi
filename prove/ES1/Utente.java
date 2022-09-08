package ES1;

public class Utente {
    
    private String nome;
    private String cognome;
    String login;
    private String password;
    Genere genere;

    Utente(String nome, String cognome, String login, String password, Genere genere) {

        this.nome = nome;
        this.cognome = cognome;
        this.login = login;
        this.password = password;
        this.genere = genere;
    }

    static enum Genere {
        maschio,
        femmina
    }

    String getPassword() {
        return password;
    }

    void setPassword(String newPassword) {
        this.password = newPassword;
    }
}
