package com.day12.swing;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;


public class PannelTest02 extends JFrame{
	private JTextField tf;
 public PannelTest02() {
	setTitle("inner class test");
	setLayout(new FlowLayout());
	JButton b1 = new JButton("버튼1");
	JButton b2 = new JButton("버튼2");
	JButton b3 = new JButton("버튼3");
	tf = new JTextField(20);
	add(b1); add(b2); add(b3);
	add(tf);
	ActionH ah = new ActionH();
	b1.addActionListener(ah);
	b2.addActionListener(ah);
	b3.addActionListener(ah);
	setSize(300, 300);
	setVisible(true);
 }
 
	public static void main(String[] args) {
		new PannelTest02();

	}

	class ActionH implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
				String str = e.getActionCommand();
				tf.setText(str);
//				System.out.println(str+" 이벤트 발생");
				if(str.equals("버튼1")) {
					getContentPane().setBackground(Color.red);
//					System.out.println("이벤트1 발생");
				}

				 else if (str.equals("버튼2")) {
					 getContentPane().setBackground(Color.pink);
//					 System.out.println("이벤트2 발생");
				 }


				 else if (str.equals("버튼3")) {
					 getContentPane().setBackground(Color.yellow);
//					 System.out.println("이벤트3 발생");
				 }
				
			}
			

	
	}
}


