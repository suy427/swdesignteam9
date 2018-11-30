package user;

public class User {
    private String id;
    private String password;

    public User() {

    }

    String getId() {
        return id;
    }

    void setId(String id) {
        this.id = id;
    }

    public boolean isValid() {

        return false; // default value
    }
}
