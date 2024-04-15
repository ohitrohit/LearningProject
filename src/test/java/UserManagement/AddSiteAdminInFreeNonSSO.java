package UserManagement;

import org.testng.annotations.Test;

import ObjectRepository.LoginAsAdminPage;
import ObjectRepository.UserManagementTest;

public class AddSiteAdminInFreeNonSSO {

	@Test()
	public void addSiteAdminFreeNonSSO() {
		LoginAsAdminPage lp = new LoginAsAdminPage();
		lp.loginAsAdminInFreeNonSSO();
		
		UserManagementTest ut = new UserManagementTest();
		ut.addSiteAdminForFreeNonSSO();
		
	}
}
