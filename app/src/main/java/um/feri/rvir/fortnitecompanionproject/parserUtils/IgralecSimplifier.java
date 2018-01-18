package um.feri.rvir.fortnitecompanionproject.parserUtils;

/**
 * Created by Miha on 18/01/2018.
 */

public class IgralecSimplifier {
    public static IgralecSimple vPreprostegaIgralca(IgralecFull igralecFull){
        IgralecSimple igralecSimple = new IgralecSimple();


        //Overall
        igralecSimple.setAccountId(igralecFull.getAccountId());
        igralecSimple.setPlatformId(igralecFull.getPlatformId());
        igralecSimple.setPlatformName(igralecFull.getPlatformName());
        igralecSimple.setPlatformNameLong(igralecFull.getPlatformNameLong());
        igralecSimple.setEpicUserHandle(igralecFull.getEpicUserHandle());

        //Solo
        igralecSimple.setSoloScore(igralecFull.getStats().getP2().getScore().getValueInt());
        igralecSimple.setSoloScoreRank(igralecFull.getStats().getP2().getScore().getRank());
        igralecSimple.setSoloTop1(igralecFull.getStats().getP2().getTop1().getValueInt());
        igralecSimple.setSoloTop1Rank(igralecFull.getStats().getP2().getTop1().getRank());
        igralecSimple.setSoloTop10(igralecFull.getStats().getP2().getTop10().getValueInt());
        igralecSimple.setSoloTop10Rank(igralecFull.getStats().getP2().getTop10().getRank());
        igralecSimple.setSoloTop25(igralecFull.getStats().getP2().getTop25().getValueInt());
        igralecSimple.setSoloTop25Rank(igralecFull.getStats().getP2().getTop25().getRank());
        igralecSimple.setSoloKillDeath(igralecFull.getStats().getP2().getKd().getValueDec());
        igralecSimple.setSoloKillDeathRank(igralecFull.getStats().getP2().getKd().getRank());
        igralecSimple.setSoloWinRadio(igralecFull.getStats().getP2().getWinRatio().getValueDec());
        igralecSimple.setSoloWinRadioRank(igralecFull.getStats().getP2().getWinRatio().getRank());
        igralecSimple.setSoloMatches(igralecFull.getStats().getP2().getMatches().getValueInt());
        igralecSimple.setSoloMatchesRank(igralecFull.getStats().getP2().getMatches().getRank());
        igralecSimple.setSoloKills(igralecFull.getStats().getP2().getKills().getValueInt());
        igralecSimple.setSoloKillsRank(igralecFull.getStats().getP2().getKills().getRank());
        igralecSimple.setSoloMinutesPlayed(igralecFull.getStats().getP2().getMinutesPlayed().getValueInt());
        igralecSimple.setSoloMinutesPlayedRank(igralecFull.getStats().getP2().getMinutesPlayed().getRank());
        igralecSimple.setSoloMinutesPlayedHours(igralecFull.getStats().getP2().getMinutesPlayed().getDisplayValue());
        igralecSimple.setSoloKillsPerMinute(igralecFull.getStats().getP2().getKpm().getValueDec());
        igralecSimple.setSoloKillsPerMinuteRank(igralecFull.getStats().getP2().getKpm().getRank());
        igralecSimple.setSoloKillsPerMatch(igralecFull.getStats().getP2().getKpg().getValueDec());
        igralecSimple.setSoloKillsPerMatchRank(igralecFull.getStats().getP2().getKpg().getRank());
        igralecSimple.setSoloAvgMatchTime(igralecFull.getStats().getP2().getAvgTimePlayed().getDisplayValue());
        igralecSimple.setSoloAvgMatchTimeRank(igralecFull.getStats().getP2().getAvgTimePlayed().getRank());
        igralecSimple.setSoloScorePerMatch(igralecFull.getStats().getP2().getScorePerMatch().getValueDec());
        igralecSimple.setSoloScorePerMatchRank(igralecFull.getStats().getP2().getScorePerMatch().getRank());
        igralecSimple.setSoloScorePerMinute(igralecFull.getStats().getP2().getScorePerMin().getValueDec());
        igralecSimple.setSoloScorePerMinuteRank(igralecFull.getStats().getP2().getScorePerMin().getRank());

        //Duo
        igralecSimple.setDuoScore(igralecFull.getStats().getP10().getScore().getValueInt());
        igralecSimple.setDuoScoreRank(igralecFull.getStats().getP10().getScore().getRank());

        igralecSimple.setDuoTop1(igralecFull.getStats().getP10().getTop1().getValueInt());
        igralecSimple.setDuoTop1Rank(igralecFull.getStats().getP10().getTop1().getRank());
        igralecSimple.setDuoTop5(igralecFull.getStats().getP10().getTop10().getValueInt());
        igralecSimple.setDuoTop5Rank(igralecFull.getStats().getP10().getTop10().getRank());
        igralecSimple.setDuoTop12(igralecFull.getStats().getP10().getTop25().getValueInt());
        igralecSimple.setDuoTop12Rank(igralecFull.getStats().getP10().getTop25().getRank());

        igralecSimple.setDuoKillDeath(igralecFull.getStats().getP10().getKd().getValueDec());
        igralecSimple.setDuoKillDeathRank(igralecFull.getStats().getP10().getKd().getRank());
        igralecSimple.setDuoWinRadio(igralecFull.getStats().getP10().getWinRatio().getValueDec());
        igralecSimple.setDuoWinRadioRank(igralecFull.getStats().getP10().getWinRatio().getRank());
        igralecSimple.setDuoMatches(igralecFull.getStats().getP10().getMatches().getValueInt());
        igralecSimple.setDuoMatchesRank(igralecFull.getStats().getP10().getMatches().getRank());
        igralecSimple.setDuoKills(igralecFull.getStats().getP10().getKills().getValueInt());
        igralecSimple.setDuoKillsRank(igralecFull.getStats().getP10().getKills().getRank());
        igralecSimple.setDuoMinutesPlayed(igralecFull.getStats().getP10().getMinutesPlayed().getValueInt());
        igralecSimple.setDuoMinutesPlayedRank(igralecFull.getStats().getP10().getMinutesPlayed().getRank());
        igralecSimple.setDuoMinutesPlayedHours(igralecFull.getStats().getP10().getMinutesPlayed().getDisplayValue());
        igralecSimple.setDuoKillsPerMinute(igralecFull.getStats().getP10().getKpm().getValueDec());
        igralecSimple.setDuoKillsPerMinuteRank(igralecFull.getStats().getP10().getKpm().getRank());
        igralecSimple.setDuoKillsPerMatch(igralecFull.getStats().getP10().getKpg().getValueDec());
        igralecSimple.setDuoKillsPerMatchRank(igralecFull.getStats().getP10().getKpg().getRank());
        igralecSimple.setDuoAvgMatchTime(igralecFull.getStats().getP10().getAvgTimePlayed().getDisplayValue());
        igralecSimple.setDuoAvgMatchTimeRank(igralecFull.getStats().getP10().getAvgTimePlayed().getRank());
        igralecSimple.setDuoScorePerMatch(igralecFull.getStats().getP10().getScorePerMatch().getValueDec());
        igralecSimple.setDuoScorePerMatchRank(igralecFull.getStats().getP10().getScorePerMatch().getRank());
        igralecSimple.setDuoScorePerMinute(igralecFull.getStats().getP10().getScorePerMin().getValueDec());
        igralecSimple.setDuoScorePerMinuteRank(igralecFull.getStats().getP10().getScorePerMin().getRank());


        //Squad
        igralecSimple.setSquadScore(igralecFull.getStats().getP9().getScore().getValueInt());
        igralecSimple.setSquadScoreRank(igralecFull.getStats().getP9().getScore().getRank());

        igralecSimple.setSquadTop1(igralecFull.getStats().getP9().getTop1().getValueInt());
        igralecSimple.setSquadTop1Rank(igralecFull.getStats().getP9().getTop1().getRank());
        igralecSimple.setSquadTop3(igralecFull.getStats().getP9().getTop10().getValueInt());
        igralecSimple.setSquadTop3Rank(igralecFull.getStats().getP9().getTop10().getRank());
        igralecSimple.setSquadTop6(igralecFull.getStats().getP9().getTop25().getValueInt());
        igralecSimple.setSquadTop6Rank(igralecFull.getStats().getP9().getTop25().getRank());

        igralecSimple.setSquadKillDeath(igralecFull.getStats().getP9().getKd().getValueDec());
        igralecSimple.setSquadKillDeathRank(igralecFull.getStats().getP9().getKd().getRank());
        igralecSimple.setSquadWinRadio(igralecFull.getStats().getP9().getWinRatio().getValueDec());
        igralecSimple.setSquadWinRadioRank(igralecFull.getStats().getP9().getWinRatio().getRank());
        igralecSimple.setSquadMatches(igralecFull.getStats().getP9().getMatches().getValueInt());
        igralecSimple.setSquadMatchesRank(igralecFull.getStats().getP9().getMatches().getRank());
        igralecSimple.setSquadKills(igralecFull.getStats().getP9().getKills().getValueInt());
        igralecSimple.setSquadKillsRank(igralecFull.getStats().getP9().getKills().getRank());
        igralecSimple.setSquadMinutesPlayed(igralecFull.getStats().getP9().getMinutesPlayed().getValueInt());
        igralecSimple.setSquadMinutesPlayedRank(igralecFull.getStats().getP9().getMinutesPlayed().getRank());
        igralecSimple.setSquadMinutesPlayedHours(igralecFull.getStats().getP9().getMinutesPlayed().getDisplayValue());
        igralecSimple.setSquadKillsPerMinute(igralecFull.getStats().getP9().getKpm().getValueDec());
        igralecSimple.setSquadKillsPerMinuteRank(igralecFull.getStats().getP9().getKpm().getRank());
        igralecSimple.setSquadKillsPerMatch(igralecFull.getStats().getP9().getKpg().getValueDec());
        igralecSimple.setSquadKillsPerMatchRank(igralecFull.getStats().getP9().getKpg().getRank());
        igralecSimple.setSquadAvgMatchTime(igralecFull.getStats().getP9().getAvgTimePlayed().getDisplayValue());
        igralecSimple.setSquadAvgMatchTimeRank(igralecFull.getStats().getP9().getAvgTimePlayed().getRank());
        igralecSimple.setSquadScorePerMatch(igralecFull.getStats().getP9().getScorePerMatch().getValueDec());
        igralecSimple.setSquadScorePerMatchRank(igralecFull.getStats().getP9().getScorePerMatch().getRank());
        igralecSimple.setSquadScorePerMinute(igralecFull.getStats().getP9().getScorePerMin().getValueDec());
        igralecSimple.setSquadScorePerMinuteRank(igralecFull.getStats().getP9().getScorePerMin().getRank());

        //LifeTime
        igralecSimple.setLifeTimeScore(igralecFull.getLifeTimeStats().get(6).getValue());
        igralecSimple.setLifeTimeMatchesPlayed(Integer.parseInt(igralecFull.getLifeTimeStats().get(7).getValue()));
        igralecSimple.setLifeTimeWins(Integer.parseInt(igralecFull.getLifeTimeStats().get(8).getValue()));
        igralecSimple.setLifeTimeWinsProcent(igralecFull.getLifeTimeStats().get(9).getValue());
        igralecSimple.setLifeTimeKills(Integer.parseInt(igralecFull.getLifeTimeStats().get(10).getValue()));
        igralecSimple.setLifeTimeKillDeath(Double.parseDouble(igralecFull.getLifeTimeStats().get(11).getValue()));
        igralecSimple.setLifeTimeKillsPerMinute(Double.parseDouble(igralecFull.getLifeTimeStats().get(12).getValue()));
        igralecSimple.setLifeTimeTimePlayed(igralecFull.getLifeTimeStats().get(13).getValue());
        igralecSimple.setLifeTimeAvgSurvivalTime(igralecFull.getLifeTimeStats().get(14).getValue());

        return igralecSimple;
    }
}
