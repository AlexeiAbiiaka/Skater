import java.util.Arrays;

/* **********************************************************
 * Programmer:	Alexei Abiiaka
 * Class:	CS30S
 * 
 * Assignment:	Array of Skater objects
 *
 * Description:	skater class has an array of assessment scores and a unique id number
 *              Behaviors.
 * *************************************************************
 */
 
 // import files here as needed
 
 
public class Skater
{
	private String id;
	private int length = 0;
	private Record[] records = new Record[10];
	
/********************************************************
 * Purpose:        get id for Skater
 *         
 * Interface:
 *     in:        id and str
 *     out:       none
 ********************************************************/	
	public Skater(String id, String str) {
		this.id = id;
		String[] recs = str.split(" ");
		for (int i=0; i<recs.length; i++) {
			addRecord( new Record( recs[i] ) );
		}
		
	}

/********************************************************
 * Purpose:        get average speed for skater
 *         
 * Interface:
 *     in:        none
 *     out:       average
 ********************************************************/	
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
	
/********************************************************
 * Purpose:       shifts numbers if longer than 10
 * 				  numbers
 *         
 * Interface:
 *     in:        record
 *     out:       none
 ********************************************************/	
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
	
/********************************************************
 * Purpose:       get specific time/record
 *         
 * Interface:
 *     in:        none
 *     out:       records
 ********************************************************/	
	public Record getRecord(int ri) {
		return records[ri];
	}
	
/********************************************************
 * Purpose:       print out all data
 *         
 * Interface:
 *     in:        none
 *     out:       sb.toString
 ********************************************************/	
	public String toString() {
		StringBuffer sb = new StringBuffer();
		for (int i=0; i<length; i++) {
			if (i>0)
				sb.append(" ");
			sb.append( records[i].toString() );
		}
		return sb.toString();
	}

/********************************************************
 * Purpose:        get id for Skater
 *         
 * Interface:
 *     in:        none
 *     out:       id
 ********************************************************/	
	public String getId() {
		return id;
	}

/********************************************************
 * Purpose:        set id for Skater
 *         
 * Interface:
 *     in:        string id
 *     out:       none
 ********************************************************/	
	public void setId(String id) {
		this.id = id;
	}
}  // end class






