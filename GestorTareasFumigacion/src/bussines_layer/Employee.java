package bussines_layer;

public class Employee {
	
	private Integer id;
	private String name;
	private String lastName;
	private Integer dni;
	
	public Employee(Integer id, String name, String lastName, Integer dni) {
		super();
		this.id = id;
		this.name = name;
		this.lastName = lastName;
		this.dni = dni;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
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

	public Integer getDni() {
		return dni;
	}

	public void setDni(Integer dni) {
		this.dni = dni;
	}
	
	
	
	
	

}
