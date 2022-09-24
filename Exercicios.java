import java.util.Scanner;

public class Exercicios {
    
    public static void main(String[] args){

        try (Scanner scan = new Scanner(System.in)) {
        

            //Ex. 03
            /* System.out.println("Digite aqui um número: ");
            int primeiroNumero = scan.nextInt();
            System.out.println("Digite aqui outro número: ");
            int segundoNumero = scan.nextInt();

            System.out.println("A soma desses dois números é: " + (primeiroNumero + segundoNumero)); */


            //Ex. 04
            /* System.out.print("Sua nota do 1o Bimestre: ");
            int nota1 = scan.nextInt();
            System.out.print("Sua nota do 2o Bimestre: ");
            int nota2 = scan.nextInt();
            System.out.print("Sua nota do 3o Bimestre: ");
            int nota3 = scan.nextInt();
            System.out.print("Sua nota do 4o Bimestre: ");
            int nota4 = scan.nextInt();

            System.out.println("Sua média final foi de: " + ((nota1 + nota2 + nota3 + nota4) / 4)); */
            

            //Ex. 05
            /* System.out.print("Sua altura em metros é: ");
            float altura = scan.nextFloat();

            System.out.println("Sua altura em centímetros é: " + (altura * 100) + "cm"); */


            //Ex.06
            /* System.out.print("Escreva o tamanho do raio de um círculo em metros: ");
            double raio = scan.nextDouble();
            
            System.out.println("A área desse círculo tem aproximadamente: " + (3.1415 * (raio*raio)) + " metros quadrados"); */
            

            //Ex. 07
            /* System.out.print("Escreva o tamanho da base e da altura de um quadrado em metros: ");
            double alturaQuadrado = scan.nextDouble();
            double baseQuadrado = scan.nextDouble();

            double area = alturaQuadrado * baseQuadrado;
            System.out.println("Sua área é de: " + (alturaQuadrado * baseQuadrado) + " metros quadrados");
            System.out.println("O dobro de sua área é: " + (area * 2) + " metros quadrados"); */


            //Ex. 08
            /* System.out.println("Quanto você ganha por hora trabalhada?");
            double salarioHora = scan.nextDouble();
            System.out.println("Quanto horas você trabalha por mês?");
            double horas = scan.nextDouble();

            System.out.println("Seu salário é: R$" + (salarioHora * horas)); */
            

            //Ex .09
            /* System.out.print("Informe a temperatura atual em graus Fahrenheit: ");
            int temperatura = scan.nextInt();
            System.out.println("A temperatura em graus Celsius é: " + (5 * (temperatura -32)/9)); */


            //Ex. 11
            /* System.out.println("Informe dois números inteiros e um número real: ");
            int n1 = scan.nextInt();
            int n2 = scan.nextInt();
            double n3 = scan.nextDouble();
            System.out.println("O produto do dobro do primeiro com metade do segundo é: " + ((n1*2)*(n2/2)));
            System.out.println("A soma do triplo do primeiro com o terceiro é: " + ((n1*3)+n3));
            System.out.println("O terceiro ao cubo é: " + (n3*n3*n3)); */


            //Ex. 12
            /* System.out.print("Informe sua altura: ");
            double altura = scan.nextDouble();
            System.out.println("Seu peso ideal seria em média: " + ((72.7*altura) - 58) + "kg"); */


            //Ex. 13
            /* System.out.print("Quanto você ganha por hora trabalhada? ");
            double salarioHora = scan.nextDouble();
            System.out.print("Quanto horas você trabalha por mês? ");
            double horas = scan.nextDouble();

            double salarioBruto = (salarioHora * horas);
            double salarioINSS = (salarioBruto * 0.08);
            double salarioSind = (salarioBruto * 0.05);
            double salarioLiq = (salarioBruto - salarioINSS - salarioSind);

            System.out.println("Seu salário bruto é: R$" + (salarioBruto));
            System.out.println("Você pagou ao INSS 8%, em R$" + salarioINSS);
            System.out.println("Ao sindicato, 5%, em R$" + salarioSind);

            System.out.println("Seu salário líquido final é de: R$" + salarioLiq); */


            //Ex. 14
            System.out.println("Informe o tamanho do arquivo em Megabytes: ");
            double arqSize = scan.nextDouble();
            System.out.println("Informe a velocidade de download em Mbps: ");
            double velDown = scan.nextDouble();

            System.out.println("O tempo aproximado de download é: " + (arqSize/velDown) + " minutos");
        
        }

    }

}
