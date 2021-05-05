package campGameProject.Entity;

import java.time.*;

public class User implements Entity {
	private int id;
	private String nationalityId;
	private String name;
	private String lastName;
	private int dateOfBirth;

	public User() {

	}

	public User(int id, String nationalityId, String name, String lastName, int dateOfBirth) {
		super();
		this.id = id;
		this.nationalityId = nationalityId;
		this.name = name;
		this.lastName = lastName;
		this.dateOfBirth = dateOfBirth;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNationalityId() {
		return nationalityId;
	}

	public void setNationalityId(String nationalityId) {
		this.nationalityId = nationalityId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public int getDateOfBirth() {
		return dateOfBirth;
	}

	public void setDateOfBirth(int dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

}
