package notWite;
import java.awt.*;
import java.awt.event.*;

@SuppressWarnings("serial")
class StartFrame extends BaseFrame{
	private Button b1 = new Button("¾­µה"), b2 = new Button("לר");
	StartFrame() {
		setLayout(new GridLayout(2,1));
		ActionListener al = new ActionListener(){
			public void actionPerformed(ActionEvent e) {
				if(e.getSource() == b1){
					setVisible(false);
					@SuppressWarnings("unused")
					ChooseColume c = new ChooseColume(new Classic());
				}
				if(e.getSource() == b2){
					setVisible(false);
					@SuppressWarnings("unused")
					ChooseColume c = new ChooseColume(new LimitTime());
				}
			}	
		};
		b1.setFont(new Font("ËÎÌו",Font.BOLD,80));
		b1.setBackground(Color.white);
		b1.addActionListener(al);
		add(b1);
		
		b2.setFont(new Font("ËÎÌו",Font.BOLD,80));
		b2.setForeground(Color.white);
		b2.setBackground(Color.black);
		b2.addActionListener(al);
		add(b2);
		
		setVisible(true);
	}
}
