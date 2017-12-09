import java.util.Arrays;

/* **********************************************************
 * Programmer:	Alexei Abiiaka
 * Class:	CS30S
 * 
 * Assignment:	Array of Skater objects
 *
 * Description:	skater class has an array of assessment scores and a unique id number
                Behaviours, get id, 
                            get average
                            get assessment score 
 * *************************************************************
 */
 
 // import files here as needed
 
 
public class Skater
{
	private String id;
	private int length = 0;
	private Record[] records = new Record[10];
	
	public Skater(String id, String str) {
		this.id = id;
		String[] recs = str.split(" ");
		for (int i=0; i<recs.length; i++) {
			addRecord( new Record( recs[i] ) );
		}
	}

	public double getAverageSpeed() {
		double avg = 0;
		for (int i = 0; i < length; i++) {                
			avg += records[i].getSpeed();
		}
		if (length>0) {
			avg = avg / length;
		}
		return avg;
	}
	
	public void addRecord(Record record) {
		if (length==10) {
			for (int i = 0; i < records.length - 1; i++) {                
				records[i] = records[i+1];
			}
			records[length-1] = record;
		} else {
			records[length] = record;
			length++;
		}
	}
	
	public String toString() {
		StringBuffer sb = new StringBuffer();
		for (int i=0; i<length; i++) {
			if (i>0)
				sb.append(" ");
			sb.append( records[i].toString() );
		}
		return sb.toString();
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}
}  // end class






