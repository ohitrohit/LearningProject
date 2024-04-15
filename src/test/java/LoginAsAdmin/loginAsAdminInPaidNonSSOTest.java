package LoginAsAdmin;

import org.testng.annotations.Test;

import ObjectRepository.LoginAsAdminPage;

public class loginAsAdminInPaidNonSSOTest {

	@Test()
	public void loginAsAdminInPaidNonSSO() {
		
		LoginAsAdminPage lp = new LoginAsAdminPage();
		lp.loginAsAdminInPaidNonSSO();
	}
}
