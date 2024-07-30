package sub3;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

/*
 * 날짜 : 2024/07/18
 * 이름 : 박수정
 * 내용 : 직렬화 실습하기
 */
public class DeSerializeTest {
	public static void main(String[] args) {

		Apple apple1 = new Apple("한국", 3000);

		String path = "C:\\Users\\lotte4\\Desktop\\apple.txt";

		try {
			FileInputStream fis = new FileInputStream(path);

			// 직렬화 객체를 내보내기 위한 보조스트림
			ObjectInputStream ois = new ObjectInputStream(fis);

			// 역직렬화
			Apple apple = (Apple) ois.readObject();
			apple.show();

			// 스트림해제
			ois.close();
			fis.close();

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}

		System.out.println("프로그램 종료...");

	}

}
