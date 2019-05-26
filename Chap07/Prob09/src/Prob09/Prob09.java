package Prob09;

import java.util.Vector;

interface IStack<T> {
	T pop();

	boolean push(T ob);
}

class MyStack<T> implements IStack<T> {
	private Vector<T> v = new Vector<>();
	private int count = 0;

	@Override
	public T pop() {
		// TODO Auto-generated method stub
		count--;
		try {
			return (T) v.get(count);
		} catch (ArrayIndexOutOfBoundsException e) {
			return null;
		}
	}

	@Override
	public boolean push(T ob) {
		// TODO Auto-generated method stub
		v.add(ob);
		count++;
		return true;
	}

}

public class Prob09 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		IStack<Integer> stack = new MyStack<Integer>();

		for (int i = 0; i < 10; i++)
			stack.push(i);

		while (true) {
			Integer n = stack.pop();
			if (n == null)
				break;
			System.out.print(n + " ");
		}
	}

}
