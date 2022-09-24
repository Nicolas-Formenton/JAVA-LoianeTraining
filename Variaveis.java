public class Variaveis {

    public static void main(String[] args) {
        int idade = 20;
        String nome = "Nicolas";
        String nomeCachorro = "Becky";

        System.out.println("Idade = " + idade);
        System.out.println("Nome = " + nome);
        System.out.println("Nome Cachorro = " + nomeCachorro);

        //Variaveis Inteiras
        byte idade01 = 20;
        short idade02 = 21;
        int idade03 = 22;
        long idade04 = 23l;
        System.out.println(idade01);
        System.out.println(idade02);
        System.out.println(idade03);
        System.out.println(idade04);

        //Variaveis Float
        double valorPassagem = 2.90;
        float valorPassagem1 = 2.90f;
        System.out.println(valorPassagem + " " +  valorPassagem1);

        //Variaveis Char
        char interrogacao = 0x00E1;
        System.out.println(interrogacao);
        
        //Variaveis Boolean
        boolean verdadeiro = true;
        boolean falso = false;
        System.out.println(verdadeiro + " " + falso);
    }
}
