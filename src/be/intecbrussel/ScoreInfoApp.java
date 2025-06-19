package be.intecbrussel;

public class ScoreInfoApp {
    public static void main(String[] args) {
        Student student1 = new Student("Khomenko", "Alexandr");
        Student student2 = new Student("Yildiz", "Elif");
        Student student3 = new Student("Shevchenko", "Olena");
        Student student4 = new Student("Demir", "Mustafa");
        Student student5 = new Student("Johnson", "Emma");

        ScoreInfoService service = new ScoreInfoService();

        service.addScoreInfo(student1,95);
        service.addScoreInfo(student2,90);
        service.addScoreInfo(student3,59);
        service.addScoreInfo(student4,81);
        service.addScoreInfo(student5,46);

        System.out.println("Number of students: " + service.getNumberOfStudents());
        service.calculateAverageScore();
        System.out.println("Number of A scores (>=90): " + service.filterScore());

        System.out.println("\nFailing students: ");
        service.printFailingStudents();

        System.out.println("\nSorted by last name: ");
        service.getDataSortedByLastName();

        System.out.println("\nSorted by score: ");
        service.getDataSortedByScored();
    }
}
