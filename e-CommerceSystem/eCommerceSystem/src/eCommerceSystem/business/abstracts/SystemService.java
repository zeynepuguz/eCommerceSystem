package eCommerceSystem.business.abstracts;

import eCommerceSystem.entities.concretes.ContactInformation;

public interface SystemService {
	void entry(ContactInformation person);
	void login(ContactInformation person, String eMail, String password);
}
