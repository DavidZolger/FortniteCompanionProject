
package um.feri.rvir.fortnitecompanionproject.parserUtils;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Stats {

    @SerializedName("p2")
    @Expose
    private P2 p2;
    @SerializedName("p10")
    @Expose
    private P10 p10;
    @SerializedName("p9")
    @Expose
    private P9 p9;

    public P2 getP2() {
        return p2;
    }

    public void setP2(P2 p2) {
        this.p2 = p2;
    }

    public P10 getP10() {
        return p10;
    }

    public void setP10(P10 p10) {
        this.p10 = p10;
    }

    public P9 getP9() {
        return p9;
    }

    public void setP9(P9 p9) {
        this.p9 = p9;
    }

}
