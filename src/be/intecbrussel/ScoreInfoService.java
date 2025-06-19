package be.intecbrussel;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class ScoreInfoService {

    long numberOfStudents;
    private List<ScoreInfo> scoreData = new ArrayList<>();

    public ScoreInfoService() {
    }


    public void addScoreInfo(Student student, int score) {
        scoreData.add(new ScoreInfo(score, student));
        numberOfStudents++;
    }

    public long getNumberOfStudents() {
        return numberOfStudents;
    }

    public void calculateAverageScore() {
        double result = scoreData.stream()
                .mapToInt(n -> n.score)
                .average()
                .orElse(0);
        System.out.println("Average score: " + result);
    }

    public long filterScore() {
        return scoreData.stream()
                .filter(scr -> scr.score >= 90)
                .count();
    }

    private String[] getFailedStudents() {
        return scoreData.stream()
                .filter(scr -> scr.score < 60)
                .map(info -> info.student + " " + info.score)
                .toArray(String[]::new);
    }

    public void printFailingStudents() {
        System.out.println("Students who didn't pass the test: ");
    }

    public void getDataSortedByLastName() {
        System.out.println("Sorted last name: ");
        scoreData.stream()
                .sorted(Comparator.comparing(s -> s.student.lastName))
                .forEach(info -> System.out.println(info.student + " " + info.score));
    }

    public void getDataSortedByScored() {
        System.out.println("Sorted score: ");
        scoreData.stream()
                .sorted(Comparator.comparingInt(s -> s.score))
                .forEach(info -> System.out.println(info.student + " " + info.score));
    }
}


