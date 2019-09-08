
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
public class GUIDemo {
	public static void main(String[] args) {
		int gap = 10;
		JFrame f = new JFrame("计算机硬软件价格计算");
		f.setSize(410, 400);
		f.setLocation(200, 200);
		f.setLayout(null);
		
		JPanel pInput = new JPanel();
		pInput.setBounds(gap, gap, 375, 120);
		pInput.setLayout(new GridLayout(4,3,gap,gap));
		 
		
		
		JLabel year = new JLabel("年份Y:");
		JTextField yearText = new JTextField();
		
		
		JLabel capacity = new JLabel("存储容量M:");
		JTextField capacityText = new JTextField();
		
		
		JLabel price1 = new JLabel("价格P1:");
		JTextField price1Text = new JTextField();
		
		
		JLabel price2 = new JLabel("价格P2:");
		JTextField price2Text = new JTextField();
		
		JLabel celery = new JLabel("程序员工资:");
		JTextField celeryText = new JTextField();

		JLabel codes = new JLabel("日均指令:");
		JTextField codesText = new JTextField();
		
		JLabel measure = new JLabel("字长位数:");
		JTextField measureText = new JTextField();


		JButton b = new JButton("计算");
		
		pInput.add(year);
		pInput.add(yearText);
		pInput.add(capacity);
		pInput.add(capacityText);
		pInput.add(price1);
		pInput.add(price1Text);
		pInput.add(price2);
		pInput.add(price2Text);
		pInput.add(celery);
		pInput.add(celeryText);
		pInput.add(codes);
		pInput.add(codesText);
		pInput.add(measure);
		pInput.add(measureText);


		//文本域
		JTextArea ta = new JTextArea();
        ta.setLineWrap(true);
        b.setBounds(180, 140 + 40, 80, 30);
        ta.setBounds(gap, 160 + 60, 395, 120);
        
		
		
		f.add(pInput);
		f.add(b);
        f.add(ta);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		  
	    f.setVisible(true);
		//鼠标监听
	    b.addActionListener(new ActionListener(){
	    	
	    	@SuppressWarnings("unused")
			public void actionPerformed(ActionEvent e){
	    		
				String year = yearText.getText();
				String capacity = capacityText.getText();
				String price1 = price1Text.getText();
				String price2 = price2Text.getText();
				String celery = celeryText.getText();
				String codes = codesText.getText();
				String unit = measureText.getText();
				double y = Double.parseDouble(year);
				double m = Double.parseDouble(capacity);
				double p1 = Double.parseDouble(price1);
			    double p2 = Double.parseDouble(price2);
			    double mc = Double.parseDouble(celery);//工资
			    double z = Double.parseDouble(codes);//指令
			    double zc = Double.parseDouble(unit);
			    double cb1 = 0;
			    double cb2 = 0;
			    if (year.length()!=0)
			    {
			    	m = 4080*Math.pow(Math.E,0.28*(y-1960));//存储容量
			    	p1 = 0.3*Math.pow(0.72, y-1974)*m;
			    	p2 = 0.003*zc*Math.pow(0.72, y-1974)*m;//16位
			    	cb1 = m/(z*20)*mc;
			    	
			    }
			    String model = "在%s年，"+"计算机的存储容量约为（%s），"+"价格约为（%s），"+"若程序员工资为（%s）美元,"+"则成本约为（%s）美元"+"如果计算机为（%s）位，价格将为（%s）"+"成本将为（%s）美元";
			    String result= String.format(model, y,m,p1,mc,cb1,zc,p2,cb1);
				ta.setText("");
		        ta.append(result);

	    	}
	    	
	    	
	
	    	
	    });
		
	}
	
		
			
		
	}
