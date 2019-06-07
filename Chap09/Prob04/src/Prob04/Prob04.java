package Prob04;

import java.awt.Color;
import java.awt.Container;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class Prob04 extends JFrame {
	private static final long serialVersionUID = -4079066709374455426L;

	public Prob04() {
		// TODO Auto-generated constructor stub
		setTitle("Ten Color Buttons Frame");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		GridLayout grid = new GridLayout(1, 10);

		Container c = getContentPane();
		c.setLayout(grid);

		c.add(new JButton("0")).setBackground(Color.RED);
		c.add(new JButton("1")).setBackground(Color.ORANGE);
		c.add(new JButton("2")).setBackground(Color.YELLOW);
		c.add(new JButton("3")).setBackground(Color.GREEN);
		c.add(new JButton("4")).setBackground(Color.CYAN);
		c.add(new JButton("5")).setBackground(Color.BLUE);
		c.add(new JButton("6")).setBackground(Color.MAGENTA);
		c.add(new JButton("7")).setBackground(Color.DARK_GRAY);
		c.add(new JButton("8")).setBackground(Color.PINK);
		c.add(new JButton("9")).setBackground(Color.MAGENTA);

		setSize(600, 200);
		setVisible(true);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Prob04();
	}

}
