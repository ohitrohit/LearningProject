package Login;

import org.testng.annotations.Test;

import ObjectRepository.LoginPage;

public class loginAsAdminInFreeSSOTest {

	@Test()
	public void loginAsAdminInFreeSSO() {
		
		LoginPage lp = new LoginPage();
		lp.loginAsAdminInFreeSSO();
	}
}
