package RPSProcess;

import java.util.Scanner;

public class RPS {
	Scanner scanner = new Scanner(System.in);
	private String str[] = { "가위", "바위", "보" };
	private String vs[] = { "보", "가위", "바위" };
	private int user;
	private int com;

	/* 컴퓨터가 낸 것 */
	private void com() {
		this.com = (int) (Math.random() * 3);
	}

	/* 유저가 낸 것 */
	private boolean user() {
		this.user = scanner.nextInt();

		if (user == 4)
			return true;
		else
			return false;
	}

	/* 배틀 결과 */
	private void battle() {
		if (vs[user - 1].equals(str[com]))
			System.out.println("웅기(" + vs[user - 1] + ") : 컴퓨터(" + str[com]
					+ ")\n비겼습니다.");
		else {
			for (int i = 0; i < str.length; i++) {
				if (vs[user - 1].equals(str[i]))
					if (str[com].equals(vs[i]))
						System.out.println("웅기(" + vs[user - 1] + ") : 컴퓨터("
								+ str[com] + ")\n웅기가 이겼습니다.");
					else
						System.out.println("웅기(" + vs[user - 1] + ") : 컴퓨터("
								+ str[com] + ")\n컴퓨터가 이겼습니다.");
			}
		}
	}

	/* 실행 함수 */
	public void run() {
		while (true) {
			System.out.print("웅기[가위(1), 바위(2), 보(3), 끝내기(4)]>>");
			if (user())
				break;
			com();

			battle();
		}
	}
}