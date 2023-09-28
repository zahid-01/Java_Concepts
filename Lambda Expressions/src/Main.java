@FunctionalInterface
interface MyLambda{
    int add(int x, int y);
}

public class Main {
    public static void main(String[] args) {
        MyLambda myLambda = (a,b) -> a + b;


        System.out.println(myLambda.add(2,5));
    }
}
