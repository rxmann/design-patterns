package builder;

// builder pattern

// all the members are immutable and will not have a public constructor
// instead it will have an inner class of the builder that will construct the User object step wise 
// 

public class User {

    private final String firstName;
    private final String lastName;
    private final String email;

    private final Integer age;
    private final String phone;
    private final String address;

    private User(UserBuilder b) {
        this.firstName = b.firstName;
        this.lastName = b.lastName;
        this.email = b.email;
        this.age = b.age;
        this.phone = b.phone;
        this.address = b.address;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getEmail() {
        return email;
    }

    public Integer getAge() {
        return age;
    }

    public String getPhone() {
        return phone;
    }

    public String getAddress() {
        return address;
    }

    public static class UserBuilder {
        private final String firstName;
        private final String lastName;
        private final String email;

        private Integer age;
        private String phone;
        private String address;

        public UserBuilder(String firstName, String lastName, String email) {
            this.firstName = firstName;
            this.lastName = lastName;
            this.email = email;
        }

        public UserBuilder age(int age) {
            this.age = age;
            return this;
        }

        public UserBuilder phone(String phone) {
            this.phone = phone;
            return this;
        }

        public UserBuilder address(String address) {
            this.address = address;
            return this;
        }

        public User build() {
            return new User(this);
        }
    }

}
