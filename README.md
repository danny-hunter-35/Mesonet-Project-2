# Project-2.0

## DateTimeInherit
daysOfAnyMonth(int, int): Constructs a YearMonth object with the given paramters "month" and "year". The aim of this method is to print to the console the first day (of the week, i.e
a Wednesday) and last day of the month to the console. Utilizes the "atDay(1)" and "atEndOfMonth" methods from the YearMonth class.

## MesoInherit
Extends and implements the methods of the MesoAbstract class

Constructor - Initalizes stationID by using the "getStID" method on the mesoStation object

calAverage() - Calculates the ascii average of all 4 characters in a stationID. This is accomplished by converting the String to a character array, iterating through the array to get 
a sum of all of the character's ascii values, and then dividing by 4.0 to get a raw double average. The floor value is calculated by type-casting the rawAverage value to an int
(which will automatically round it down), and then the ceiling value is found by adding 1 to the floor value. The "averageValue" is determined by the decimal value of the rawAverage.
If the decimal value is below .75, the floor value is the average value, and otherwise is the ceiling value. An array containing the ceiling, floor, and average values is returned.

letterAverage() - returns the character that the average ascii value of the station corresponds to

## PosAvg

PosAvg(String stID): (Constructor) Initializes stationID to the passed argument, and also initializes stationList by calling the private helper method "readFile".

PosAvg(char letter): (Constructor) Created to satisfy eclipse when I chose to have LetterAvg inherit PosAvg

readFile(): Reads in the file "Mesonet.txt", storing the station Id's (along the left-hand column of the file) into stationList. Utilizes a scanner object.

indexOfStation() - returns stationID's place in the list (adds 1 to the index for position purposes).

toString() - Since the driver class automatically calls the toString() method due to the object being called inside of a print statement, this method returns a string in the format
required for the project. Finds the two stations on either side of stationID in the ArrayList and puts these stations in the returned and formatted String.

## LetterAvg
I chose to inherit the PosAvg class so that I wouldn't have to re-write the readFile method, but inheritance is not the best option here. Later on, I concluded that I should have 
made the ArrayList of stationIDs a static variable, rather than using inheritance here.

numberOfStationWithLetterAvg() - Iterates through the stationList, counting the number of stations that start with the same letter as the character passed in the constructor. 
The method then returns this count.

toString() - Since the driver class automatically calls the toString() method due to the object being called inside of a print statement, this method returns a string in the format
required for the project. Similar to the numberOfStationWithLetterAvg(), iterates through the array list, and adds the stations that start with the same char as "letter" to the 
String that will be returned.
