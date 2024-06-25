package lista25exercicios;

/*
8- Escrever um programa que leia:
- a porcentagem do IPI a ser acrescido no valor das peças 
- o código da peça 1, valor unitário da peça 1, quantidade de peças 1 
- o código da peça 2, valor unitário da peça 2, quantidade de peças 2 
O programa deve calcular o valor total a ser pago e apresentar o resultado. 
Cálculo : (valor1*quant1 + valor2*quant2)*(IPI/100 + 1)
*/

import java.util.Scanner;

public class Exercicio8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Porcentagem do IPI a ser acrescido: ");
        double ipi = scanner.nextDouble();
        
        System.out.println("Informe os dados da peça 1:");
        System.out.print("Código da peça: ");
        int codigo1 = scanner.nextInt();
        System.out.print("Valor unitário da peça: ");
        double valor1 = scanner.nextDouble();
        System.out.print("Quantidade de peças: ");
        int quant1 = scanner.nextInt();
        
        System.out.println("Informe os dados da peça 2:");
        System.out.print("Código da peça: ");
        int codigo2 = scanner.nextInt();
        System.out.print("Valor unitário da peça: ");
        double valor2 = scanner.nextDouble();
        System.out.print("Quantidade de peças: ");
        int quant2 = scanner.nextInt();
        
        double total = (valor1 * quant1 + valor2 * quant2) * (ipi / 100 + 1);
        
        System.out.println("Valor total a ser pago: " + total);
        
        scanner.close();
    }
}
