package work_class; 

import javax.swing.*;

import java.awt.*;   //导入必要的包
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
 
 public class GUI extends JFrame implements ActionListener{
	Double y,m,p1,p2,a;
	  
     JTextField jTYearField=null;
     JTextField jTNeedField=null;
     JTextField jTMoneyField=null;
     JTextField jTChengField=null;
     JLabel jLabel1,jLabel2,jLabel3;
     JPanel jp1,jp2,jp3,jp4;
     JButton jb1; //创建按钮
    public GUI(){
        jTNeedField = new JTextField(24);
        jTNeedField.setBounds(234, 8, 198, 24);
        jLabel2 = new JLabel("计算机存储容量的需求是");
        jLabel2.setBounds(48, 11, 165, 18);
        jp2 = new JPanel();
        jp3 = new JPanel();
        
        //设置布局
        getContentPane().setLayout(new GridLayout(5,1));
        jp3.setLayout(null);
        
        jp3.add(jLabel2);
        jp3.add(jTNeedField);
        getContentPane().add(jp2);
        jp1 = new JPanel();
        jp1.setLayout(null);
        
         getContentPane().add(jp1);
         jLabel1 = new JLabel("输入年份");
         jLabel1.setBounds(51, 13, 60, 18);
         jp1.add(jLabel1);
         jTYearField = new JTextField(24);
         jTYearField.setBounds(125, 10, 106, 24);
         jp1.add(jTYearField);
        getContentPane().add(jp3); 
        jTMoneyField = new JTextField(24);
        jTMoneyField.setBounds(235, 5, 198, 24);
        jLabel3 = new JLabel("字长16位时存储器的价格是");
        jLabel3.setBounds(49, 8, 181, 18);
        jp4 = new JPanel();
        jp4.setLayout(null);
        
        jp4.add(jLabel3);
        jp4.add(jTMoneyField);
        getContentPane().add(jp4);
        jb1 = new JButton("开始计算");
        getContentPane().add(jb1);
        
        jb1.addActionListener(this);
      
       this.setSize(619, 497);
      
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       this.setVisible(true);
       this.setTitle("计算");   
    
    
    }
       public void actionPerformed(ActionEvent e) {
      	    if(e.getActionCommand().equals("开始计算")){//按下按钮，即标记生效
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
        new GUI();
        
    }
 }