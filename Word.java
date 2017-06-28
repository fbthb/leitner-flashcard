import java.io.*;

public class Word implements Serializable {

	private static final long serialVersionUID = 1L;
	String ger;
	String eng;
	
	Word() {
		ger="TestD";
		eng="TestE";
	}
	
	Word(String ger, String eng) {
		this.ger = ger;
		this.eng = eng;		
	}
	
	String getGer() {
		return ger;
	}
	String getEng() {
		return eng;
	}
	
	
	
	

}
