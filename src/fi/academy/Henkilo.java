package fi.academy;

import java.util.Objects;

public class Henkilo implements Comparable <Henkilo> {
    //implementoidaan Comparable interface

    private String etunimi;
    private String sukunimi;
    private int syntymavuosi;

    public Henkilo (String etunimi, String sukunimi, int syntymavuosi) {
        this.etunimi = etunimi;
        this.sukunimi = sukunimi;
        //this.syntymavuosi = syntymavuosi;
        setSyntymavuosi(syntymavuosi);

    }

    public Henkilo() {
        this.etunimi = "Terppa";
        this.sukunimi = "Sagerholm";
        this.syntymavuosi = 1991;
    }

    public String getEtunimi() {
        return etunimi;
    }

    public String getSukunimi() {
        return sukunimi;
    }

    public int getSyntymavuosi() {
        return syntymavuosi;
    }

    public void setEtunimi(String etunimi) {
        this.etunimi = etunimi;
    }

    public void setSukunimi(String sukunimi) {
        this.sukunimi = sukunimi;
    }

    public void setSyntymavuosi(int syntymavuosi) {
        if (syntymavuosi >= 0 && syntymavuosi <= 2018) {
            this.syntymavuosi = syntymavuosi;
        } else {
            this.syntymavuosi = 0;
        }
    }

    @Override
    public boolean equals(Object verrattava) {
        /*if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Henkilo henkilo = (Henkilo) o;
        return getSyntymavuosi() == henkilo.getSyntymavuosi() &&
                Objects.equals(getEtunimi(), henkilo.getEtunimi()) &&
                Objects.equals(getSukunimi(), henkilo.getSukunimi());*/

        if (this == verrattava) {
            return true;
        }
        if (!(verrattava instanceof Henkilo)) {
            return false;
        }
        //verrattavan tyyppimyynnos Henkiloksi
        Henkilo verrattavaHenkilo = (Henkilo) verrattava;
        if (this.etunimi != verrattavaHenkilo.etunimi) {
            return false;
        }
        if (this.syntymavuosi != verrattavaHenkilo.syntymavuosi) {
            return false;
        }
        if (this.sukunimi != verrattavaHenkilo.sukunimi) {
            return false;
        }
        return true;
    }


    @Override
    public int hashCode() {
        return Objects.hash(getEtunimi(), getSukunimi(), getSyntymavuosi());
    }

    @Override
    public String toString() {
        return "Henkilo: " +
                "Etunimi='" + etunimi + '\'' +
                ", Sukunimi='" + sukunimi + '\'' +
                ", Syntymavuosi=" + syntymavuosi;
    }

    @Override
    public int compareTo(Henkilo o) {

        return o.syntymavuosi - this.syntymavuosi;
    }


}


