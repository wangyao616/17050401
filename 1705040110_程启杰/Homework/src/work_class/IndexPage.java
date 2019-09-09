package work_class;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
 
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
public class IndexPage {
	
	static JFrame jf = new JFrame("课后作业！！！");
	private static void firtPage() {
		// 1.设置窗体大小和标题
		
		jf.setPreferredSize(new Dimension(500, 500));
		// 2.设置关闭窗口就是关闭程序
		jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		jf.getContentPane().setLayout(null);
		// 设置定位
		JLabel jl = new JLabel("软件工程课后作业！！！", JLabel.CENTER);
		jl.setBounds(47, 0, 347, 30);
		jl.setPreferredSize(new Dimension(680, 30));
		jf.getContentPane().add(jl);
		jl.setFont(new Font("宋体", Font.BOLD, 24));
		jl.setForeground(Color.decode("#375a7f"));
		JMenuBar jb = new JMenuBar();
		jb.setBounds(0, 40, 690, 30);
		jf.getContentPane().add(jb);
		jb.setBackground(Color.decode("#65991a"));
		// 新建一个菜单项
		JMenu jmenu0 = new JMenu("题目顺序***");
		jmenu0.setPreferredSize(new Dimension(100, 30));
		jmenu0.setForeground(Color.white);
		jb.add(jmenu0);
		// 新建一个菜单项
		JMenuItem jm = new JMenuItem("第一题！");
		JMenuItem jmi = new JMenuItem("第二题！！");
		JMenuItem jmi0 = new JMenuItem("第三题！！！");

		jmenu0.add(jm);
		jmenu0.add(jmi);
		jmenu0.add(jmi0);

        //开始监听事件
		jm.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				if(e.getSource()==jm) {
				//打开一个新的页面
				new GUI();
			
				}
				
			}
		});
		// 3.设置窗体可见
		jf.pack();
		jf.setVisible(true);
	}

	public static void main(String[] args) {
		firtPage();
		
	}
}
