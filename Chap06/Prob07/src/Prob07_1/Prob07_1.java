package Prob07_1;

import java.util.Scanner;
import java.util.StringTokenizer;

public class Prob07_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);

		while (true) {
			System.out.print(">>");
			String str = scanner.nextLine();

			StringTokenizer st = new StringTokenizer(str, " ");

			if (str.equals("그만"))
				break;
			else
				System.out.println("어절 개수는 " + st.countTokens());
		}

		System.out.println("종료합니다...");

		scanner.close();
	}
}
