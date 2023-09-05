package com.day12.swing;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class JGugudan extends JFrame implements ActionListener {
	private JTextField tf;
	private JTextArea ta;

	public JGugudan() {
		super("구구단");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setLayout(new FlowLayout());
		tf = new JTextField(10);

		JButton btn = new JButton("실행");
		ta = new JTextArea(10, 15);
		add(tf);
		add(btn);
		add(ta);
		btn.addActionListener(this);
		tf.addActionListener(this);

		setSize(300, 300);
		setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		ta.setText(" ");
		// System.out.println(tf.getText());
		// ta.setText(tf.getText());
		try {
			int d = Integer.parseInt(tf.getText());
			for (int i = 1; i < 10; i++) {
				ta.append(d + "*" + i + "=" + d * i + "\n");
			}
		} catch (NumberFormatException n) {
			ta.setText("숫자를 입력하세요");
			// tf.setText(" ");
		}
	}

	public static void main(String[] args) {
		new JGugudan();
	}

}
