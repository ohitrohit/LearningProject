package LoginAsAdmin;

import org.testng.annotations.Test;

import ObjectRepository.LoginAsAdminPage;

public class loginAsAdminInFreeNonSSOTest {

	@Test()
	public void loginAsAdminInFreeNonSSO() {
		
		LoginAsAdminPage lp = new LoginAsAdminPage();
		lp.loginAsAdminInFreeNonSSO();
	}
}
