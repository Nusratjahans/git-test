public class Hello {
    public static void main(String[] args) {
        /*System.out.println("Hello!");*/
        
        for (int i=0;i<5;i++){
            System.out.println("PRINT: "+i);
        }
  
        greeting("git");
        sqr(2);
        show(5);
    }

    public static void greeting(String val) {
        System.out.println("Hello "+ val);
        
    }


    public static void sqr(int x) {
        System.out.println("check merge in main: "+ x*x);
        
    }

     public static void show(int x) {
        System.out.println("my name is: xxx, age is:"+x);
        
    }




}