package com.workllama.springbootvuejsdemo.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Pattern;

import com.workllama.springbootvuejsdemo.Validation.ConfigurableSize;

@Entity
@Table
public class User {
		
	@Id
	@ConfigurableSize(minProperty = "cruddemo.minUserId", maxProperty = "cruddemo.maxUserId")
	private String userId;

	@NotBlank(message = "Password is mandatory")
	@ConfigurableSize(minProperty = "cruddemo.minpwd", maxProperty = "cruddemo.maxpwd")
	private String password;
	
	@NotBlank(message = "First name is mandatory")
	@ConfigurableSize(minProperty = "cruddemo.minname", maxProperty = "cruddemo.maxname")
	private String firstName;
	 
	 @NotBlank(message = "Last name is mandatory")
	@ConfigurableSize(minProperty = "cruddemo.minname", maxProperty = "cruddemo.maxname")
	 private String lastName;   
	 
	 @NotBlank(message = "DOB is mandatory")
	private String dob;  
	 
	
	 @NotBlank(message = "Email is mandatory")
	 @ConfigurableSize(minProperty = "cruddemo.minEmail", maxProperty = "cruddemo.maxEmail")
	private String email;
	
	 @NotBlank(message = "Address is mandatory")
	@ConfigurableSize(minProperty = "cruddemo.minAddress", maxProperty = "cruddemo.maxAddress")
	private String address;  
	
	 @NotBlank(message = "City is mandatory")
	private String city;   

	 @NotBlank(message = "State is mandatory")
	private String state;
	
	 @NotBlank(message = "Zipcode is mandatory")
	private String  zipCode;
	 
	 @NotBlank(message = "Country is mandatory")
	private String country;
	 
	 @NotBlank(message = "Phone number is mandatory")
	private String  phoneNumber;
	
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getDob() {
		return dob;
	}
	public void setDob(String dob) {
		this.dob = dob;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getZipCode() {
		return zipCode;
	}
	public void setZipCode(String zipCode) {
		this.zipCode = zipCode;
	}
	public String getCountry() {
		return country;
	}
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public String getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	@Override
	public String toString() {
		return "User [userId=" + userId + ", password=" + password + ", firstName=" + firstName + ", lastName="
				+ lastName + ", dob=" + dob + ", email=" + email + ", address=" + address + ", city=" + city
				+ ", state=" + state + ", zipCode=" + zipCode + ", country=" + country + ", phoneNumber=" + phoneNumber
				+ "]";
	}
	
	
}
