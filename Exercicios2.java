import java.util.Scanner;

public class Exercicios2 {
    public static void main(String[] args) {

        try (Scanner scan = new Scanner(System.in)) {
            //Ex. 01
            /* System.out.print("Entre com um valor: ");
            double valor1 = scan.nextDouble();
            System.out.print("Entre com outro valor: ");
            double valor2 = scan.nextDouble();

            if(valor1 > valor2){
                System.out.println("O maior valor é: " + valor1);
            }
            else if(valor2 > valor1){
                System.out.println("O maior valor é: " + valor2);
            }
            else if(valor1 == valor2){
                System.out.println("São iguais!");
            }
            else{
                System.out.println("Entrada inválida.");
            } */

            //Ex. 02
            /* if(valor1 > 0){
                System.out.println("Valor 1 é positivo!");
            }
            else if(valor1 < 0){
                System.out.println("Valor 1 é negativo");
            }
            
            if(valor2 > 0){
                System.out.println("Valor 2 é positivo");
            }
            else if(valor2 < 0){
                System.out.println("Valor 2 é negativo");
            } */

            //Ex. 03
            /* System.out.print("Entre com seu gênero(M ou F): ");
            String sexo = scan.nextLine();
            
            if("M".equals(sexo)){
                System.out.println("M - Masculino");
            }
            else if("F".equals(sexo)){
                System.out.println("F - Feminino");
            }
            else{
                System.out.println("Entrada inválida");
            } */

            //Ex. 04
            /* System.out.print("Digite uma letra e direi se é consoante ou vogal: ");
            String letra = scan.nextLine();

            switch(letra){
                case "A":
                case "E":
                case "I":
                case "O":
                case "U":System.out.println("Vogal."); break;

                case "B":
                case "C":
                case "D":
                case "F":
                case "G":
                case "H":
                case "J":
                case "L":
                case "M":
                case "N":
                case "P":
                case "Q":
                case "R":
                case "S":
                case "T":
                case "V":
                case "X":
                case "Z": System.out.println("Consoante."); break;

                default: System.out.println("Comum.");

            } */

            //Ex. 05
            /* System.out.print("Primeira nota: ");
            double nota1 = scan.nextDouble();
            System.out.print("Segunda nota: ");
            double nota2 = scan.nextDouble();

            double media = (nota1+nota2)/2;

            if(media >= 70 && media <= 99){
                System.out.println("Aprovado, média final: " + media);
            }
            else if(media < 70){
                System.out.println("Reprovado, média final: " + media);
            }
            else if(media == 100){
                System.out.println("Aprovado com distinção!");
            }
            else{
                System.out.println("Inválido.");
            } */

            //Ex. 06
            /* System.out.print("Digite um número: ");
            double num1 = scan.nextDouble();
            System.out.print("Digite outro número: ");
            double num2 = scan.nextDouble();
            System.out.print("Digite mais um número: ");
            double num3 = scan.nextDouble();

            if(num1>num2 && num1>num3){
                System.out.println("O maior número é: " + num1);
            }
            else if(num2 > num1 && num2 > num3){
                System.out.println("O maior número é: " + num2);
            }
            else if(num3 > num1 && num3 > num2){
                System.out.println("O maior número é: " + num3);
            }
            else if(num1 == num2 && num1 == num3){
                System.out.println("São iguais!");
            }
            else{
                System.out.println("Inválido");
            } */


            //Ex. 07
            /* if(num1<num2 && num1<num3){
                System.out.println("O menor número é: " + num1);
            }
            else if(num2 < num1 && num2 < num3){
                System.out.println("O menor número é: " + num2);
            }
            else if(num3 < num1 && num3 < num2){
                System.out.println("O menor número é: " + num3);
            } */

            //Ex. 08
            /* System.out.println("Informe o preço de X produto em 3 lugares diferentes: ");
            double p1 = scan.nextDouble();
            double p2 = scan.nextDouble();
            double p3 = scan.nextDouble();

            if(p1 < p2 && p1 < p3){
                System.out.println("O primeiro lugar é o mais barato!");
            }
            else if(p2<p1 && p2<p3){
                System.out.println("O segundo lugar é o mais barato!");
            }
            else if(p3<p1 && p3<p2){
                System.out.println("O terceiro lugar é o mais barato!");
            }
            else if(p1 == p2 && p1 == p3){
                System.out.println("Preços iguais, fica a seu critério..");
            } */

            //Ex. 09
            /* System.out.print("Informe 3 números: ");
            double num1 = scan.nextDouble();
            double num2 = scan.nextDouble();
            double num3 = scan.nextDouble();
            
            if(num1 < num2 && num1 < num3 && num2 < num3){
                System.out.println(num3 +" "+ num2 +" "+ num1);
            }
            else if(num3>num1 && num1>num2){
                System.out.println(num3 +" "+ num1 +" "+ num2);
            }
            else if(num2>num1 && num1>num3){
                System.out.println(num2 +" "+ num1 +" "+ num3);
            }
            else if(num2>num1 && num3>num1){
                System.out.println(num2 +" "+ num3 +" "+ num1);
            }
            else if(num1>num2 && num2>num3){
                System.out.println(num1 +" "+ num2 +" "+ num3);
            }
            else if(num1>num2 && num3>num2){
                System.out.println(num1 +" "+ num3 +" "+ num2);
            }
            else if(num1 == num2 && num1 == num3){
                System.out.println(num1 +" "+ num2 +" "+ num3);
            } */

            //Ex. 10
            /* System.out.print("Digite o período que você estuda(M - V - N): ");
            String periodo = scan.nextLine();
            
            if("M".equals(periodo)){
                System.out.println("Bom Dia!");
            }
            else if("V".equals(periodo)){
                System.out.println("Boa Tarde!");
            }
            else if("N".equals(periodo)){
                System.out.println("Boa Noite!");
            }
            else{
                System.out.println("Entrada Inválida!");
            } */

            //Ex. 11
            /* System.out.print("Digite seu salário em R$: ");
            double salarioInicial = scan.nextDouble();

            String frase = "O valor do seu aumento foi de R$";

            System.out.println("");
            System.out.println("Seu salário antes do reajuste era R$" + salarioInicial);

            if(salarioInicial <= 280.00){
                double aumento20 = salarioInicial*0.2; 
                double salario20 = salarioInicial + (salarioInicial*0.2);
                System.out.println("Seu reajuste é de 20%, totalizando R$" + salario20);
                System.out.println(frase + aumento20);
            }
            else if(salarioInicial > 280 && salarioInicial <= 700){
                double aumento15 = salarioInicial*0.15;
                double salario15 = salarioInicial + (salarioInicial*0.15);
                System.out.println("Seu reajuste é de 15%, totalizando R$" + salario15);
                System.out.println(frase + aumento15);
            }
            else if(salarioInicial > 700 && salarioInicial <= 1500){
                double aumento10 = salarioInicial*0.1;
                double salario10 = salarioInicial + (salarioInicial*0.10);
                System.out.println("Seu reajuste é de 10%, totalizando R$" + salario10);
                System.out.println(frase + aumento10);
            }
            else if(salarioInicial > 1500){
                double aumento5 = salarioInicial*0.05;
                double salario5 = salarioInicial + (salarioInicial*0.05);
                System.out.println("Seu reajuste é de 5%, totalizando R$" + salario5);
                System.out.println(frase + aumento5);
            } */

            //Ex. 12
            //Pedir ao usuário valor da sua hora e quantidade de horas trabalhadas no mês
            /* System.out.print("Quanto você ganha por hora? ");
            double valorHora = scan.nextDouble();
            System.out.print("Quantas horas você trabalha por mês? ");
            double horasMes = scan.nextDouble();

            double salarioBruto = valorHora * horasMes;
            String fraseSalBruto = "Salário Bruto: R$" + salarioBruto;
            double aumentoFGTS = (salarioBruto*0.11);
            String fraseFGTS = "FGTS(11%): R$" + aumentoFGTS;

            if(salarioBruto <= 900){
                System.out.println(" ");
                System.out.println(fraseFGTS);
                System.out.println("Isento de descontos.");

                double salarioLiq = (salarioBruto);
                System.out.println("Salário Líquido: R$" + salarioLiq);
            }

            else if(salarioBruto <= 1500){
                double salarioIR = (salarioBruto*0.05);
                double totalDescontos = salarioIR;

                System.out.println(" ");
                System.out.println(fraseSalBruto);
                System.out.println(fraseFGTS);
                System.out.println("Total de desconto: R$" + totalDescontos);
                
                double salarioLiq = (salarioBruto - totalDescontos);
                System.out.println("Salário Líquido: R$" + salarioLiq);
            }

            else if(salarioBruto <= 2500){
                double salarioIR = (salarioBruto*0.10);
                double salarioINSS = (salarioBruto*0.1);
                double totalDescontos = salarioINSS + salarioIR;
                
                System.out.println(" ");
                System.out.println(fraseSalBruto);
                System.out.println(fraseFGTS);
                System.out.println("Total de desconto: R$" + totalDescontos);
                
                double salarioLiq = (salarioBruto - totalDescontos);
                System.out.println("Salário Líquido: R$" + salarioLiq);
            }

            else if(salarioBruto > 2500){
                double salarioIR = (salarioBruto*0.2);
                double salarioINSS = (salarioBruto*0.1);
                double totalDescontos = salarioINSS + salarioIR;
                
                System.out.println(" ");
                System.out.println(fraseSalBruto);
                System.out.println(fraseFGTS);
                System.out.println("Total de desconto: R$" + totalDescontos);

                double salarioLiq = (salarioBruto - totalDescontos);
                System.out.println("Salário Líquido: R$" + salarioLiq);
            } */

            //Ex. 13
            /* System.out.print("Entre com um dia da semana(1-7): ");
            int dia = scan.nextInt();

            switch(dia){
                case 1: System.out.println("Domingo"); break;
                case 2: System.out.println("Segunda"); break;
                case 3: System.out.println("Terça"); break;
                case 4: System.out.println("Quarta"); break;
                case 5: System.out.println("Quinta"); break;
                case 6: System.out.println("Sexta"); break;
                case 7: System.out.println("Sabado"); break;
                default: System.out.println("Inválido."); break;
            } */

            //Ex. 14
            /* System.out.print("Digite sua primeira nota(0-10): ");
            double nota1 = scan.nextDouble();
            System.out.print("Digite sua segunda nota(0-10): ");
            double nota2 = scan.nextDouble();

            double media = (nota1 + nota2)/2;
            String notaFinal = "Média final: " + media;

            if(media >= 9){
                System.out.println("Conceito: A");
                System.out.println(notaFinal);
            }
            
            else if(media >= 7.5 && media < 9){
                System.out.println("Conceito: B");
                System.out.println(notaFinal);
            }
            
            else if(media >= 6 && media < 7.5){
                System.out.println("Conceito: C");
                System.out.println(notaFinal);
            }
            
            else if(media >= 4 && media < 6){
                System.out.println("Conceito: D");
                System.out.println(notaFinal);
            }
            
            else if(media < 4){
                System.out.println("Conceito: E");
                System.out.println(notaFinal);
            }

            if(media >= 6){
                System.out.println("Aprovado");
            }
            else if(media < 6){
                System.out.println("Reprovado");
            } */
            
            //Ex. 15
            /* System.out.println("Digite 3 valores e direi se podem formar um triângulo...");
            double lado1 = scan.nextDouble();
            double lado2 = scan.nextDouble();
            double lado3 = scan.nextDouble();
            
            if((lado1 + lado2) > lado3 && (lado2 + lado3) > lado1 && (lado1+lado3) > lado2 ){
                System.out.println("Pode formar um triângulo!");
            }
            else{
                System.out.println("Não é possível formar um triângulo.");
            }

            if(lado1 == lado2 && lado1 == lado3){
                System.out.println("Triângulo Equilátero.");
            }
            else if(lado1 == lado2 || lado2 == lado3 || lado1 == lado3){
                System.out.println("Triângulo Isósceles.");
            }
            else if(lado1 != lado2 && lado1 != lado3 && lado2 != lado3){
                System.out.println("Triângulo Escaleno.");
            } */

            //Ex. 16
            /* System.out.print("Digite três valores: ");
            int a = scan.nextInt();
            int b = scan.nextInt();
            int c = scan.nextInt();

            double delta = (b*b)-4*a*c;

            if(delta < 0){
                System.out.println("Não possuí raízes.");
            }
            else if(delta == 0){
                double x = ((-b) / (2*a));
                System.out.println("Apenas uma raiz: " + x);
            }
            else if(delta > 0){
                double raiz = Math.sqrt(delta);
                double x1 = (((-b) + raiz) / (2*a));
                double x2 = (((-b) - raiz) / (2*a));
                System.out.println("Possuí duas raizes, sendo elas, x1: " + x1 + "e x2: " + x2);
            } */

            //Ex. 17
            /* System.out.println("Entre com um ano e direi se é bissexto ou não...");
            int ano = scan.nextInt();
            boolean bissexto = false;
            
            if((ano % 4 == 0 && ano % 100 != 0) || ano % 400 == 0){
                bissexto = true;
                System.out.println("É bissexto. " + bissexto);
            }
            else{
                System.out.println("Não é bissexto. " + bissexto);
            } */    
            
            //Ex. 18
            /* System.out.println("Entre com um número e direi se é par ou ímpar.");
            int num = scan.nextInt();

            if(num % 2 == 0){
                System.out.println("Par.");
            }
            else{
                System.out.println("Ímpar.");
            } */

            //Ex. 19
            /* System.out.print("Digite dois números: ");
            double num1 = scan.nextDouble();
            double num2 = scan.nextDouble();

            System.out.print("Digite qual operação deseja realizar(+, -, /, *): ");
            String operacao = scan.next();

            switch(operacao){
                case "+": double sum = (num1+num2);
                System.out.println("O resultado da soma é: " + sum);

                if(sum % 2 == 0){
                    System.out.println("O resultado é par");
                }
                else{
                    System.out.println("Ímpar");
                }

                if(sum >= 0){
                    System.out.println("Positivo");
                }
                else{
                    System.out.println("Negativo");
                }

                break;

                case "-": double sub = (num1-num2);
                System.out.println("O resultado da soma é: " + sub);

                if(sub % 2 == 0){
                    System.out.println("O resultado é par");
                }
                else{
                    System.out.println("Ímpar");
                }

                if(sub >= 0){
                    System.out.println("Positivo");
                }
                else{
                    System.out.println("Negativo");
                }

                break;
                
                case "/": double div = (num1/num2);
                System.out.println("O resultado da divisão é: " + div);

                if(div % 2 == 0){
                    System.out.println("O resultado é par");
                }
                else{
                    System.out.println("Ímpar");
                }

                if(div >= 0){
                    System.out.println("Positivo");
                }
                else{
                    System.out.println("Negativo");
                }

                break;
                
                case "*": double mult = (num1*num2);
                System.out.println("O resultado da multiplicação é: " + mult);

                if(mult % 2 == 0){
                    System.out.println("O resultado é par");
                }
                else{
                    System.out.println("Ímpar");
                }

                if(mult >= 0){
                    System.out.println("Positivo");
                }
                else{
                    System.out.println("Negativo");
                }

                break;
                
                default: System.out.println("Entrada Inválida.");
            } */

            //Ex. 20
            /* System.out.println("Responda as seguintes questões com SIM ou NÃO.");
            System.out.println("");

            System.out.println("Telefonou para a vítima? ");
            String resposta1 = scan.next();

            System.out.println("Esteve no local do crime? ");
            String resposta2 = scan.next();

            System.out.println("Mora perto da vítima? ");
            String resposta3 = scan.next();

            System.out.println("Devia para a vítima? ");
            String resposta4 = scan.next();

            System.out.println("Já trabalhou com a vítima? ");
            String resposta5 = scan.next();


            int cont = 0;
            if(resposta1.equalsIgnoreCase("SIM")){
                cont++;
            }
            if(resposta2.equalsIgnoreCase("SIM")){
                cont++;
            }
            if(resposta3.equalsIgnoreCase("SIM")){
                cont++;
            }
            if(resposta4.equalsIgnoreCase("SIM")){
                cont++;
            }
            if(resposta5.equalsIgnoreCase("SIM")){
                cont++;
            }

            System.out.println("");

            if(cont < 2){
                System.out.println("Inocente");
            }
            else if(cont == 2){
                System.out.println("Suspeita.");
            }
            else if(cont >= 3 && cont <=4){
                System.out.println("Cúmplice.");
            }
            else if(cont == 5){
                System.out.println("Assassino(a).");
            } */

            //Ex. 21
            /* System.out.print("Escolha o tipo de combustível que quer abastecer(A-Alcool; G-Gasolina): ");
            String comb = scan.next();
            System.out.println("Quantos litros deseja abastecer? ");
            double litros = scan.nextDouble();

            if(comb.equalsIgnoreCase("A")){
                System.out.println("O valor do álcool está R$1,90/L.");
                double valor = 1.90;

                if(litros <= 20){
                    double qtd = litros*valor;
                    double desconto = qtd*0.03;
                    System.out.println("Seu desconto é de 3% por litro, totalizando R$" + desconto + " de desconto.");
                    double totalPagar = qtd - desconto;
                    System.out.println("Valor a ser pago: R$" + totalPagar);
                }
                else if(litros > 20){
                    double qtd = litros*valor;
                    double desconto = qtd*0.03;
                    System.out.println("Seu desconto é de 5% por litro, totalizando R$" + desconto + " de desconto.");
                    double totalPagar = qtd - desconto;
                    System.out.println("Valor a ser pago: R$" + totalPagar);
                }
            }

            else if(comb.equalsIgnoreCase("G")){
                System.out.println("O valor da gasolina está R$2,50/L.");
                double valor = 2.50;

                if(litros <= 20){
                    double qtd = litros*valor;
                    double desconto = qtd*0.04;
                    System.out.println("Seu desconto é de 4% por litro, totalizando R$" + desconto + " de desconto.");
                    double totalPagar = qtd - desconto;
                    System.out.println("Valor a ser pago: R$" + totalPagar);
                }
                else if(litros > 20){
                    double qtd = litros*valor;
                    double desconto = qtd*0.06;
                    System.out.println("Seu desconto é de 6% por litro, totalizando R$" + desconto + " de desconto.");
                    double totalPagar = qtd - desconto;
                    System.out.println("Valor a ser pago: R$" + totalPagar);
                }

            } */

            //Ex. 22
            /* System.out.print("Quantos kg de morango irá comprar? ");
            double kgMorango = scan.nextDouble();
            System.out.print("Quantos kg de maçã irá comprar? ");
            double kgMaca = scan.nextDouble();

            double kgTotal = kgMorango + kgMaca;

            if(kgTotal <= 5){
                double precoMorango = 2.50;
                double precoMaca = 1.80;

                double precoX = precoMorango*kgMorango;
                double precoY = precoMaca*kgMaca;
                double precoTotal = precoX + precoY;

                System.out.println("O valor total ficou em: R$" + precoTotal);
                System.out.println("Sendo o valor do morango: R$" + precoX);
                System.out.println("Sendo o valor da maçã: R$" + precoY);
            }
            else if(kgTotal > 5){
                double precoMorango = 2.20;
                double precoMaca = 1.50;

                double precoX = precoMorango*kgMorango;
                double precoY = precoMaca*kgMaca;
                double precoTotal = precoX + precoY;

                System.out.println("O valor total ficou em: R$" + precoTotal);
                System.out.println("Sendo o valor do morango: R$" + precoX);
                System.out.println("Sendo o valor da maçã: R$" + precoY);

                if(precoTotal > 25 || kgTotal > 8){
                    double desconto = precoTotal * 0.1;
                    double precoFinal = precoTotal - desconto; 

                    System.out.println("Com desconto de 10%, o valor total ficou em: R$" + precoFinal);
                }
            } */

            //Ex. 23
            System.out.print("Qual o tipo da carne pretendida(File Duplo, Alcatra, Picanha)? ");
            String nomeCarne = scan.nextLine();
            System.out.print("Qual a quantidade desejada(em kg)? ");
            double kgCarne = scan.nextDouble();

            if(nomeCarne.equalsIgnoreCase("File Duplo")){
                if(kgCarne <= 5){
                    double precoFile = 4.9;
                    double precoTotal = precoFile * kgCarne;

                    System.out.println("Carne selecionada: " + nomeCarne);
                    System.out.println("Quantidade desejada: " + kgCarne + "kg.");

                    System.out.println("O valor ficará em: R$" + precoTotal);
                    
                    System.out.println("");
                    
                    System.out.print("Deseja pagar no cartão(Desconto de 5%)? ");
                    String cartao = scan.next();

                    if(cartao.equalsIgnoreCase("Sim")){
                        double desconto = precoTotal * 0.05; 
                        precoTotal = precoTotal - desconto;
                        System.out.println("O valor do desconto é de: R$" + desconto);
                        System.out.println("O preço total com desconto é: R$" + precoTotal);
                    }
                    else if(cartao.equalsIgnoreCase("Nao")){
                        System.out.println("O valor final é de: R$" + precoTotal);
                    }
                }
                else if(kgCarne > 5){
                    double precoFile = 5.8;

                    double precoTotal = precoFile * kgCarne;

                    System.out.println("O valor ficará em: R$" + precoTotal);
                    System.out.println("");
                    
                    System.out.print("Deseja pagar no cartão(Desconto de 5%)? ");
                    String cartao = scan.next();

                    if(cartao.equalsIgnoreCase("Sim")){
                        double desconto = precoTotal * 0.05; 
                        precoTotal = precoTotal - desconto;
                        System.out.println("O valor do desconto é de: R$" + desconto);
                        System.out.println("O preço total com desconto é: R$" + precoTotal);
                    }
                    else if(cartao.equalsIgnoreCase("Nao")){
                        System.out.println("O valor final é de: R$" + precoTotal);
                    }
                }
            }
            if(nomeCarne.equalsIgnoreCase("Alcatra")){
                if(kgCarne <= 5){
                    double precoAlcatra = 5.9;
                    double precoTotal = precoAlcatra * kgCarne;

                    System.out.println("Carne selecionada: " + nomeCarne);
                    System.out.println("Quantidade desejada: " + kgCarne + "kg.");

                    System.out.println("O valor ficará em: R$" + precoTotal);
                    
                    System.out.println("");
                    
                    System.out.print("Deseja pagar no cartão(Desconto de 5%)? ");
                    String cartao = scan.next();

                    if(cartao.equalsIgnoreCase("Sim")){
                        double desconto = precoTotal * 0.05; 
                        precoTotal = precoTotal - desconto;
                        System.out.println("O valor do desconto é de: R$" + desconto);
                        System.out.println("O preço total com desconto é: R$" + precoTotal);
                    }
                    else if(cartao.equalsIgnoreCase("Nao")){
                        System.out.println("O valor final é de: R$" + precoTotal);
                    }
                }
                else if(kgCarne > 5){
                    double precoAlcatra = 6.8;

                    double precoTotal = precoAlcatra * kgCarne;

                    System.out.println("O valor ficará em: R$" + precoTotal);
                    System.out.println("");
                    
                    System.out.print("Deseja pagar no cartão(Desconto de 5%)? ");
                    String cartao = scan.next();

                    if(cartao.equalsIgnoreCase("Sim")){
                        double desconto = precoTotal * 0.05; 
                        precoTotal = precoTotal - desconto;
                        System.out.println("O valor do desconto é de: R$" + desconto);
                        System.out.println("O preço total com desconto é: R$" + precoTotal);
                    }
                    else if(cartao.equalsIgnoreCase("Nao")){
                        System.out.println("O valor final é de: R$" + precoTotal);
                    }
                }
            }
            if(nomeCarne.equalsIgnoreCase("Picanha")){
                if(kgCarne <= 5){
                    double precoPicanha = 6.9;
                    double precoTotal = precoPicanha * kgCarne;

                    System.out.println("Carne selecionada: " + nomeCarne);
                    System.out.println("Quantidade desejada: " + kgCarne + "kg.");
                    
                    System.out.println("O valor ficará em: R$" + precoTotal);
                    
                    System.out.println("");
                    
                    System.out.print("Deseja pagar no cartão(Desconto de 5%)? ");
                    String cartao = scan.next();

                    if(cartao.equalsIgnoreCase("Sim")){
                        double desconto = precoTotal * 0.05; 
                        precoTotal = precoTotal - desconto;
                        System.out.println("O valor do desconto é de: R$" + desconto);
                        System.out.println("O preço total com desconto é: R$" + precoTotal);
                    }
                    else if(cartao.equalsIgnoreCase("Nao")){
                        System.out.println("O valor final é de: R$" + precoTotal);
                    }
                }
                else if(kgCarne > 5){
                    double precoPicanha = 7.8;

                    double precoTotal = precoPicanha * kgCarne;

                    System.out.println("O valor ficará em: R$" + precoTotal);
                    System.out.println("");
                    
                    System.out.print("Deseja pagar no cartão(Desconto de 5%)? ");
                    String cartao = scan.next();

                    if(cartao.equalsIgnoreCase("Sim")){
                        double desconto = precoTotal * 0.05; 
                        precoTotal = precoTotal - desconto;
                        System.out.println("O valor do desconto é de: R$" + desconto);
                        System.out.println("O preço total com desconto é: R$" + precoTotal);
                    }
                    else if(cartao.equalsIgnoreCase("Nao")){
                        System.out.println("O valor final é de: R$" + precoTotal);
                    }
                }
            }
        }
    }
}