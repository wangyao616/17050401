package hello;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.event.ActionEvent;

public class GUI extends hello {
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GUI frame = new GUI();
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
	public GUI() {
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		JPanel contentPane = new JPanel();
		contentPane.setToolTipText("");
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		//年份下拉框
		Integer[] arry = new Integer[201];
		for (int i = 1960; i < 2161; i++)
		{
		   arry[i-1960] = i;
		}
		JComboBox comboBox = new JComboBox(arry);
		comboBox.setEditable(true);
		comboBox.setToolTipText("\u5E74\u4EFD");
		comboBox.setBounds(55, 31, 54, 23);
		contentPane.add(comboBox);
		
		
		
		JLabel lblNewLabel = new JLabel("\u5E74\u4EFD");
		lblNewLabel.setBounds(22, 35, 54, 15);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("\u5B57\u957F");
		lblNewLabel_1.setBounds(208, 35, 66, 15);
		contentPane.add(lblNewLabel_1);
		
		//字长下拉框
		JComboBox comboBox_1 = new JComboBox();
		comboBox_1.setModel(new DefaultComboBoxModel(new String[] {"8","16","32","64"}));
		comboBox_1.setToolTipText("\u8BA1\u7B97\u673A\u7684\u5B57\u957F");
		comboBox_1.setEditable(true);
		comboBox_1.setBounds(240, 31, 41, 23);
		contentPane.add(comboBox_1);
		
		JLabel lblNewLabel_2 = new JLabel("\u7A0B\u5E8F\u5458\u6BCF\u5929\u53EF\u5F00\u53D1\u6307\u4EE4\u6761\u6570");
		lblNewLabel_2.setBounds(10, 83, 144, 15);
		contentPane.add(lblNewLabel_2);
		
		//指令条数下拉框
		JComboBox comboBox_2 = new JComboBox();
		comboBox_2.setModel(new DefaultComboBoxModel(new String[] {"1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30"}));
		comboBox_2.setEditable(true);
		comboBox_2.setBounds(164, 79, 41, 23);
		contentPane.add(comboBox_2);
		
		JLabel label = new JLabel("\u6708\u5DE5\u8D44");
		label.setBounds(267, 83, 54, 15);
		contentPane.add(label);
		
		//工资下拉框
		JComboBox comboBox_3 = new JComboBox();
		comboBox_3.setModel(new DefaultComboBoxModel(new String[] {"2000", "2500", "3000", "3500", "4000", "4500", "5000", "5500", "6000", "6500", "7000", "7500", "8000", "8500", "9000"}));
		comboBox_3.setToolTipText("\u7F8E\u56FD\u5DE5\u8D44\u8FD9\u4E48\u9AD8\u5417\uFF1F");
		comboBox_3.setEditable(true);
		comboBox_3.setBounds(313, 79, 54, 23);
		contentPane.add(comboBox_3);
		
		
		JLabel label_1 = new JLabel("\u7ED3\u679C\uFF1A");
		label_1.setBounds(10, 148, 54, 15);
		contentPane.add(label_1);
		
		JLabel label_2 = new JLabel("\u5BB9\u91CF\u9700\u6C42");
		label_2.setBounds(55, 173, 54, 15);
		contentPane.add(label_2);
		
		textField = new JTextField();
		textField.setBounds(107, 170, 130, 21);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JLabel label_3 = new JLabel("\u4EF7\u683C");
		label_3.setBounds(240, 173, 54, 15);
		contentPane.add(label_3);
		
		textField_1 = new JTextField();
		textField_1.setBounds(267, 170, 150, 21);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		JLabel label_4 = new JLabel("\u88C5\u6EE1\u7A0B\u5E8F\u6210\u672C");
		label_4.setBounds(55, 216, 80, 15);
		contentPane.add(label_4);
		
		textField_2 = new JTextField();
		textField_2.setBounds(132, 213, 166, 21);
		contentPane.add(textField_2);
		textField_2.setColumns(10);
		
		JLabel label_5 = new JLabel("\u6761");
		label_5.setBounds(208, 83, 54, 15);
		contentPane.add(label_5);
		
		JLabel label_6 = new JLabel("\u7F8E\u5143");
		label_6.setBounds(370, 83, 54, 15);
		contentPane.add(label_6);
		
		JLabel label_7 = new JLabel("\u5E74");
		label_7.setBounds(119, 35, 54, 15);
		contentPane.add(label_7);
		
		JButton button = new JButton("\u786E\u8BA4");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//double capacity = 0,price = 0,cost = 0;
				String a = comboBox.getSelectedItem().toString();
				String b = comboBox_1.getSelectedItem().toString();
				String c = comboBox_2.getSelectedItem().toString();
				String d = comboBox_3.getSelectedItem().toString();
				hello money = new hello();
			    money.Operation(Integer.parseInt(a),Integer.parseInt(b),Integer.parseInt(c),Integer.parseInt(d));
			    String capacity = String.format("%.0f",money.capacity);
			    String price = String.format("%.0f",money.price);
			    String cost = String.format("%.0f",money.cost);
			    String capacity_1 = capacity + "";// capacity.toString();
				String price_1 = price + "";
				String cost_1 = cost + "";
				textField.setText(capacity_1);
				textField_1.setText(price_1);
				textField_2.setText(cost_1);
			}
		});
		button.setBounds(177, 124, 93, 23);
		contentPane.add(button);
		
	}
}
