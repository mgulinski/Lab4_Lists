package lab4_lists;

import java.util.Objects;

/**
 * class will demonstrate how to overwrite equals method
 * @author Machi
 */
public class Dog implements Breathing {
    
    
    private String name;
    private String rabiesID;
    private String breed;
    

    public Dog(String name, String rabiesID) {
	this.name = name;
	this.rabiesID = rabiesID;
    }

    public Dog(String name, String rabiesID, String breed) {
	this.name = name;
	this.rabiesID = rabiesID;
	this.breed = breed;
    }

    
        
    
    @Override
    public int hashCode() {
	int hash = 5;
	hash = 37 * hash + Objects.hashCode(this.rabiesID);
	return hash;
	
	
    }

    @Override
    public boolean equals(Object obj) {
	if (obj == null) {
	    return false;
	}
	if (getClass() != obj.getClass()) {
	    return false;
	}
	final Dog other = (Dog) obj;
	if (!Objects.equals(this.rabiesID, other.rabiesID)) {
	    return false;
	}
	return true;
    }
    

    public String getName() {
	return name;
    }

    public void setName(String name) {
	this.name = name;
    }

    public String getRabiesID() {
	return rabiesID;
    }

    public void setRabiesID(String rabiesID) {
	this.rabiesID = rabiesID;
    }

    public String getBreed() {
	return breed;
    }

    public void setBreed(String breed) {
	this.breed = breed;
    }
    
    
    @Override
    public String toString() {
	
	String str = "\nDog Info\n------------"
		+ "\nDog Name: " + name
		+ "\nRabies ID: " + rabiesID 
		+ "\nBreed: " + breed;
		
	
	return str;
}

    @Override
    public void Breath() {
	System.out.println("Breathing oxygen, bark");
    }
}
