package GenericUtility;

import java.io.*;

public class TestData {

    private static String email;

    public int getRandomNumber() {
        return (int) (Math.random() * 10000);
    }

    public String getPaidSSOEmail() {
        return "paidsso" + getRandomNumber() + "@kine.ai";
    }

    public String getFreeNonSSOEmail() {
        return "freenonsso" + getRandomNumber() + "@kine.ai";
    }

    public String getPaidNonSSOEmail() {
        return "paidnonsso" + getRandomNumber() + "@kine.ai";
    }

    public String getFreeSSOEmail() {
        return "freesso" + getRandomNumber() + "@kine.ai";
    }

    private static String getFileName(String emailType) {
        return emailType + ".txt";
    }

    public static void saveTestData(String emailType, String paidSSOEmail, String freeNonSSOEmail, String paidNonSSOEmail, String freeSSOEmail) {
        String fileName = getFileName(emailType);
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(fileName))) {
            writer.write(paidSSOEmail);
            writer.newLine();
            writer.write(freeNonSSOEmail);
            writer.newLine();
            writer.write(paidNonSSOEmail);
            writer.newLine();
            writer.write(freeSSOEmail);
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
                    email = line;
                    break; // Stop reading after finding the email address
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static String getEmail() {
        return email;
    }

    public static void setEmail(String email) {
        TestData.email = email;
    }

}
