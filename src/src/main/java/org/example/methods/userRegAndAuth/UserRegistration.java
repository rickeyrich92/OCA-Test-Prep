package org.example.methods.userRegAndAuth;

public class UserRegistration {
    public static boolean registerUser(String username, String password) {
        if (UserValidator.validateUsername(username) && UserValidator.validatePassword(password)) {
            // Register user in the database
            System.out.println("User registered successfully.");
            return true;
        } else {
            System.out.println("Invalid username or password.");
            return false;
        }
    }
}
