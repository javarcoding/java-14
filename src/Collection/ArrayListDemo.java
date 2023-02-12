package Collection;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListDemo {

	public static void main(String[] args) {


		ArrayList al=new ArrayList();
		
		al.add("c");
		al.add("B");
		al.add("A");
		al.add("D");
		
       ArrayList al1=new ArrayList();
		
		al1.add("c");
		al1.add("B");
		al1.addAll(al);
		
		
		
		Iterator itr=al1.iterator();
		
		while (itr.hasNext()) {
		     System.out.println(itr.next());
			
		}

	}

}
