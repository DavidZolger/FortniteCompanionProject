package um.feri.rvir.fortnitecompanionproject.parserUtils;

/**
 * Created by Miha on 18/01/2018.
 */

public class IgralecSimple {

    private String accountId;
    private int platformId;
    private String platformName;
    private String platformNameLong;
    private String epicUserHandle;


    //SOLO
    private int soloScore;
    private int soloScoreRank;

    private int soloTop1;
    private int soloTop1Rank;
    private int soloTop10;
    private int soloTop10Rank;
    private int soloTop25;
    private int soloTop25Rank;

    private double soloKillDeath;
    private int SoloKillDeathRank;

    private double soloWinRadio;
    private double SoloWinRadioRank;

    private int soloMatches;
    private int SoloMatchesRank;

    private int soloKills;
    private int soloKillsRank;

    private int soloMinutesPlayed;
    private int soloMinutesPlayedRank;
    private String soloMinutesPlayedHours;

    private double soloKillsPerMinute;
    private int soloKillsPerMinuteRank;

    private double soloKillsPerMatch;
    private int soloKillsPerMatchRank;

    private String soloAvgMatchTime;
    private int soloAvgMatchTimeRank;

    private double soloScorePerMatch;
    private int soloScorePerMatchRank;

    private double soloScorePerMinute;
    private int soloScorePerMinuteRank;

    //DUO
    private int duoScore;
    private int duoScoreRank;

    private int duoTop1;
    private int duoTop1Rank;
    private int duoTop5;
    private int duoTop5Rank;
    private int duoTop12;
    private int duoTop12Rank;

    private double duoKillDeath;
    private int duoKillDeathRank;

    private double duoWinRadio;
    private double duoWinRadioRank;

    private int duoMatches;
    private int duoMatchesRank;

    private int duoKills;
    private int duoKillsRank;

    private int duoMinutesPlayed;
    private int duoMinutesPlayedRank;
    private String duoMinutesPlayedHours;

    private double duoKillsPerMinute;
    private int duoKillsPerMinuteRank;

    private double duoKillsPerMatch;
    private int duoKillsPerMatchRank;

    private String duoAvgMatchTime;
    private int duoAvgMatchTimeRank;

    private double duoScorePerMatch;
    private int duoScorePerMatchRank;

    private double duoScorePerMinute;
    private int duoScorePerMinuteRank;

    //SQUAD
    private int squadScore;
    private int squadScoreRank;

    private int squadTop1;
    private int squadTop1Rank;
    private int squadTop3;
    private int squadTop3Rank;
    private int squadTop6;
    private int squadTop6Rank;

    private double squadKillDeath;
    private int squadKillDeathRank;

    private double squadWinRadio;
    private double squadWinRadioRank;

    private int squadMatches;
    private int squadMatchesRank;

    private int squadKills;
    private int squadKillsRank;

    private int squadMinutesPlayed;
    private int squadMinutesPlayedRank;
    private String squadMinutesPlayedHours;

    private double squadKillsPerMinute;
    private int squadKillsPerMinuteRank;

    private double squadKillsPerMatch;
    private int squadKillsPerMatchRank;

    private String squadAvgMatchTime;
    private int squadAvgMatchTimeRank;

    private double squadScorePerMatch;
    private int squadScorePerMatchRank;

    private double squadScorePerMinute;
    private int squadScorePerMinuteRank;

    private String lifeTimeScore;
    private int lifeTimeMatchesPlayed;
    private int lifeTimeWins;
    private String lifeTimeWinsProcent;
    private int lifeTimeKills;
    private double lifeTimeKillDeath;
    private double lifeTimeKillsPerMinute;
    private String lifeTimeTimePlayed;
    private String lifeTimeAvgSurvivalTime;


    public String getAccountId() {
        return accountId;
    }

    public void setAccountId(String accountId) {
        this.accountId = accountId;
    }

    public int getPlatformId() {
        return platformId;
    }

    public void setPlatformId(int platformId) {
        this.platformId = platformId;
    }

    public String getPlatformName() {
        return platformName;
    }

