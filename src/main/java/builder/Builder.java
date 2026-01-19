package builder;

import builder.User.UserBuilder;

/*
 * Builder constructs a complex object step-by-step, separating construction from representation,
 * so the same process can create different forms of a single object.
 */
public class Builder {

    public static void main(String args[]) {

        UserBuilder ktmUserBuilder = new UserBuilder("Ram", "Shrestha", "ram@ktm.com");

        User ktmUser = UserDirector.buildKathmanduUser(ktmUserBuilder);

        UserBuilder rmchpUserBuilder = new UserBuilder("Sita", "Karki", "sita@ramechhap.com");

        User ramechhapUser = UserDirector.buildRamechhapUser(rmchpUserBuilder);

        System.out.println(ktmUser.getAddress());
        System.out.println(ramechhapUser.getAddress());
    }

}
