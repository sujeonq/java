package test01;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/*
 * 날짜 : 2024/08/02
 * 이름 : 박수정
 * 내용 : 자바 총정리 문제
 */
public class Main {
	private static Scanner scanner = new Scanner(System.in);
	private static List<StudentScore> scores = new ArrayList<StudentScore>();
	
	
	public static void main(String[] args) {
		
		// 학생 성적 객체 생성
		StudentScore student = new StudentScore("홍길동", "S001", "자바", 90.0);
		StudentScore newStudentScore = null;
		scores.add(newStudentScore);
		
		// 학생 정보 출력
		student.printStudentInfo();
		System.out.println("--------------------");
		
		// 성적 수정 및 조회 테스트
		student.updateScore(98.0);
		System.out.println("--------------------");
		
		// 유효하지 않은 성적 입력
		student.updateScore(102.0);
		System.out.println("--------------------");
		
		// 학생 정보 출력
		student.printStudentInfo();
		System.out.println("--------------------");
	}
}