    public void setPlatformName(String platformName) {
        this.platformName = platformName;
    }

    public String getPlatformNameLong() {
        return platformNameLong;
    }

    public void setPlatformNameLong(String platformNameLong) {
        this.platformNameLong = platformNameLong;
    }

    public String getEpicUserHandle() {
        return epicUserHandle;
    }

    public void setEpicUserHandle(String epicUserHandle) {
        this.epicUserHandle = epicUserHandle;
    }

    public int getSoloScore() {
        return soloScore;
    }

    public void setSoloScore(int soloScore) {
        this.soloScore = soloScore;
    }

    public int getSoloScoreRank() {
        return soloScoreRank;
    }

    public void setSoloScoreRank(int soloScoreRank) {
        this.soloScoreRank = soloScoreRank;
    }

    public int getSoloTop1() {
        return soloTop1;
    }

    public void setSoloTop1(int soloTop1) {
        this.soloTop1 = soloTop1;
    }

    public int getSoloTop1Rank() {
        return soloTop1Rank;
    }

    public void setSoloTop1Rank(int soloTop1Rank) {
        this.soloTop1Rank = soloTop1Rank;
    }

    public int getSoloTop10() {
        return soloTop10;
    }

    public void setSoloTop10(int soloTop10) {
        this.soloTop10 = soloTop10;
    }

    public int getSoloTop10Rank() {
        return soloTop10Rank;
    }

    public void setSoloTop10Rank(int soloTop10Rank) {
        this.soloTop10Rank = soloTop10Rank;
    }

    public int getSoloTop25() {
        return soloTop25;
    }

    public void setSoloTop25(int soloTop25) {
        this.soloTop25 = soloTop25;
    }

    public int getSoloTop25Rank() {
        return soloTop25Rank;
    }

    public void setSoloTop25Rank(int soloTop25Rank) {
        this.soloTop25Rank = soloTop25Rank;
    }

    public double getSoloKillDeath() {
        return soloKillDeath;
    }

    public void setSoloKillDeath(double soloKillDeath) {
        this.soloKillDeath = soloKillDeath;
    }

    public int getSoloKillDeathRank() {
        return SoloKillDeathRank;
    }

    public void setSoloKillDeathRank(int soloKillDeathRank) {
        SoloKillDeathRank = soloKillDeathRank;
    }

    public double getSoloWinRadio() {
        return soloWinRadio;
    }

    public void setSoloWinRadio(double soloWinRadio) {
        this.soloWinRadio = soloWinRadio;
    }

    public double getSoloWinRadioRank() {
        return SoloWinRadioRank;
    }

    public void setSoloWinRadioRank(double soloWinRadioRank) {
        SoloWinRadioRank = soloWinRadioRank;
    }

    public int getSoloMatches() {
        return soloMatches;
    }

    public void setSoloMatches(int soloMatches) {
        this.soloMatches = soloMatches;
    }

    public int getSoloMatchesRank() {
        return SoloMatchesRank;
    }

    public void setSoloMatchesRank(int soloMatchesRank) {
        SoloMatchesRank = soloMatchesRank;
    }

    public int getSoloKills() {
        return soloKills;
    }

    public void setSoloKills(int soloKills) {
        this.soloKills = soloKills;
    }

    public int getSoloKillsRank() {
        return soloKillsRank;
    }

    public void setSoloKillsRank(int soloKillsRank) {
        this.soloKillsRank = soloKillsRank;
    }

    public int getSoloMinutesPlayed() {
        return soloMinutesPlayed;
    }

    public void setSoloMinutesPlayed(int soloMinutesPlayed) {
        this.soloMinutesPlayed = soloMinutesPlayed;
    }

    public int getSoloMinutesPlayedRank() {
        return soloMinutesPlayedRank;
    }

    public void setSoloMinutesPlayedRank(int soloMinutesPlayedRank) {
        this.soloMinutesPlayedRank = soloMinutesPlayedRank;
    }

    public String getSoloMinutesPlayedHours() {
        return soloMinutesPlayedHours;
    }

