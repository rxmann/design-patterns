package builder;

import builder.User.UserBuilder;

public class UserDirector {

    public static User buildKathmanduUser(UserBuilder usb) {
        return usb
                .address("Kathmandu")
                .build();
    }

    public static User buildRamechhapUser(UserBuilder usb) {
        return usb
                .address("Ramechhap")
                .build();
    }
}