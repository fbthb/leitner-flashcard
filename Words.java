import java.util.*;
import java.io.*;

public class Words implements Serializable {
	
	private static final long serialVersionUID = 1L;
	ArrayList<Word> words;
	int boxnr;
	String dateiname;
	
	Words(int boxnr) {
		this.boxnr = boxnr;
		dateiname = ".box" + boxnr + ".txt";
		words = new ArrayList<Word>();
	}
	Words(ArrayList<Word> words, int boxnr, String dateiname) {
		this.words = words;
		this.boxnr = boxnr;
		this.dateiname = dateiname;
	}
	void addWord(Word w) {
		words.add(w);
	}
	void deleteFirst() {
		words.remove(0);
	}
	
	String getWordGer() {
		return words.get(0).ger;
	}
	String getWordEng() {
		return words.get(0).eng;	
	}

	void save(ArrayList<Word> words) {
		try {
			ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(dateiname));
			oos.writeObject(words);		
			oos.close();
		}
		catch(IOException e) {
			System.err.println("Fehler beim Speichern");
		}
	}

	@SuppressWarnings("unchecked")
	void load() {
		try {
			words = new ArrayList<Word>();
			ObjectInputStream ois = new ObjectInputStream(new FileInputStream(dateiname));
			words = ((ArrayList<Word>) ois.readObject());
			ois.close();
		}
		catch(Exception e) {
			words = new ArrayList<Word>();
		}
	}
}
