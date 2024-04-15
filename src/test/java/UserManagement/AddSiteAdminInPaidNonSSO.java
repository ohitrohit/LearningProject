package UserManagement;

import org.testng.annotations.Test;

import ObjectRepository.LoginAsAdminPage;
import ObjectRepository.UserManagementTest;

public class AddSiteAdminInPaidNonSSO {

	@Test()
	public void addSiteAdminPaidNonSSO() {
		LoginAsAdminPage lp = new LoginAsAdminPage();
		lp.loginAsAdminInPaidNonSSO();
		
		UserManagementTest ut = new UserManagementTest();
		ut.addSiteAdminForPaidNonSSO();
		
	}
}
