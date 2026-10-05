class C
{
    int i =10;
    void show(){
        System.out.println("this is parent class"+i);
    }
}
    class B extends C{
        int i=80;
        void show(){
            System.out.println("this is child class"+i);
        }
    }

class A{
    public static void main (String args[]){
        B b= new B ();
        b.show();
    }
}
