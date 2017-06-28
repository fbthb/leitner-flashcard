import java.awt.*;
import java.awt.event.*;

public class Start extends Frame implements ActionListener {

	private static final long serialVersionUID = 1L;
	Button learn = new Button("lernen");
	Button addWords = new Button("Vokabeln hinzuf\u00fcgen");
	Label l = new Label("Was m\u00f6chtest du tun?");
	
	Start() {
		Main.frame.remove(0);
		Panel all = new Panel();
		all.setLayout(new GridLayout(3,1));
		all.setSize(Main.frame.getSize());
		
		Panel eins = new Panel();
		eins.add(l);
		Panel zwei = new Panel();
		zwei.add(learn);
		Panel drei = new Panel();
		drei.add(addWords);
		
		all.add(eins);
		all.add(zwei);
		all.add(drei);

		Main.frame.add(all);
		learn.addActionListener(this);
		addWords.addActionListener(this);
		Main.frame.validate();
	}

	
	public void actionPerformed(ActionEvent e) {
		if (e.getActionCommand().equals(learn.getLabel())){
			new Menu();
		}
		if (e.getActionCommand().equals(addWords.getLabel())){
			new AddWords();
		}
	}
}
