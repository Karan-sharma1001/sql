package day4;
import java.util.*;
public class Employee {
	
	String name;
	String address;
	int empid;
	Scanner m=new Scanner(System.in);
	
	public boolean equals(Employee a, Employee b) {
			
		boolean x1;
		boolean x2;
		boolean x3;
		x1=a.name.equals(b.name);
		System.out.println("Name of two objects are equals: "+x1);
		x2=a.address.equals(b.address);
		System.out.println("Name of two objects are equals: "+x2);
		if (a.empid==b.empid){
		System.out.println("Name of two objects are equals: True");
		}
		else{
			System.out.println("Name of two objects are equals: False");
			
		}
		return true;
	}
	
	public void getDet() {
		System.out.println("Enter name,address,empid");
	this.name=m.next();
	this.address=m.next();
	this.empid=m.nextInt();
		
	}
	public void chk() {
            System.out.println("Hello New employee : "+empid);
	   }
	public static void main(String[] args) {
		Employee e1=new Employee();
		e1.getDet();
		Employee e2=new Employee();
		e2.getDet();
		boolean x;
		x= e1.equals(e2);
		System.out.println("Two Objects are Equals = " + x);
		x=e1.equals(e1,e2);
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((address == null) ? 0 : address.hashCode());
		result = prime * result + empid;
		result = prime * result + ((m == null) ? 0 : m.hashCode());
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Employee other = (Employee) obj;
		if (address == null) {
			if (other.address != null)
				return false;
		} else if (!address.equals(other.address))
			return false;
		if (empid != other.empid)
			return false;
		if (m == null) {
			if (other.m != null)
				return false;
		} else if (!m.equals(other.m))
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}

}
