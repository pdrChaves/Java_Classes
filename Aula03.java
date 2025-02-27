import java.util.Scanner;

public class App {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int x, y;                             //shift + alt + seta, duplica linha
        x = sc.nextInt();                    //pegará sempre o proximo inteiro 
        y = sc.nextInt();
        System.out.println("x = "+x);
        System.out.println("y = "+y);
        
        String s,t;
        s = sc.next ();                      //pegará a proxima entrada que encaixe como String
        t = sc.next ();                      //scanner entende espaço como ponto final
        System.out.println("s = "+s);   
        System.out.println("t = "+t); 

        String nome;

        System.out.println("Entre com o seu nome completo");        
        nome = sc.next();
        
        System.out.println();
        System.out.println("Bom dia, " +nome+ "!");     //aqui nao vai ter o sobrenome porque nao tem um proximo next para os demais sobrenomes
        
        char l;
        l = sc.next().charAt(0);            //coleta somente um carater, se for uma palavra ou algo maior, so pega a primeira letra

    }
}
