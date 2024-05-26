public class User {
    private String username;
    private String password;
    private String role;

    public User(String username, String password, String role) {
        this.username = username;
        this.password = password;
        this.role = role;
    }

    public String getUsername() {
        return username;
    }

   public boolean validatePassword(String password) {
        return this.password.equals(password);
    }

    public String getRole() {
        return role;
    }
}
