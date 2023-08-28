package eCommerceSystem.business.concretes;

import eCommerceSystem.business.abstracts.SystemService;
import eCommerceSystem.core.GoogleService;
import eCommerceSystem.dataAccess.abstracts.LoginOptions;
import eCommerceSystem.entities.concretes.ContactInformation;

public class SystemManager implements SystemService{

	private LoginOptions options;
	private GoogleService googleService;
	
	
	public SystemManager(LoginOptions options, GoogleService googleService) {
		super();
		this.options = options;
		this.googleService = googleService;
	}

	public void entry(ContactInformation person) {
		while(person.getFirstName().length() >= 2 && person.getLastName().length() >= 2 &&
				ContactInformation.getPassword().length() >= 6 && person.getVerificationCode() >= 6){
			if(ContactInformation.geteMail() == "zynp_uguz@gmail.com" || ContactInformation.geteMail() == "zeynp.uguz8@gmail.com" ||
					ContactInformation.geteMail() == "zeynepuguz796@gmail.com" || ContactInformation.geteMail() == "zeynepuguz@gmail.com"){
				System.out.println("Kayıtlı kullanıcı. Lütfen başka mail hesabı ile deneyin.");
			}else {
				System.out.println("Kaydı gerçekleştiren siz iseniz " + ContactInformation.geteMail() + 
						" isimli mail hesabınıza gönderilen doğrulama kodunu giriniz. ");
				if(person.getVerificationCode() == 193042) {
					System.out.println("Sisteme başarıyla kayıt oldunuz.");
				}else {
					System.out.println("Yanlış doğrulama kodu girildi. Tekrar deneyiniz.");
				}
			}
			this.options.entry(person);
			this.googleService.entryToSystem();
			break;
		}
		
	}

	@Override
	public void login(ContactInformation person, String eMail, String password) {
		if(ContactInformation.geteMail() == eMail && ContactInformation.getPassword() == password) {
			System.out.println("Sisteme giriş yapıldı.");
		}else {
			System.out.println("Sisteme giriş gerçekleştirilemedi.");
		}
		
	}
	
	
	

}
