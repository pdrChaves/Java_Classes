public class App { 
    public static void main(String args []){
        String mensagem = "Hello, world!!";
		String nome = args[0];

        System.out.println(mensagem);
        System.out.println("Hello, World!");
        
        
        int numero = 1234;
        System.out.println(numero);
        System.out.println(mensagem + " Bom dia!!");
        System.out.println("Bom dia");
        
        
        mensagem = mensagem + 1234;         //funciona como conversão para string
        mensagem = mensagem + "1234";       //funciona como string nativa
        int idade = 20 
        System.out.format("A idade de Fulano é %i", idade);     //println nao funciona com int
    }
}
