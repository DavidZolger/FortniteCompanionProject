package um.feri.rvir.fortnitecompanionproject.primerjanjeTerLeaderBoard;

import android.support.annotation.NonNull;

/**
 * Created by Urh on 21.1.2018.
 */

public class VrednostIgralca implements Comparable<VrednostIgralca>{

    String ime;
    int vrednost;

    public VrednostIgralca(String ime, int vrednost){
        this.ime = ime;
        this.vrednost = vrednost;
    }

    public String getIme() {
        return ime;
    }

    public void setIme(String ime) {
        this.ime = ime;
    }

    public int getVrednost() {
        return vrednost;
    }

    public void setVrednost(int vrednost) {
        this.vrednost = vrednost;
    }

    @Override
    public int compareTo(@NonNull VrednostIgralca igralec) {
        int vrednost = igralec.getVrednost();

        return this.vrednost - vrednost;
    }
}
