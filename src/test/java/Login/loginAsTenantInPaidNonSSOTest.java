package Login;

import org.testng.annotations.Test;

import ObjectRepository.LoginPage;

public class loginAsTenantInPaidNonSSOTest {

	@Test()
	public void loginAsTenantInPaidNonSSO() {
		
		LoginPage lp = new LoginPage();
		lp.loginAsTenantInPaidNonSSO();
	}
}
