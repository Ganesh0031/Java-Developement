class AN implements Runnable{
  public void run(){
    for(int i=0;i<110;i++){
      System.out.println("How ");
    }
  }
  public void show(){
    for(int i=0;i<=10;i++){
      System.out.println("Hii");
    }
  }
}
class BN implements Runnable {
  public void run(){
    for(int i=0;i<100;i++){
      System.out.println(
        "How are you "
      );
    }
  }
  public void show(){
    for(int i=0;i<=10;i++){
      System.out.println("Hello");
    }
  }
}
public class ThreadProgram {
  public static void main(String[] args) {

   Runnable r1=()->{
    for(int i=0;i<100;i++){
      System.out.println("Thread 1");
    }
   };
    Runnable r2=()->{
      for (int i=0;i<199;i++){
        System.out.println("Thread 2");
      }
    };
     Thread t1=new Thread(r1);
     Thread t2=new Thread(r2);
     t1.start();
     t2.start();
    
  }
  
}
