package week1.day2.assignments;

public class Car {
	
//Creating methods with return statement
	
	public String applyBreak()
	{
		return "break applied";
	}
	public String applyGear()
	{
		return "Gear applied";
	}
	public String switchOnAc()
	{
		return "AC switched has been on";
	}
	public String applyAcclerate()
	{
		return "Applied Acceleration";
	}
	
	public static void main(String[] args) {
		//creation object and execute for same class
		Car obj=new Car();
		System.out.println(obj.applyBreak());
		System.out.println(obj.applyGear());
		System.out.println(obj.switchOnAc());
		System.out.println(obj.applyAcclerate());
	}
}