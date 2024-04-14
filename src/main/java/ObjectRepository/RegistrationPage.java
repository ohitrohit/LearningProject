package ObjectRepository;

import GenericUtility.PropertyFileUtility;
import GenericUtility.TestData;

public class RegistrationPage {

    TestData tUtil = new TestData();
    PropertyFileUtility pUtil;

    public void FreeSSORegistration() {
        String environment = System.getProperty("environment");
        if (environment == null || environment.isEmpty()) {
            environment = "dev";
        }
        pUtil = new PropertyFileUtility(environment);
        String URL = pUtil.getfreereg_url();
        System.out.println("URL  = " + URL);
        String freeSSOEmail = tUtil.getFreeSSOEmail();
        String password = "123456789";
        System.out.println("Email  = " + freeSSOEmail);
        System.out.println("Password  = " + password);
        
        // Save the generated email address
        TestData.saveTestData("freeSSO", freeSSOEmail, "", "", "");
    }

    public void PaidNonSSORegistration() {
        String environment = System.getProperty("environment");
        if (environment == null || environment.isEmpty()) {
            environment = "dev";
        }
        pUtil = new PropertyFileUtility(environment);
        String URL = pUtil.getpaidreg_url();
        System.out.println("URL  = " + URL);
        String paidNonSSOEmail = tUtil.getPaidNonSSOEmail();
        String password = "123456789";
        System.out.println("Email  = " + paidNonSSOEmail);
        System.out.println("Password  = " + password);
        
        // Save the generated email address
        TestData.saveTestData("paidNonSSO", "", "", paidNonSSOEmail, "");
    }

    public void PaidSSORegistration() {
        String environment = System.getProperty("environment");
        if (environment == null || environment.isEmpty()) {
            environment = "dev";
        }
        pUtil = new PropertyFileUtility(environment);
        String URL = pUtil.getpaidreg_url();
        System.out.println("URL  = " + URL);
        String paidSSOEmail = tUtil.getPaidSSOEmail();
        String password = "123456789";
        System.out.println("Email  = " + paidSSOEmail);
        System.out.println("Password  = " + password);
        
        // Save the generated email address
        TestData.saveTestData("paidSSO", paidSSOEmail, "", "", "");
    }

    public void FreeNonSSORegistration() {
        String environment = System.getProperty("environment");
        if (environment == null || environment.isEmpty()) {
            environment = "dev";
        }
        pUtil = new PropertyFileUtility(environment);
        String URL = pUtil.getfreereg_url();
        System.out.println("URL  = " + URL);
        String freeNonSSOEmail = tUtil.getFreeNonSSOEmail();
        String password = "123456789";
        System.out.println("Email  = " + freeNonSSOEmail);
        System.out.println("Password  = " + password);
        
        // Save the generated email address
        TestData.saveTestData("freeNonSSO", "", "", "", freeNonSSOEmail);
    }
}
