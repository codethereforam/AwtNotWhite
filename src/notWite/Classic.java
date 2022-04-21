package notWite;
import java.util.*;
import java.awt.Button;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Classic extends NotWhite{
	private static final int STEEP = 50;
	
	public void clickBlack() {
		click();
		
		if(count == STEEP-3) {
			for(int j1=0;j1<c; j1++) {
				b[0][j1].setBackground(Color.green);
			}
		}
		
		if(count == STEEP-2) {
			for(int i=0; i<2; i++)
				for(int j1=0;j1<c; j1++) {
					b[i][j1].setBackground(Color.green);
				}
		}
		
		if(count == STEEP-1) {
			for(int i=0; i<3; i++)
				for(int j1=0;j1<c; j1++) {
					b[i][j1].setBackground(Color.green);
				}
		}				
		
		if(count == STEEP) {
			t2 = new Date().getTime();
			f.setVisible(false);
			@SuppressWarnings("unused")
			WinOrFailFrame ff = new WinOrFailFrame(" 经典\n\n " + c + "列\n\n" +(t2 - t1)/1000.0 + "\"", r, c,Color.green,true);
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
		WinOrFailFrame ff = new WinOrFailFrame(" 经典\n\n " + c + "列\n\n 败了！", r, c,Color.red,true);
	}
	
	public void NewFrame(int r, int c) {
		frame(r,c);
		for(int j=0; j<c; j++) {
			b[r-1][j].addActionListener(new Monitor());
		}
	}
}
