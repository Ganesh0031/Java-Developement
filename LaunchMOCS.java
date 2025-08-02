class Calculator3{

 int add(int a,int b){
 return a+b;
}
void add1(int a,int b){
 int res=a+b;
  System.out.println(res);
}
float add(int a,float b){

  return a+b;
}
}
public class LaunchMOCS{
 public static void main(String []args){

  Calculator3 cal=new Calculator3();
   System.out.println(cal.add(10,20));
    cal.add1(10,66);



}

}