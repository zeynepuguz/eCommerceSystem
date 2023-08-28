package eCommerceSystem;

import RegistrationWithGoogle.GooggleAccount;
import eCommerceSystem.business.abstracts.SystemService;
import eCommerceSystem.business.concretes.SystemManager;
import eCommerceSystem.core.GoogleAccountManagerAdapter;
import eCommerceSystem.dataAccess.concretes.RegistrationByEmail;
import eCommerceSystem.entities.concretes.ContactInformation;

public class Main {

	public static void main(String[] args) {
		SystemService service = new SystemManager(new RegistrationByEmail(),new GoogleAccountManagerAdapter());
		ContactInformation person = new ContactInformation("Zeynep","Uğuz","0555 555 5555","zeynppguzz4@gmail.com","zeynep29.4",193042);
		service.entry(person);
		service.login(person,"zeynppuguzz4@gmail.com","zeynep29.4");
	}

	

}
