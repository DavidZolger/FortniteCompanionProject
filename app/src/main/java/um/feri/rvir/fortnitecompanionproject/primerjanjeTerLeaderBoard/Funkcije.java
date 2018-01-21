package um.feri.rvir.fortnitecompanionproject.primerjanjeTerLeaderBoard;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

import um.feri.rvir.fortnitecompanionproject.parserUtils.IgralecSimple;

/**
 * Created by Urh on 20.1.2018.
 */

public class Funkcije {

    public ArrayList<PrimerjanjeDveh> primerjajDva(String imePrvegaIgralca, String imeDrugegaIgralca) {

        IgralecSimple p1 = null; // = pridobiIgralcaPoImenu("imePrvegaIgralca");
        IgralecSimple p2 = null; // = pridobiIgralcaPoImenu("imeDrugegaIgralca");
        ArrayList<PrimerjanjeDveh> arrayPrimerjanj = new ArrayList<>();

        //Primerjava točk
        arrayPrimerjanj.add(primerjajTocke(p1,p2));

        //Primerjava Umorov
        arrayPrimerjanj.add(primerjajUmore(p1,p2));

        //Primerjava K/D
        arrayPrimerjanj.add(primerjajKD(p1,p2));

        //Primerjava zmag
        arrayPrimerjanj.add(primerjajZmage(p1,p2));

        //Primerjava odigranihUr
        arrayPrimerjanj.add(primerjajUre(p1,p2));

        return arrayPrimerjanj;
    }

    public VrednostIgralca[] pridobiLestvico (ArrayList<String> arrayIgralcev){

        VrednostIgralca[] vrednosti = new VrednostIgralca[5];
        for(int i = 0; i < arrayIgralcev.size(); i++){
            IgralecSimple igralec = null; // pridobiIgralcaPoImenu("arrayIgralcev.get(i)");
            vrednosti[i] = (new VrednostIgralca(arrayIgralcev.get(i),Integer.parseInt(igralec.getLifeTimeScore().replace(",",""))));
        }

        Arrays.sort(vrednosti);

        return vrednosti;
    }


    private PrimerjanjeDveh primerjajUre(IgralecSimple p1, IgralecSimple p2) {

        PrimerjanjeDveh primerjava = null;
        try {
            int vecji = 0;

            String ureP1 = p1.getLifeTimeTimePlayed();
            String ureP2 = p2.getLifeTimeTimePlayed();

            int indexDnevi1 = ureP1.indexOf("d");
            int dnevi1 = Integer.parseInt(ureP1.substring(0,indexDnevi1));

            int inexUre1 = ureP1.indexOf("h");
            int ure1 = Integer.parseInt(ureP1.substring(indexDnevi1+2,inexUre1));

            int indexDnevi2 = ureP2.indexOf("d");
            int dnevi2 = Integer.parseInt(ureP2.substring(0,indexDnevi2));

            int inexUre2 = ureP2.indexOf("h");
            int ure2 = Integer.parseInt(ureP2.substring(indexDnevi2+2,inexUre2));

            int p1Ure = (dnevi1*24)+ure1;
            int p2Ure = (dnevi2*24)+ure2;

            if (p1Ure > p2Ure)
                vecji = -1;
            if (p2Ure > p1Ure)
                vecji = 1;
            primerjava = new PrimerjanjeDveh("Ure", p1Ure, p2Ure, vecji);
        }catch(NullPointerException e){
            System.out.println("Primerjava ur error!");
            e.printStackTrace();
        }
        return primerjava;

    }

    private PrimerjanjeDveh primerjajZmage(IgralecSimple p1, IgralecSimple p2) {

        PrimerjanjeDveh primerjava = null;
        try {
            int vecji = 0;
            if (p1.getLifeTimeWins() > p2.getLifeTimeWins())
                vecji = -1;
            if (p2.getLifeTimeWins() > p1.getLifeTimeWins())
                vecji = 1;
            primerjava = new PrimerjanjeDveh("Zmage", p1.getLifeTimeWins(), p2.getLifeTimeWins(), vecji);
        }catch(NullPointerException e){
            System.out.println("Primerjava zmag error!");
            e.printStackTrace();
        }
        return primerjava;

    }

    private PrimerjanjeDveh primerjajKD(IgralecSimple p1, IgralecSimple p2) {

        PrimerjanjeDveh primerjava = null;
        try {
            int vecji = 0;
            if (p1.getLifeTimeKillDeath() > p2.getLifeTimeKillDeath())
                vecji = -1;
            if (p2.getLifeTimeKillDeath() > p1.getLifeTimeKillDeath())
                vecji = 1;
            primerjava = new PrimerjanjeDveh("K/D", p1.getLifeTimeKillDeath(), p2.getLifeTimeKillDeath(), vecji);
        }catch(NullPointerException e){
            System.out.println("Primerjava K/D error!");
            e.printStackTrace();
        }
        return primerjava;

    }

    private PrimerjanjeDveh primerjajUmore(IgralecSimple p1, IgralecSimple p2) {

        PrimerjanjeDveh primerjava = null;
        try {
            int vecji = 0;
            if (p1.getLifeTimeKills() > p2.getLifeTimeKills())
                vecji = -1;
            if (p2.getLifeTimeKills() > p1.getLifeTimeKills())
                vecji = 1;
            primerjava = new PrimerjanjeDveh("Umori", p1.getLifeTimeKills(), p2.getLifeTimeKills(), vecji);
        }catch(NullPointerException e){
            System.out.println("Primerjava umorov error!");
            e.printStackTrace();
        }
        return primerjava;

    }

    private PrimerjanjeDveh primerjajTocke(IgralecSimple p1, IgralecSimple p2) {

        PrimerjanjeDveh primerjava = null;
        try {
            int vecji = 0;
            int p1Tocke = Integer.parseInt(p1.getLifeTimeScore().replace(",", ""));
            int p2Tocke = Integer.parseInt(p2.getLifeTimeScore().replace(",", ""));
            if (p1Tocke > p2Tocke)
                vecji = -1;
            if (p2Tocke > p1Tocke)
                vecji = 1;
             primerjava = new PrimerjanjeDveh("Točke", p1Tocke, p2Tocke, vecji);
        }catch(NullPointerException e){
            System.out.println("Primerjava točk error!");
            e.printStackTrace();
        }
        return primerjava;
    }
}
