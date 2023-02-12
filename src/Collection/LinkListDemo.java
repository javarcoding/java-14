package Collection;


import java.util.LinkedList;

public class LinkListDemo {

	public static void main(String[] args) {
		
		LinkedList ll=new LinkedList();
		ll.add("A");
		ll.add("B");
		ll.add("S");
		ll.add("C");
		ll.set(2, "R");
		
		System.out.println(ll.contains("R"));
		
		System.out.println(ll.isEmpty());
		
		System.out.println(ll.size());
		
		System.out.println(ll);
	}
}