    public void setSoloMinutesPlayedHours(String soloMinutesPlayedHours) {
        this.soloMinutesPlayedHours = soloMinutesPlayedHours;
    }

    public double getSoloKillsPerMinute() {
        return soloKillsPerMinute;
    }

    public void setSoloKillsPerMinute(double soloKillsPerMinute) {
        this.soloKillsPerMinute = soloKillsPerMinute;
    }

    public int getSoloKillsPerMinuteRank() {
        return soloKillsPerMinuteRank;
    }

    public void setSoloKillsPerMinuteRank(int soloKillsPerMinuteRank) {
        this.soloKillsPerMinuteRank = soloKillsPerMinuteRank;
    }



    public String getSoloAvgMatchTime() {
        return soloAvgMatchTime;
    }

    public void setSoloAvgMatchTime(String soloAvgMatchTime) {
        this.soloAvgMatchTime = soloAvgMatchTime;
    }

    public int getSoloAvgMatchTimeRank() {
        return soloAvgMatchTimeRank;
    }

    public void setSoloAvgMatchTimeRank(int soloAvgMatchTimeRank) {
        this.soloAvgMatchTimeRank = soloAvgMatchTimeRank;
    }

    public double getSoloScorePerMatch() {
        return soloScorePerMatch;
    }

    public void setSoloScorePerMatch(double soloScorePerMatch) {
        this.soloScorePerMatch = soloScorePerMatch;
    }

    public int getSoloScorePerMatchRank() {
        return soloScorePerMatchRank;
    }

    public void setSoloScorePerMatchRank(int soloScorePerMatchRank) {
        this.soloScorePerMatchRank = soloScorePerMatchRank;
    }

    public double getSoloScorePerMinute() {
        return soloScorePerMinute;
    }

    public void setSoloScorePerMinute(double soloScorePerMinute) {
        this.soloScorePerMinute = soloScorePerMinute;
    }

    public int getSoloScorePerMinuteRank() {
        return soloScorePerMinuteRank;
    }

    public void setSoloScorePerMinuteRank(int soloScorePerMinuteRank) {
        this.soloScorePerMinuteRank = soloScorePerMinuteRank;
    }

    public int getDuoScore() {
        return duoScore;
    }

    public void setDuoScore(int duoScore) {
        this.duoScore = duoScore;
    }

    public int getDuoScoreRank() {
        return duoScoreRank;
    }

    public void setDuoScoreRank(int duoScoreRank) {
        this.duoScoreRank = duoScoreRank;
    }

    public int getDuoTop1() {
        return duoTop1;
    }

    public void setDuoTop1(int duoTop1) {
        this.duoTop1 = duoTop1;
    }

    public int getDuoTop1Rank() {
        return duoTop1Rank;
    }

    public void setDuoTop1Rank(int duoTop1Rank) {
        this.duoTop1Rank = duoTop1Rank;
    }

    public int getDuoTop5() {
        return duoTop5;
    }

    public void setDuoTop5(int duoTop5) {
        this.duoTop5 = duoTop5;
    }

    public int getDuoTop5Rank() {
        return duoTop5Rank;
    }

    public void setDuoTop5Rank(int duoTop5Rank) {
        this.duoTop5Rank = duoTop5Rank;
    }

    public int getDuoTop12() {
        return duoTop12;
    }

    public void setDuoTop12(int duoTop12) {
        this.duoTop12 = duoTop12;
    }

    public int getDuoTop12Rank() {
        return duoTop12Rank;
    }

    public void setDuoTop12Rank(int duoTop12Rank) {
        this.duoTop12Rank = duoTop12Rank;
    }

    public double getDuoKillDeath() {
        return duoKillDeath;
    }

    public void setDuoKillDeath(double duoKillDeath) {
        this.duoKillDeath = duoKillDeath;
    }

    public int getDuoKillDeathRank() {
        return duoKillDeathRank;
    }

    public void setDuoKillDeathRank(int duoKillDeathRank) {
        this.duoKillDeathRank = duoKillDeathRank;
    }

