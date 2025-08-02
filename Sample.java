abstract class St{
St(){
System.out.println("abstract");
}
abstract void simple();
}
class Sv extends St{
public void simple(){
System.out.println("Implements the abstract  method in class");

}}
public class Sample{

public static void main(String []args){

Sv s=new Sv();
s.simple();

}
}
