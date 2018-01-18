
package um.feri.rvir.fortnitecompanionproject.parserUtils;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class P9 {

    @SerializedName("score")
    @Expose
    private Score__ score;
    @SerializedName("top1")
    @Expose
    private Top1__ top1;
    @SerializedName("top3")
    @Expose
    private Top3__ top3;
    @SerializedName("top5")
    @Expose
    private Top5__ top5;
    @SerializedName("top6")
    @Expose
    private Top6__ top6;
    @SerializedName("top10")
    @Expose
    private Top10__ top10;
    @SerializedName("top12")
    @Expose
    private Top12__ top12;
    @SerializedName("top25")
    @Expose
    private Top25__ top25;
    @SerializedName("kd")
    @Expose
    private Kd__ kd;
    @SerializedName("winRatio")
    @Expose
    private WinRatio__ winRatio;
    @SerializedName("matches")
    @Expose
    private Matches__ matches;
    @SerializedName("kills")
    @Expose
    private Kills__ kills;
    @SerializedName("minutesPlayed")
    @Expose
    private MinutesPlayed__ minutesPlayed;
    @SerializedName("kpm")
    @Expose
    private Kpm__ kpm;
    @SerializedName("kpg")
    @Expose
    private Kpg__ kpg;
    @SerializedName("avgTimePlayed")
    @Expose
    private AvgTimePlayed__ avgTimePlayed;
    @SerializedName("scorePerMatch")
    @Expose
    private ScorePerMatch__ scorePerMatch;
    @SerializedName("scorePerMin")
    @Expose
    private ScorePerMin__ scorePerMin;

    public Score__ getScore() {
        return score;
    }

    public void setScore(Score__ score) {
        this.score = score;
    }

    public Top1__ getTop1() {
        return top1;
    }

    public void setTop1(Top1__ top1) {
        this.top1 = top1;
    }

    public Top3__ getTop3() {
        return top3;
    }

    public void setTop3(Top3__ top3) {
        this.top3 = top3;
    }

    public Top5__ getTop5() {
        return top5;
    }

    public void setTop5(Top5__ top5) {
        this.top5 = top5;
    }

    public Top6__ getTop6() {
        return top6;
    }

    public void setTop6(Top6__ top6) {
        this.top6 = top6;
    }

    public Top10__ getTop10() {
        return top10;
    }

    public void setTop10(Top10__ top10) {
        this.top10 = top10;
    }

    public Top12__ getTop12() {
        return top12;
    }

    public void setTop12(Top12__ top12) {
        this.top12 = top12;
    }

    public Top25__ getTop25() {
        return top25;
    }

    public void setTop25(Top25__ top25) {
        this.top25 = top25;
    }

    public Kd__ getKd() {
        return kd;
    }

    public void setKd(Kd__ kd) {
        this.kd = kd;
    }

    public WinRatio__ getWinRatio() {
        return winRatio;
    }

    public void setWinRatio(WinRatio__ winRatio) {
        this.winRatio = winRatio;
    }

    public Matches__ getMatches() {
        return matches;
    }

    public void setMatches(Matches__ matches) {
        this.matches = matches;
    }

    public Kills__ getKills() {
        return kills;
    }

    public void setKills(Kills__ kills) {
        this.kills = kills;
    }

    public MinutesPlayed__ getMinutesPlayed() {
        return minutesPlayed;
    }

    public void setMinutesPlayed(MinutesPlayed__ minutesPlayed) {
        this.minutesPlayed = minutesPlayed;
    }

    public Kpm__ getKpm() {
        return kpm;
    }

    public void setKpm(Kpm__ kpm) {
        this.kpm = kpm;
    }

    public Kpg__ getKpg() {
        return kpg;
    }

    public void setKpg(Kpg__ kpg) {
        this.kpg = kpg;
    }

    public AvgTimePlayed__ getAvgTimePlayed() {
        return avgTimePlayed;
    }

    public void setAvgTimePlayed(AvgTimePlayed__ avgTimePlayed) {
        this.avgTimePlayed = avgTimePlayed;
    }

    public ScorePerMatch__ getScorePerMatch() {
        return scorePerMatch;
    }

    public void setScorePerMatch(ScorePerMatch__ scorePerMatch) {
        this.scorePerMatch = scorePerMatch;
    }

    public ScorePerMin__ getScorePerMin() {
        return scorePerMin;
    }

    public void setScorePerMin(ScorePerMin__ scorePerMin) {
        this.scorePerMin = scorePerMin;
    }

}
