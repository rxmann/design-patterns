package builder;

public class Builder {

    public static void main(String args[]) {
        UserDirector director = new UserDirector();

        User ktmUser = director.buildKathmanduUser(
                "Ram", "Shrestha", "ram@ktm.com");

        User ramechhapUser = director.buildRamechhapUser(
                "Sita", "Karki", "sita@ramechhap.com");

        System.out.println(ktmUser.getAddress());
        System.out.println(ramechhapUser.getAddress());
    }

}