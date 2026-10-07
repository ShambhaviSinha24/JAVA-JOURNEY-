class A{
    private static A a=new A();
    private A(){
        System.out.println("this is a singleton class");

    }
    public static A getInstance(){
        return a;
    }
}
public class Singleton{
    public static void main(String args[]){
        A a1= A .getInstance();
        A a2= A. getInstance();
        System.out.println(""+a1);
        System.out.println("" +a2);
        
    }
}

