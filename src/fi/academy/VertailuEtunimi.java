package fi.academy;

import java.util.Collections;
import java.util.Comparator;

public class VertailuEtunimi implements Comparator <Henkilo> {

    @Override
    public int compare(Henkilo o1, Henkilo o2) {
        String h1 = o1.getEtunimi();
        String h2 = o2.getEtunimi();

        int tulos = h1.compareTo(h2);



        return tulos;
    }
}

