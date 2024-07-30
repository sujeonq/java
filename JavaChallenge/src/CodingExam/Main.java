package CodingExam;

public class Main {
	public static void main(String[] args) {
		Grade stud1 = new Grade("강백호", 90.0, 85.5, 70.0);
		Grade stud2 = new Grade("채치수", 82.0, 92.0, 60.5);

		stud1.printAverage();
		stud2.printAverage();
	}

}