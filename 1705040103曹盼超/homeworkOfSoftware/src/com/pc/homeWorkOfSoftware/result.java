package com.pc.homeWorkOfSoftware;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.LayoutStyle.ComponentPlacement;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JTextField;

public class result extends JFrame {
	 JFrame frame;
	 private JTextField textFieldNeed;
	 private JTextField textFieldPrice;
	 private JTextField textFieldWork;
	 private JTextField textFieldCoast;
	 public JFrame getFrame() {
		return frame;
	}

	public void setFrame(JFrame frame) {
		this.frame = frame;
	}

	public JTextField getTextFieldNeed() {
		return textFieldNeed;
	}

	public void setTextFieldNeed(JTextField textFieldNeed) {
		this.textFieldNeed = textFieldNeed;
	}

	public JTextField getTextFieldPrice() {
		return textFieldPrice;
	}

	public void setTextFieldPrice(JTextField textFieldPrice) {
		this.textFieldPrice = textFieldPrice;
	}

	public JTextField getTextFieldWork() {
		return textFieldWork;
	}

	public void setTextFieldWork(JTextField textFieldWork) {
		this.textFieldWork = textFieldWork;
	}

	public JTextField getTextFieldCoast() {
		return textFieldCoast;
	}

	public void setTextFieldCoast(JTextField textFieldCoast) {
		this.textFieldCoast = textFieldCoast;
	}

	public JLabel getLabel_4() {
		return label_4;
	}

	public void setLabel_4(JLabel label_4) {
		this.label_4 = label_4;
	}

	public JLabel getLabel_5() {
		return label_5;
	}

	public void setLabel_5(JLabel label_5) {
		this.label_5 = label_5;
	}

	public JLabel getLabel_6() {
		return label_6;
	}

	public void setLabel_6(JLabel label_6) {
		this.label_6 = label_6;
	}

	public JLabel getLabel_7() {
		return label_7;
	}

	public void setLabel_7(JLabel label_7) {
		this.label_7 = label_7;
	}

	public JButton getButton() {
		return button;
	}

	public void setButton(JButton button) {
		this.button = button;
	}

	private JLabel label_4;
	 private JLabel label_5;
	 private JLabel label_6;
	 private JLabel label_7;
	 private JButton button;
	 
	 
	
	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setTitle("查询中心");
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		frame.setVisible(true);
		
		JLabel lblNewLabel = new JLabel("计算结果");
		
		JLabel label = new JLabel("需求估计");
		
		textFieldNeed = new JTextField();
		textFieldNeed.setColumns(10);
		
		
		JLabel label_1 = new JLabel("存储器价格");
		
		textFieldPrice = new JTextField();
		textFieldPrice.setColumns(10);
		
		JLabel label_2 = new JLabel("工作量");
		
		textFieldWork = new JTextField();
		textFieldWork.setColumns(10);
		
		JLabel label_3 = new JLabel("\u6210\u672C");
		
		textFieldCoast = new JTextField();
		textFieldCoast.setColumns(10);
		
		label_4 = new JLabel("\u5B57");
		
		label_5 = new JLabel("\u7F8E\u5143");
		
		label_6 = new JLabel("\u4EBA/\u6708");
		
		label_7 = new JLabel("\u7F8E\u5143");
		
		button = new JButton("\u8FD4\u56DE\u9996\u9875");
		button.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				frame.dispose();
				 new test();
			}
		});
		GroupLayout groupLayout = new GroupLayout(frame.getContentPane());
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(25)
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addGroup(groupLayout.createSequentialGroup()
							.addComponent(label_3)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(textFieldCoast, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(label_7)
							.addGap(67)
							.addComponent(button)
							.addGap(80))
						.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
							.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
								.addGroup(groupLayout.createSequentialGroup()
									.addPreferredGap(ComponentPlacement.RELATED)
									.addComponent(label_1)
									.addPreferredGap(ComponentPlacement.RELATED)
									.addComponent(textFieldPrice, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
									.addPreferredGap(ComponentPlacement.RELATED)
									.addComponent(label_5)
									.addGap(173))
								.addGroup(groupLayout.createSequentialGroup()
									.addComponent(label)
									.addPreferredGap(ComponentPlacement.RELATED)
									.addComponent(textFieldNeed, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
									.addPreferredGap(ComponentPlacement.RELATED)
									.addComponent(label_4)
									.addPreferredGap(ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
									.addComponent(lblNewLabel, GroupLayout.PREFERRED_SIZE, 205, GroupLayout.PREFERRED_SIZE)
									.addGap(32)))
							.addGroup(groupLayout.createSequentialGroup()
								.addComponent(label_2)
								.addPreferredGap(ComponentPlacement.RELATED)
								.addComponent(textFieldWork, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
								.addPreferredGap(ComponentPlacement.RELATED)
								.addComponent(label_6)))))
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
								.addComponent(textFieldNeed, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
								.addComponent(label_4))))
					.addGap(26)
					.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
						.addComponent(label_1)
						.addComponent(textFieldPrice, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(label_5))
					.addGap(27)
					.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
						.addComponent(label_2)
						.addComponent(textFieldWork, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(label_6))
					.addGap(18)
					.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
						.addComponent(label_3)
						.addComponent(textFieldCoast, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(label_7)
						.addComponent(button))
					.addGap(33))
		);
		frame.getContentPane().setLayout(groupLayout);
	}
	
public result() {
	initialize();
}
}
