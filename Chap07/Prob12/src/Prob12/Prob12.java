package Prob12;

import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.Vector;

class EnglishWord {
	private String eng;
	private String kor;

	public EnglishWord(String eng, String kor) {
		// TODO Auto-generated constructor stub
		this.eng = eng;
		this.kor = kor;
	}

	public String getEng() {
		return this.eng;
	}

	public String getKor() {
		return this.kor;
	}
}

class EnglishStudy {
	private Vector<EnglishWord> v = new Vector<>();
	Scanner scanner = new Scanner(System.in);

	public EnglishStudy() {
		// TODO Auto-generated constructor stub
		v.add(new EnglishWord("apple", "사과"));
		v.add(new EnglishWord("banana", "바나나"));
		v.add(new EnglishWord("love", "사랑"));
		v.add(new EnglishWord("baby", "아기"));
		v.add(new EnglishWord("human", "인간"));
		v.add(new EnglishWord("fault", "오류"));
		v.add(new EnglishWord("emotion", "감정"));
		v.add(new EnglishWord("painting", "그림"));
		v.add(new EnglishWord("animal", "동물"));
		v.add(new EnglishWord("eye", "눈"));
	}

	private void test() {
		// TODO Auto-generated method stub
		System.out.println("현재 " + v.size()
				+ "개의 단어가 들어 있습니다. -1을 입력하면 테스트를 종료합니다.");
		while (true) {
			String[] list = { "", "", "", "" };
			int answer = (int) (Math.random() * 4); // 여기에 +1 한게 답임
			int randWord = (int) (Math.random() * v.size());

			System.out.println(v.get(randWord).getEng() + "?");
			list[answer] = v.get(randWord).getKor();
			// System.out.println(list[answer] + " " + (answer+1)); // 답지

			for (int i = 0; i < 3; i++) {
				int index;
				int randindex;
				while (true) {
					boolean isTrue = false;
					index = (int) (Math.random() * 4);
					randindex = (int) (Math.random() * v.size());

					if (list[index].equals("")) {
						for (int j = 0; j < list.length; j++) {
							if (list[j].equals(v.get(randindex).getKor())) {
								isTrue = true;
							}
						}
						if (isTrue)
							continue;
						else {
							list[index] = v.get(randindex).getKor();
							break;
						}
					}
				}
			}

			for (int i = 0; i < list.length; i++) {
				System.out.print("(" + (i + 1) + ")" + list[i] + " ");
			}
			System.out.println();

			int yourAnswer = 0;
			try {
				yourAnswer = scanner.nextInt();
			} catch (InputMismatchException e) {
				System.out.println("숫자를 입력하세요!");
				scanner.nextLine(); // 버퍼 제거
				continue;
			}

			if (yourAnswer == -1)
				break;
			if (yourAnswer == answer + 1)
				System.out.println("Excellent !!");
			else
				System.out.println("No. !!");
		}
		System.out.println();
	}

	private void insert() {
		// TODO Auto-generated method stub
		System.out.println("영어 단어에 그만을 입력하면 입력을 종료합니다.");
		while (true) {
			System.out.print("영어 한글 입력 >> ");
			String eng = scanner.next();
			if (eng.equals("그만"))
				break;
			String kor = scanner.next();

			v.add(new EnglishWord(eng, kor));
		}
		System.out.println();
	}

	private boolean finish() {
		// TODO Auto-generated method stub
		System.out.println("\"명품영어\"를 종료합니다.");
		return true;
	}

	public void run() {
		System.out.println("**** 영어 단어 테스트 프로그램 \"명품영어\" 입니다. ****");
		boolean isFinish = false;

		while (true) {
			System.out.print("단어 테스트:1, 단어 삽입:2, 종료:3>> ");
			int n = scanner.nextInt();

			switch (n) {
			case 1:
				test();
				break;
			case 2:
				insert();
				break;
			default:
				isFinish = finish();
				break;
			}
			if (isFinish)
				break;
		}
	}
}

public class Prob12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EnglishStudy es = new EnglishStudy();

		es.run();
	}
}
