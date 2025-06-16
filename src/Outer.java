
public class Outer {
    private  String msg = "안녕하세요. Outer Class!!!";

    class InnerClass {
        void displayMessage() {
            System.out.println("Inner says : " + msg);
        }
    }

    public void callInner() {
        InnerClass inner = new InnerClass();
        inner.displayMessage();
    }

    public static void main(String[] args) {

        Outer outer = new Outer();
        outer.callInner();

    }
}