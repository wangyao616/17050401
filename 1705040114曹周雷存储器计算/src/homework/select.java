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
		super("������ֳ�ѡ��");
		//��������
		Container c = this.getContentPane();
		//���밴ť
		c.add(getJButton());
		//���б߿��С��λ������
		this.setSize(600, 300);
		this.setUndecorated(false);
		this.setLocationRelativeTo(null);
		this.setVisible(true);//���ӻ�
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//�ɹر�
	}
	public JPanel getJButton() {
		JPanel jP = new JPanel();
		jP.setOpaque(false);
		jP.setLayout(null);// ���ÿղ���
		JButton jButton1 = new JButton("16λ�ֳ�");
		jButton1.setBounds(130, 80, 90, 40);// ���ð�ťλ�ü���С
		jP.add(jButton1);//���밴ť
		jButton1.addActionListener(this);//***�����¼�����������Ҫ��
		
		JButton jButton2 = new JButton("��16λ�ֳ�");
		jButton2.setBounds(350, 80,150, 40);// ����λ�ü���С
		jP.add(jButton2);
		jButton2.addActionListener(this);
		return jP;
	}
	public static void main(String[] args) {
		select s = new select();
	}
	public void actionPerformed(ActionEvent e) {
		if (e.getActionCommand() == "16λ�ֳ�") {
			this.dispose();//���ٴ˽���
			new sixteen(); // ����16λ�ֳ�
			
			}
			else if (e.getActionCommand() == "��16λ�ֳ�") {
				dispose();
				new nosixteen(); // ���ӷ�16λ�ֳ�
				
	}
}
}

