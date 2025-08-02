class Display{

 void disp(){

System.out.println("Hellow No args method");
}
void disp(String name){
System.out.println(name);
}
void disp(int age){
System.out.println(age);
}
}
public class LaunchMOG{

public static void main (String []args){

 Display d=new Display();
d.disp();
d.disp(28);
d.disp("Hyder");
}

}