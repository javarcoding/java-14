package Collection;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class HashSet {

	public static void main(String[] args) {
		
		LinkedHashSet lhs=new LinkedHashSet();
		lhs.add("f");
		lhs.add("D");
		lhs.add(1);
		lhs.add(null);
		lhs.add("D");
		lhs.add(null);
		
		Iterator itr=lhs.iterator();
		while (itr.hasNext()) {
		    System.out.println(itr.next());
			
		}

	}

}
