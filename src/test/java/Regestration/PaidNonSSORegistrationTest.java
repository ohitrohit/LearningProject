package Regestration;

import org.testng.annotations.Test;

import GenericUtility.BaseClass;
import ObjectRepository.RegistrationPage;

public class PaidNonSSORegistrationTest extends BaseClass{

	
	@Test()
	public void paidNonSSOReg() {
		
	    
		RegistrationPage rp = new RegistrationPage();
		rp.PaidNonSSORegistration();
	}
}
