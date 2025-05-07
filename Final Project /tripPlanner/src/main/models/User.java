package src.main.models;

public class User {
    private String username;
    private String email;

    public String getEmail() {
        return email;
    }

    public User(String username, String email) {
        this.username = username;
        this.email = email;
    }

    public void login() {
        System.out.println(username + " logged in.");
    }

    public void logout() {
        System.out.println(username + " logged out.");
    }
}