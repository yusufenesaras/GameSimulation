package Entities;

import Abstract.IEntity;

public class Gamer implements IEntity{
	
	int id;
	String firstName;
	String lastName;
	int birthYear;
    long nationalityNumber;
    
    public Gamer() {
    	
    }
    
	public Gamer(int id, String firstName, String lastName, int birthYear, long nationalityNumber) {
		super();
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.birthYear = birthYear;
		this.nationalityNumber = nationalityNumber;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
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

	public int getBirthYear() {
		return birthYear;
	}

	public void setBirthYear(int birthYear) {
		this.birthYear = birthYear;
	}

	public long getNationalityNumber() {
		return nationalityNumber;
	}

	public void setNationalityNumber(long nationalityNumber) {
		this.nationalityNumber = nationalityNumber;
	}
    


}
