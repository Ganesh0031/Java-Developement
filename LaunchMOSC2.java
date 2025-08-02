class Calculator4{
 float add(float a,int b){
 return a+b;
}
float add(float a,float b,int c){
    return a+b+c;
}
}
public class LaunchMOSC2{

 public static void main(String []args){


  Calculator4 cal=new Calculator4();
 System.out.println(cal.add(10,20));
}
}