    public double getDuoWinRadio() {
        return duoWinRadio;
    }

    public void setDuoWinRadio(double duoWinRadio) {
        this.duoWinRadio = duoWinRadio;
    }

    public double getDuoWinRadioRank() {
        return duoWinRadioRank;
    }

    public void setDuoWinRadioRank(double duoWinRadioRank) {
        this.duoWinRadioRank = duoWinRadioRank;
    }

    public int getDuoMatches() {
        return duoMatches;
    }

    public void setDuoMatches(int duoMatches) {
        this.duoMatches = duoMatches;
    }

    public int getDuoMatchesRank() {
        return duoMatchesRank;
    }

    public void setDuoMatchesRank(int duoMatchesRank) {
        this.duoMatchesRank = duoMatchesRank;
    }

    public int getDuoKills() {
        return duoKills;
    }

    public void setDuoKills(int duoKills) {
        this.duoKills = duoKills;
    }

    public int getDuoKillsRank() {
        return duoKillsRank;
    }

    public void setDuoKillsRank(int duoKillsRank) {
        this.duoKillsRank = duoKillsRank;
    }

    public int getDuoMinutesPlayed() {
        return duoMinutesPlayed;
    }

    public void setDuoMinutesPlayed(int duoMinutesPlayed) {
        this.duoMinutesPlayed = duoMinutesPlayed;
    }

    public int getDuoMinutesPlayedRank() {
        return duoMinutesPlayedRank;
    }

    public void setDuoMinutesPlayedRank(int duoMinutesPlayedRank) {
        this.duoMinutesPlayedRank = duoMinutesPlayedRank;
    }

    public String getDuoMinutesPlayedHours() {
        return duoMinutesPlayedHours;
    }

    public void setDuoMinutesPlayedHours(String duoMinutesPlayedHours) {
        this.duoMinutesPlayedHours = duoMinutesPlayedHours;
    }

    public double getDuoKillsPerMinute() {
        return duoKillsPerMinute;
    }

    public void setDuoKillsPerMinute(double duoKillsPerMinute) {
        this.duoKillsPerMinute = duoKillsPerMinute;
    }

    public int getDuoKillsPerMinuteRank() {
        return duoKillsPerMinuteRank;
    }

    public void setDuoKillsPerMinuteRank(int duoKillsPerMinuteRank) {
        this.duoKillsPerMinuteRank = duoKillsPerMinuteRank;
    }

    public String getDuoAvgMatchTime() {
        return duoAvgMatchTime;
    }

    public void setDuoAvgMatchTime(String duoAvgMatchTime) {
        this.duoAvgMatchTime = duoAvgMatchTime;
    }

    public int getDuoAvgMatchTimeRank() {
        return duoAvgMatchTimeRank;
    }

    public void setDuoAvgMatchTimeRank(int duoAvgMatchTimeRank) {
        this.duoAvgMatchTimeRank = duoAvgMatchTimeRank;
    }

    public double getDuoScorePerMatch() {
        return duoScorePerMatch;
    }

    public void setDuoScorePerMatch(double duoScorePerMatch) {
        this.duoScorePerMatch = duoScorePerMatch;
    }

    public int getDuoScorePerMatchRank() {
        return duoScorePerMatchRank;
    }

    public void setDuoScorePerMatchRank(int duoScorePerMatchRank) {
        this.duoScorePerMatchRank = duoScorePerMatchRank;
    }

    public double getDuoScorePerMinute() {
        return duoScorePerMinute;
    }

    public void setDuoScorePerMinute(double duoScorePerMinute) {
        this.duoScorePerMinute = duoScorePerMinute;
    }

    public int getDuoScorePerMinuteRank() {
        return duoScorePerMinuteRank;
    }

    public void setDuoScorePerMinuteRank(int duoScorePerMinuteRank) {
        this.duoScorePerMinuteRank = duoScorePerMinuteRank;
    }

    public int getSquadScore() {
        return squadScore;
    }

    public void setSquadScore(int squadScore) {
        this.squadScore = squadScore;
    }

