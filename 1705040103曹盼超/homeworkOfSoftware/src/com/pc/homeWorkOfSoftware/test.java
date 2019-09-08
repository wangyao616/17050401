package com.pc.homeWorkOfSoftware;


import javax.swing.JFrame;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.LayoutStyle.ComponentPlacement;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JTextField;

public class test extends JFrame {
	 JFrame frame;
	 private JTextField textFieldYear;
	 private JTextField textFieldOrder;
	 private JTextField textFieldMoney;
	 
	 
	public JFrame getFrame() {
		return frame;
	}

	public void setFrame(JFrame frame) {
		this.frame = frame;
	}

	public JTextField getTextFieldYear() {
		return textFieldYear;
	}

	public void setTextFieldYear(JTextField textFieldYear) {
		this.textFieldYear = textFieldYear;
	}

	public JTextField getTextFieldOrder() {
		return textFieldOrder;
	}

	public void setTextFieldOrder(JTextField textFieldOrder) {
		this.textFieldOrder = textFieldOrder;
	}

	public JTextField getTextFieldMoney() {
		return textFieldMoney;
	}

	public void setTextFieldMoney(JTextField textFieldMoney) {
		this.textFieldMoney = textFieldMoney;
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setTitle("cpc管理中心");
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		frame.setVisible(true);
		
		JLabel lblNewLabel = new JLabel("\u4E3B\u9875\u9762");
		
		JLabel label = new JLabel("\u5E74\u4EFD");
		
		textFieldYear = new JTextField();
		textFieldYear.setColumns(10);
		
		JLabel label_1 = new JLabel("\u6BCF\u5929\u53EF\u5F00\u53D1\u6307\u4EE4");
		
		textFieldOrder = new JTextField();
		textFieldOrder.setColumns(10);
		
		JLabel label_2 = new JLabel("\u6708\u5E73\u5747\u5DE5\u8D44");
		
		textFieldMoney = new JTextField();
		textFieldMoney.setColumns(10);
		
		JButton button = new JButton("\u786E\u8BA4");
		button.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				frame.dispose();
				 result result = new result();
				 String s_year = getTextFieldYear().getText();
				 String s_order = getTextFieldOrder().getText();
				 String s_money = getTextFieldMoney().getText();
				 
				if(s_money!=null && s_order!=null && s_order!=null) {
					int year = 0;
					int order = 0;
					int money = 0;
					long work=0;
					try {
						year = Integer.parseInt(s_year);
						order = Integer.parseInt(s_order);
						money = Integer.parseInt(s_money);
					} catch (Exception e2) {
						e2.printStackTrace();
					}
					
					long need = (long) (4080*Math.pow(Math.E, 0.28*(year-1960)));
					long price = (long) (0.003*16*Math.pow(0.72, year-1974)*need);
					long cost = (long) (need*money/(order*20));
					work = (long) (need/(200));
					
					result.getTextFieldNeed().setText(new Long(need).toString());
					result.getTextFieldPrice().setText(new Long(price).toString());
					result.getTextFieldCoast().setText(new Long(cost).toString());
					result.getTextFieldWork().setText(new Long(work).toString());
				}
			}
		});
		
		JLabel label_3 = new JLabel("\u7F8E\u5143");
		GroupLayout groupLayout = new GroupLayout(frame.getContentPane());
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(25)
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addGroup(groupLayout.createSequentialGroup()
							.addComponent(label_2)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(textFieldMoney, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(label_3)
							.addContainerGap())
						.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
							.addGroup(groupLayout.createSequentialGroup()
								.addComponent(label_1)
								.addPreferredGap(ComponentPlacement.RELATED)
								.addComponent(textFieldOrder, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
								.addGap(210))
							.addGroup(groupLayout.createSequentialGroup()
								.addComponent(label)
								.addPreferredGap(ComponentPlacement.RELATED)
								.addComponent(textFieldYear, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
								.addPreferredGap(ComponentPlacement.RELATED, 48, Short.MAX_VALUE)
								.addComponent(lblNewLabel, GroupLayout.PREFERRED_SIZE, 205, GroupLayout.PREFERRED_SIZE)
								.addGap(32)))))
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(185)
					.addComponent(button)
					.addContainerGap(184, Short.MAX_VALUE))
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addGroup(groupLayout.createSequentialGroup()
							.addContainerGap()
							.addComponent(lblNewLabel, GroupLayout.PREFERRED_SIZE, 46, GroupLayout.PREFERRED_SIZE))
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(53)
							.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
								.addComponent(label)
								.addComponent(textFieldYear, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))))
					.addGap(39)
					.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
						.addComponent(label_1)
						.addComponent(textFieldOrder, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(39)
					.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
						.addComponent(label_2)
						.addComponent(textFieldMoney, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(label_3))
					.addPreferredGap(ComponentPlacement.RELATED, 10, Short.MAX_VALUE)
					.addComponent(button)
					.addContainerGap())
		);
		frame.getContentPane().setLayout(groupLayout);
	}
public test() {
	initialize();
}
}
