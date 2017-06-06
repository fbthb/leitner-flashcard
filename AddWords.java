import java.awt.*;
import java.awt.event.*;

public class AddWords extends Frame implements ActionListener {

	private static final long serialVersionUID = -7386866212593898954L;

	Label explain = new Label("Bitte Wort hinzufügen");
	Label german = new Label("deutsch");
	Label english = new Label("englisch");
	TextField inputgerman = new TextField(50);
	TextField inputenglish = new TextField(50);
	Button nextWord = new Button("weiter");
	Button exit = new Button("beenden");
	
	AddWords() {
	
		Main.frame.remove(0);
		Panel all = new Panel();
		all.setLayout(new GridLayout(4,1));
		all.setSize(550,750);
		
		Panel boxn = new Panel();
		boxn.add(explain);
		all.add(boxn);
		
		Panel boxger = new Panel();
		boxger.add(german);
		boxger.add(inputgerman);
		all.add(boxger);
		
		Panel boxeng = new Panel();
		boxeng.add(english);
		boxeng.add(inputenglish);
		all.add(boxeng);
		
		Panel buttonbox = new Panel();
		buttonbox.add(nextWord);
		buttonbox.add(exit);
		all.add(buttonbox);

		Main.frame.add(all);
		nextWord.addActionListener(this);
		exit.addActionListener(this);
		Main.frame.validate();
	}
	
	public void actionPerformed(ActionEvent e) {
		if (e.getActionCommand().equals(nextWord.getLabel())){
			Words w = new Words(1);
			w.load();
			w.addWord(new Word(inputgerman.getText(), inputenglish.getText()));
			w.save(w.words);
			new AddWords();
		}
		if (e.getActionCommand().equals(exit.getLabel())){
			new Start();
		}
	}
}
