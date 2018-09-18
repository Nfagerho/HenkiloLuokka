package fi.academy;

public class Frellu extends Henkilo implements Palkansaaja {

    private double tuntipalkka;
    private int tunnit;
    private double veroprosentti;

    public Frellu() {
        super();
    }

    public Frellu(String etunimi, String sukunimi, int syntymävuosi, double tuntipalkka, int tunnit, double veroprosentti) {
        super(etunimi, sukunimi, syntymävuosi);
        this.tuntipalkka = tuntipalkka;
        this.tunnit = tunnit;
        this.veroprosentti = veroprosentti;
    }

    public double getTuntipalkka() {
        return tuntipalkka;
    }

    public void setTuntipalkka(double tuntipalkka) {
        this.tuntipalkka = tuntipalkka;
    }

    public int getTunnit() {
        return tunnit;
    }

    public void setTunnit(int tunnit) {
        this.tunnit = tunnit;
    }

    public double getVeroprosentti() {
        return veroprosentti;
    }

    public void setVeroprosentti(int veroprosentti) {
        this.veroprosentti = veroprosentti;
    }

    @Override
    public double laskePalkka() {
        return (tuntipalkka * tunnit)*(1-(veroprosentti/100));
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder(" Frellu: ");
        sb.append("Kuukausipalkka: ").append(laskePalkka()).append('\'');
        return super.toString() + sb;
    }
}

