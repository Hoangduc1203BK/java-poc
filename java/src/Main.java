// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.

interface CreateUser{
    int AGE = 22;

    String Infor();

    default void MyDefault () {
        System.out.println("This is create user");
    }

}

class MyClass implements  CreateUser {
    int age;
    MyClass(int age) {
        this.age = age;
    }
    public String Infor() {
        return "hello";
    }

}


public class Main {
    public static void main(String[] args) {
        MyClass cl = new MyClass(22);
        System.out.println(cl.Infor());
        System.out.println(MyClass.AGE);

    }
}
