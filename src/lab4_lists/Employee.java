package lab4_lists;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Machi
 */
public class Employee implements Breathing {
    
    private String firstName;
    private String lastName;
    private int empNum;
    private String position;

    public String getPosition() {
	return position;
    }

    public void setPosition(String position) {
	this.position = position;
    }

    public Employee(String firstName, String lastName, int empNum) {
	this.firstName = firstName;
	this.lastName = lastName;
	this.empNum = empNum;
    }

    public Employee(String firstName, String lastName, int empNum, String position) {
	this.firstName = firstName;
	this.lastName = lastName;
	this.empNum = empNum;
	this.position = position;
    }

    
    
    public String getFirstName() {
	return firstName;
    }

    public void setFirstName(String firstName) {
	this.firstName = firstName;
    }

    public String getLastName() {
	return lastName;
    }

    public void setLastName(String lastName) {
	this.lastName = lastName;
    }

    public int getEmpNum() {
	return empNum;
    }

    public void setEmpNum(int empNum) {
	this.empNum = empNum;
    }
    
    
    @Override
    public String toString() {
	
	String str = "\nEmployee Info\n----------------" 
		    + "\nName: " + firstName + " " + lastName
		    + "\nEmployee ID: " + empNum
		    + "\nPosition: " + position;
	
	return str;  
    
    }
    
    public static void main(String[] args) {
	
	Employee e1 = new Employee("Macio", "Gulinski", 333);
	Employee e2 = new Employee("Alex", "Druzny", 222);
	Employee e3 = new Employee("Seba", "Gulinski", 555);
	Employee e4 = new Employee("Seba", "Gulinski", 555);
	
	
	
	List<Employee> employees = new ArrayList<Employee>();
	
	employees.add(e1);
	employees.add(e2);
	employees.add(e3);
	
	
	for(Employee e: employees) {
	    
	    System.out.println(e);
	
	
	}
    }

    @Override
    public void Breath() {
	System.out.println("Breathing oxygen, yeah");
    }
}
