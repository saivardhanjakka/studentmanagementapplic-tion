package studentManagementApp;
/*Student class:

This class represents a student object with attributes such as roll number, name, branch, and address.
It contains the getters and setters for accessing and modifying that attributes.
This class also contains the constructors for initializing the object with or without a roll number.*/
public class Student
{
	private int rollNo;
	private String name;
	private String branch;
	private String address;
	public int getRollNo() {
		return rollNo;
	}
	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getBranch() {
		return branch;
	}
	public void setBranch(String branch) {
		this.branch = branch;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public Student(int rollNo, String name, String branch, String address) {
		super();
		this.rollNo = rollNo;
		this.name = name;
		this.branch = branch;
		this.address = address;
	}
	public Student(String name, String branch, String address) {
		super();
		this.name = name;
		this.branch = branch;
		this.address = address;
	}
	public Student() {
		super();
	}
	@Override
	public String toString() {
		return "Student [rollNo=" + rollNo + ", name=" + name + ", branch=" + branch + ", address=" + address + "]";
	}
	
	
}
	