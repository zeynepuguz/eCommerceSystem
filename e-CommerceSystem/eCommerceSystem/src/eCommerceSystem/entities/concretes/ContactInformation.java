package eCommerceSystem.entities.concretes;

import eCommerceSystem.entities.abstracts.Entity;

import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class ContactInformation implements Entity {
	
	private String firstName;
	private String lastName;
	private String phoneNumber;
	private static String eMail = 
	        "^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@" +
	        "[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$";
	private static String password  = 
	        "^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@" +
	        "[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$";
	private long verificationCode;
	
	public ContactInformation() {
		super();
	}

	public ContactInformation(String firstName, String lastName,String phoneNumber,String eMail,String password, long verificationCode) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.phoneNumber = phoneNumber;
		this.verificationCode = verificationCode;
		ContactInformation.eMail = eMail;
		ContactInformation.password = password;
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
	
	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public static String geteMail() {
		return eMail;
	}

	public static void seteMail(String eMail) {
		ContactInformation.eMail = eMail;
	}

	public static String getPassword() {
		return password;
	}

	public static void setPassword(String password) {
		ContactInformation.password = password;
	}

	public long getVerificationCode() {
		return verificationCode;
	}

	public void setVerificationCode(long verificationCode) {
		this.verificationCode = verificationCode;
	}

	
	
	
}
