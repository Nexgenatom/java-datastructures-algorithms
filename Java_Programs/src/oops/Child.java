package oops;

public class Child extends Parent{
	void display() {
        System.out.println(getSecret());  // ✅ Allowed via getter
    }
    public static void main(String[] args) {
        Child obj = new Child();
        obj.display();        // ✅ Output: Hidden Data
        System.out.println(obj.getSecret());  // ✅ Allowed, Output: Hidden Data
    }
}
