package com.demo.model;

public class User {
	
	private String firstname;
	private String lastname;
	private String usergroup;
	private String username;
	private String passwd;
	private int id;
	
	public User(){
		
	}
	
	public User(String firstname, String lastname, String usergroup,
			String username, String passwd, int id) {
		super();
		this.firstname = firstname;
		this.lastname = lastname;
		this.usergroup = usergroup;
		this.username = username;
		this.passwd = passwd;
		this.id = id;
	}
	public String getFirstname() {
		return firstname;
	}
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}
	public String getLastname() {
		return lastname;
	}
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
	public String getUsergroup() {
		return usergroup;
	}
	public void setUsergroup(String usergroup) {
		this.usergroup = usergroup;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPasswd() {
		return passwd;
	}
	public void setPasswd(String passwd) {
		this.passwd = passwd;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	
}
