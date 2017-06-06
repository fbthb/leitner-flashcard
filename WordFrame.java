import java.awt.*;
import java.awt.event.*;

public class WordFrame extends Frame implements ActionListener {

	private static final long serialVersionUID = -7386866212593898954L;

	int boxnr;
	int nextmethod;
	int thismethod;
	boolean hasnext = false;
	boolean solved = false;
	String solution;
	Label language = new Label();
	Label wordtotranslate = new Label();
	Label infolabel = new Label();
	TextField inputbox = new TextField(50);
	Button check = new Button("prüfen");
	Button nextWord = new Button("weiter");
	Button exit = new Button("beenden");
	Words w; //Words aktuell
	Words w1; //Words Fach 1
	Words wn; //Words next
	
	WordFrame(int boxnr, int method) {
		
		this.boxnr=boxnr;
		this.nextmethod=method;
		w = new Words(boxnr);
		w.load();

		if (w.words.size() >= 2) hasnext = true;
		
		if (nextmethod == 3) thismethod = (int) (Math.random()*2+1);
		else thismethod = nextmethod;
	
		if (thismethod == 1) {
			language.setText("Übersetze von deutsch auf englisch:");
			wordtotranslate.setText(w.getWordGer());
			solution = w.getWordEng();
		}
		else {
			language.setText("Übersetze von englisch auf deutsch");
			wordtotranslate.setText(w.getWordEng());
			solution = w.getWordGer();
		}

		Main.frame.remove(0);
		Panel all = new Panel();
		all.setLayout(new BorderLayout());
		all.setSize(550,750);
		
		Panel boxn = new Panel();
		boxn.add(language);
		all.add(BorderLayout.NORTH, boxn);
		
		Panel box1 = new Panel();
		box1.add(wordtotranslate);
		box1.add(inputbox);
		all.add(BorderLayout.CENTER, box1);
		
		Panel buttonbox = new Panel();
		buttonbox.add(infolabel);
		buttonbox.add(check);
		buttonbox.add(nextWord);
		buttonbox.add(exit);
		
		Panel boxs = new Panel();
		boxs.setLayout(new GridLayout(2,1));
		boxs.add(infolabel);
		boxs.add(buttonbox);
		all.add(BorderLayout.SOUTH, boxs);

		Main.frame.add(all);
		check.addActionListener(this);
		nextWord.addActionListener(this);
		exit.addActionListener(this);
		Main.frame.validate();
	}
	
	public void actionPerformed(ActionEvent e) {
		if (e.getActionCommand().equals(check.getLabel())){
			if (inputbox.getText().equals(solution)) {
				solved = true;
				infolabel.setBackground(Color.GREEN);
				infolabel.setText("Die Lösung war richtig");
						
				wn = new Words(boxnr+1);
				wn.load();
				wn.addWord(new Word(w.getWordGer(), w.getWordEng()));
				wn.save(wn.words);
				w.deleteFirst();
				w.save(w.words);
			}
			else { 
				infolabel.setBackground(Color.RED);
				infolabel.setText("Die richtige Lösung wäre " + solution);
				
				w1 = new Words(1);
				w1.load();
				w1.addWord(new Word(w.getWordGer(), w.getWordEng()));
				w1.save(w1.words);
				w.deleteFirst();
				w.save(w.words);
			}
		}
		if (e.getActionCommand().equals(nextWord.getLabel())){
			if (solved) {
				if (hasnext) {
					new WordFrame(boxnr, nextmethod);
				}
				else {
					infolabel.setBackground(Color.ORANGE);
					infolabel.setText("Keine weiteren Wörter in dieser Box");
				}
			}
			else {
				infolabel.setBackground(Color.ORANGE);
				infolabel.setText("Erst lösen!\n");
			}
		}
		if (e.getActionCommand().equals(exit.getLabel())){
			if (solved) new Menu();
			else {
				infolabel.setBackground(Color.ORANGE);
				infolabel.setText("Erst lösen!\n");
			}
		}
		

	}

}
