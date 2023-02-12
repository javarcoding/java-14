package Collection;

public class Employee 
{
    private int empNo;
    private String empName;
    private String empAddress;
    
	public int getEmpNo() {
		return empNo;
	}
	public void setEmpNo(int empNo) {
		this.empNo = empNo;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public String getEmpAddress() {
		return empAddress;
	}
	public void setEmpAddress(String empAddress) {
		this.empAddress = empAddress;
	}
    
	@Override
	public String toString() {
		
		return empNo+" "+empName+" "+empAddress;
	}
    
}