    public int getSquadScoreRank() {
        return squadScoreRank;
    }

    public void setSquadScoreRank(int squadScoreRank) {
        this.squadScoreRank = squadScoreRank;
    }

    public int getSquadTop1() {
        return squadTop1;
    }

    public void setSquadTop1(int squadTop1) {
        this.squadTop1 = squadTop1;
    }

    public int getSquadTop1Rank() {
        return squadTop1Rank;
    }

    public void setSquadTop1Rank(int squadTop1Rank) {
        this.squadTop1Rank = squadTop1Rank;
    }

    public int getSquadTop3() {
        return squadTop3;
    }

    public void setSquadTop3(int squadTop3) {
        this.squadTop3 = squadTop3;
    }

    public int getSquadTop3Rank() {
        return squadTop3Rank;
    }

    public void setSquadTop3Rank(int squadTop3Rank) {
        this.squadTop3Rank = squadTop3Rank;
    }

    public int getSquadTop6() {
        return squadTop6;
    }

    public void setSquadTop6(int squadTop6) {
        this.squadTop6 = squadTop6;
    }

    public int getSquadTop6Rank() {
        return squadTop6Rank;
    }

    public void setSquadTop6Rank(int squadTop6Rank) {
        this.squadTop6Rank = squadTop6Rank;
    }

    public double getSquadKillDeath() {
        return squadKillDeath;
    }

    public void setSquadKillDeath(double squadKillDeath) {
        this.squadKillDeath = squadKillDeath;
    }

    public int getSquadKillDeathRank() {
        return squadKillDeathRank;
    }

    public void setSquadKillDeathRank(int squadKillDeathRank) {
        this.squadKillDeathRank = squadKillDeathRank;
    }

    public double getSquadWinRadio() {
        return squadWinRadio;
    }

    public void setSquadWinRadio(double squadWinRadio) {
        this.squadWinRadio = squadWinRadio;
    }

    public double getSquadWinRadioRank() {
        return squadWinRadioRank;
    }

    public void setSquadWinRadioRank(double squadWinRadioRank) {
        this.squadWinRadioRank = squadWinRadioRank;
    }

    public int getSquadMatches() {
        return squadMatches;
    }

    public void setSquadMatches(int squadMatches) {
        this.squadMatches = squadMatches;
    }

    public int getSquadMatchesRank() {
        return squadMatchesRank;
    }

    public void setSquadMatchesRank(int squadMatchesRank) {
        this.squadMatchesRank = squadMatchesRank;
    }

    public int getSquadKills() {
        return squadKills;
    }

    public void setSquadKills(int squadKills) {
        this.squadKills = squadKills;
    }

    public int getSquadKillsRank() {
        return squadKillsRank;
    }

    public void setSquadKillsRank(int squadKillsRank) {
        this.squadKillsRank = squadKillsRank;
    }

    public int getSquadMinutesPlayed() {
        return squadMinutesPlayed;
    }

    public void setSquadMinutesPlayed(int squadMinutesPlayed) {
        this.squadMinutesPlayed = squadMinutesPlayed;
    }

    public int getSquadMinutesPlayedRank() {
        return squadMinutesPlayedRank;
    }

    public void setSquadMinutesPlayedRank(int squadMinutesPlayedRank) {
        this.squadMinutesPlayedRank = squadMinutesPlayedRank;
    }

    public String getSquadMinutesPlayedHours() {
        return squadMinutesPlayedHours;
    }

    public void setSquadMinutesPlayedHours(String squadMinutesPlayedHours) {
        this.squadMinutesPlayedHours = squadMinutesPlayedHours;
    }

    public double getSquadKillsPerMinute() {
        return squadKillsPerMinute;
    }

    public void setSquadKillsPerMinute(double squadKillsPerMinute) {
        this.squadKillsPerMinute = squadKillsPerMinute;
    }

    public int getSquadKillsPerMinuteRank() {
        return squadKillsPerMinuteRank;
    }

