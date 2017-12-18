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
		double s1=(min * 60 + sec);		
		double s2=s1/3600;
		double s3=5000/s2;
		double s4=s3/1000;
		return s4;
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


