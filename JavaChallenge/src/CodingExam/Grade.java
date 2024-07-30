package CodingExam;

public class Grade {

	private String name;
    private double koreanScore;
    private double englishScore;
    private double mathScore;

    public Grade(String name, double koreanScore, double englishScore, double mathScore) {
        this.name = name;
        this.koreanScore = koreanScore;
        this.englishScore = englishScore;
        this.mathScore = mathScore;
    }

    public double calculateAverage() {
        return ((koreanScore + englishScore + mathScore) / 3);
    }

    public void printAverage() {
    	double average = calculateAverage();
    	System.out.println(name+"의 평균점수: "+average);
    }
}
