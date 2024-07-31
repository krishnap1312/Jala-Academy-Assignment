interface SingleMethodInterface {
    void singleMethod();
}

class ImplementingClass implements SingleMethodInterface {
    @Override
    public void singleMethod() {
        System.out.println("Single method implemented.");
    }
}

public class TestSingleMethodInterface {
    public static void main(String[] args) {
        ImplementingClass obj = new ImplementingClass();
        obj.singleMethod();
    }
}
