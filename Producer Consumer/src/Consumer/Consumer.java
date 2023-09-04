package Consumer;

import com.sudo.Shared;

public class Consumer extends Thread {
    Shared shared;

    public Consumer(Shared shared) {
        this.shared = shared;
    }

    public void run() {
        int counter = 1;

        while (counter<1000) {
            System.out.println("Consumer " + shared.get());
            counter++;
        }
    }
}
