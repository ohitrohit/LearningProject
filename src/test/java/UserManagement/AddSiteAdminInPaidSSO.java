package UserManagement;

import org.testng.annotations.Test;

import ObjectRepository.LoginAsAdminPage;
import ObjectRepository.UserManagementTest;

public class AddSiteAdminInPaidSSO {


	@Test()
	public void addSiteAdminPaidSSO() {
		LoginAsAdminPage lp = new LoginAsAdminPage();
		lp.loginAsAdminInPaidSSO();
		
		UserManagementTest ut = new UserManagementTest();
		ut.addSiteAdminForPaidSSO();
		
	}
}
