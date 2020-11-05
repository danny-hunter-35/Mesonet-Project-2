public class MesoInherit extends MesoAbstract
{

	private String stationID;

	public MesoInherit(MesoStation mesoStation) {
		stationID = mesoStation.getStID();
	}

	@Override
	public int[] calAverage() {
		char[] stationLetters = stationID.toCharArray();
		int sum = 0;
		for(int i = 0; i < stationLetters.length; ++i) {
			sum = sum + ((int) stationLetters[i]);
		}
		double rawAverage = sum/4.0;
		int floorValue = (int) rawAverage;
		int ceilingValue = floorValue + 1;
		double rawAverageDecimalValue = rawAverage - floorValue;
		int averageValue;
		if(rawAverageDecimalValue >= .75) {
			averageValue = ceilingValue;
		}
		else {
			averageValue = floorValue;
		}
		int[] values = {ceilingValue, floorValue, averageValue};
		return values;
	}

	@Override
	public char letterAverage() {
		int averageValue = calAverage()[2];
		return (char) averageValue;
	}
   
}