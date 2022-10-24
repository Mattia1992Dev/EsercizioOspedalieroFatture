public class Dottore extends Persona {

    private String reparto;

    public Dottore(String cognome, String nome, String reparto) {
        super(cognome, nome);
        this.reparto= reparto;
    }

    @Override
    public String toString() {
        return " Dottore {" + getCognome() + " " + getNome() + " " +
                " reparto='" + reparto + '\'' +
                '}';
    }
}
