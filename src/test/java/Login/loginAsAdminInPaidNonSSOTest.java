package Login;

import org.testng.annotations.Test;

import ObjectRepository.LoginPage;

public class loginAsAdminInPaidNonSSOTest {

	@Test()
	public void loginAsAdminInPaidNonSSO() {
		
		LoginPage lp = new LoginPage();
		lp.loginAsAdminInPaidNonSSO();
	}
}
