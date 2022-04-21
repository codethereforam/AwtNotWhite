package notWite;
import java.awt.*;
import java.util.*;
import java.awt.event.*;

abstract class NotWhite {
	protected Panel p1 = new Panel();
	protected Button[][] b; 
	protected int r,c;
	protected BaseFrame f = new BaseFrame();
	protected long t1,t2;
	protected int count;
	protected int tag;
	
	public void click() {
		for(int i=r-2; i>=0; i--)
			for(int j=0;j<c; j++) {
				b[i+1][j].setBackground(b[i][j].getBackground());
			}
		for(int j=0; j<c; j++) {
			if(b[r-1][j].getBackground() == Color.black) {
				b[r-1][j].requestFocus();
			}
		}
		for(int j=0;j<c; j++) {
			b[0][j].setBackground(Color.white);
		}
		Random x = new Random();
		int j = x.nextInt(c);
		b[0][j].setBackground(Color.black );
		count++;
		
		if(count == 1) {
			t1 = new Date().getTime();
		}
	}
	
	public void randomBlack() {
		for(int i=0; i<r; i++){
			Random x = new Random();
			int j = x.nextInt(c);
			b[i][j].setBackground(Color.black);
			if(i == r-1) {
				tag = j;
			}
		}
	}
	
	public abstract void clickBlack();
	
	public abstract void clickWhite();

	public abstract void NewFrame(int r, int c);
	
	public void frame(int r, int c) {	
		this.r = r;
		this.c = c;
		ActionListener al =new ActionListener(){
			public void actionPerformed(ActionEvent e) {
				if(((Button) ( e.getSource())).getBackground() == Color.white) {
					clickWhite();
				}		
			}	
		};
		b = new Button[r][c];
		p1.setLayout(new GridLayout(r, c));
		for(int i=0; i<r; i++)
			for(int j=0; j<c; j++) {
					b[i][j] = new Button();
					b[i][j].setBackground(Color.white);
					p1.add(b[i][j]);
					b[i][j].addActionListener(al);
 		}
		randomBlack();
		f.add(p1);
		
		b[r-1][0].addKeyListener(new KeyAdapter() {
			public void keyPressed(KeyEvent e) {
				if(e.getKeyCode() == KeyEvent.VK_A) {
					clickBlack();
				} else {
					clickWhite();
				}
			}
		});
		
		b[r-1][1].addKeyListener(new KeyAdapter() {
			public void keyPressed(KeyEvent e) {
				if(e.getKeyCode() == KeyEvent.VK_S) {
					clickBlack();
				} else {
					clickWhite();
				}
			}
		});
		
		b[r-1][2].addKeyListener(new KeyAdapter() {
			public void keyPressed(KeyEvent e) {
				if(e.getKeyCode() == KeyEvent.VK_D) {
					clickBlack();
				} else {
					clickWhite();
				}
			}
		});
		
		if(c >= 4) {
			b[r-1][3].addKeyListener(new KeyAdapter() {
				public void keyPressed(KeyEvent e) {
					if(e.getKeyCode() == KeyEvent.VK_F) {
						clickBlack();
					} else {
						clickWhite();
					}
				}
			});
		}
		
		if(c == 5) {
			b[r-1][4].addKeyListener(new KeyAdapter() {
				public void keyPressed(KeyEvent e) {
					if(e.getKeyCode() == KeyEvent.VK_G) {
						clickBlack();
					} else {
						clickWhite();
					}
				}
			});
		}
		
		f.setVisible(true);
		b[r-1][tag].requestFocusInWindow();
	}
}