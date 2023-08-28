package eCommerceSystem.dataAccess.abstracts;

import eCommerceSystem.entities.concretes.ContactInformation;

public interface LoginOptions {

	void entry(ContactInformation person);
	void update(ContactInformation person);
	void delete(ContactInformation person);
}
