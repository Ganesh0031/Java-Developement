class Calculator2{


int add(int a, int b){
return a+b;
}
int add(int a,int b,int c){
  return a+b+c;
}
float add(int a, float b){
return a+b;}
float add(float a, float b ){
return a+b;
}
float add(int a, float b,float c){
return a+b+c;}
double add(int a,int b, double c){
return a+b+c;
}
double add(double a, double b, double c){
return a+b+c;}
double add(int a,double b, int c){
  return a+b+c;
}


}
public class LaunchMO{

public static void main(String []args){

 Calculator2 calc=new Calculator2();
 int a=10,b=30,c=20;
float m=10.5f,n=20.5f,o=30.5f;
double x=15.5, y=25.5, z=35.5;
System.out.println(calc.add(a,b));
System.out.println(calc.add(m,n));
System.out.println(calc.add(a,b,c));
System.out.println(calc.add(x,y,z));
System.out.println(calc.add(a,b,x));
}
}