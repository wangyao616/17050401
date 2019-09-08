package hello;

import javax.swing.JFrame;

class hello extends JFrame{
	public double capacity;
	public double price;
	public double cost;

	public void Operation(int year,int Word_length,int code_article,int dollor) {
		capacity = 4080*(Math.pow(Math.E,0.28*(year-1960)));//容量需求
	    price = (0.003*Word_length*Math.pow(0.72,(year-1974)))*capacity;//价格
		cost = (capacity/(30*code_article))*dollor;//装满成本
	}
}
