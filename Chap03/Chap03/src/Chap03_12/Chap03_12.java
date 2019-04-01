package Chap03_12;

public class Chap03_12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum = 0;

		for (int i = 0; i < args.length; i++) {

			try {
				sum += Integer.parseInt(args[i]);
			} catch (NumberFormatException e) {
				System.out.println(args[i] + "는 정수가 아니므로 정수로 파싱이 불가능합니다.");
			}
		}

		System.out.println(sum);
	}
}
