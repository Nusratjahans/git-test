public class Hello {
    public static void main(String[] args) {
        /*System.out.println("Hello!");*/
        
        for (int i=0;i<5;i++){
            System.out.println("PRINT: "+i);
        }
  
        greeting("git");
        greetingbranchA("git");
    }

    public static void greeting(String val) {
        System.out.println("Hello "+ val);
        
    }

    public static void greetingbranchA(String val) {
        System.out.println("Hello from branchA "+ val);
        
    }
}