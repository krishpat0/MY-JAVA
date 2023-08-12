public class M1 {

    // create method 1 non return type method
    static void myMethod() {
        System.out.println("Method1");
    }

    public static void main(String[] args) {
        myMethod();
    }
}

// second if we not want to use static keyword then we can called method using
// object
// ClassName obj =new ClassName();
// obj.methodName();