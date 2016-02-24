/**
 * 
 */
package manish.criti.practice;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/**
 * @author manish.tiwari
 *
 */
public class HashMapDemo {
	public static void main(String args[]) {
		// create hash map
		HashMap<Integer, String> newmap = new HashMap();

		// populate hash map
		newmap.put(1, "tutorials");
		newmap.put(2, "point");
		newmap.put(3, "4");

		for (Map.Entry<Integer, String> entry : newmap.entrySet()) {
			System.out.println(entry.getKey()+":"+entry.getValue());
			
		}
		// create set view for the map
		/*
		 * Set set=newmap.entrySet();
		 * 
		 * // check set values System.out.println("Set values: " + set);
		 * Iterator it=set.iterator(); int i=0; while (it.hasNext()) {
		 * System.out.print( ++i+"<------counter----->");
		 * System.out.println(it.next()); }
		 */
	}
}
