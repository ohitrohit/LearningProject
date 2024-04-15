package LoginAsAdmin;

import org.testng.annotations.Test;

import ObjectRepository.LoginAsAdminPage;

public class loginAsAdminInPaidSSOTest {

	@Test()
	public void loginAsAdminInPaidSSO() {
		
		LoginAsAdminPage lp = new LoginAsAdminPage();
		lp.loginAsAdminInPaidSSO();
	}
}
