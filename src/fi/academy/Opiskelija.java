package fi.academy;

public class Opiskelija extends Henkilo {

    private int opiskelijaNumero;

    public Opiskelija(String etunimi, String sukunimi, int syntymavuosi, int opiskelijaNumero) {

        super(etunimi, sukunimi, syntymavuosi);
        this.opiskelijaNumero = opiskelijaNumero;
    }

    public Opiskelija() {
        super();
    }

    public int getOpiskelijaNumero() {
        return opiskelijaNumero;
    }

    public void setOpiskelijaNumero(int opiskelijaNumero) {
        this.opiskelijaNumero = opiskelijaNumero;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder(" Opiskelija: ");
        sb.append("opiskelijanumero: ").append(opiskelijaNumero).append('\'');
        return super.toString() + sb;
        //"Opiskelija: " + getEtunimi() + " " + getSukunimi() + " " +
                //"opiskelijanumero " + getOpiskelijaNumero();
    }
}
