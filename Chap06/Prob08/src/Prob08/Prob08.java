package Prob08;

import java.util.Scanner;

public class Prob08 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.print(">>");
		String s = scanner.nextLine();
		String OriginS = new String(s);

		while (true) {
			char c = s.charAt(0);
			s = s.substring(1, s.length());
			s = s.concat(Character.toString(c));

			System.out.println(s);

			if (OriginS.equals(s))
				break;
		}

		scanner.close();
	}

}
