class SB {
    public static void main(String []args){
        StringBuffer sb=new StringBuffer("SSIPMT");
        sb.append("Raipur");
        System.out.println(""+sb);
        sb.insert(6,"Java class");
        System.out.println(""+sb);

        System.out.println(""+sb.length());
    
        sb.reverse();
        System.out.println(""+sb);
        System.out.println("capacity is:"+sb.capacity());
    }
    
}
