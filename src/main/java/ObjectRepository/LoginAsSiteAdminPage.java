package ObjectRepository;

import GenericUtility.PropertyFileUtility;
import GenericUtility.TestDataSiteAdmin;

public class LoginAsSiteAdminPage {

    public TestDataSiteAdmin tUtil = new TestDataSiteAdmin();
    public PropertyFileUtility pUtil;

    public void loginAsTenantInFreeSSO() {
        String environment = System.getProperty("environment");
        if (environment == null || environment.isEmpty()) {
            environment = "dev";
        }
        pUtil = new PropertyFileUtility(environment);
        String loginAsTenantURL = pUtil.gettenantlogin_url();
        System.out.println("LoginAsTenantURL = " + loginAsTenantURL);

        // Retrieve email address for free SSO from TestDataSiteAdmin
        String freeSSOSiteAdminEmail = tUtil.getFreeSSOEmail();

        // Additional code to perform login using the retrieved email address
        System.out.println("Logging in as tenant in Free SSO with email: " + freeSSOSiteAdminEmail);
    }

    public void loginAsTenantInFreeNonSSO() {
        String environment = System.getProperty("environment");
        if (environment == null || environment.isEmpty()) {
            environment = "dev";
        }
        pUtil = new PropertyFileUtility(environment);
        String loginAsTenantURL = pUtil.gettenantlogin_url();
        System.out.println("LoginAsTenantURL = " + loginAsTenantURL);

        // Retrieve email address for free non-SSO from TestDataSiteAdmin
        String freeNonSSOSiteAdminEmail = tUtil.getFreeNonSSOEmail();

        // Additional code to perform login using the retrieved email address
        System.out.println("Logging in as tenant in Free non-SSO with email: " + freeNonSSOSiteAdminEmail);
    }

    public void loginAsTenantInPaidSSO() {
        String environment = System.getProperty("environment");
        if (environment == null || environment.isEmpty()) {
            environment = "dev";
        }
        pUtil = new PropertyFileUtility(environment);
        String loginAsTenantURL = pUtil.gettenantlogin_url();
        System.out.println("LoginAsTenantURL = " + loginAsTenantURL);

        // Retrieve email address for paid SSO from TestDataSiteAdmin
        String paidSSOSiteAdminEmail = tUtil.getPaidSSOEmail();

        // Additional code to perform login using the retrieved email address
        System.out.println("Logging in as tenant in Paid SSO with email: " + paidSSOSiteAdminEmail);
    }

    public void loginAsTenantInPaidNonSSO() {
        String environment = System.getProperty("environment");
        if (environment == null || environment.isEmpty()) {
            environment = "dev";
        }
        pUtil = new PropertyFileUtility(environment);
        String loginAsTenantURL = pUtil.gettenantlogin_url();
        System.out.println("LoginAsTenantURL = " + loginAsTenantURL);

        // Retrieve email address for paid non-SSO from TestDataSiteAdmin
        String paidNonSSOSiteAdminEmail = tUtil.getPaidNonSSOEmail();

        // Additional code to perform login using the retrieved email address
        System.out.println("Logging in as tenant in Paid non-SSO with email: " + paidNonSSOSiteAdminEmail);
    }
}
