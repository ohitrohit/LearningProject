package Regestration;

import org.testng.annotations.Test;

import GenericUtility.BaseClass;
import ObjectRepository.RegistrationPage;

public class FreeNonSSORegistrationTest extends BaseClass {

	@Test()
	public void freeNonSSOReg() {
		
	    
		RegistrationPage rp = new RegistrationPage();
		rp.FreeNonSSORegistration();
	}
}
