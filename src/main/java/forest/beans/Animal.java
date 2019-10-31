package forest.beans;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.springframework.beans.factory.annotation.Autowired;

public class Animal {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	private String name;
	private String species;
	private char sex;
	private double pounds;
	@Autowired
	private Diet diet;
	
	public Animal() {
		super();
	}

	public Animal(String name, String species, char sex, double pounds) {
		super();
		this.name = name;
		this.species = species;
		this.sex = sex;
		this.pounds = pounds;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSpecies() {
		return species;
	}

	public void setSpecies(String species) {
		this.species = species;
	}

	public char getSex() {
		return sex;
	}

	public void setSex(char sex) {
		this.sex = sex;
	}

	public double getPounds() {
		return pounds;
	}

	public void setPounds(double pounds) {
		this.pounds = pounds;
	}
	
	public Diet getDiet() {
		return diet;
	}
	
	public void setDiet(Diet diet) {
		this.diet = diet;
	}
	
	@Override
	public String toString() {
		return    "   Name - " + name + ", Species  - " 
	            + species + ", Sex - " + sex
		        + ", Pounds - " + pounds + ", Diet - " + diet;
	}
}
