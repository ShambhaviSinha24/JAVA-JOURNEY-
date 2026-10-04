abstract class college{
    abstract void exam();
    void results(){
        System.out.println("student is pass");
    }
}
    class Teacher extends college{
        void exam(){
            System.out.println("teacher checks the paper");
        }
    }
        class student {
            public static void main(String[]args)
            {
                Teacher t = new Teacher();
                t.exam();
                t.results();

            }
        }

    




