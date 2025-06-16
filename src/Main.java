
class Person {
    int a = 0;
    static int b = 1;

    public static void greet() {
        System.out.println("Hello from static method!");

        //System.out.println("a = " + a ); 오류 발생
        System.out.println(("b = "+ b));
    }

    public void sayHello() {
        System.out.println("Hello from instance method!");

        System.out.println("a = " + a);
        System.out.println("b = " + b);
    }
}

public class Main {
    public static void main(String[] args) {
        Person.greet();

        Person p = new Person();
        p.sayHello();

    }
}