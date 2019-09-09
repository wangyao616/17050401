package GUI.demo;

import java.awt.*;
import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class GUI extends test {
    private JTextField F1,F2,F3,F4,F5,F6,F7;
    private JLabel L1,L2,L3,L4,L5,L6,L7;
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

    public GUI() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(500, 250, 190, 300);
        JPanel contentPane = new JPanel();
        contentPane.setToolTipText("");
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        setContentPane(contentPane);
        contentPane.setLayout(new FlowLayout());

        L1 = new JLabel("年份");
        contentPane.add(L1);
        F1 = new JTextField();
        contentPane.add(F1);
        F1.setColumns(10);

        L2 = new JLabel("字长");
        contentPane.add(L2);
        F2 = new JTextField();
        contentPane.add(F2);
        F2.setColumns(10);

        L3 = new JLabel("指令数");
        contentPane.add(L3);
        F3 = new JTextField();
        contentPane.add(F3);
        F3.setColumns(10);

        L4 = new JLabel("工资");
        contentPane.add(L4);
        F4 = new JTextField();
        contentPane.add(F4);
        F4.setColumns(10);

        L5 = new JLabel("容量估计");
        contentPane.add(L5);
        F5 = new JTextField();
        contentPane.add(F5);
        F5.setColumns(10);

        L6 = new JLabel("价格");
        contentPane.add(L6);
        F6 = new JTextField();
        contentPane.add(F6);
        F6.setColumns(10);

        L7 = new JLabel("成本");
        contentPane.add(L7);
        F7 = new JTextField();
        contentPane.add(F7);
        F7.setColumns(10);

        JButton button = new JButton("计算");
        contentPane.add(button);
        button.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String a = F1.getText();
                String b = F2.getText();
                String c = F3.getText();
                String d = F4.getText();
                if(a.isEmpty()==false&&b.isEmpty()==false&&c.isEmpty()==false&&d.isEmpty()==false){
                    test money = new test();
                    money.Operation(Integer.parseInt(a),Integer.parseInt(b),Integer.parseInt(c),Integer.parseInt(d));
                    String capacity = String.format("%.0f",money.capacity);
                    String price = String.format("%.0f",money.price);
                    String cost = String.format("%.0f",money.cost);
                    F5.setText(capacity);
                    F6.setText(price);
                    F7.setText(cost);
                }
                else {
                    JOptionPane.showMessageDialog(null,"请输入前四个数据");
                }
            }
        });
    }
}
class test extends JFrame{
    public double capacity,price,cost;

    public void Operation(int year,int Wl,int code,int dollor) {
        capacity = 4080*(Math.pow(Math.E,0.28*(year-1960)));
        price = (0.003*Wl*Math.pow(0.72,(year-1974)))*capacity;
        cost = (capacity/(30*code))*dollor;
    }
}