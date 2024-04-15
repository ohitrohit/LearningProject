package GenericUtility;

import java.io.*;

public class TestDataSiteAdmin {

	
	private static final String SITEADMIN_FILE_PREFIX = "siteadmin_";
    private static String siteadminemail;

    private int getRandomNumber() {
        return (int) (Math.random() * 10000);
    }

    public String getPaidSSOEmail() {
        return "paidssositeadmin" + getRandomNumber() + "@kine.ai";
    }

    public String getFreeNonSSOEmail() {
        return "freenonssositeadmin" + getRandomNumber() + "@kine.ai";
    }

    public String getPaidNonSSOEmail() {
        return "paidnonssositeadmin" + getRandomNumber() + "@kine.ai";
    }

    public String getFreeSSOEmail() {
        return "freessositeadmin" + getRandomNumber() + "@kine.ai";
    }

    private static String getFileName(String emailType) {
        return SITEADMIN_FILE_PREFIX + emailType + ".txt";
    }

    public static void saveTestData(String emailType, String paidSSOEmailSiteAdmin, String freeNonSSOEmailSiteAdmin, String paidNonSSOEmailSiteAdmin, String freeSSOEmailSiteAdmin) {
        String fileName = getFileName(emailType);
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(fileName))) {
            writer.write(paidSSOEmailSiteAdmin);
            writer.newLine();
            writer.write(freeNonSSOEmailSiteAdmin);
            writer.newLine();
            writer.write(paidNonSSOEmailSiteAdmin);
            writer.newLine();
            writer.write(freeSSOEmailSiteAdmin);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void loadTestData(String emailType) {
        String fileName = getFileName(emailType);
        try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
            String line;
            while ((line = reader.readLine()) != null) {
                // Check if the line contains an email address pattern
                if (line.matches(".*@.*")) {
                	siteadminemail = line;
                    break; // Stop reading after finding the email address
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static String getEmail() {
        return siteadminemail;
    }

    public static void setEmail(String siteadminemail) {
        TestDataSiteAdmin.siteadminemail = siteadminemail;
    }

}
