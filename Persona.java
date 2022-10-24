public class Persona {

    public Persona(String cognome, String nome) {
        this.cognome = cognome;
        this.nome = nome;
    }

    private String cognome, nome;

    public String getCognome() {
        return cognome;
    }

    public void setCognome(String cognome) {
        this.cognome = cognome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String Stampa(Paziente paziente) {
        return " Paziente{ " + cognome + " " + nome +
                " numeroId=' " + paziente.getNumeroId() +
                '}';
    }
    }

