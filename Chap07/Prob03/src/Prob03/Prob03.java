package Prob03;

import java.util.HashMap;
import java.util.Scanner;

public class Prob03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<String, Integer> nations = new HashMap<String, Integer>(10);
		Scanner scanner = new Scanner(System.in);

		System.out.println("나라 이름과 인구를 10개 입력하세요.(예: Korea 5000)");
		for (int i = 0; i < 10; i++) {
			System.out.print("나라 이름, 인구 >> ");
			String name = scanner.next();
			if (name.equals("그만"))
				break;

			int count = scanner.nextInt();

			nations.put(name, count);
		}

		while (true) {
			System.out.print("인구 검색 >> ");
			String name = scanner.next();

			if (name.equals("그만"))
				break;

			if (nations.containsKey(name))
				System.out.println(name + "의 인구는 " + nations.get(name));
			else
				System.out.println(name + " 나라는 없습니다.");
		}

		scanner.close();
	}

}
