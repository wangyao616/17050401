package work;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.JTextPane;
import javax.swing.JLabel;
import javax.swing.JToggleButton;
import javax.swing.JComboBox;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;

public class work extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					work frame = new work();
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
	public work() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1134, 414);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		
		JLabel label = new JLabel("\u5E74\u4EFD");
		label.setBounds(105, 35, 54, 47);
		contentPane.add(label);
		
		
		JComboBox year = new JComboBox();
		for(int i=1960;i<=2099;i++) {
			year.addItem(i);
		}
		year.setBounds(145, 41, 113, 24);
		contentPane.add(year);
		
		JComboBox instructions = new JComboBox();
		for(int i=1;i<=100;i++) {
			instructions.addItem(i);
		}
		instructions.setBounds(611, 46, 91, 24);
		contentPane.add(instructions);
		
		JComboBox salary = new JComboBox();
		for(int i=1000;i<=20000;i = i+1000) {
			salary.addItem(i);
		}
		salary.setBounds(611, 95, 91, 24);
		contentPane.add(salary);
		
		JTextPane textPane = new JTextPane();
		textPane.setBounds(171, 230, 175, 24);
		contentPane.add(textPane);
		
		JTextPane textPane_1 = new JTextPane();
		textPane_1.setBounds(531, 230, 130, 24);
		contentPane.add(textPane_1);
		
		JTextPane textPane_2 = new JTextPane();
		textPane_2.setBounds(792, 230, 97, 24);
		contentPane.add(textPane_2);
		
		JLabel label_1 = new JLabel("\u8BA1\u7B97\u673A\u5B57\u957F");
		label_1.setBounds(61, 95, 113, 18);
		contentPane.add(label_1);
		
		JComboBox Bits = new JComboBox();
		for(int i=2;i<=32;i=i*2) {
			Bits.addItem(i);
		}
		Bits.setBounds(145, 95, 113, 24);
		contentPane.add(Bits);
		
		JButton button = new JButton("\u8BA1\u7B97");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double M,P1,P2;
				int Y,b,I,S,P,C,W;
				b = (int) Bits.getSelectedItem();
				Y = (int) year.getSelectedItem();
				I = (int) instructions.getSelectedItem();
				S = (int) salary.getSelectedItem();
				M = 4080*Math.pow(Math.E,0.28*(Y-1960));
				W = (int) (M/(20*I));
				C = (int) (W*S);
				String c = null;
				c = c.valueOf(C);
				textPane_2.setText(c);
				String m = null;
				m = m.valueOf(M);
				textPane.setText(m);
				P1 = 0.003*Math.pow(0.72, (Y-1974));
				P2 = 0.048*Math.pow(0.72, (Y-1974));
				if(b==16){
					P = (int) (P2*M);
				}else P = (int) (P1*M);
				String p = null;
				p = p.valueOf(P);
				textPane_1.setText(p);
			}
		});
		button.setBounds(389, 158, 91, 27);
		contentPane.add(button);
		
		JLabel label_2 = new JLabel("\u50A8\u5B58\u5BB9\u91CF\u7684\u9700\u6C42\u4F30\u8BA1");
		label_2.setBounds(16, 236, 158, 18);
		contentPane.add(label_2);
		
		JLabel label_3 = new JLabel("\u50A8\u5B58\u5668\u7684\u4EF7\u683C");
		label_3.setBounds(426, 236, 91, 18);
		contentPane.add(label_3);
		
		JLabel label_5 = new JLabel("\u5E74");
		label_5.setBounds(274, 49, 72, 18);
		contentPane.add(label_5);
		
		JLabel label_6 = new JLabel("\u4F4D");
		label_6.setBounds(274, 101, 72, 18);
		contentPane.add(label_6);
		
		JLabel label_7 = new JLabel("\u7A0B\u5E8F\u5458\u6BCF\u5929\u53EF\u5F00\u53D1\u7684\u6307\u4EE4");
		label_7.setBounds(418, 49, 165, 18);
		contentPane.add(label_7);
		
		JLabel label_8 = new JLabel("\u7A0B\u5E8F\u5458\u7684\u5E73\u5747\u6708\u85AA");
		label_8.setBounds(458, 95, 125, 18);
		contentPane.add(label_8);
		
		JLabel label_9 = new JLabel("\u6761");
		label_9.setBounds(716, 49, 72, 18);
		contentPane.add(label_9);
		
		JLabel label_10 = new JLabel("\u7F8E\u5143");
		label_10.setBounds(716, 95, 72, 18);
		contentPane.add(label_10);
		
		JLabel label_4 = new JLabel("\u7F8E\u5143");
		label_4.setBounds(675, 236, 40, 18);
		contentPane.add(label_4);
		
		JLabel label_11 = new JLabel("\u6210\u672C");
		label_11.setBounds(751, 236, 37, 18);
		contentPane.add(label_11);
		
		JLabel label_12 = new JLabel("\u7F8E\u5143");
		label_12.setBounds(902, 236, 72, 18);
		contentPane.add(label_12);
		
		JLabel label_13 = new JLabel("\u5B57");
		label_13.setBounds(360, 236, 72, 18);
		contentPane.add(label_13);
	}
}
