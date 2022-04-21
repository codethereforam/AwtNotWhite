package notWite;
import java.awt.*;
import java.awt.event.*;

@SuppressWarnings("serial")
class ChooseColume extends BaseFrame {
	private Button b[] = new Button[3];
	
	ChooseColume(NotWhite n) {
		setLayout(new GridLayout(3,1));
		for(int i=0; i<b.length; i++) {
			b[i] = new Button((i+3) + "列");
			b[i].setBackground(Color.white);
			add(b[i]);
		}
		b[1].setForeground(Color.white);
		b[1].setBackground(Color.black);
		
		b[0].addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent arg0) {
				setVisible(false);
				n.NewFrame(4,3);
			}		
		});
		
		b[1].addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent arg0) {
				setVisible(false);
				n.NewFrame(4,4);
			}		
		});
		
		b[2].addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent arg0) {
				setVisible(false);
				n.NewFrame(4,5);
			}		
		});
		
		b[0].setFont(new Font("黑体",Font.BOLD,70));
		b[1].setFont(new Font("黑体",Font.BOLD,70));
		b[2].setFont(new Font("黑体",Font.BOLD,70));
		
		setVisible(true);
	}
}
