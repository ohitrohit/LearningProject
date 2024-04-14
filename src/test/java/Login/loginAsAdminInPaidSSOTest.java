package Login;

import org.testng.annotations.Test;

import ObjectRepository.LoginPage;

public class loginAsAdminInPaidSSOTest {

	@Test()
	public void loginAsAdminInPaidSSO() {
		
		LoginPage lp = new LoginPage();
		lp.loginAsAdminInPaidSSO();
	}
}
