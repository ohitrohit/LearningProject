package Regestration;

import org.testng.annotations.Test;

import GenericUtility.BaseClass;
import ObjectRepository.RegistrationPage;

public class FreeSSORegistrationTest extends BaseClass{

	@Test()
	public void freeSSOReg() {
		
	    
		RegistrationPage rp = new RegistrationPage();
		rp.FreeSSORegistration();
	}
}
