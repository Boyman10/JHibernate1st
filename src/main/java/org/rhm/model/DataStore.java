package org.rhm.model;

/**
 * Data store model class being used to match the submission of an online form
 * @author hackme
 * @version 1
 */
public class DataStore {

	// TODO : implement hibernate here !!
	private String name;
	private String message;
	private int age;
	private String email;
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}

	@Override
	public String toString() {
		return "DataStore{" +
				"name='" + name + '\'' +
				", message='" + message + '\'' +
				", age=" + age +
				", email='" + email + '\'' +
				'}';
	}
}
