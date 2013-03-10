package lab4_lists;

import java.util.*;

/**
 *
 * create a list of mixed objects
 *
 * @author Machi
 */
public class Lab4_Part3 {

    public static void main(String[] args) {


	List<Breathing> mylist = new ArrayList();
	// both objects implement Breathing interface so we can treat them as they are the same now
	mylist.add(new Employee("Macio", "Gulinski", 333, "Guru"));
	mylist.add(new Employee("Alex", "Druzny", 222, "Acounting"));
	mylist.add(new Employee("Seba", "Gulinski", 555, "Distractor"));
	mylist.add(new Dog("Angel", "RB01", "Space Shepperd"));
	mylist.add(new Dog("Yupper", "RB33", "Squeeker"));



	
	for (Breathing org: mylist) {
	    
	    System.out.println(org);
	
	}
	
	
	
	
    }
}
