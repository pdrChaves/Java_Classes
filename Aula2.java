
import java.util.Locale;

public class App {
    public static void main(String[] args) throws Exception {
        String nome = "Fulano";
        int dia = 25;
        
        System.out.printf("Olá " +nome+ ", hoje é dia " +dia+"!");
        System.out.printf("\n====================================================\n");
        
        //variavel ponto flutuante
        //0.12345678910 x 10^4
        
        // double armazena o dobro de bits na memoria (consequentemnte o dobro de bites)
        // float = 32 bits, double = 64 bits
        // float renda;     erro por numero ser muito grande
        // double precisa ser inicializado sendo declarado, nem que seja atribuindo a 0

        double renda = 0;
        System.out.println("valor inicial da renda: " +renda);
        renda= 1235.6789;

        System.out.println("Agora, a variavel vale " +renda);
        System.out.printf("Agora, a variavel vale %.2f %n",renda);
        System.out.printf("Agora, a variavel vale %.4f %n",renda);
        System.out.printf("Agora, a variavel vale %.6f %n",renda);

         // agora o formato padrao foi configurado para Estados Unidos
        Locale.setDefault(Locale.US);
        System.out.println("Formato americano:");
        System.out.printf("Agora, a variavel vale %.2f %n",renda);
        System.out.printf("Agora, a variavel vale %.4f %n",renda);
        System.out.printf("Agora, a variavel vale %.6f %n",renda);

    }
}
