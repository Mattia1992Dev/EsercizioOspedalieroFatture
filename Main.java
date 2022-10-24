public class Main {
    public static void main(String[] args) {

    Dottore dottore1= new Dottore("Rossi", "Mario","chirurgo");
    Paziente paziente1= new Paziente("Cer","Marco","Cema1823");
    Fattura fattura1= new Fattura("13-03-2022",34.7,paziente1,dottore1);
    System.out.println(paziente1.Stampa(paziente1));
        System.out.println( "visitato dal " + dottore1.toString() + fattura1.toString());
    }
}