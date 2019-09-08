本产品为李昊原创计算器，非李昊授权不可转发分享
开发工具：visual studio 2017  现学的c#
运行环境：windows
功能描述：可用于软件工程学概述中第一章32页第五题的解题计算
文件说明：scr文件夹中为程序的源码，点开exe文件即可使用
16位button的代码
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
32位button的代码
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
大致就是这样的，具体以使用为主
有任何问题请联系李昊