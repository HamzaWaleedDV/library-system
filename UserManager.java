import java.util.ArrayList;

public class UserManager {

    // No fields

    // Add a user to the library
    public void addUser(Library library, User user) {
        library.getUsers().add(user);
    }

    // Find a user by ID
    public User findUserById(Library library, int id) {
        for (User user : library.getUsers()) {
            if (user.getId() == id) {
                return user;
            }
        }
        return null; // if user not found
    }

    // Get all users from the library
    public ArrayList<User> getAllUsers(Library library) {
        return library.getUsers();
    }
}