public class User {
    private String name;
    private int age;
    public User(String name, int age) {
        this.age = age;
        this.name = name;
    }

    protected void getInfor() {
        System.out.println("My name is:" + this.name + ", my age is:" + this.age);
    }
}
