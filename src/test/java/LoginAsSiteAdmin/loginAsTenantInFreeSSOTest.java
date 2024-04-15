package LoginAsSiteAdmin;

import org.testng.annotations.Test;

import ObjectRepository.LoginAsAdminPage;
import ObjectRepository.LoginAsSiteAdminPage;

public class loginAsTenantInFreeSSOTest {

	@Test()
	public void loginAsTenantInFreeSSO() {
		
		LoginAsSiteAdminPage lp2 = new LoginAsSiteAdminPage();
		lp2.loginAsTenantInFreeSSO();
	}
}
