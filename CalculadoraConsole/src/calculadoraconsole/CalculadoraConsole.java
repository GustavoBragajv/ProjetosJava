package calculadoraconsole;

import java.util.Scanner;


public class CalculadoraConsole {


    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Calculadora Console");
        System.out.println("");
        int opcao = 0;
        System.out.print("Digite o primeiro valor: ");
        int valor1 = input.nextInt();
        System.out.print("Digite o segundo valor: ");
        int valor2 = input.nextInt();
        while (opcao != 6) {
            mostarMenuOpcao();
            System.out.print("Opção: ");
            opcao = input.nextInt();
            switch (opcao) {
                case 1:
                    somarValores(valor1, valor2);
                    break;
                case 2:
                    subtrairValores(valor1, valor2);
                    break;
                case 3:
                    dividirValores(valor1, valor2);
                    break;
                case 4:
                    muliplicarValores(valor1, valor2);
                    break;
                case 5:
                    raizQuadrada(valor1, valor2);
                    break;
                default:
                    throw new AssertionError();
            }
            String resposta = "";
            System.out.print("Quer continuar? [S/N]: ");
            resposta = input.next();
            if(resposta.equals("N") || resposta.equals("n")) {
                System.out.println("Encerrando o programa...");
                break;
            } else {
                System.out.print("Digite o primeiro valor: ");
                valor1 = input.nextInt();
                System.out.print("Digite o segundo valor: ");
                valor2 = input.nextInt();
            }
        }

    }
    
    public static void mostarMenuOpcao() {
        System.out.println("============Menu============");
        System.out.println("1 - Somar\n"
                + "2 - Subtrarir\n"
                + "3 - Dividir\n"
                + "4 - Multiplicar\n"
                + "5 - Raiz Quadrada");
        System.out.println("=============================");
    }
        
    
    public static void somarValores(int valor1, int valor2) {
        int somar = valor1 + valor2;
        System.out.printf("A soma entre %d e %d é igual a: %d\n", valor1, valor2, somar);
    }
    
    public static void subtrairValores(int valor1, int valor2) {
        int subtrair = valor1 - valor2;
        System.out.printf("A subtração entre %d e %d é igual a: %d\n", valor1, valor2, subtrair);
    }
    
    public static void dividirValores(int valor1, int valor2) {
        int dividir = valor1 / valor2;
        System.out.printf("A divisão entre %d e %d é igual a: %d\n", valor1, valor2, dividir);
    }
    
    public static void muliplicarValores(int valor1, int valor2) {
        int multiplicar = valor1 * valor2;
        System.out.printf("A multiplicação entre %d e %d é igual a: %d\n", valor1, valor2, multiplicar);
    }
    
    public static void raizQuadrada(double valor1, double valor2) {
        double raizQ1 = Math.sqrt(valor1);
        double raizQ2 = Math.sqrt(valor2);
        System.out.println("A raiz quadrada de " + valor1 + " é igual a: " + raizQ1);
        System.out.println("A raiz quadrada de " + valor2 + " é igual a: " + raizQ2);
    }

}
