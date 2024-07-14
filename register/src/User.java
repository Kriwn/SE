public class User {
    private int age;
    private String name;
    public String email;

    public User(int age, String name, String email) {
        this.age = age;
        this.name = name;
        this.email = email;
    }

    public int getAge() {
        return this.age;
    }

    public String getName() {
        return this.name;
    }

    public String getEmail() {
        return this.email;
    }

}