    public void setSquadKillsPerMinuteRank(int squadKillsPerMinuteRank) {
        this.squadKillsPerMinuteRank = squadKillsPerMinuteRank;
    }

    public String getSquadAvgMatchTime() {
        return squadAvgMatchTime;
    }

    public void setSquadAvgMatchTime(String squadAvgMatchTime) {
        this.squadAvgMatchTime = squadAvgMatchTime;
    }

    public int getSquadAvgMatchTimeRank() {
        return squadAvgMatchTimeRank;
    }

    public void setSquadAvgMatchTimeRank(int squadAvgMatchTimeRank) {
        this.squadAvgMatchTimeRank = squadAvgMatchTimeRank;
    }

    public double getSquadScorePerMatch() {
        return squadScorePerMatch;
    }

    public void setSquadScorePerMatch(double squadScorePerMatch) {
        this.squadScorePerMatch = squadScorePerMatch;
    }

    public int getSquadScorePerMatchRank() {
        return squadScorePerMatchRank;
    }

    public void setSquadScorePerMatchRank(int squadScorePerMatchRank) {
        this.squadScorePerMatchRank = squadScorePerMatchRank;
    }

    public double getSquadScorePerMinute() {
        return squadScorePerMinute;
    }

    public void setSquadScorePerMinute(double squadScorePerMinute) {
        this.squadScorePerMinute = squadScorePerMinute;
    }

    public int getSquadScorePerMinuteRank() {
        return squadScorePerMinuteRank;
    }

    public void setSquadScorePerMinuteRank(int squadScorePerMinuteRank) {
        this.squadScorePerMinuteRank = squadScorePerMinuteRank;
    }

    public String getLifeTimeScore() {
        return lifeTimeScore;
    }

    public void setLifeTimeScore(String lifeTimeScore) {
        this.lifeTimeScore = lifeTimeScore;
    }

    public int getLifeTimeMatchesPlayed() {
        return lifeTimeMatchesPlayed;
    }

    public void setLifeTimeMatchesPlayed(int lifeTimeMatchesPlayed) {
        this.lifeTimeMatchesPlayed = lifeTimeMatchesPlayed;
    }

    public int getLifeTimeWins() {
        return lifeTimeWins;
    }

    public void setLifeTimeWins(int lifeTimeWins) {
        this.lifeTimeWins = lifeTimeWins;
    }

    public String getLifeTimeWinsProcent() {
        return lifeTimeWinsProcent;
    }

    public void setLifeTimeWinsProcent(String lifeTimeWinsProcent) {
        this.lifeTimeWinsProcent = lifeTimeWinsProcent;
    }

    public int getLifeTimeKills() {
        return lifeTimeKills;
    }

    public void setLifeTimeKills(int lifeTimeKills) {
        this.lifeTimeKills = lifeTimeKills;
    }

    public double getLifeTimeKillDeath() {
        return lifeTimeKillDeath;
    }

    public void setLifeTimeKillDeath(double lifeTimeKillDeath) {
        this.lifeTimeKillDeath = lifeTimeKillDeath;
    }

    public double getLifeTimeKillsPerMinute() {
        return lifeTimeKillsPerMinute;
    }

    public void setLifeTimeKillsPerMinute(double lifeTimeKillsPerMinute) {
        this.lifeTimeKillsPerMinute = lifeTimeKillsPerMinute;
    }

    public String getLifeTimeTimePlayed() {
        return lifeTimeTimePlayed;
    }

    public void setLifeTimeTimePlayed(String lifeTimeTimePlayed) {
        this.lifeTimeTimePlayed = lifeTimeTimePlayed;
    }

    public String getLifeTimeAvgSurvivalTime() {
        return lifeTimeAvgSurvivalTime;
    }

    public void setLifeTimeAvgSurvivalTime(String lifeTimeAvgSurvivalTime) {
        this.lifeTimeAvgSurvivalTime = lifeTimeAvgSurvivalTime;
    }

    public double getSoloKillsPerMatch() {
        return soloKillsPerMatch;
    }

    public void setSoloKillsPerMatch(double soloKillsPerMatch) {
        this.soloKillsPerMatch = soloKillsPerMatch;
    }

