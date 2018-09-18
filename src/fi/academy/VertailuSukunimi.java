package fi.academy;

import java.util.Comparator;

public class VertailuSukunimi implements Comparator<Henkilo> {
    @Override
    public int compare(Henkilo o1, Henkilo o2) {
        String h1 =  o1.getSukunimi();
        String h2 =  o2.getSukunimi();

        int tulos = h1.compareTo(h2);
        return tulos;

    }
}

