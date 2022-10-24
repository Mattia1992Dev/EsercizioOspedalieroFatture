public class Paziente extends Persona{
    private String numeroId;
    public Paziente(String cognome, String nome, String numeroId) {
        super(cognome, nome);
        this.numeroId=numeroId;
    }

    public String getNumeroId() {

        return numeroId;
    }



}
