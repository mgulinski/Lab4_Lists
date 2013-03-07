package lab4_lists;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Machi
 */
public class Lab4_Part1 {

    
    public static void main(String[] args) {
	
	List ma = new ArrayList();
	
	ma.add("Karate");
	ma.add("Judo");
	ma.add("Taekwondo");
	ma.add("Karate");
	ma.add("Kick-boxing");
	
	for(int i=0; i < ma.size(); i++) {
	    
	    System.out.println(ma.get(i));
	}
	
	
	
	
    }
}