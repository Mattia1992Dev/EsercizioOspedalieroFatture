public class Fattura {
    private String dataVisita;
    private double importoPagato;
    Paziente paziente;
    Dottore dottore;

    public Fattura(String dataVisita, double importoPagato, Paziente paziente, Dottore dottore) {
        this.dataVisita = dataVisita;
        this.importoPagato = importoPagato;
        this.paziente = paziente;
        this.dottore = dottore;

    }

    @Override
    public String toString() {
        return "Struttura{" +
                "dataVisita='" + dataVisita + '\'' +
                ", importoPagato=" + importoPagato +

                '}';
    }
}
