package week1.day2.assignments;

public class EmployeeDetail {
	public static void main(String[] args) {
		EmployeeDetail emp=new EmployeeDetail();
		emp.printEmployeeName("Sadhana", 10400526);
		emp.getEmployeeAddress("Chennai");
		double empSalary=50000;
		System.out.println(emp.printEmployeeSalary(empSalary));
		long mobNum=123456789L;
		System.out.println(emp.printEmployeeMobileNumber(mobNum));
	}
	public void printEmployeeName(String empName, int empId)
	{
		System.out.println(empName+ empId);
	}
	public void getEmployeeAddress(String empAddress)
	{
		System.out.println(empAddress);
	}
	public double printEmployeeSalary(double empSalary)
	{
		return empSalary;
	}
	public long printEmployeeMobileNumber(long mobNum)
	{
		return mobNum;
		
	}

}
