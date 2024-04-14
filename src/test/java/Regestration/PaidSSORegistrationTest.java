package Regestration;

import org.testng.annotations.Test;

import GenericUtility.BaseClass;
import ObjectRepository.RegistrationPage;

public class PaidSSORegistrationTest extends BaseClass{

	@Test()
	public void paidSSOReg() {
		
	    
		RegistrationPage rp = new RegistrationPage();
		rp.PaidSSORegistration();
	}
}
