package sub3;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import java.awt.Font;

public class CalcApp extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CalcApp frame = new CalcApp();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public CalcApp() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 461, 490);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);

		JButton btn4 = new JButton("4");
		btn4.setBounds(25, 194, 87, 71);
		contentPane.add(btn4);

		JButton btn5 = new JButton("5");
		btn5.setBounds(126, 194, 87, 71);
		contentPane.add(btn5);

		JButton btn6 = new JButton("6");
		btn6.setBounds(231, 194, 87, 71);
		contentPane.add(btn6);

		textField = new JTextField();
		textField.setEditable(false);
		textField.setFont(new Font("굴림", Font.PLAIN, 48));
		textField.setHorizontalAlignment(SwingConstants.RIGHT);
		textField.setText("0");
		textField.setBounds(25, 10, 389, 92);
		contentPane.add(textField);
		textField.setColumns(10);

		JButton btnMul = new JButton("x");
		btnMul.setBounds(332, 194, 87, 71);
		contentPane.add(btnMul);

		JButton btnDiv = new JButton("/");
		btnDiv.setBounds(329, 112, 87, 71);
		contentPane.add(btnDiv);

		JButton btn9 = new JButton("9");
		btn9.setBounds(228, 112, 87, 71);
		contentPane.add(btn9);

		JButton btn8 = new JButton("8");
		btn8.setBounds(123, 112, 87, 71);
		contentPane.add(btn8);

		JButton btn7 = new JButton("7");
		btn7.setBounds(22, 112, 87, 71);
		contentPane.add(btn7);

		JButton btn1 = new JButton("1");
		btn1.setBounds(25, 275, 87, 71);
		contentPane.add(btn1);

		JButton btn2 = new JButton("2");
		btn2.setBounds(126, 275, 87, 71);
		contentPane.add(btn2);

		JButton btn3 = new JButton("3");
		btn3.setBounds(231, 275, 87, 71);
		contentPane.add(btn3);

		JButton btnMin = new JButton("-");
		btnMin.setBounds(332, 275, 87, 71);
		contentPane.add(btnMin);

		JButton btnC = new JButton("C");
		btnC.setBounds(25, 356, 87, 71);
		contentPane.add(btnC);

		JButton btn0 = new JButton("0");
		btn0.setBounds(126, 356, 87, 71);
		contentPane.add(btn0);

		JButton btnEqual = new JButton("=");
		btnEqual.setBounds(231, 356, 87, 71);
		contentPane.add(btnEqual);

		JButton btnPlus = new JButton("+");
		btnPlus.setBounds(332, 356, 87, 71);
		contentPane.add(btnPlus);
	}

}
