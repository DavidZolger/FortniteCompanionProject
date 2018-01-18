
package um.feri.rvir.fortnitecompanionproject.parserUtils;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class P2 {

    @SerializedName("score")
    @Expose
    private Score score;
    @SerializedName("top1")
    @Expose
    private Top1 top1;
    @SerializedName("top3")
    @Expose
    private Top3 top3;
    @SerializedName("top5")
    @Expose
    private Top5 top5;
    @SerializedName("top6")
    @Expose
    private Top6 top6;
    @SerializedName("top10")
    @Expose
    private Top10 top10;
    @SerializedName("top12")
    @Expose
    private Top12 top12;
    @SerializedName("top25")
    @Expose
    private Top25 top25;
    @SerializedName("kd")
    @Expose
    private Kd kd;
    @SerializedName("winRatio")
    @Expose
    private WinRatio winRatio;
    @SerializedName("matches")
    @Expose
    private Matches matches;
    @SerializedName("kills")
    @Expose
    private Kills kills;
    @SerializedName("minutesPlayed")
    @Expose
    private MinutesPlayed minutesPlayed;
    @SerializedName("kpm")
    @Expose
    private Kpm kpm;
    @SerializedName("kpg")
    @Expose
    private Kpg kpg;
    @SerializedName("avgTimePlayed")
    @Expose
    private AvgTimePlayed avgTimePlayed;
    @SerializedName("scorePerMatch")
    @Expose
    private ScorePerMatch scorePerMatch;
    @SerializedName("scorePerMin")
    @Expose
    private ScorePerMin scorePerMin;

    public Score getScore() {
        return score;
    }

    public void setScore(Score score) {
        this.score = score;
    }

    public Top1 getTop1() {
        return top1;
    }

    public void setTop1(Top1 top1) {
        this.top1 = top1;
    }

    public Top3 getTop3() {
        return top3;
    }

    public void setTop3(Top3 top3) {
        this.top3 = top3;
    }

    public Top5 getTop5() {
        return top5;
    }

    public void setTop5(Top5 top5) {
        this.top5 = top5;
    }

    public Top6 getTop6() {
        return top6;
    }

    public void setTop6(Top6 top6) {
        this.top6 = top6;
    }

    public Top10 getTop10() {
        return top10;
    }

    public void setTop10(Top10 top10) {
        this.top10 = top10;
    }

    public Top12 getTop12() {
        return top12;
    }

    public void setTop12(Top12 top12) {
        this.top12 = top12;
    }

    public Top25 getTop25() {
        return top25;
    }

    public void setTop25(Top25 top25) {
        this.top25 = top25;
    }

    public Kd getKd() {
        return kd;
    }

    public void setKd(Kd kd) {
        this.kd = kd;
    }

    public WinRatio getWinRatio() {
        return winRatio;
    }

    public void setWinRatio(WinRatio winRatio) {
        this.winRatio = winRatio;
    }

    public Matches getMatches() {
        return matches;
    }

    public void setMatches(Matches matches) {
        this.matches = matches;
    }

    public Kills getKills() {
        return kills;
    }

    public void setKills(Kills kills) {
        this.kills = kills;
    }

    public MinutesPlayed getMinutesPlayed() {
        return minutesPlayed;
    }

    public void setMinutesPlayed(MinutesPlayed minutesPlayed) {
        this.minutesPlayed = minutesPlayed;
    }

    public Kpm getKpm() {
        return kpm;
    }

    public void setKpm(Kpm kpm) {
        this.kpm = kpm;
    }

    public Kpg getKpg() {
        return kpg;
    }

    public void setKpg(Kpg kpg) {
        this.kpg = kpg;
    }

    public AvgTimePlayed getAvgTimePlayed() {
        return avgTimePlayed;
    }

    public void setAvgTimePlayed(AvgTimePlayed avgTimePlayed) {
        this.avgTimePlayed = avgTimePlayed;
    }

    public ScorePerMatch getScorePerMatch() {
        return scorePerMatch;
    }

    public void setScorePerMatch(ScorePerMatch scorePerMatch) {
        this.scorePerMatch = scorePerMatch;
    }

    public ScorePerMin getScorePerMin() {
        return scorePerMin;
    }

    public void setScorePerMin(ScorePerMin scorePerMin) {
        this.scorePerMin = scorePerMin;
    }

}
