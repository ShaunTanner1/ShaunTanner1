
import java.util.Map;
import java.util.HashMap;

public class UserManagement {
    private Map<String, User> users;

    public UserManagement() {
        users = new HashMap<>();
        users.put("admin", new User("admin", "adminpass", "admin"));
    }

    public boolean registerUser(String username, String password, String role) {
        if (!users.containsKey(username)) {
            users.put(username, new User(username, password, role));
            return true;
        } else {
            return false;
        }
    }

    public User loginUser(String username, String password) {
        User user = users.get(username);
        if (user != null && user.validatePassword(password)) {
            return user;
        } else {
            return null;
        }
    }

    public User getUser(String username) {
        return users.get(username);
    }
}
