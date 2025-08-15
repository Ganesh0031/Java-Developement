abstract class A{
  public abstract void show();
}
public class AbstractAnonymous {
  public static void main(String[] args) {
    A a= new A() {
      
       public  void show(){
        System.out.println("Innner show");
      }
    };
    a.show();
    
  }
  
}
