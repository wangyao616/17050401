package homework;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class select extends JFrame implements ActionListener{
	private static final ActionListener ActionListener = null;
	public select() {
		super("计算机字长选择");
		//设置容器
		Container c = this.getContentPane();
		//加入按钮
		c.add(getJButton());
		//进行边框大小及位置设置
		this.setSize(600, 300);
		this.setUndecorated(false);
		this.setLocationRelativeTo(null);
		this.setVisible(true);//可视化
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//可关闭
	}
	public JPanel getJButton() {
		JPanel jP = new JPanel();
		jP.setOpaque(false);
		jP.setLayout(null);// 设置空布局
		JButton jButton1 = new JButton("16位字长");
		jButton1.setBounds(130, 80, 90, 40);// 设置按钮位置及大小
		jP.add(jButton1);//加入按钮
		jButton1.addActionListener(this);//***加入事件监听，很重要！
		
		JButton jButton2 = new JButton("非16位字长");
		jButton2.setBounds(350, 80,150, 40);// 设置位置及大小
		jP.add(jButton2);
		jButton2.addActionListener(this);
		return jP;
	}
	public static void main(String[] args) {
		select s = new select();
	}
	public void actionPerformed(ActionEvent e) {
		if (e.getActionCommand() == "16位字长") {
			this.dispose();//销毁此界面
			new sixteen(); // 连接16位字长
			
			}
			else if (e.getActionCommand() == "非16位字长") {
				dispose();
				new nosixteen(); // 连接非16位字长
				
	}
}
}

