package notWite;

import java.awt.Button;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.*;

public class LimitTime extends NotWhite {
	private static final int LIMIT =30;
	
	public void clickBlack() {
		click();
		if(count > 1) {
			t2 = new Date().getTime();
			if((t2 - t1)/1000.0 > LIMIT) {
				f.setVisible(false);
				@SuppressWarnings("unused")
				WinOrFailFrame ff = new WinOrFailFrame("  ��\n\n  " + c + "��\n\n  " + (count - 1) + "��", r, c,Color.green, false);
			}
		}	
	}
	
	private class Monitor implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			if(((Button) ( e.getSource())).getBackground() == Color.black) {
				clickBlack();
			}
		}
	}
	public void clickWhite() {
		f.setVisible(false);
		@SuppressWarnings("unused")
		WinOrFailFrame ff = new WinOrFailFrame("  ��\n\n  " + c + "��\n\n  ���ˣ�", r, c,Color.red,false);
	}

	public void NewFrame(int r, int c) {
		frame(r,c);
		for(int j=0; j<c; j++) {
			b[r-1][j].addActionListener(new Monitor());
		}
	}	
		
}
