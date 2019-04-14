package Chap07;

import java.util.Scanner;

class Day {
	private String work;

	public void set(String work) {
		this.work = work;
	}

	public String get() {
		return work;
	}

	public void show() {
		if (work == null)
			System.out.println("없습니다.");
		else
			System.out.println(work + "입니다.");
	}
}

class MonthSchedule {
	private Day[] todo;
	Scanner scanner = new Scanner(System.in);
	
	public MonthSchedule(int day) {
		todo = new Day[day];
		for (int i = 0; i < todo.length; i++) {
			todo[i] = new Day();
		}
	}

	public void input() {
		System.out.print("날짜(1~30)?");
		int day = scanner.nextInt();

		System.out.print("할일(빈칸없이 입력)?");
		String work = scanner.next();
		todo[day - 1].set(work);
	}

	public void view() {
		System.out.print("날짜(1~30)?");
		int day = scanner.nextInt();

		System.out.print(day + "일의 할 일은 ");
		todo[day - 1].show();
	}

	public boolean finish() {
		System.out.println("프로그램을 종료합니다.");
		return false;
	}

	public void run() {
		boolean isNotFin = true;

		System.out.println("이번달 스케쥴 관리 프로그램.");
		do {
			System.out.print("할일(입력:1, 보기:2, 끝내기:3)>>");
			int option = scanner.nextInt();

			switch (option) {
			case 1:
				input();
				break;
			case 2:
				view();
				break;
			case 3:
				isNotFin = finish();
				break;
			default:
				System.out.println("해당하는 옵션이 존재하지 않습니다.");
				break;
			}
			System.out.println();
		} while (isNotFin);
	}
}

public class Chap07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MonthSchedule april = new MonthSchedule(30);
		april.run();
	}

}
