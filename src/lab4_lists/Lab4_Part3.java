package lab4_lists;

import java.util.*;

/**
 * 
 * create a list of mixed objects
 * @author Machi
 */
public class Lab4_Part3 {
    
    public static void main(String[] args) {
    
    
    List mylist = new ArrayList();
    
    mylist.add(new Employee("Macio", "Gulinski", 333));
    mylist.add(new Employee("Alex", "Druzny", 222));
    mylist.add(new Employee("Seba", "Gulinski", 555));
    mylist.add(new Dog("Angel", "RB01"));
    mylist.add(new Dog("Yupper", "RB33"));
    
        
    for(int i = 0; i < mylist.size(); i++){
	
	System.out.println(mylist.get(i));
    
    }
       
    
    
    
    
    }
}
