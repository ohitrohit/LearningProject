package LoginAsAdmin;

import org.testng.annotations.Test;

import ObjectRepository.LoginAsAdminPage;

public class loginAsAdminInFreeSSOTest {

	@Test()
	public void loginAsAdminInFreeSSO() {
		
		LoginAsAdminPage lp = new LoginAsAdminPage();
		lp.loginAsAdminInFreeSSO();
	}
}
