package Encapsulation;

public class Student {
	
	private String Name;
	private int rollNo;
	private String address;
	
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public int getRollNo() {
		return rollNo;
	}
	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	

	public String toString() {
		
		return Name+""+rollNo+""+address;
	}
	

}
