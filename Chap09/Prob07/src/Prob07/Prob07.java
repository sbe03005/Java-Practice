package Prob07;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

class NorthPanel extends JPanel {
	private static final long serialVersionUID = -3251694701710894387L;

	public NorthPanel() {
		// TODO Auto-generated constructor stub
		setBackground(Color.GRAY);
		setLayout(new FlowLayout());

		add(new JLabel("수식입력"));
		add(new JTextField(16));
	}
}

class CenterPanel extends JPanel {
	private static final long serialVersionUID = -8708288527282487599L;

	public CenterPanel() {
		// TODO Auto-generated constructor stub
		GridLayout grid = new GridLayout(4, 4, 5, 5);
		setLayout(grid);

		for (int i = 0; i < 10; i++) {
			add(new JButton(Integer.toString(i)));
		}

		add(new JButton("CE"));
		add(new JButton("계산"));
		add(new JButton("+")).setBackground(Color.CYAN);
		add(new JButton("-")).setBackground(Color.CYAN);
		add(new JButton("x")).setBackground(Color.CYAN);
		add(new JButton("/")).setBackground(Color.CYAN);
	}
}

class SouthPanel extends JPanel {
	private static final long serialVersionUID = 285692862645049618L;

	public SouthPanel() {
		// TODO Auto-generated constructor stub
		setBackground(Color.YELLOW);
		setLayout(new FlowLayout());

		add(new JLabel("계산 결과"));
		add(new JTextField(16));
	}
}

public class Prob07 extends JFrame {
	private static final long serialVersionUID = -3978967833787824218L;

	public Prob07() {
		// TODO Auto-generated constructor stub
		setTitle("BorderLayout Practice");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		Container c = getContentPane();

		c.setLayout(new BorderLayout());

		c.add(new NorthPanel(), BorderLayout.NORTH);

		c.add(new CenterPanel(), BorderLayout.CENTER);

		c.add(new SouthPanel(), BorderLayout.SOUTH);

		setSize(350, 300);
		setVisible(true);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Prob07();
	}

}
