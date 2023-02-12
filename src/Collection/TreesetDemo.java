package Collection;

import java.util.Iterator;
import java.util.TreeSet;

public class TreesetDemo {

	public static void main(String[] args) {
		TreeSet lhs=new TreeSet();
		lhs.add(1);
		lhs.add(5);
		lhs.add(4);
		lhs.add(3);
		lhs.add(2);
		
		Iterator itr=lhs.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
			
		}
	}

}
