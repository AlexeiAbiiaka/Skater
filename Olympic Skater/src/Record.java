import java.text.DecimalFormat;
import java.text.NumberFormat;

public class Record {
	private static NumberFormat format = new DecimalFormat("00");
	
	private int min = 0;
	private int sec = 0;
	
	public Record(String str) {
		String[] rec =  str.split(":");
		if(rec.length==2) {
			min = Integer.parseInt(rec[0]);
			sec = Integer.parseInt(rec[1]);
			
		}
	}
	
/********************************************************
 * Purpose:        get speed for skater
 *         
 * Interface:
 *     in:        none
 *     out:       speed in km/h 
 ********************************************************/
	public double getSpeed() {
		return 5d / (min * 60 + sec) / 3600;
	}
	
/********************************************************
 * Purpose:       prints record in min and sec
 *         
 * Interface:
 *     in:        none
 *     out:       min, sec
 ********************************************************/	
	public String toString() {
		return format.format(min)+":"+format.format(sec);
	}
	


}


