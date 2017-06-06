import java.awt.*;
import java.awt.event.*;

public class Menu extends Frame implements ActionListener {

	private static final long serialVersionUID = -7386866212593898954L;

	Label l1 = new Label();
	Button deen1 = new Button("DE->EN 1 lernen");
	Button ende1 = new Button("EN->DE 1 lernen");
	Button rand1 = new Button("Zufallsprinzip 1");
	
	Label l2 = new Label();
	Button deen2 = new Button("DE->EN 2 lernen");
	Button ende2 = new Button("EN->DE 2 lernen");
	Button rand2 = new Button("Zufallsprinzip 2");
	
	Label l3 = new Label();
	Button deen3 = new Button("DE->EN 3  lernen");
	Button ende3 = new Button("EN->DE 3 lernen");
	Button rand3 = new Button("Zufallsprinzip 3");
	
	Label l4 = new Label();
	Button deen4 = new Button("DE->EN 4 lernen");
	Button ende4 = new Button("EN->DE 4 lernen");
	Button rand4 = new Button("Zufallsprinzip 4");
	
	Label l5 = new Label();
	Button deen5 = new Button("DE->EN 5 lernen");
	Button ende5 = new Button("EN->DE 5 lernen");
	Button rand5 = new Button("Zufallsprinzip 5");
	
	Button exit = new Button("beenden");
	int[] cardnumber = new int[5];
	Menu() {
		//Löschen der vorherigen Seite
		Main.frame.remove(0);
		Panel all = new Panel();
		all.setLayout(new GridLayout(6,1));
		all.setSize(550,750);
	
		//Anzahl der Karten je Fach ermitteln
		
		for (int i = 1; i <6; i++) {
			try{
				Words w = new Words(i);
				w.load();
				cardnumber[i-1] = w.words.size();
			}
			catch(Exception e) {
				cardnumber[i-1] = 0;
			}
		}
		l1.setText("Box 1: Anzahl der Karten: " + cardnumber[0]);
		l2.setText("Box 2: Anzahl der Karten: " + cardnumber[1]);
		l3.setText("Box 3: Anzahl der Karten: " + cardnumber[2]);
		l4.setText("Box 4: Anzahl der Karten: " + cardnumber[3]);
		l5.setText("Box 5: Anzahl der Karten: " + cardnumber[4]);
		
		// Aufbauen der neuen Seite
		Panel box1 = new Panel();
		box1.add(l1);
		box1.add(deen1);
		box1.add(ende1);
		box1.add(rand1);
		all.add(box1);
		
		Panel box2 = new Panel();
		box2.add(l2);
		box2.add(deen2);
		box2.add(ende2);
		box2.add(rand2);
		all.add(box2);
		
		Panel box3 = new Panel();
		box3.add(l3);
		box3.add(deen3);
		box3.add(ende3);
		box3.add(rand3);
		all.add(box3);
		
		Panel box4 = new Panel();
		box4.add(l4);
		box4.add(deen4);
		box4.add(ende4);
		box4.add(rand4);
		all.add(box4);
		
		Panel box5 = new Panel();
		box5.add(l5);
		box5.add(deen5);
		box5.add(ende5);
		box5.add(rand5);
		all.add(box5);
		
		Panel buttonbox = new Panel();
		buttonbox.add(exit);
		all.add(buttonbox);
		
		Main.frame.add(all);
		//Action-Listener aktivieren
		deen1.addActionListener(this);
		ende1.addActionListener(this);
		rand1.addActionListener(this);
		deen2.addActionListener(this);
		ende2.addActionListener(this);
		rand2.addActionListener(this);
		deen3.addActionListener(this);
		ende3.addActionListener(this);
		rand3.addActionListener(this);
		deen4.addActionListener(this);
		ende4.addActionListener(this);
		rand4.addActionListener(this);
		deen5.addActionListener(this);
		ende5.addActionListener(this);
		rand5.addActionListener(this);
		exit.addActionListener(this);
		Main.frame.validate();
	}
	
	public void actionPerformed(ActionEvent e) {
		//Aktion ActionListener (erste Zahl Fachnummer, zweite Zahl Modus)
		if (e.getActionCommand().equals(deen1.getLabel())&&cardnumber[0]>=1){
			new WordFrame(1, 1);
		}
		if (e.getActionCommand().equals(ende1.getLabel())&&cardnumber[0]>=1){
			new WordFrame(1, 2);
		}
		if (e.getActionCommand().equals(rand1.getLabel())&&cardnumber[0]>=1){
			new WordFrame(1, 3);
		}
		
		if (e.getActionCommand().equals(deen2.getLabel())&&cardnumber[1]>=1){
			new WordFrame(2, 1);
		}
		if (e.getActionCommand().equals(ende2.getLabel())&&cardnumber[1]>=1){
			new WordFrame(2, 2);
		}
		if (e.getActionCommand().equals(rand2.getLabel())&&cardnumber[1]>=1){
			new WordFrame(2, 3);
		}
		
		if (e.getActionCommand().equals(deen3.getLabel())&&cardnumber[2]>=1){
			new WordFrame(3, 1);
		}
		if (e.getActionCommand().equals(ende3.getLabel())&&cardnumber[2]>=1){
			new WordFrame(3, 2);
		}
		if (e.getActionCommand().equals(rand3.getLabel())&&cardnumber[2]>=1){
			new WordFrame(3, 3);
		}
		
		if (e.getActionCommand().equals(deen4.getLabel())&&cardnumber[3]>=1){
			new WordFrame(4, 1);
		}
		if (e.getActionCommand().equals(ende4.getLabel())&&cardnumber[3]>=1){
			new WordFrame(4, 2);
		}
		if (e.getActionCommand().equals(rand4.getLabel())&&cardnumber[3]>=1){
			new WordFrame(4, 3);
		}
		
		if (e.getActionCommand().equals(deen5.getLabel())&&cardnumber[4]>=1){
			new WordFrame(5, 1);
		}
		if (e.getActionCommand().equals(ende5.getLabel())&&cardnumber[4]>=1){
			new WordFrame(5, 2);
		}
		if (e.getActionCommand().equals(rand5.getLabel())&&cardnumber[4]>=1){
			new WordFrame(5, 3);
		}
		
		if (e.getActionCommand().equals(exit.getLabel())){
			new Start();
		}
	}

}
