using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Windows.Forms;

namespace WindowsFormsApp1
{
    public partial class Form1 : Form
    {
        public Form1()
        {
            InitializeComponent();
        }
        

        private void button1_Click(object sender, EventArgs e)
        {
            double Y, B, Z, W, G, M, P1, P2, P3;
            string y, b, z, w, g;
            y = textBox1.Text;
            z = textBox3.Text;
            g = textBox5.Text;

            Y = System.Convert.ToDouble(y);
            Z = System.Convert.ToDouble(z);
           
            G = System.Convert.ToDouble(g);


            M = 4080 * Math.Exp(0.28 * (Y - 1960));
            P1 = 0.048 * Math.Pow(0.72, (Y - 1974));
            P3 = (M / (Z * 30)) * G + (P1 * M);



            label4.Text = M.ToString();
            label5.Text = P1.ToString();
            label6.Text = P3.ToString();







        }

        private void textBox3_TextChanged(object sender, EventArgs e)
        {

        }

        private void textBox1_TextChanged(object sender, EventArgs e)
        {

        }

        private void label2_Click(object sender, EventArgs e)
        {

        }

        private void label1_Click(object sender, EventArgs e)
        {

        }

        private void button2_Click(object sender, EventArgs e)
        {
            double Y, B, Z, W, G, M, P1, P2, P3;
            string y, b, z, w, g;
            y = textBox1.Text;
            z = textBox3.Text;
            g = textBox5.Text;

            Y = System.Convert.ToDouble(y);
            Z = System.Convert.ToDouble(z);
            G = System.Convert.ToDouble(g);


            M = 4080 * Math.Exp(0.28 * (Y - 1960));
            P1 = 0.3 * Math.Pow(0.72, (Y - 1974));
            P3 = (M / (Z * 30)) * G + (P1 * M);



            label4.Text = M.ToString();
            label5.Text = P1.ToString();
            label6.Text = P3.ToString();

        }

        private void button3_Click(object sender, EventArgs e)
        {
            
        }
    }
}
