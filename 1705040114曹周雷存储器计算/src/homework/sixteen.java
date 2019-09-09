package homework;
import java.awt.Container;
import java.awt.Label;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class sixteen extends JFrame implements ActionListener{
	public sixteen() {
		super("计算(16位)");
		Container c = this.getContentPane();
		c.add(getJButton());
		this.setSize(600, 600);
		this.setUndecorated(false);
		this.setLocationRelativeTo(null);
		this.setVisible(true);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		
	}
	public JPanel getJButton() {
		JPanel jP = new JPanel();
		jP.setOpaque(false);
		jP.setLayout(null);// 设置空布局
		Label lable1 = new Label("当年存储器容量需求与价格");
		TextField num1,num2,num3,num4,num5;
		num1 = new TextField(4);  //获取文本框里的数字     
		num2 = new TextField(10);       
		num3 = new TextField(10);
		num4 = new TextField(10);
		num5 = new TextField(10);
		
		class myMonitor implements ActionListener {     //事件监听器（点击按钮，触发的事件）
			private static final double E = 0;
			JPanel tf = null;                          //一个类不能直接访问其他类成员变量
			
			public myMonitor(JPanel tf) {         //在该对象中持有对方的引用（整个类的引用）
				this.tf = tf;
			}
			TextField num1,num2,num3,num4,num5;                                            //将对方的成员变量传给自己的方法中
			public myMonitor(TextField num1,TextField num2,TextField num3,TextField num4,TextField num5) {
				this.num1 = num1;
				this.num2 = num2;
				this.num3 = num3;
				this.num4 = num4;
				this.num5 = num5;
				
			}
			
			public void actionPerformed(ActionEvent e) {
				double a = Math.E;//给e赋值过去，避免与e冲突
				int n1 = Integer.parseInt(num1.getText());
				int n2 = Integer.parseInt(num2.getText());
				int n3 = Integer.parseInt(num3.getText());
				//在第4和第5个框里进行公式计算得出结果
				num4.setText("" + (4080*Math.pow(a,0.28*(n1-1960))));
				num5.setText("" + (n3+n2*0.048*Math.pow(0.72,(n1-1974))));
			}
	}
		
		lable1.setBounds(200,30,400,40);
		jP.add(lable1);
		
		Label lable2 = new Label("请输入年份：");
		lable2.setBounds(60,110,80,40);//标签位置
		jP.add(lable2);
		num1.setBounds(140, 120, 80,20);
		jP.add(num1);
		
		Label lable3 = new Label("请输入员工每天工作效率：");
		lable3.setBounds(320,110,150,40);
		jP.add(lable3);
		num2.setBounds(470, 120, 80,20);
		jP.add(num2);
		
		Label lable4 = new Label("请输入员工每月工资：");
		lable4.setBounds(60,220,130,40);
		jP.add(lable4);
		num3.setBounds(190, 230, 80,20);
		jP.add(num3);
		
		JButton jButton1 = new JButton("确定");
		jButton1.setBounds(110, 320, 90, 40);// 设置位置及大小
		jP.add(jButton1);
		jButton1.addActionListener(new myMonitor(num1,num2,num3,num4,num5));  //给按钮jButton1加上监听器
		
		JButton jButton2 = new JButton("返回");
		jButton2.setBounds(360,320,90, 40);// 设置位置及大小
		jP.add(jButton2);
		jButton2.addActionListener(this);
		
		Label lable5 = new Label("当年存储器容量需求：");
		lable5.setBounds(50,420,130,40);
		jP.add(lable5);
		num4.setBounds(180, 430, 80,20);
		jP.add(num4);
		
		Label lable6 = new Label("当年存储器成本：");
		lable6.setBounds(300,420,100,40);
		jP.add(lable6);
		num5.setBounds(400, 430, 80,20);
		jP.add(num5);
		
		return jP;
	}
	
	public static void main(String[] args) {
		 new sixteen();
	}
	public void actionPerformed(ActionEvent e) {
		if (e.getActionCommand() == "返回") {
			this.dispose();
			new select();
			}
	}
}
