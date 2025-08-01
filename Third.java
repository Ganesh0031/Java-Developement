interface firstI{
void m1();
}
interface fourthI{
void m1(int a);
}
interface sixI{
int a=99;}
interface sevenI{
int a=100;}
class second implements firstI,fourthI,sixI,sevenI{
      public void m1(){
System.out.println("This is the implements the interface in java");
}
public  void m1(int a){
 System.out.println("Second :"+a);
}
 void printCheck(){
System.out.println("This is the concrited method");
}
}
public class Third {
public static void main(String []args){

second s=new second();
s.m1();
s.m1(22);
s.printCheck();
System.out.println(sixI.a);
System.out.println(sevenI.a);

}}