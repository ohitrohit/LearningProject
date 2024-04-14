package Login;

import org.testng.annotations.Test;

import ObjectRepository.LoginPage;

public class loginAsTenantInFreeSSOTest {

	@Test()
	public void loginAsTenantInFreeSSO() {
		
		LoginPage lp = new LoginPage();
		lp.loginAsTenantInFreeSSO();
	}
}
