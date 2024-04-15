package ObjectRepository;

import GenericUtility.TestDataSiteAdmin;

public class UserManagementTest {

	 private TestDataSiteAdmin tUtil = new TestDataSiteAdmin();

	    public void addSiteAdminForPaidSSO() {
	        // Generate paid SSO email for site admin
	        String paidSSOEmailForSiteAdmin = tUtil.getPaidSSOEmail();
	        System.out.println("Paid SSO Email: " + paidSSOEmailForSiteAdmin);

	        // Save the generated email address
	        TestDataSiteAdmin.saveTestData("paidSSO", paidSSOEmailForSiteAdmin, "", "", "");
	    }

	    public void addSiteAdminForFreeNonSSO() {
	        // Generate free non-SSO email for site admin
	        String freeNonSSOEmailForSiteAdmin = tUtil.getFreeNonSSOEmail();
	        System.out.println("Free Non-SSO Email: " + freeNonSSOEmailForSiteAdmin);

	        // Save the generated email address
	        TestDataSiteAdmin.saveTestData("freeNonSSO", "", freeNonSSOEmailForSiteAdmin, "", "");
	    }

	    public void addSiteAdminForPaidNonSSO() {
	        // Generate paid non-SSO email for site admin
	        String paidNonSSOEmailForSiteAdmin = tUtil.getPaidNonSSOEmail();
	        System.out.println("Paid Non-SSO Email: " + paidNonSSOEmailForSiteAdmin);

	        // Save the generated email address
	        TestDataSiteAdmin.saveTestData("paidNonSSO", "", "", paidNonSSOEmailForSiteAdmin, "");
	    }

	    public void addSiteAdminForFreeSSO() {
	        // Generate free SSO email for site admin
	        String freeSSOEmailForSiteAdmin = tUtil.getFreeSSOEmail();
	        System.out.println("Free SSO Email: " + freeSSOEmailForSiteAdmin);

	        // Save the generated email address
	        TestDataSiteAdmin.saveTestData("freeSSO", "", "", "", freeSSOEmailForSiteAdmin);
	    }
}
