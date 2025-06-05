public class Contrasenia_segura {
    private String username;
    private String userPassword;

    public void setUsername(String username) {
        if (username != null && !username.trim().isEmpty()) {
            this.username = username;
        } else {
            System.out.println("Username cannot be empty.");
        }
    }

    public void setUserPassword(String password) {
        boolean isValid = true;

        if (password == null || password.length() < 8) {
            System.out.println("Password must be at least 8 characters long.");
            isValid = false;
        }

        boolean hasUppercase = false;
        boolean hasLowercase = false;
        boolean hasDigit = false;

        for (int i = 0; i < password.length(); i++) {
            char c = password.charAt(i);

            if (Character.isUpperCase(c)) {
                hasUppercase = true;
            }
            if (Character.isLowerCase(c)) {
                hasLowercase = true;
            }
            if (Character.isDigit(c)) {
                hasDigit = true;
            }
        }

        if (!hasUppercase) {
            System.out.println("Password must contain at least one uppercase letter.");
            isValid = false;
        }

        if (!hasLowercase) {
            System.out.println("Password must contain at least one lowercase letter.");
            isValid = false;
        }

        if (!hasDigit) {
            System.out.println("Password must contain at least one number.");
            isValid = false;
        }

        if (isValid) {
            this.userPassword = password;
        }
    }

    public boolean authenticate(String attempt) {
        return userPassword != null && userPassword.equals(attempt);
    }

    public boolean isInitialized() {
        return username != null && userPassword != null;
    }

    public String getUserPassword() {
        return userPassword;
    }
}