package LoginAsSiteAdmin;

import org.testng.annotations.Test;


import ObjectRepository.LoginAsSiteAdminPage;

public class loginAsTenantInFreeNonSSOTest {

	@Test()
	public void loginAsTenantInFreeNonSSO() {
		
		LoginAsSiteAdminPage lp2 = new LoginAsSiteAdminPage();
		lp2.loginAsTenantInFreeNonSSO();
	}
}
