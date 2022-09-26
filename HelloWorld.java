public class HelloWorld
{

    int a = 5;
    int b = 2;
    int c = 1;
    int d = -8;
    
    public void run() {
        if (a==5){
            System.out.println("SUCCESS");
        } else {
            System.out.println("FAILURE");
        }
        System.out.println("Hello World!");
        
    }
    
    
    public static void main(String[] args)
    {        
        HelloWorld hw = new HelloWorld();
        hw.run();
    }
}


