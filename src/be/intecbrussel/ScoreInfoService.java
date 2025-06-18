package be.intecbrussel;

import java.util.Arrays;

public class ScoreInfoService {
    private ScoreInfo[] scoreData;
    Long numberOfStudents;

    public ScoreInfoService() {
        scoreData = new ScoreInfo[0];
    }


    public void addScoreInfo (ScoreInfo info){


    }

    long numberOfStudents() {
        return
    }

    public void calculateAverageScore (){

    }
    public long filterScore (){
        return Arrays.stream(scoreData)
                .filter(score -> score.score >=90)
                .count();
    }
    private String[] getFailedStudents() {
        return
    }

    public void getDataSortedByLastName (){

    }
    public void getDataSortedByScore () {

    }

}
