package ObjectRepository;

import GenericUtility.PropertyFileUtility;
import GenericUtility.TestData;

public class LoginPage {

	 public TestData tUtil = new TestData();
	 public PropertyFileUtility pUtil;

	    public void loginAsAdminInFreeSSO() {
	        String environment = System.getProperty("environment");
	        if (environment == null || environment.isEmpty()) {
	            environment = "dev";
	        }
	        pUtil = new PropertyFileUtility(environment);
	        String loginAsAdminURL = pUtil.getadminlogin_url();
	        System.out.println("LoginAsAdminURL =  " + loginAsAdminURL);
	        
	        // Load the email address for Free SSO user
	        TestData.loadTestData("freeSSO");
	        String freeSSOEmail = TestData.getEmail();
	        System.out.println("Logging in as admin with email: " + freeSSOEmail);
	    }

	    public void loginAsAdminInFreeNonSSO() {
	        String environment = System.getProperty("environment");
	        if (environment == null || environment.isEmpty()) {
	            environment = "dev";
	        }
	        pUtil = new PropertyFileUtility(environment);
	        String loginAsAdminURL = pUtil.getadminlogin_url();
	        System.out.println("LoginAsAdminURL =  " + loginAsAdminURL);
	        
	        // Load the email address for Free Non-SSO user
	        TestData.loadTestData("freeNonSSO");
	        String freeNonSSOEmail = TestData.getEmail();
	        System.out.println("Logging in as admin with email: " + freeNonSSOEmail);
	    }

	    public void loginAsAdminInPaidSSO() {
	        String environment = System.getProperty("environment");
	        if (environment == null || environment.isEmpty()) {
	            environment = "dev";
	        }
	        pUtil = new PropertyFileUtility(environment);
	        String loginAsAdminURL = pUtil.getadminlogin_url();
	        System.out.println("LoginAsAdminURL =  " + loginAsAdminURL);
	        
	        // Load the email address for Paid SSO user
	        TestData.loadTestData("paidSSO");
	        String paidSSOEmail = TestData.getEmail();
	        System.out.println("Logging in as admin with email: " + paidSSOEmail);
	    }

	    public void loginAsAdminInPaidNonSSO() {
	        String environment = System.getProperty("environment");
	        if (environment == null || environment.isEmpty()) {
	            environment = "dev";
	        }
	        pUtil = new PropertyFileUtility(environment);
	        String loginAsAdminURL = pUtil.getadminlogin_url();
	        System.out.println("LoginAsAdminURL =  " + loginAsAdminURL);
	        
	        // Load the email address for Paid Non-SSO user
	        TestData.loadTestData("paidNonSSO");
	        String paidNonSSOEmail = TestData.getEmail();
	        System.out.println("Logging in as admin with email: " + paidNonSSOEmail);
	    }
	public void loginAsTenantInFreeSSO() {
		String environment = System.getProperty("environment");
		if(environment == null || environment.isEmpty()) {
			environment = "dev";
		}
		pUtil = new PropertyFileUtility(environment);
		String LoginAsTenantURL = pUtil.gettenantlogin_url();
		System.out.println("LoginAsTenantURL = "+LoginAsTenantURL);
		System.out.println("loginAsTenantInFreeSSO");
	}

	public void loginAsTenantInFreeNonSSO() {
		String environment = System.getProperty("environment");
		if(environment == null || environment.isEmpty()) {
			environment = "dev";
		}
		pUtil = new PropertyFileUtility(environment);
		String LoginAsTenantURL = pUtil.gettenantlogin_url();
		System.out.println("LoginAsTenantURL = "+LoginAsTenantURL);
		System.out.println("loginAsTenantInFreeNonSSO");
	}
	public void loginAsTenantInPaidSSO() {
		String environment = System.getProperty("environment");
		if(environment == null || environment.isEmpty()) {
			environment = "dev";
		}
		pUtil = new PropertyFileUtility(environment);
		String LoginAsTenantURL = pUtil.gettenantlogin_url();
		System.out.println("LoginAsTenantURL = "+LoginAsTenantURL);
		System.out.println("loginAsTenantInPaidSSO");
	}
	public void loginAsTenantInPaidNonSSO() {
		String environment = System.getProperty("environment");
		if(environment == null || environment.isEmpty()) {
			environment = "dev";
		}
		pUtil = new PropertyFileUtility(environment);
		String LoginAsTenantURL = pUtil.gettenantlogin_url();
		System.out.println("LoginAsTenantURL = "+LoginAsTenantURL);
		System.out.println("loginAsTenantInPaidNonSSO");
	}
}
