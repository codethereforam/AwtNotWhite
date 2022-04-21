package notWite;
import java.awt.Frame;
import java.awt.event.*;

@SuppressWarnings("serial")
class BaseFrame extends Frame {
	BaseFrame() {
		super("NW 1.0");
		setBounds(500,0,300,600);
		setResizable(false);
		addWindowListener(new WindowAdapter(){
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});
	}
}
