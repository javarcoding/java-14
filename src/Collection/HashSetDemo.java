package Collection;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetDemo {

	public static void main(String[] args) {
		int abc=123456;
		String s="Raj";
		HashSet hs=new HashSet<>();
		
		hs.add(576.677f);
		hs.add(54675467);
		hs.add("Ajay");
		hs.add(null);
		hs.add(abc);
		hs.add(s);
		hs.add("Sandeep");
		
		Iterator itr=hs.iterator();
		while (itr.hasNext()) 
		{
               System.out.println(itr.next());			
		}
	}
}
