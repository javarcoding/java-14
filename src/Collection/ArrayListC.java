package Collection;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListC {

	public static void main(String[] args)
	{
		Employee e=new Employee();
		e.setEmpNo(120);
		e.setEmpName("Raj");
		e.setEmpAddress("Satara");
		
		Employee e1=new Employee();
		e1.setEmpNo(121);
		e1.setEmpName("Ajay");
		e1.setEmpAddress("Pune");

		ArrayList al=new ArrayList();
		al.add(e);
		al.add(e1);
		
		Iterator itr=al.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
			
		}
	}

}
