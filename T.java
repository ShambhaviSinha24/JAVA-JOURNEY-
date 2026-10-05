class T {
    public static void main (String []args){
        int a[]=null;
        try{
            a= new int[3];
            a[0]=10;
            a[1]=20;
            a[2]=30;
            System.out.println(a[5]);
        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println(e);
        }
        finally{
            System.out.println(a[2]);
        }

    }
}
