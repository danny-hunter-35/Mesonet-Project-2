import java.io.FileNotFoundException;

public class LetterAvg extends PosAvg{
	
	private char letter;
	

	public LetterAvg(char letter) throws FileNotFoundException {
		super(letter);
		this.letter = letter;
	}
	
	
	@Override
	public String toString() {
		String output = "These stations are:";
		for(int i = 0; i < stationList.size(); ++i) {
			if(letter == stationList.get(i).charAt(0)) {
				output = output + (" " + stationList.get(i));
			}
			
		}
		return output;
	}

	public int numberOfStationWithLetterAvg() {
		// TODO Auto-generated method stub
		int counter = 0;
		for(int i = 0; i < stationList.size(); ++i) {
			if(letter == stationList.get(i).charAt(0)) {
				++counter;
			}
		}
		return counter;
	}
}
