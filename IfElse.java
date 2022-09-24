import java.util.Scanner;

public class IfElse {
    public static void main(String[] args) {
        
        try (Scanner scan = new Scanner(System.in)) {
            System.out.print("Sua idade: ");
            int idade = scan.nextInt();

            if (idade>=18){
                System.out.println("É maior de idade.");
            }
            else{
                System.out.println("Menor de idade.");
            }

            
            System.out.print("Entre com o preço do item em R$: ");
            double valor = scan.nextDouble();

            if(valor <= 10){
                System.out.println("Barato, pode comprar!");
            } 
            else if(valor > 10 && valor < 15){
                System.out.println("Ok, da pra pedir um desconto...");
            }
            else if (valor >= 15 && valor < 17){
                System.out.println("Pesquise mais.");
            }
            else{
                System.out.println("Muito caro");
            }

        }
    }
}
