package Login;

import org.testng.annotations.Test;

import ObjectRepository.LoginPage;

public class loginAsTenantInFreeNonSSOTest {

	@Test()
	public void loginAsTenantInFreeNonSSO() {
		
		LoginPage lp = new LoginPage();
		lp.loginAsTenantInFreeNonSSO();
	}
}
