package um.feri.rvir.fortnitecompanionproject.primerjanjeTerLeaderBoard;

/**
 * Created by Urh on 21.1.2018.
 */

public class PrimerjanjeDveh {

    private String nazivVrednosti;
    private double vrednostPrvega;
    private double vrednostDrugega;
    private int vecjaVrednost;
    /* vrednost atributa je lahko -1, 0, -1.
       -1 če je večja VrednostPrvega,1 če je večja vrednostDrugaga ter 0 če sta vrednosti enaki*/

    public PrimerjanjeDveh(String nazivVrednosti, double vrednostPrvega, double vrednostDrugega, int vecjaVrednost) {
        this.nazivVrednosti = nazivVrednosti;
        this.vrednostPrvega = vrednostPrvega;
        this.vrednostDrugega = vrednostDrugega;
        this.vecjaVrednost = vecjaVrednost;
    }

    public PrimerjanjeDveh() {
    }

    public String getNazivVrednosti() {
        return nazivVrednosti;
    }

    public void setNazivVrednosti(String nazivVrednosti) {
        this.nazivVrednosti = nazivVrednosti;
    }

    public double getVrednostPrvega() {
        return vrednostPrvega;
    }

    public void setVrednostPrvega(double vrednostPrvega) {
        this.vrednostPrvega = vrednostPrvega;
    }

    public double getVrednostDrugega() {
        return vrednostDrugega;
    }

    public void setVrednostDrugega(double vrednostDrugega) {
        this.vrednostDrugega = vrednostDrugega;
    }

    public int getVecjaVrednost() {
        return vecjaVrednost;
    }

    public void setVecjaVrednost(int vecjaVrednost) {
        this.vecjaVrednost = vecjaVrednost;
    }

    @Override
    public String toString() {
        return "{Naziv vrednosti: " + nazivVrednosti + ", vrednost prvega: " + vrednostPrvega + ", vrednost drugega: " + vrednostDrugega + ", večja vrednost: " + vecjaVrednost + "}";
    }
}
