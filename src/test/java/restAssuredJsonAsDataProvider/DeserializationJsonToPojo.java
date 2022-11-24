package restAssuredJsonAsDataProvider;

import java.io.Serializable;

public class DeserializationJsonToPojo implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int id;
	private String name;
	private int departmentId;
	private String registrationDate;
	
	public DeserializationJsonToPojo(int id, String name, int departmentId, String registrationDate) {
		super();
		this.id = id;
		this.name = name;
		this.departmentId = departmentId;
		this.registrationDate = registrationDate;
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

	public int getDepartmentId() {
		return departmentId;
	}

	public void setDepartmentId(int departmentId) {
		this.departmentId = departmentId;
	}

	public String getRegistrationDate() {
		return registrationDate;
	}

	public void setRegistrationDate(String registrationDate) {
		this.registrationDate = registrationDate;
	}
	
	

}
