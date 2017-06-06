import java.awt.Frame;
import java.awt.Panel;
import java.awt.event.*;

public class Main {

	public static Frame frame;

	public static void main(String[] args) {
		
		frame = new Frame();
		frame.setLocation(0,0);
		frame.setSize(600,300);
		frame.setVisible(true);
		Panel all = new Panel();
		all.setSize(frame.getSize());
		frame.add(all);
		
		frame.addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent we) {
				dispose();
			}

			private void dispose() {
				System.exit(0);
			}
		});
		new Start();
	}

}
