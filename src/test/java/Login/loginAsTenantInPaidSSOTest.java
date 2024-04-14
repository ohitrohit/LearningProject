package Login;

import org.testng.annotations.Test;

import ObjectRepository.LoginPage;

public class loginAsTenantInPaidSSOTest {

	@Test()
	public void loginAsTenantInPaidSSO() {
		
		LoginPage lp = new LoginPage();
		lp.loginAsTenantInPaidSSO();
	}
}
