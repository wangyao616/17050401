using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Windows.Forms;

namespace WindowsFormsApplication3
{
    public partial class Form1 : Form
    {
        internal object textBox;

        public Form1()
        {
            InitializeComponent();
        }


        public void Form1_Load(object sender, EventArgs e)
        {

        }
        public double a = 1;
        public void button1_Click(object sender, EventArgs e)
        {
            panel1.Visible = false;
            double  X,y;
            if (radioButton2.Checked)
            {
                a = 1;
            }
            else if (radioButton1.Checked)
            {
                a = 0.16;
            }
            else if (radioButton3.Checked)
            {
                a = 0.032;
            }
            else
                a = 1;

            X = Math.Round(Cost() + Price() * a,2);
            y = Math.Round(Price() * a,2);
            double T;
            T = Math.Round(Capacity(), 2);
            label8.Text = T.ToString();
            label9.Text = X.ToString();
            label10.Text = y.ToString();
            panel4.Visible = true;
        }

        public void textBox2_TextChanged(object sender, EventArgs e)
        {

        }

        public void textBox1_TextChanged(object sender, EventArgs e)
        {

        }

        public void numericUpDown1_ValueChanged(object sender, EventArgs e)
        {
        
        }

        public void groupBox1_Enter(object sender, EventArgs e)
        {

        }
        public void radioButton1_CheckedChanged(object sender, EventArgs e)
        {
            
        } 
        public void radioButton2_CheckedChanged(object sender, EventArgs e)
        {
           
        }

       
        public string Wages   //获取工资信息
        {
            get { return this.textBox1.Text; }
            set { this.textBox1.Text = value; }
        }
        public string skill   // 获取每日指令数
        {
            get { return this.textBox2.Text; }
            set { this.textBox2.Text = value; }
        }

        private void panel1_Paint(object sender, PaintEventArgs e)
        {

        }

        private void textBox5_TextChanged(object sender, EventArgs e)
        {

        }
        public double Capacity()  //容量
        {
            double d = 0;
            d = 4080 * Math.Exp(0.28 * (Int32.Parse(this.numericUpDown1.Value.ToString()) - 1960));
            return d;
        }
        public double Cost ()    //成本
        {
            double Wage = Convert.ToDouble(Wages);   //每月工资
            double Skill = Convert.ToDouble(skill);  //每日指令数
            double M = ((Capacity() / Skill) /30) +1 ;  //工作月数
            double Awage = Wage * M;
            return Awage;
        }
        public double Price()  // 价格 
        {
            double P0 ;
            P0 = Capacity()*0.3 * Math.Pow(0.72, Int32.Parse(this.numericUpDown1.Value.ToString()) - 1974);  //基础公式
            return P0;
        }
        public void radioButton3_CheckedChanged(object sender, EventArgs e)
        {
           
        }

        private void button3_Click(object sender, EventArgs e)
        {
            panel1.Visible = true;
            panel4.Visible = false;
        }

        private void label8_Click(object sender, EventArgs e)
        {

        }

        private void label7_Click(object sender, EventArgs e)
        {

        }
    }


}
