//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by Fernflower decompiler)
//

package homework;

import java.awt.EventQueue;
import java.awt.LayoutManager;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextPane;
import javax.swing.border.EmptyBorder;

public class GUI extends JFrame {
    private JPanel contentPane;

    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    GUI frame = new GUI();
                    frame.setVisible(true);
                } catch (Exception var2) {
                    var2.printStackTrace();
                }

            }
        });
    }

    public GUI() {
        this.setDefaultCloseOperation(3);
        this.setBounds(100, 100, 1134, 414);
        this.contentPane = new JPanel();
        this.contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        this.setContentPane(this.contentPane);
        this.contentPane.setLayout((LayoutManager)null);
        JLabel label = new JLabel("年份");
        label.setBounds(105, 35, 54, 47);
        this.contentPane.add(label);
        final JComboBox year = new JComboBox();

        for(int i = 1960; i <= 2099; ++i) {
            year.addItem(i);
        }

        year.setBounds(145, 41, 113, 24);
        this.contentPane.add(year);
        final JComboBox instructions = new JComboBox();

        for(int i = 1; i <= 100; ++i) {
            instructions.addItem(i);
        }

        instructions.setBounds(611, 46, 91, 24);
        this.contentPane.add(instructions);
        final JComboBox salary = new JComboBox();

        for(int i = 1000; i <= 20000; i += 1000) {
            salary.addItem(i);
        }

        salary.setBounds(611, 95, 91, 24);
        this.contentPane.add(salary);
        final JTextPane textPane = new JTextPane();
        textPane.setBounds(171, 230, 175, 24);
        this.contentPane.add(textPane);
        final JTextPane textPane_1 = new JTextPane();
        textPane_1.setBounds(531, 230, 130, 24);
        this.contentPane.add(textPane_1);
        final JTextPane textPane_2 = new JTextPane();
        textPane_2.setBounds(792, 230, 97, 24);
        this.contentPane.add(textPane_2);
        JLabel label_1 = new JLabel("计算机字长");
        label_1.setBounds(61, 95, 113, 18);
        this.contentPane.add(label_1);
        final JComboBox Bits = new JComboBox();

        for(int i = 2; i <= 32; i *= 2) {
            Bits.addItem(i);
        }

        Bits.setBounds(145, 95, 113, 24);
        this.contentPane.add(Bits);
        JButton button = new JButton("计算");
        button.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                int b = (Integer)Bits.getSelectedItem();
                int Y = (Integer)year.getSelectedItem();
                int I = (Integer)instructions.getSelectedItem();
                int S = (Integer)salary.getSelectedItem();
                double M = 4080.0D * Math.pow(2.718281828459045D, 0.28D * (double)(Y - 1960));
                int W = (int)(M / (double)(20 * I));
                int C = W * S;
                String c = null;
                c = String.valueOf(C);
                textPane_2.setText(c);
                String m = null;
                m = String.valueOf(M);
                textPane.setText(m);
                double P1 = 0.003D * Math.pow(0.72D, (double)(Y - 1974));
                double P2 = 0.048D * Math.pow(0.72D, (double)(Y - 1974));
                int P;
                if (b == 16) {
                    P = (int)(P2 * M);
                } else {
                    P = (int)(P1 * M);
                }

                String p = null;
                p = String.valueOf(P);
                textPane_1.setText(p);
            }
        });
        button.setBounds(389, 158, 91, 27);
        this.contentPane.add(button);
        JLabel label_2 = new JLabel("储存容量的需求估计");
        label_2.setBounds(16, 236, 158, 18);
        this.contentPane.add(label_2);
        JLabel label_3 = new JLabel("储存器的价格");
        label_3.setBounds(426, 236, 91, 18);
        this.contentPane.add(label_3);
        JLabel label_5 = new JLabel("年");
        label_5.setBounds(274, 49, 72, 18);
        this.contentPane.add(label_5);
        JLabel label_6 = new JLabel("位");
        label_6.setBounds(274, 101, 72, 18);
        this.contentPane.add(label_6);
        JLabel label_7 = new JLabel("程序员每天可开发的指令");
        label_7.setBounds(418, 49, 165, 18);
        this.contentPane.add(label_7);
        JLabel label_8 = new JLabel("程序员的平均月薪");
        label_8.setBounds(458, 95, 125, 18);
        this.contentPane.add(label_8);
        JLabel label_9 = new JLabel("条");
        label_9.setBounds(716, 49, 72, 18);
        this.contentPane.add(label_9);
        JLabel label_10 = new JLabel("美元");
        label_10.setBounds(716, 95, 72, 18);
        this.contentPane.add(label_10);
        JLabel label_4 = new JLabel("美元");
        label_4.setBounds(675, 236, 40, 18);
        this.contentPane.add(label_4);
        JLabel label_11 = new JLabel("成本");
        label_11.setBounds(751, 236, 37, 18);
        this.contentPane.add(label_11);
        JLabel label_12 = new JLabel("美元");
        label_12.setBounds(902, 236, 72, 18);
        this.contentPane.add(label_12);
        JLabel label_13 = new JLabel("字");
        label_13.setBounds(360, 236, 72, 18);
        this.contentPane.add(label_13);
    }
}
