package notWite;
import java.awt.*;
import java.awt.event.*;

import javax.swing.*;

@SuppressWarnings("serial")
public class WinOrFailFrame extends BaseFrame {
	private Button b1 = new Button("返回"), b2 = new Button("重来");
	private JTextArea l = new JTextArea();
	private Panel p = new Panel();
	
	WinOrFailFrame(String s, int r, int c, Color i,boolean b) {
		p.setLayout(new GridLayout(1,2));
		b1.setBackground(i);
		b2.setBackground(i);
		b1.setFocusable(false);
		
		b1.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
				@SuppressWarnings("unused")
				StartFrame s = new StartFrame();
			}		
		});
		
		b2.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e) {
				if(b == true) {
					setVisible(false);
					Classic cla = new Classic();
					cla.NewFrame(r, c);
				} else {
					setVisible(false);
					LimitTime lim = new LimitTime();
					lim.NewFrame(r, c);
				}	
			}	
		});
		
		b1.setForeground(Color.white);
		b2.setForeground(Color.white);
		b1.setFont(new Font("黑体",Font.BOLD,60));
		b2.setFont(new Font("黑体",Font.BOLD,60));
		
		p.add(b1);
		p.add(b2);
		add(p,BorderLayout.SOUTH);
		
		l.setText(s);
		l.setFont(new Font("宋体",Font.BOLD,80));
		l.setEditable(false);
		l.setLineWrap(false);
		l.setBackground(i);
		add(l);
		
		setVisible(true);
	}
}
