package Collection;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeMap;

public class TreeMapDemo {

	public static void main(String[] args) {
		
		TreeMap tm=new TreeMap();
		
		tm.put("B", "A");
		tm.put("D", "B");
		tm.put("A", "C");
		tm.put("C", "D");
		
		Set s=tm.entrySet();
		
		Iterator itr=s.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
			
		}

	}

}
