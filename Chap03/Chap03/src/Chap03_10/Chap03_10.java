package Chap03_10;

public class Chap03_10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int intArray[][] = { { 0, 0, 0, 0 }, { 0, 0, 0, 0 }, { 0, 0, 0, 0 },
				{ 0, 0, 0, 0 } };
		int count = 0;
		
		for (int i = 0; i < intArray.length; i++) {
			for (int j = 0; j < intArray.length; j++) {
				if (intArray[(int) (Math.random() * 4)][(int) (Math.random() * 4)] == 0 && count<10) {
					intArray[i][j] = (int) (Math.random() * 10 + 1);
					count++;
				}
				System.out.printf("%-3d", intArray[i][j]);
			}
			System.out.println();
		}
	}
}
