package f; 

import javax.swing.*;
  
 import java.awt.*;   //�����Ҫ�İ�
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
  
  public class Study extends JFrame implements ActionListener{
	Double y,m,p1,p2,a;
	  
      JTextField jTYearField=null;
      JTextField jTNeedField=null;
      JTextField jTMoneyField=null;
      JTextField jTChengField=null;
      JLabel jLabel1,jLabel2,jLabel3,jLabel4;
      JPanel jp1,jp2,jp3,jp4,jp5;
      JButton jb1; //������ť
     public Study(){
         jTYearField = new JTextField(24);
         jTNeedField = new JTextField(24);
         jTMoneyField = new JTextField(24);
         jTChengField = new JTextField(24);
         jLabel1 = new JLabel("�������");
         jLabel2 = new JLabel("������洢������������");
         jLabel3 = new JLabel("�ֳ�16λʱ�洢���ļ۸���");
         jLabel4 = new JLabel("����ɱ�Ϊ");
         jb1 = new JButton("������");
         jp1 = new JPanel();
         jp2 = new JPanel();
         jp3 = new JPanel();
         jp4 = new JPanel();
         jp5 = new JPanel();
         
         jb1.addActionListener(this);
         //���ò���
         this.setLayout(new GridLayout(5,1));
         
         jp1.add(jLabel1); 
         jp1.add(jTYearField);
         
         jp2.add(jb1);
         
         jp3.add(jLabel2);
         jp3.add(jTNeedField);
         
         jp4.add(jLabel3);
         jp4.add(jTMoneyField);
         
         jp5.add(jLabel4);
         jp5.add(jTChengField);
        
         this.add(jp1);
         this.add(jp2);
         this.add(jp3); 
         this.add(jp4);
         this.add(jp5);
         
        this.setSize(500, 300);
       
         this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
        this.setTitle("����");   
     
     
     }
        public void actionPerformed(ActionEvent e) {
       	    if(e.getActionCommand().equals("������")){//���°�ť���������Ч
       	    	y=Double.parseDouble(jTYearField.getText());
       	        m=Math.pow(Math.E, 0.28*(y-1960))*4080;
       	        p2=Math.pow(0.72, (y-1974))*m*0.048;
       	        a=m/200*4000;
       	        jTNeedField.setText(String.valueOf(m)); 
       	        jTMoneyField.setText(String.valueOf(p2));;
       	        jTChengField.setText(String.valueOf(a));
       	    } 
        
        
        
    }
    public static void main(String[] args){
         new Study();
         
     }
  }
