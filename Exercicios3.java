import java.util.Scanner;

public class Exercicios3 {
    public static void main(String[] args) {
      
        try(Scanner scan = new Scanner(System.in)){

            //Ex. 01
            /* boolean notaValida = false;

            do{
                System.out.print("Entre com uma nota(0-10): ");
                double nota = scan.nextInt();

                if(nota >= 0 && nota <= 10){
                    notaValida = true;
                    System.out.println("Nota: " + nota);
                }
                else{
                    System.out.println("Inválido");
                }
            } while (!notaValida); */
            
            //Ex. 02
            /* Boolean infoValidas = false;

            do{
                System.out.print("Informe o nome de usuário: ");
                String user = scan.next();
                System.out.print("Informe a senha: ");
                String senha = scan.next();

                if(senha.equalsIgnoreCase(user)){
                    System.out.println("Sua senha não pode ser igual ao nome do usuário.");
                }
                else{
                    infoValidas = true;
                }

            }while(Boolean.FALSE.equals(infoValidas)); */

            //Ex. 03
            /* boolean infoValida= false;
            
            do{
                System.out.print("Informe seu nome: ");
                String nome = scan.next();

                if(nome.length() > 3){
                    infoValida = true;
                    System.out.println("Válido.");
                }
                else{
                    System.out.println("Inválido.");
                    System.out.println("");
                }

            }while(!infoValida);

            infoValida = false;
            do{
                System.out.print("Informe sua idade: ");
                int idade = scan.nextInt();

                if(idade > 0 && idade <= 150){
                    infoValida = true;
                    System.out.println("Válido.");
                }
                else{
                    System.out.println("Inválido.");
                    System.out.println("");
                }
            }while(!infoValida);
            
            infoValida = false;
            do{
                System.out.print("Informe seu salário: R$");
                double salario = scan.nextDouble();

                if(salario > 0){
                    infoValida = true;
                    System.out.println("Válido.");
                }
                else{
                    System.out.println("Inválido.");
                    System.out.println("");
                }
            }while(!infoValida);
            
            infoValida = false;
            do{
                System.out.print("Informe seu gênero(M - F): ");
                String sexo = scan.next();

                if(sexo.equalsIgnoreCase("M") || sexo.equalsIgnoreCase("F")){
                    infoValida = true;
                    System.out.println("Válido.");
                }
                else{
                    System.out.println("Inválido.");
                    System.out.println("");
                }
            }while(!infoValida);
            
            infoValida = false;
            do{
                System.out.print("Informe seu Estado Civil: ");
                String estadoCivil = scan.next();

                if(estadoCivil.equalsIgnoreCase("S") || estadoCivil.equalsIgnoreCase("C") || estadoCivil.equalsIgnoreCase("V") || estadoCivil.equalsIgnoreCase("D")){
                    infoValida = true;
                    System.out.println("Válido.");
                }
                else{
                    System.out.println("Inválido.");
                    System.out.println("");
                }
            }while(!infoValida); */

            //Ex. 05
            /* double popX;
            double popY;
            double taxaX;
            double taxaY;
            
            boolean valido = false;
            do{
                System.out.print("Digite a população da cidade X: ");
                popX = scan.nextInt();

                if(popX > 0){
                    valido = true;
                }
                else{
                    System.out.println("Valor tem que ser maior do que 0.");
                }
                
            }while(!valido);

            valido = false;
            do{
                System.out.print("Digite a população da cidade Y: ");
                popY = scan.nextInt();

                if(popY > 0){
                    valido = true;
                }
                else{
                    System.out.println("Valor tem que ser maior do que 0.");
                }

            }while(!valido);
            
            valido = false;
            do{
                System.out.print("Digite a taxa de crescimento de X: ");
                taxaX = scan.nextDouble();

                if(taxaX > 0){
                    valido = true;
                }
                else{
                    System.out.println("Valor da taxa tem que ser maior do que 0.");
                }

            }while(!valido);
            
            valido = false;
            do{
                System.out.print("Digite a taxa de crescimento de X: ");
                taxaY = scan.nextDouble();

                if(taxaY > 0){
                    valido = true;
                }
                else{
                    System.out.println("Valor da taxa tem que ser maior do que 0.");
                }

            }while(!valido);
            
            int count = 0;
            while(popX < popY){
                popX += (popX/100) * taxaX; 
                popY += (popY/100) * taxaY;
                count++;
            }

            System.out.println("População X: " + popX);
            System.out.println("População Y: " + popY);
            System.out.println("Quantidade de anos para ultrapassagem: " + count); */

            //Ex. 04
            /* int popA = 80000;
            int popB = 200000;
            int count = 0;

            while(popA < popB){
                popA += (popA/100) * 3; // popA = popA + (popA/100)*3
                popB += (popB/100) * 1.5;
                count++;
            } */

            /* System.out.println("População X: " + popA);
            System.out.println("População Y: " + popB);
            System.out.println("Quantidade de anos para ultrapassagem: " + count); */


            //Ex. 06
            /* for(int i = 0; i <= 20; i++){
                System.out.print(i + " ");
                // System.out.println(i);
            } */

            //Ex. 07/08
            /* int num;
            int maior = Integer.MIN_VALUE;
            int soma = 0;
            double media;   

            for(int i = 0; i <5; i++){
                System.out.print("Entre com um numero: ");
                num = scan.nextInt();
                
                soma += num;

                if(num > maior){
                    maior = num;
                }

            }

            media = soma/5;
            
            System.out.println("O maior número é: " + maior);
            System.out.println("A soma dos números é: " + soma);
            System.out.println("A média dos números é: " + media); */
            
            //Ex. 09
            /* for(int i = 0; i<=50; i++){
                if(i%2 != 0){
                System.out.print(i);
                System.out.print(" ");
                }
            } */

            //Ex. 10/11
            /* System.out.print("Digite um número inteiro para começar o intervalo: ");
            int num1 = scan.nextInt();
            System.out.print("Digite outro número inteiro para finalizar o intervalo: ");
            int num2 = scan.nextInt();

            int soma = 0;

            do{
                int i = num1++;
                soma += i;
                System.out.print(i);
                System.out.print(" ");
            } while(num1 < num2);

            System.out.println(" ");
            System.out.print("Soma: " + soma);

            //OU (no lugar do do;while)
            /* for(int i = num1; i <= num2; i++){
                soma+=i;
            }
            System.out.println(i); */ 
            

            //Ex. 12
            /* System.out.print("Escreva um número que você quer ver a tabuada(1 a 10): ");
            int num = scan.nextInt();

            boolean valido = false;

            if(num > 0 && num <=10){
                valido = true;
                
                do{
                    System.out.println("A tabuada de " + num + " é: " );
                    for(int tabuada = 0; tabuada <= 10; tabuada++){
                        int result = num * tabuada;
                        System.out.println(num + " * " + tabuada + " = " + result);
                    }
                }while(!valido);
            }
            else{
                valido = false;
                System.out.println("Inválido.");
            } */

            //Ex. 13
            /* System.out.print("Digite um número para a BASE: ");
            int base = scan.nextInt();
            System.out.print("Digite um número para EXPOENTE: ");
            int expoente = scan.nextInt();

            int resultado = base;

            for(int i = 1; i < expoente; i++){
                resultado *= base;
            }
            System.out.println(resultado); */

            //Ex. 14
            /* int i = 0;
            int pares = 0;
            int impares = 0;
            
            System.out.println("Digite 10 numeros inteiros: ");
            
            for(i = 1; i <= 10; i++){
                scan.nextInt();
                
                if(i % 2 == 0){
                    pares++;
                }
                else{
                    impares++;
                }
            }

            System.out.println("Pares: " + pares);
            System.out.println("Ímpares: " + impares); */

            //Ex. 15
            /* System.out.print("Entre com o n-ésimo termo da série de fibonacci: ");
            int n = scan.nextInt();
            //0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55....

            int primeiro = 1;
            int segundo = 1;
            int proximo = 0;

            System.out.println(primeiro);
            System.out.println(segundo);


            for(int i = 3; i <= n; i++){
                proximo = primeiro + segundo;
                primeiro = segundo;
                segundo = proximo;

                System.out.println(proximo);
            } */ 
            

            //Ex. 16
            /* int primeiro = 1;
            int segundo = 1;
            int proximo = 0;

            System.out.println(primeiro);
            System.out.println(segundo);

            while(proximo <=500){
                proximo = primeiro + segundo;
                primeiro = segundo;
                segundo = proximo;

                System.out.println(proximo);
            } */
            
            //Ex. 17
            /* System.out.print("Digite um número para fazer fatorial: ");
            int num = scan.nextInt();

            int fatorial = 1;

            for(int i = num; i > 0; i--){
                fatorial *= i;
                System.out.println(i + " * ");
            }
            System.out.print("Resultado = " + fatorial); */
            
            //Ex. 21
            System.out.print("Digite um número: ");
            int num = scan.nextInt();
            boolean primo = true;

            for(int i = 2; i <= num; i++){
                if(num % i == 0){
                    System.out.println("Não é primo! - Divisível por " + i);
                    primo = false;
                }
            }
            if(primo){
                System.out.println("É primo!");
            }

            //Ex. 24
            
        }
    }
}
