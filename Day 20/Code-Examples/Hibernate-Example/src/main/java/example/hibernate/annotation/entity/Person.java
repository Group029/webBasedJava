package example.hibernate.annotation.entity;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity//Used to declare this class as an Entity
@Table(name = "person_master")
public class Person {
	@Id//Used to declare the field as an identity
	@Column(name = "person_id")
	private int personId;
	@Column(name = "person_name", length = 20)
	private String name;
	@Column(name = "person_email", length = 40)
	private String email;
	@Column(name = "person_birth_date")
	private LocalDate birthDate;
	
	public Person() {
		// TODO Auto-generated constructor stub
	}

	public Person(int personId, String name, String email, LocalDate birthDate) {
		super();
		this.personId = personId;
		this.name = name;
		this.email = email;
		this.birthDate = birthDate;
	}

	public int getPersonId() {
		return personId;
	}

	public void setPersonId(int personId) {
		this.personId = personId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public LocalDate getBirthDate() {
		return birthDate;
	}

	public void setBirthDate(LocalDate birthDate) {
		this.birthDate = birthDate;
	}

	@Override
	public String toString() {
		return "Person [personId=" + personId + ", name=" + name + ", email=" + email + ", birthDate=" + birthDate
				+ "]";
	}

}
