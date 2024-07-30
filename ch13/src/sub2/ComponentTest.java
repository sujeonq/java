package sub2;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;

public class ComponentTest extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txtUid;
	private JTextField txtName;
	private JTextField txtHp;
	private JTextField txtPlus1;
	private JTextField txtPlus2;
	private JTextField txtPlusResult;
	private JTextField txtMin1;
	private JTextField txtMin2;
	private JTextField txtMinResult;
	private JTextField txtMul1;
	private JTextField txtMul2;
	private JTextField txtMulResult;
	private JTextField txtDiv1;
	private JTextField txtDiv2;
	private JTextField txtDivResult;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ComponentTest frame = new ComponentTest();
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
	public ComponentTest() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 848, 716);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);

		JLabel lblNewLabel = new JLabel("컴포넌트 실습");
		lblNewLabel.setBounds(32, 10, 76, 15);
		lblNewLabel.setHorizontalAlignment(SwingConstants.LEFT);
		contentPane.add(lblNewLabel);

		JLabel lblNewLabel_1 = new JLabel("버튼 실습");
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel_1.setBounds(32, 35, 76, 15);
		contentPane.add(lblNewLabel_1);

		JButton btn1 = new JButton("확인1");
		btn1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.out.println("버튼1 클릭...");
			}
		});
		btn1.setBounds(32, 58, 97, 23);
		contentPane.add(btn1);

		JButton btn2 = new JButton("확인2");
		btn2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, "버튼2 클릭...");
			}
		});
		btn2.setBounds(141, 58, 97, 23);
		contentPane.add(btn2);

		JButton btn3 = new JButton("확인3");
		btn3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int answer = JOptionPane.showConfirmDialog(null, "버튼3 클릭...", "확인대화상자", JOptionPane.YES_NO_OPTION);

				if (answer == 0) {
					System.out.println("YES 클릭!");
				} else {
					System.out.println("NO 클릭!");
				}
			}
		});
		btn3.setBounds(248, 58, 97, 23);
		contentPane.add(btn3);

		JLabel lblNewLabel_2 = new JLabel("텍스트필드 실습");
		lblNewLabel_2.setBounds(32, 107, 97, 15);
		contentPane.add(lblNewLabel_2);

		JLabel lblNewLabel_2_1 = new JLabel("아이디");
		lblNewLabel_2_1.setBounds(32, 132, 45, 15);
		contentPane.add(lblNewLabel_2_1);

		txtUid = new JTextField();
		txtUid.setBounds(81, 129, 116, 21);
		contentPane.add(txtUid);
		txtUid.setColumns(10);

		JLabel lbResultUid = new JLabel("결과 : ");
		lbResultUid.setBounds(300, 132, 317, 15);
		contentPane.add(lbResultUid);

		JButton btnUid = new JButton("확인");
		btnUid.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String uid = txtUid.getText();
				lbResultUid.setText("결과 : " + uid);
			}
		});
		btnUid.setBounds(201, 128, 76, 23);
		contentPane.add(btnUid);

		JLabel lblNewLabel_2_2 = new JLabel("이름");
		lblNewLabel_2_2.setBounds(32, 161, 45, 15);
		contentPane.add(lblNewLabel_2_2);

		txtName = new JTextField();
		txtName.setColumns(10);
		txtName.setBounds(81, 158, 116, 21);
		contentPane.add(txtName);

		JLabel lbResultName = new JLabel("결과 : ");
		lbResultName.setBounds(300, 161, 317, 15);
		contentPane.add(lbResultName);

		JButton btnName = new JButton("확인");
		btnName.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String name = txtName.getText();
				lbResultName.setText("결과 : " + name);
			}
		});
		btnName.setBounds(201, 157, 76, 23);
		contentPane.add(btnName);

		JLabel lblNewLabel_2_3 = new JLabel("휴대폰");
		lblNewLabel_2_3.setBounds(32, 190, 45, 15);
		contentPane.add(lblNewLabel_2_3);

		txtHp = new JTextField();
		txtHp.setColumns(10);
		txtHp.setBounds(81, 187, 116, 21);
		contentPane.add(txtHp);

		JLabel lbResultHp = new JLabel("결과 : ");
		lbResultHp.setBounds(300, 190, 317, 15);
		contentPane.add(lbResultHp);

		JButton btnHp = new JButton("확인");
		btnHp.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String hp = txtHp.getText();
				lbResultHp.setText("결과 : " + hp);
			}
		});
		btnHp.setBounds(201, 186, 76, 23);
		contentPane.add(btnHp);

		JLabel lblNewLabel_3 = new JLabel("덧셈");
		lblNewLabel_3.setBounds(32, 234, 45, 15);
		contentPane.add(lblNewLabel_3);

		txtPlus1 = new JTextField();
		txtPlus1.setBounds(66, 231, 51, 21);
		contentPane.add(txtPlus1);
		txtPlus1.setColumns(10);

		JLabel lblNewLabel_3_1 = new JLabel("+");
		lblNewLabel_3_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_3_1.setBounds(121, 234, 28, 15);
		contentPane.add(lblNewLabel_3_1);

		txtPlus2 = new JTextField();
		txtPlus2.setColumns(10);
		txtPlus2.setBounds(146, 231, 51, 21);
		contentPane.add(txtPlus2);

		JLabel lblNewLabel_3_1_1 = new JLabel("=");
		lblNewLabel_3_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_3_1_1.setBounds(201, 234, 28, 15);
		contentPane.add(lblNewLabel_3_1_1);

		txtPlusResult = new JTextField();
		txtPlusResult.setColumns(10);
		txtPlusResult.setBounds(226, 231, 51, 21);
		contentPane.add(txtPlusResult);

		JButton btnHp_1 = new JButton("확인");
		btnHp_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnHp_1.setBounds(286, 230, 76, 23);
		contentPane.add(btnHp_1);

		JLabel lblNewLabel_3_2 = new JLabel("뺄셈");
		lblNewLabel_3_2.setBounds(32, 263, 45, 15);
		contentPane.add(lblNewLabel_3_2);

		txtMin1 = new JTextField();
		txtMin1.setColumns(10);
		txtMin1.setBounds(66, 260, 51, 21);
		contentPane.add(txtMin1);

		JLabel lblNewLabel_3_1_2 = new JLabel("+");
		lblNewLabel_3_1_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_3_1_2.setBounds(121, 263, 28, 15);
		contentPane.add(lblNewLabel_3_1_2);

		txtMin2 = new JTextField();
		txtMin2.setColumns(10);
		txtMin2.setBounds(146, 260, 51, 21);
		contentPane.add(txtMin2);

		JLabel lblNewLabel_3_1_1_1 = new JLabel("=");
		lblNewLabel_3_1_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_3_1_1_1.setBounds(201, 263, 28, 15);
		contentPane.add(lblNewLabel_3_1_1_1);

		txtMinResult = new JTextField();
		txtMinResult.setColumns(10);
		txtMinResult.setBounds(226, 260, 51, 21);
		contentPane.add(txtMinResult);

		JButton btnHp_1_1 = new JButton("확인");
		btnHp_1_1.setBounds(286, 259, 76, 23);
		contentPane.add(btnHp_1_1);

		JLabel lblNewLabel_3_2_1 = new JLabel("곱셈");
		lblNewLabel_3_2_1.setBounds(32, 292, 45, 15);
		contentPane.add(lblNewLabel_3_2_1);

		txtMul1 = new JTextField();
		txtMul1.setColumns(10);
		txtMul1.setBounds(66, 289, 51, 21);
		contentPane.add(txtMul1);

		JLabel lblNewLabel_3_1_2_1 = new JLabel("+");
		lblNewLabel_3_1_2_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_3_1_2_1.setBounds(121, 292, 28, 15);
		contentPane.add(lblNewLabel_3_1_2_1);

		txtMul2 = new JTextField();
		txtMul2.setColumns(10);
		txtMul2.setBounds(146, 289, 51, 21);
		contentPane.add(txtMul2);

		JLabel lblNewLabel_3_1_1_1_1 = new JLabel("=");
		lblNewLabel_3_1_1_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_3_1_1_1_1.setBounds(201, 292, 28, 15);
		contentPane.add(lblNewLabel_3_1_1_1_1);

		txtMulResult = new JTextField();
		txtMulResult.setColumns(10);
		txtMulResult.setBounds(226, 289, 51, 21);
		contentPane.add(txtMulResult);

		JButton btnHp_1_1_1 = new JButton("확인");
		btnHp_1_1_1.setBounds(286, 288, 76, 23);
		contentPane.add(btnHp_1_1_1);

		JLabel lblNewLabel_3_2_1_1 = new JLabel("나눗셈");
		lblNewLabel_3_2_1_1.setBounds(26, 321, 51, 15);
		contentPane.add(lblNewLabel_3_2_1_1);

		txtDiv1 = new JTextField();
		txtDiv1.setColumns(10);
		txtDiv1.setBounds(66, 318, 51, 21);
		contentPane.add(txtDiv1);

		JLabel lblNewLabel_3_1_2_1_1 = new JLabel("+");
		lblNewLabel_3_1_2_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_3_1_2_1_1.setBounds(121, 321, 28, 15);
		contentPane.add(lblNewLabel_3_1_2_1_1);

		txtDiv2 = new JTextField();
		txtDiv2.setColumns(10);
		txtDiv2.setBounds(146, 318, 51, 21);
		contentPane.add(txtDiv2);

		JLabel lblNewLabel_3_1_1_1_1_1 = new JLabel("=");
		lblNewLabel_3_1_1_1_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_3_1_1_1_1_1.setBounds(201, 321, 28, 15);
		contentPane.add(lblNewLabel_3_1_1_1_1_1);

		txtDivResult = new JTextField();
		txtDivResult.setColumns(10);
		txtDivResult.setBounds(226, 318, 51, 21);
		contentPane.add(txtDivResult);

		JButton btnHp_1_1_1_1 = new JButton("확인");
		btnHp_1_1_1_1.setBounds(286, 317, 76, 23);
		contentPane.add(btnHp_1_1_1_1);

	}

}
