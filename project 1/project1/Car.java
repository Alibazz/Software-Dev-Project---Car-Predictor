package project1;

import org.omg.CORBA.PUBLIC_MEMBER;

public class Car implements CarADT{
	
	private String buying;
	private String maint;
	private int doors;
	private int people;
	private String trunk;
	private String safety;
	private String rating;
	
	
	public Car(String buying, String maint, String doors, String people, String trunk, String safety, String rating) {
		
		this.buying = buying;
		this.maint = maint;
		
		if(doors.equals("2") || doors.equals("3") || doors.equals("4"))
			this.doors = Integer.parseInt(doors);
		else
			this.doors = 5;
		
		if(people.equals("2") || people.equals("4"))
			this.people = Integer.parseInt(people);
		else
			this.people = 5;
		
		this.trunk = trunk;
		this.safety = safety;
		this.rating = rating;
				
	}
	

	@Override
	public void setBuying(String s) {
		buying = s;
	}

	@Override
	public void setMaint(String m) {
		maint = m;
	}

	@Override
	public void setDoors(int numDoors) {
		doors = numDoors;
	}

	@Override
	public void setPersons(int numPersons) {
		people = numPersons;
	}

	@Override
	public void setTrunk(String t) {
		trunk = t;
	}

	@Override
	public void setSafety(String s) {
		safety = s;
	}

	@Override
	public void setRating(String c) {
		rating = c;
	}

	@Override
	public String getRating() {
		
		
		return rating;
		
		
	}
	public int getPeople() {
		return people;
	}


	public void setPeople(int people) {
		this.people = people;
	}


	public String getBuying() {
		return buying;
	}


	public String getMaint() {
		return maint;
	}


	public int getDoors() {
		return doors;
	}


	public String getTrunk() {
		return trunk;
	}


	public String getSafety() {
		return safety;
	}



	
	

}