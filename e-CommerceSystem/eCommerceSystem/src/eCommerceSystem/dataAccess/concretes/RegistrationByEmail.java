package eCommerceSystem.dataAccess.concretes;

import eCommerceSystem.dataAccess.abstracts.LoginOptions;
import eCommerceSystem.entities.concretes.ContactInformation;

public class RegistrationByEmail implements LoginOptions {

	public void entry(ContactInformation person) {
		System.out.println("e-mail ile kayıt");		
	}

	public void update(ContactInformation person) {
		// TODO Auto-generated method stub
		
	}

	public void delete(ContactInformation person) {
		// TODO Auto-generated method stub
		
	}

}
