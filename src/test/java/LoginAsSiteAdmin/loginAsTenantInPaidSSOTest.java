package LoginAsSiteAdmin;

import org.testng.annotations.Test;

import ObjectRepository.LoginAsAdminPage;
import ObjectRepository.LoginAsSiteAdminPage;

public class loginAsTenantInPaidSSOTest {

	@Test()
	public void loginAsTenantInPaidSSO() {
		
		LoginAsSiteAdminPage lp2 = new LoginAsSiteAdminPage();
		lp2.loginAsTenantInPaidSSO();
	}
}
