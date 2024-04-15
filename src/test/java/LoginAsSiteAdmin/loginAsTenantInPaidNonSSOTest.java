package LoginAsSiteAdmin;

import org.testng.annotations.Test;

import ObjectRepository.LoginAsAdminPage;
import ObjectRepository.LoginAsSiteAdminPage;

public class loginAsTenantInPaidNonSSOTest {

	@Test()
	public void loginAsTenantInPaidNonSSO() {
		
		LoginAsSiteAdminPage lp2 = new LoginAsSiteAdminPage();
		lp2.loginAsTenantInPaidNonSSO();
	}
}
