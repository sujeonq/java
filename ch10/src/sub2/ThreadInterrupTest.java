package sub2;

/*
 * 날짜 : 2024/07/22
 * 이름 : 박수정
 * 내용 : 스레드 상태 실습하기
 */
class SubThread extends Thread {

	@Override
	public void run() { // 작업 스레드로 처리할 메서드

		int i = 1;

		for (;;) {
			System.out.println("Sub Thread 실행..." + i);

			i++;

			try {
				Thread.sleep(1000); // 스레드 1초 대기
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}

	}
}

public class ThreadInterrupTest {

	public static void main(String[] args) {

		SubThread sub = new SubThread();

		sub.start();

		try {
			Thread.sleep(1000 * 10); // 스레드 1초 대기
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		sub.interrupt(); // InterruptedException 발생시켜 작업 스레드 종료
		System.out.println("Main 스레드 종료...");

	}

}
