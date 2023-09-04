package Producer;

import com.sudo.Shared;

public class Producer extends Thread{
   Shared shared;

   public Producer(Shared shared){
       this.shared = shared;
   }

   public void run(){
       int counter = 0;

       while(counter<1000) {
           shared.set(counter);
           System.out.println("Producer: " + counter);
           counter++;
       }
   }
 }
