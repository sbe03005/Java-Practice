package Prob05;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;
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

public class Prob05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Student> s = new ArrayList<Student>(4);
		Scanner scanner = new Scanner(System.in);

		System.out.println("학생 이름, 학과, 학번, 학점평균 입력하세요.");
		for (int i = 0; i < 4; i++) {
			System.out.print(">> ");
			String str = scanner.nextLine();
			StringTokenizer st = new StringTokenizer(str, ", ");
			s.add(new Student(st.nextToken(), st.nextToken(), st.nextToken(),
					st.nextToken()));
		}

		for (int i = 0; i < 4; i++) {
			System.out.println("------------------------");
			System.out.println("이름 : " + s.get(i).getName());
			System.out.println("학과 : " + s.get(i).getMajor());
			System.out.println("학번 : " + s.get(i).getSnum());
			System.out.println("학점평균 : " + s.get(i).getGrade());
		}

		System.out.println("------------------------");

		while (true) {
			System.out.print("학생 이름 >> ");
			String name = scanner.next();
			if (name.equals("그만"))
				break;

			Iterator<Student> it = s.iterator();
			while (it.hasNext()) {
				Student stu = it.next();

				if (!name.equals(stu.getName()))
					continue;

				System.out.println(stu.getName() + ", " + stu.getMajor() + ", "
						+ stu.getSnum() + ", " + stu.getGrade());
			}

		}
		scanner.close();
	}
}
