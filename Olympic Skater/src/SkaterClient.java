/********************************************************************
 * Programmer:	Alexei Abiiaka
 * Class:  CS30S
 *
 * Assignment: Olympic Skater
 * Program Name:  name of public class
 *
 * Description: brief description of program
 *
 * Input: data to be input
 *
 * Output: results to be output
 ***********************************************************************/

 import java.io.*;
import java.text.DecimalFormat;
import java.text.NumberFormat; 

 public class SkaterClient{  // begin class
		private static NumberFormat format = new DecimalFormat("00.00");

	 
     public static void main(String[] args) throws IOException{ 
    	 String strin;
    	 Skater[] sList = new Skater[5];
    	 
	 BufferedReader records = new BufferedReader(new FileReader("/Users/abiiaka/git/Skater/Olympic Skater/src/times.txt"));
	
		for (int i=0; i<sList.length; i++) {
			strin = records.readLine();
			sList[i] = new Skater(Integer.toString(i),strin);
			System.out.println("Skater "+Integer.toString(i+1)+" All Records:\r\n"+sList[i].toString());
		}
		records.close();
		
		for (int i=0; i<sList.length; i++) {
			System.out.println("Skater "+Integer.toString(i+1)+" Average Speed:\r\n"+format.format(sList[i].getAverageSpeed())+"km/h");
		}
		
		//= Example of speed for specific Race. Skater 3 Race 6
		double rSpeed=sList[2].getRecord(6).getSpeed();
		System.out.println("Skater 3 Speed for Race 7:\r\n"+format.format(rSpeed)+"km/h");
	 
		//= Example of time for specific Race. Skater 3 Race 6
		String rTime=sList[2].getRecord(6).toString();
		System.out.println("Skater 3 time for Race 7:\r\n"+rTime);
		
     }

}  // end class
 
 
 
 
 