    public int getSoloKillsPerMatchRank() {
        return soloKillsPerMatchRank;
    }

    public void setSoloKillsPerMatchRank(int soloKillsPerMatchRank) {
        this.soloKillsPerMatchRank = soloKillsPerMatchRank;
    }

    public double getDuoKillsPerMatch() {
        return duoKillsPerMatch;
    }

    public void setDuoKillsPerMatch(double duoKillsPerMatch) {
        this.duoKillsPerMatch = duoKillsPerMatch;
    }

    public int getDuoKillsPerMatchRank() {
        return duoKillsPerMatchRank;
    }

    public void setDuoKillsPerMatchRank(int duoKillsPerMatchRank) {
        this.duoKillsPerMatchRank = duoKillsPerMatchRank;
    }

    public double getSquadKillsPerMatch() {
        return squadKillsPerMatch;
    }

    public void setSquadKillsPerMatch(double squadKillsPerMatch) {
        this.squadKillsPerMatch = squadKillsPerMatch;
    }

    public int getSquadKillsPerMatchRank() {
        return squadKillsPerMatchRank;
    }

    public void setSquadKillsPerMatchRank(int squadKillsPerMatchRank) {
        this.squadKillsPerMatchRank = squadKillsPerMatchRank;
    }

    @Override
    public String toString() {
        return "IgralecSimple{" +
                "accountId='" + accountId + '\'' +
                ", platformId=" + platformId +
                ", platformName='" + platformName + '\'' +
                ", platformNameLong='" + platformNameLong + '\'' +
                ", epicUserHandle='" + epicUserHandle + '\'' +
                ", soloScore=" + soloScore +
                ", soloScoreRank=" + soloScoreRank +
                ", soloTop1=" + soloTop1 +
                ", soloTop1Rank=" + soloTop1Rank +
                ", soloTop10=" + soloTop10 +
                ", soloTop10Rank=" + soloTop10Rank +
                ", soloTop25=" + soloTop25 +
                ", soloTop25Rank=" + soloTop25Rank +
                ", soloKillDeath=" + soloKillDeath +
                ", SoloKillDeathRank=" + SoloKillDeathRank +
                ", soloWinRadio=" + soloWinRadio +
                ", SoloWinRadioRank=" + SoloWinRadioRank +
                ", soloMatches=" + soloMatches +
                ", SoloMatchesRank=" + SoloMatchesRank +
                ", soloKills=" + soloKills +
                ", soloKillsRank=" + soloKillsRank +
                ", soloMinutesPlayed=" + soloMinutesPlayed +
                ", soloMinutesPlayedRank=" + soloMinutesPlayedRank +
                ", soloMinutesPlayedHours='" + soloMinutesPlayedHours + '\'' +
                ", soloKillsPerMinute=" + soloKillsPerMinute +
                ", soloKillsPerMinuteRank=" + soloKillsPerMinuteRank +
                ", soloKillsPerMatch=" + soloKillsPerMatch +
                ", soloKillsPerMatchRank=" + soloKillsPerMatchRank +
                ", soloAvgMatchTime='" + soloAvgMatchTime + '\'' +
                ", soloAvgMatchTimeRank=" + soloAvgMatchTimeRank +
                ", soloScorePerMatch=" + soloScorePerMatch +
                ", soloScorePerMatchRank=" + soloScorePerMatchRank +
                ", soloScorePerMinute=" + soloScorePerMinute +
                ", soloScorePerMinuteRank=" + soloScorePerMinuteRank +
                ", duoScore=" + duoScore +
                ", duoScoreRank=" + duoScoreRank +
                ", duoTop1=" + duoTop1 +
                ", duoTop1Rank=" + duoTop1Rank +
                ", duoTop5=" + duoTop5 +
                ", duoTop5Rank=" + duoTop5Rank +
                ", duoTop12=" + duoTop12 +
                ", duoTop12Rank=" + duoTop12Rank +
                ", duoKillDeath=" + duoKillDeath +
                ", duoKillDeathRank=" + duoKillDeathRank +
                ", duoWinRadio=" + duoWinRadio +
                ", duoWinRadioRank=" + duoWinRadioRank +
                ", duoMatches=" + duoMatches +
                ", duoMatchesRank=" + duoMatchesRank +
                ", duoKills=" + duoKills +
                ", duoKillsRank=" + duoKillsRank +
                ", duoMinutesPlayed=" + duoMinutesPlayed +
                ", duoMinutesPlayedRank=" + duoMinutesPlayedRank +
                ", duoMinutesPlayedHours='" + duoMinutesPlayedHours + '\'' +
                ", duoKillsPerMinute=" + duoKillsPerMinute +
                ", duoKillsPerMinuteRank=" + duoKillsPerMinuteRank +
                ", duoKillsPerMatch=" + duoKillsPerMatch +
                ", duoKillsPerMatchRank=" + duoKillsPerMatchRank +
                ", duoAvgMatchTime='" + duoAvgMatchTime + '\'' +
                ", duoAvgMatchTimeRank=" + duoAvgMatchTimeRank +
                ", duoScorePerMatch=" + duoScorePerMatch +
                ", duoScorePerMatchRank=" + duoScorePerMatchRank +
                ", duoScorePerMinute=" + duoScorePerMinute +
                ", duoScorePerMinuteRank=" + duoScorePerMinuteRank +
                ", squadScore=" + squadScore +
                ", squadScoreRank=" + squadScoreRank +
                ", squadTop1=" + squadTop1 +
                ", squadTop1Rank=" + squadTop1Rank +
                ", squadTop3=" + squadTop3 +
                ", squadTop3Rank=" + squadTop3Rank +
                ", squadTop6=" + squadTop6 +
                ", squadTop6Rank=" + squadTop6Rank +
                ", squadKillDeath=" + squadKillDeath +
                ", squadKillDeathRank=" + squadKillDeathRank +
                ", squadWinRadio=" + squadWinRadio +
                ", squadWinRadioRank=" + squadWinRadioRank +
                ", squadMatches=" + squadMatches +
                ", squadMatchesRank=" + squadMatchesRank +
                ", squadKills=" + squadKills +
                ", squadKillsRank=" + squadKillsRank +
                ", squadMinutesPlayed=" + squadMinutesPlayed +
                ", squadMinutesPlayedRank=" + squadMinutesPlayedRank +
                ", squadMinutesPlayedHours='" + squadMinutesPlayedHours + '\'' +
                ", squadKillsPerMinute=" + squadKillsPerMinute +
                ", squadKillsPerMinuteRank=" + squadKillsPerMinuteRank +
                ", squadKillsPerMatch=" + squadKillsPerMatch +
                ", squadKillsPerMatchRank=" + squadKillsPerMatchRank +
                ", squadAvgMatchTime='" + squadAvgMatchTime + '\'' +
                ", squadAvgMatchTimeRank=" + squadAvgMatchTimeRank +
                ", squadScorePerMatch=" + squadScorePerMatch +
                ", squadScorePerMatchRank=" + squadScorePerMatchRank +
                ", squadScorePerMinute=" + squadScorePerMinute +
                ", squadScorePerMinuteRank=" + squadScorePerMinuteRank +
                ", lifeTimeScore='" + lifeTimeScore + '\'' +
                ", lifeTimeMatchesPlayed=" + lifeTimeMatchesPlayed +
                ", lifeTimeWins=" + lifeTimeWins +
                ", lifeTimeWinsProcent='" + lifeTimeWinsProcent + '\'' +
                ", lifeTimeKills=" + lifeTimeKills +
                ", lifeTimeKillDeath=" + lifeTimeKillDeath +
                ", lifeTimeKillsPerMinute=" + lifeTimeKillsPerMinute +
                ", lifeTimeTimePlayed='" + lifeTimeTimePlayed + '\'' +
                ", lifeTimeAvgSurvivalTime='" + lifeTimeAvgSurvivalTime + '\'' +
                '}';
    }
}
