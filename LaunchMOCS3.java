class Calculator5{
  float add(float a, int b){
System.out.println("Get the float and int");
    return a+b;
}
float add(int c, int a){
System.out.println("Get the integer and float");
 return a+c;
}

}
public class LaunchMOCS3{

 public static void main(String []args){

 Calculator5 cal=new Calculator5();
  System.out.println(cal.add(10,20));
}
}