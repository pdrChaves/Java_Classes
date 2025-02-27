public class App {
    public static void main(String[] args)
    {
        double x,y;                 //beecrowd google, entrar como aluno.
        x = 30./7;
        y = 30/7;
        //Se feito com numeros inteiros, o resultado sempre sera inteiro.
        //se feiot com numeros flutuantes, o resultado sera com numeros flutuantes.
        System.out.println("O resultado com numeros flutuantes é: " +x);
        System.out.println("O resultado com numeros inteiros é: " +y);
        
        double z;
        int a = 30, b= 7;
        z= (double)a/b;             //(double) esta tornando a de int para double, somente o a
        System.out.println("O resultado de double z: " +z);
        System.out.println("a raiz quadrada de " +x+ "é " +Math.sqrt(x));
        System.out.printf("a raiz quadrada de %d é %.2f",x,Math.sqrt(x));
        
        System.out.println(Math.sqrt(x));


        
    }
}
