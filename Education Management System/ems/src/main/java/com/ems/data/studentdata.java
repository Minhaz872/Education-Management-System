package com.ems.data;

public class studentdata {
	private String name;
	private String email;
	private int id;
	private String birthdate;
	private String password;
	private String address;
	private int shreni;
	private String instituion;
	
	public studentdata() {
		super();
		// TODO Auto-generated constructor stub
	}
	public studentdata(String name, String email, int id, String birthdate, String password, String address, int shreni,
			String instituion) {
		super();
		this.name = name;
		this.email = email;
		this.id = id;
		this.birthdate = birthdate;
		this.password = password;
		this.address = address;
		this.shreni = shreni;
		this.instituion = instituion;
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
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getBirthdate() {
		return birthdate;
	}
	public void setBirthdate(String birthdate) {
		this.birthdate = birthdate;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public int getShreni() {
		return shreni;
	}
	public void setShreni(int shreni) {
		this.shreni = shreni;
	}
	public String getInstituion() {
		return instituion;
	}
	public void setInstituion(String instituion) {
		this.instituion = instituion;
	}
	@Override
	public String toString() {
		return "studentdata [name=" + name + ", email=" + email + ", id=" + id + ", birthdate=" + birthdate
				+ ", password=" + password + ", address=" + address + ", shreni=" + shreni + ", instituion="
				+ instituion + "]";
	}
	

}
