package Prob10;

import java.util.Iterator;
import java.util.Scanner;
import java.util.Vector;

abstract class Shape {
	private Shape next;

	public Shape() {
		next = null;
	}

	public void setNext(Shape obj) {
		next = obj;
	}

	public Shape getNext() {
		return next;
	}

	public abstract void draw();
}

class Line extends Shape {
	@Override
	public void draw() {
		// TODO Auto-generated method stub
		System.out.println("Line");
	}
}

class Rect extends Shape {
	@Override
	public void draw() {
		// TODO Auto-generated method stub
		System.out.println("Rect");
	}
}

class Circle extends Shape {
	@Override
	public void draw() {
		// TODO Auto-generated method stub
		System.out.println("Circle");
	}
}

class GraphicEditor {
	Scanner scanner = new Scanner(System.in);
	Vector<Shape> v = new Vector<>();

	/* 삽입하는 메서드 */
	public void insert() {
		System.out.print("Line(1), Rect(2), Circle(3)>>");
		int n = scanner.nextInt();

		switch (n) {
		case 1:
			v.add(new Line());
			break;
		case 2:
			v.add(new Rect());
			break;
		case 3:
			v.add(new Circle());
			break;
		}
	}

	/* 삭제하는 메서드 */
	public boolean delete() {
		System.out.print("삭제할 도형의 위치>>");
		int index = scanner.nextInt();

		try {
			v.remove(index - 1);
			return true;
		} catch (ArrayIndexOutOfBoundsException e) {
			return false;
		}
	}

	/* 모든 리스트를 보여주는 메서드 */
	public void viewAll() {
		Iterator<Shape> it = v.iterator();

		while (it.hasNext())
			it.next().draw();
	}

	/* 끝내는 메서드 */
	public boolean finish() {
		System.out.println("beauty을 종료합니다.");
		return true;
	}

	public void run() {
		System.out.println("그래픽 에디터 beauty을 실행합니다.");

		while (true) {
			System.out.print("삽입(1), 삭제(2), 모두 보기(3), 종료(4)>>");
			int n = scanner.nextInt();

			switch (n) {
			case 1:
				insert();
				break;
			case 2:
				if (!delete())
					System.out.println("삭제할 수 없습니다.");
				break;
			case 3:
				viewAll();
				break;
			default:
				if (finish())
					break;
			}
		}
	}
}

public class Prob10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		GraphicEditor GE = new GraphicEditor();

		GE.run();
	}

}
