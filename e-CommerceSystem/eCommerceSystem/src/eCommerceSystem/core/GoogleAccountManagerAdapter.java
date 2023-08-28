package eCommerceSystem.core;

import RegistrationWithGoogle.GooggleAccount;

public class GoogleAccountManagerAdapter implements GoogleService {

	@Override
	public void entryToSystem() {
		GooggleAccount manager = new GooggleAccount();
		manager.entry();
		
	}

}
