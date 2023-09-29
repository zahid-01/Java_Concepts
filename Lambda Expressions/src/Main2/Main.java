package Main2;

interface MyLambda {
    int display(int a, int b);
}

public class Main {
    public static int fun(int a, int b) {
        return a + b;
    }

    public static void main(String[] args) {
        MyLambda lambda = Main::fun;
        System.out.println(lambda.display(2, 4));

    }

}
