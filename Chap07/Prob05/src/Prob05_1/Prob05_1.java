package Prob05_1;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;
import java.util.StringTokenizer;

class Student {
	private String name;
	private String major;
	private String snum;
	private String grade;

	public Student(String name, String major, String snum, String grade) {
		// TODO Auto-generated constructor stub
		this.name = name;
		this.major = major;
		this.snum = snum;
		this.grade = grade;
	}

	public String getGrade() {
		return this.grade;
	}

	public String getMajor() {
		return this.major;
	}

	public String getName() {
		return this.name;
	}

	public String getSnum() {
		return this.snum;
	}
}

public class Prob05_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<String, Student> s = new HashMap<String, Student>(4);
		Scanner scanner = new Scanner(System.in);

		System.out.println("학생 이름, 학과, 학번, 학점평균 입력하세요.");
		for (int i = 0; i < 4; i++) {
			System.out.print(">> ");
			String str = scanner.nextLine();
			StringTokenizer st = new StringTokenizer(str, ", ");
			str = st.nextToken();
			s.put(str,
					new Student(str, st.nextToken(), st.nextToken(), st
							.nextToken()));
		}

		while (true) {
			System.out.println("------------------------");
			Set<String> keys = s.keySet();
			Iterator<String> it = keys.iterator();

			while (it.hasNext()) {
				Student stu = s.get(it.next());

				System.out.println("이름 : " + stu.getName());
				System.out.println("학과 : " + stu.getMajor());
				System.out.println("학번 : " + stu.getSnum());
				System.out.println("학점평균 : " + stu.getGrade());
			}

			System.out.println("------------------------");

			while (true) {
				System.out.print("학생 이름 >> ");
				String name = scanner.next();
				if (name.equals("그만"))
					break;

				keys = s.keySet();
				it = keys.iterator();

				while (it.hasNext()) {
					Student stu = s.get(it.next());

					if (!name.equals(stu.getName()))
						continue;

					System.out.println(stu.getName() + ", " + stu.getMajor()
							+ ", " + stu.getSnum() + ", " + stu.getGrade());
				}

			}
			scanner.close();
		}
	}
}
