import java.awt.*;
import java.awt.event.*;

public class AddWords extends Frame implements ActionListener {

	private static final long serialVersionUID = -7386866212593898954L;

	Label explain = new Label("Bitte Wort hinzuf\u00fcgen");
	Label german = new Label("deutsch");
	Label english = new Label("englisch");
	TextField inputgerman = new TextField(50);
	TextField inputenglish = new TextField(50);
	Button nextWord = new Button("weiteres Vokabel-Paar");
	Button exit = new Button("zur\u00fcck ins Hauptmen\u00fc");
	Button importlist = new Button("Standard-Liste einf\u00fcgen");
	boolean inputlist = false;
	
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
		buttonbox.add(importlist);
		buttonbox.add(exit);
		all.add(buttonbox);

		Main.frame.add(all);
		nextWord.addActionListener(this);
		exit.addActionListener(this);
		importlist.addActionListener(this);
		Main.frame.validate();
	}
	
	public void actionPerformed(ActionEvent e) {
		if (e.getActionCommand().equals(nextWord.getLabel())){
			if (inputgerman.getText().isEmpty()||inputenglish.getText().isEmpty()) {
				explain.setText("Fehler. Bitte beide Felder ausf\u00fcllen");
			}
			else {
				Words w = new Words(1);
				w.load();
				w.addWord(new Word(inputgerman.getText(), inputenglish.getText()));
				w.save(w.words);
				new AddWords();
			}
		}
		if (e.getActionCommand().equals(importlist.getLabel())&&(!inputlist)){
			inputlist = true;
			explain.setText("Vokabel-Liste wurde hinzugef\u00fcgt.");
			Words w = new Words(1);
			w.load();
			w.addWord(new Word("haben", "to have"));
			w.addWord(new Word("kaufen", "to buy"));
			w.addWord(new Word("vergessen", "to forget"));
			w.addWord(new Word("geben", "to give"));
			w.addWord(new Word("behalten", "to keep"));
			w.addWord(new Word("verlassen", "to leave"));
			w.addWord(new Word("sagen", "to say"));
			w.addWord(new Word("sehen", "to see"));
			w.addWord(new Word("sitzen", "to sit"));
			w.addWord(new Word("denken", "to think"));
			w.addWord(new Word("schreiben", "to write"));
			w.addWord(new Word("Jahr", "year"));
			w.addWord(new Word("erinnern", "to remember"));
			w.addWord(new Word("tragen", "to wear"));
			w.addWord(new Word("lernen", "to learn"));
			w.addWord(new Word("Brief", "letter"));
			w.addWord(new Word("Musik", "music"));
			w.addWord(new Word("Kunst", "art"));
			w.addWord(new Word("Hoffnung", "hope"));
			w.addWord(new Word("Hauptstadt", "capital"));
			w.addWord(new Word("Maus", "mouse"));
			w.addWord(new Word("Beispiel", "example"));
			w.addWord(new Word("gestern", "yesterday"));
			w.addWord(new Word("Wasser", "water"));
			w.addWord(new Word("Eis", "ice"));
			w.addWord(new Word("arbeiten", "to work"));
			w.addWord(new Word("Essen", "food"));
			w.addWord(new Word("Flugzeug", "plane"));
			w.addWord(new Word("Flughafen", "airport"));
			w.addWord(new Word("schreiben", "to write"));
			w.addWord(new Word("Spiel", "game"));
			w.addWord(new Word("Kopf", "head"));
			w.addWord(new Word("Liste", "list"));
			w.addWord(new Word("links", "left"));
			w.addWord(new Word("rechts", "right"));
			w.addWord(new Word("Herbst", "autumn"));
			w.addWord(new Word("Feuer", "fire"));
			w.addWord(new Word("Holz", "wood"));
			w.addWord(new Word("Flasche", "bottle"));
			w.addWord(new Word("Katze", "cat"));
			w.save(w.words);
		}
		if (e.getActionCommand().equals(exit.getLabel())){
			new Start();
		}
	}
}
