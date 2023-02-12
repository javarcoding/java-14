 package Collection;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Set;

public class HashMapDemo {

	public static void main(String[] args) 
	{
		LinkedHashMap lhm=new LinkedHashMap();
		
		lhm.put(4, "A");
		lhm.put(2, "B");
		lhm.put(3, "C");
		lhm.put(1, "D");
		
	  Set s=lhm.entrySet();
		
		Iterator itr=s.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
			
		}
	}
}
