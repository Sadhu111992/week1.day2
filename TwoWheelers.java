package week1.day2.assignments;
public class TwoWheelers {
	int noOfWheels = 2;
	short noOfMirrors = 2;
	long chassisNumber = 82734872372L;
	boolean isPunctured = false;
	String bikeName = "Avenis";
	double runningKM = 56.7;
	
public static void main(String[] args) {
	TwoWheelers obj=new TwoWheelers();
	//calling Global variables of a class from Main Method
	System.out.println(obj.noOfWheels);
	System.out.println(obj.noOfMirrors);
	System.out.println(obj.chassisNumber);
	System.out.println(obj.isPunctured);
	System.out.println(obj.bikeName);
	System.out.println(obj.runningKM);
}
}
