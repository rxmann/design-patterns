package builder;

public class UserDirector {

    public User buildKathmanduUser(String fn, String ln, String email) {
        return new User.UserBuilder(fn, ln, email)
                .address("Kathmandu")
                .build();
    }

    public User buildRamechhapUser(String fn, String ln, String email) {
        return new User.UserBuilder(fn, ln, email)
                .address("Ramechhap")
                .build();
    }
}