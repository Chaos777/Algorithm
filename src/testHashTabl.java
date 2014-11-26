import java.util.Hashtable;


public class testHashTabl {

	/**Hashtable≤‚ ‘
	 * @author LCZ
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Hashtable<String, Integer> aHashtable = new Hashtable<String, Integer>();
		Hashtable<String, Integer> bHashtable = new Hashtable<String, Integer>();
		Hashtable<String, Integer> cHashtable = new Hashtable<String, Integer>();
		aHashtable.put("String1", 1);
		aHashtable.put("String2", 2);
		aHashtable.put("String3", 3);
		bHashtable.put("String4", 4);
		bHashtable.put("String5", 5);
		bHashtable.put("String6", 6);
		
		cHashtable.putAll(aHashtable);
		cHashtable.putAll(bHashtable);
		for(Object k:cHashtable.keySet()){
			System.out.println(k+"--"+cHashtable.get(k));
		}
	}

}
