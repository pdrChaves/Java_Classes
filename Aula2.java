public class App {
    public static void main(String[] args) throws Exception {
        String nome = "Fulano";
        int dia = 25;
        
        System.out.printf("Olá " +nome+ ", hoje é dia " +dia+"!");
        System.out.printf("\n====================================================\n");
        
        //variavel ponto flutuante
        //0.12345678910 x 10^4
        // double armazena o dobro de bits na memoria (consequentemnte o dobro de bites)
        // float renda;     erro por numero ser muito grande
        // double precisa ser inicializado sendo declarado, nem que seja atribuindo a 0

        double renda = 0;
        System.out.println("valor inicial da renda: " +renda);
        renda= 123.456789;
        System.out.println("Agora, a variavel vale " +renda);
        
        //

    }
}
