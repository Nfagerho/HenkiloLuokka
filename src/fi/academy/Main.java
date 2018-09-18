package fi.academy;

import fi.academy.Henkilo;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        Henkilo Nooa = new Henkilo("Nooa", "Fagerholm", 1912);
        System.out.println(Nooa);
        Henkilo h2 = new Henkilo();
        h2.setSyntymavuosi(1950);
        System.out.println(h2);
        Henkilo Nooa1 = new Henkilo("Nooa", "wagerholm", 1913);
        System.out.println(Nooa.equals(h2));

        //Tarkistaa sijainnin ja parametrit
        System.out.println(Nooa == Nooa1);

        //Tarkistaa vain parametrit, ei sijaintia
        System.out.println(Nooa.equals(Nooa1));

        List<Henkilo> lista = new ArrayList<>();
        lista.add(Nooa);
        Nooa1.setEtunimi("Jari");
        lista.add(Nooa1);
        lista.add(h2);
        //System.out.println(lista);

        //System.out.println(lista);
        Collections.sort(lista, new VertailuEtunimi());

        System.out.println(lista);
        //Collections.sort(lista, Comparator.comparing(Henkilo::getEtunimi));
        //System.out.println(lista);






      /* Opiskelija o1 = new Opiskelija();
        System.out.println(o1);
        Opiskelija o2 = new Opiskelija("Simeon", "Fagerholm", 1996, 0241200);
        System.out.println(o2);

        lista.add(o2);


        System.out.println(lista);

        Opettaja ope = new Opettaja("Anssi", "Rusanen", 1971);
        System.out.println(ope);

        Palkansaaja ope2 = new Opettaja();


        ((Opettaja) ope2).setEtunimi("Nooa");
        System.out.println(ope2);*/

      Frellu ope100 = new Frellu("Nooa", "Fagerholm", 1991, 14, 150, 24);

        System.out.println(ope100);

        List<Palkansaaja> palkkaLista = new ArrayList<>();
        palkkaLista.add(new Opettaja("Matti", "Mulkero", 1990, 2500));
        palkkaLista.add(new Opettaja("Mirva", "Miilu", 1890, 10000));
        palkkaLista.add(new Opettaja("Mikki", "Hiiri", 1978, 11235));
        palkkaLista.add(new Frellu("Nooa", "theBest", 1990, 36, 150, 40));
        palkkaLista.add(new Frellu("Pihla", "theBest", 1993, 18, 128, 21));
        palkkaLista.add(new Frellu("Jari", "theBest", 1999, 90, 150, 8));
        palkkaLista.add(ope100);

        for (Palkansaaja listoja : palkkaLista) {
            System.out.println(listoja);
        }







    }
}
