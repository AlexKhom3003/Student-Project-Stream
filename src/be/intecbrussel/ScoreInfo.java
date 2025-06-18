package be.intecbrussel;

public class ScoreInfo {
    int score;
    Student student;

    public ScoreInfo(int score, Student student) {
        this.score = score;
        this.student = student;
    }

    @Override
    public String toString() {
        return "ScoreInfo{" +
                "score=" + score +
                ", student=" + student +
                '}';
    }
}
