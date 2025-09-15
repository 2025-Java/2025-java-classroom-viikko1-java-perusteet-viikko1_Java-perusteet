package viikko1;

public class PasswordAttempts {
    public static String login(String[] tries) {
        String correctPassword = "java123";
        int maxTries = Math.min(3, tries.length); // enintään kolme yritystä

        for (int i = 0; i < maxTries; i++) {
            if (correctPassword.equals(tries[i])) {
                return "Tervetuloa!";
            }
        }
        return "Liian monta virheellistä yritystä.";
    }
}
