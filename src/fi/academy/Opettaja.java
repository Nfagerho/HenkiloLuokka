package fi.academy;

public class Opettaja extends Henkilo implements Palkansaaja {
    private double kuukausipalkka;

    public Opettaja() {
        super();
    }

    public Opettaja(String etunimi, String sukunimi, int syntymävuosi, double kuukausipalkka) {
        super(etunimi, sukunimi, syntymävuosi);
        this.kuukausipalkka = kuukausipalkka;
    }


    @Override
        public double laskePalkka() {
            return kuukausipalkka;
    }

    @Override
    public String toString() {
        final  StringBuilder sb = new StringBuilder(" Opettaja: ");
        sb.append("Kuukausipalkka: ").append(laskePalkka()).append('\'');
        return super.toString() + sb;
    }
}
