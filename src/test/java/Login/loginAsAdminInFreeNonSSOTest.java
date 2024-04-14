package Login;

import org.testng.annotations.Test;

import ObjectRepository.LoginPage;

public class loginAsAdminInFreeNonSSOTest {

	@Test()
	public void loginAsAdminInFreeNonSSO() {
		
		LoginPage lp = new LoginPage();
		lp.loginAsAdminInFreeNonSSO();
	}
}
