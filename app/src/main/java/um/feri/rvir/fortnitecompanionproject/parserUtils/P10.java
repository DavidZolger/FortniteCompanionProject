
package um.feri.rvir.fortnitecompanionproject.parserUtils;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class P10 {

    @SerializedName("score")
    @Expose
    private Score_ score;
    @SerializedName("top1")
    @Expose
    private Top1_ top1;
    @SerializedName("top3")
    @Expose
    private Top3_ top3;
    @SerializedName("top5")
    @Expose
    private Top5_ top5;
    @SerializedName("top6")
    @Expose
    private Top6_ top6;
    @SerializedName("top10")
    @Expose
    private Top10_ top10;
    @SerializedName("top12")
    @Expose
    private Top12_ top12;
    @SerializedName("top25")
    @Expose
    private Top25_ top25;
    @SerializedName("kd")
    @Expose
    private Kd_ kd;
    @SerializedName("winRatio")
    @Expose
    private WinRatio_ winRatio;
    @SerializedName("matches")
    @Expose
    private Matches_ matches;
    @SerializedName("kills")
    @Expose
    private Kills_ kills;
    @SerializedName("minutesPlayed")
    @Expose
    private MinutesPlayed_ minutesPlayed;
    @SerializedName("kpm")
    @Expose
    private Kpm_ kpm;
    @SerializedName("kpg")
    @Expose
    private Kpg_ kpg;
    @SerializedName("avgTimePlayed")
    @Expose
    private AvgTimePlayed_ avgTimePlayed;
    @SerializedName("scorePerMatch")
    @Expose
    private ScorePerMatch_ scorePerMatch;
    @SerializedName("scorePerMin")
    @Expose
    private ScorePerMin_ scorePerMin;

    public Score_ getScore() {
        return score;
    }

    public void setScore(Score_ score) {
        this.score = score;
    }

    public Top1_ getTop1() {
        return top1;
    }

    public void setTop1(Top1_ top1) {
        this.top1 = top1;
    }

    public Top3_ getTop3() {
        return top3;
    }

    public void setTop3(Top3_ top3) {
        this.top3 = top3;
    }

    public Top5_ getTop5() {
        return top5;
    }

    public void setTop5(Top5_ top5) {
        this.top5 = top5;
    }

    public Top6_ getTop6() {
        return top6;
    }

    public void setTop6(Top6_ top6) {
        this.top6 = top6;
    }

    public Top10_ getTop10() {
        return top10;
    }

    public void setTop10(Top10_ top10) {
        this.top10 = top10;
    }

    public Top12_ getTop12() {
        return top12;
    }

    public void setTop12(Top12_ top12) {
        this.top12 = top12;
    }

    public Top25_ getTop25() {
        return top25;
    }

    public void setTop25(Top25_ top25) {
        this.top25 = top25;
    }

    public Kd_ getKd() {
        return kd;
    }

    public void setKd(Kd_ kd) {
        this.kd = kd;
    }

    public WinRatio_ getWinRatio() {
        return winRatio;
    }

    public void setWinRatio(WinRatio_ winRatio) {
        this.winRatio = winRatio;
    }

    public Matches_ getMatches() {
        return matches;
    }

    public void setMatches(Matches_ matches) {
        this.matches = matches;
    }

    public Kills_ getKills() {
        return kills;
    }

    public void setKills(Kills_ kills) {
        this.kills = kills;
    }

    public MinutesPlayed_ getMinutesPlayed() {
        return minutesPlayed;
    }

    public void setMinutesPlayed(MinutesPlayed_ minutesPlayed) {
        this.minutesPlayed = minutesPlayed;
    }

    public Kpm_ getKpm() {
        return kpm;
    }

    public void setKpm(Kpm_ kpm) {
        this.kpm = kpm;
    }

    public Kpg_ getKpg() {
        return kpg;
    }

    public void setKpg(Kpg_ kpg) {
        this.kpg = kpg;
    }

    public AvgTimePlayed_ getAvgTimePlayed() {
        return avgTimePlayed;
    }

    public void setAvgTimePlayed(AvgTimePlayed_ avgTimePlayed) {
        this.avgTimePlayed = avgTimePlayed;
    }

    public ScorePerMatch_ getScorePerMatch() {
        return scorePerMatch;
    }

    public void setScorePerMatch(ScorePerMatch_ scorePerMatch) {
        this.scorePerMatch = scorePerMatch;
    }

    public ScorePerMin_ getScorePerMin() {
        return scorePerMin;
    }

    public void setScorePerMin(ScorePerMin_ scorePerMin) {
        this.scorePerMin = scorePerMin;
    }

}
