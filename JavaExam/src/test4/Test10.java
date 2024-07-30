package test4;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

/*
 * 날짜 : 2024/07/19
 * 이름 : 박수정
 * 내용 : 자바 파일 입출력 연습문제
 */
public class Test10 {
	public static void main(String[] args) {

		String path = "C:\\Users\\lotte4\\Desktop\\Gugudan.txt";

		try {
			File file = new File(path);
			FileWriter fw = new FileWriter(file);

			for (int x = 2; x <= 9; x++) {
				// System.out.println(x + "단");
				fw.write(x + "단\n");

				for (int y = 1; y <= 9; y++) {
					int z = x * y;
					// System.out.println(x + " x " + y + " = " + z);
					fw.write(x + " x " + y + " = " + z + "\n");
				}
			}
			fw.close();
		} catch (IOException e) {
			e.printStackTrace();
		}

		System.out.println("구구단 파일생성 완료...");
	}

}
