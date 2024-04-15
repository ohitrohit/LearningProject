package UserManagement;

import org.testng.annotations.Test;

import ObjectRepository.LoginAsAdminPage;
import ObjectRepository.UserManagementTest;

public class AddSiteAdminInFreeSSO {

	@Test()
	public void addSiteAdminFreeSSO() {
		LoginAsAdminPage lp = new LoginAsAdminPage();
		lp.loginAsAdminInFreeSSO();
		
		UserManagementTest ut = new UserManagementTest();
		ut.addSiteAdminForFreeSSO();
		
	}
	
}
