import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Scanner;

public class PosAvg {
	
	private static final int NUM_HEADER_LINES = 3;
	private String stationID;
	protected ArrayList<String> stationList = new ArrayList<String>();
	
	public PosAvg(String stID) throws FileNotFoundException {
		stationID = stID;
		readFile();
	}
	
	protected PosAvg(char letter) throws FileNotFoundException {
		readFile();
	}
	
	private void readFile() throws FileNotFoundException {
		Scanner reader = new Scanner(new FileReader("Mesonet.txt"));
		while (reader.hasNextLine()) {
			stationList.add(reader.next());
			reader.nextLine();
		}
		reader.close();
		//remove non-station strings from the list
		for (int i = 0; i < NUM_HEADER_LINES; ++i) {
			stationList.remove(0);
		}
	}

	public int indexOfStation() {
		//may need to edit this
		//make sure its the right index
		return stationList.indexOf(stationID) + 1;
	}
	
	@Override
	public String toString() {
		//This index is average of NOWA and OILT, NEWP and OKCE, and so on.
		String lowerStation1 = stationList.get(indexOfStation() - 1);
		String upperStation1 = stationList.get(indexOfStation() + 1);
		String lowerStation2 = stationList.get(indexOfStation() - 2);
		String upperStation2 = stationList.get(indexOfStation() + 2);
		
		return "This index is average of " + lowerStation1 + " and " + upperStation1
				+ ", " + lowerStation2 + " and " + upperStation2 + ", and so on.";
	}
}
