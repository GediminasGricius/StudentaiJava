package lt.ku.studentai.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="students")
public class Student {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	
	@Column(length = 16)
	private String name;
	
	@Column(length = 32)
	private String surname;
	
	@Column(length = 64, nullable = true)
	private String address;
	
	@Column(unique = true, length = 32)
	private String email;
	
	@Column
	private Integer year;

	public Student() {
		super();
	}
	
	

	public Student(String name, String surname, String email, Integer year) {
		super();
		this.name = name;
		this.surname = surname;
		this.email = email;
		this.year = year;
	}



	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}



	public String getSurname() {
		return surname;
	}



	public void setSurname(String surname) {
		this.surname = surname;
	}



	public String getEmail() {
		return email;
	}



	public void setEmail(String email) {
		this.email = email;
	}



	public Integer getYear() {
		return year;
	}



	public void setYear(Integer year) {
		this.year = year;
	}



	public String getAddress() {
		return address;
	}



	public void setAddress(String address) {
		this.address = address;
	}



	public void setId(Integer id) {
		this.id = id;
	}
	
	
	
}
