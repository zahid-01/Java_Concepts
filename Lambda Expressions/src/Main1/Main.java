package Main1;

@FunctionalInterface
interface MyLambda{
    void display();
}

class UseLambda{
    public void callLambda(MyLambda lambda){
        lambda.display();
    }
}

class Demo{
    public void meth(){
        new UseLambda().callLambda(()-> System.out.println("hello"));
    }
}

public class Main {
    public static void main(String[] args) {
        new Demo().meth();
    }
}
