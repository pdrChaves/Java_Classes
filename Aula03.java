import java.util.Scanner;

public class App {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int x, y;
        x = sc.nextInt();                    //pegará sempre o proximo inteiro 
        y = sc.nextInt();
        System.out.println("x = "+x);
        System.out.println("y = "+y);
        
        String s;
        s = sc.next ();                      //pegará a proxima entrada que encaixe como String
        System.out.println("s = "+s);   

    }
}
