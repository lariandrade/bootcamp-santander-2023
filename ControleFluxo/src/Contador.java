package ControleFluxo.src;

import java.util.Scanner;

/* Descrição do desafio:
* O sistema deverá receber dois parâmetros via terminal que representarão dois números inteiros.
* Com estes dois números você deverá obter a quantidade de interações (for) e realizar a impressão.
*
* - Se o primeiro parâmetro for MAIOR que o segundo parâmetro, você deverá lançar a exceção customizada chamada de ParametrosInvalidosException com a segunda mensagem: "O segundo parâmetro deve ser maior que o primeiro"
*
* 1. Crie o projeto DesafioControleFluxo
* 2. Crie a classe Contador.java para realizar toda a codificação do nosso programa.
* 3. Crie a classe ParametrosInvalidosException que representará a exceção de negócio no sistema.
*
*/
public class Contador {
	public static void main(String[] args) {

		Scanner terminal = new Scanner(System.in);

		System.out.println("Digite o primeiro parametro");
		int parametroUm = terminal.nextInt();

		System.out.println("Digite o segundo parametro");
		int parametroDois = terminal.nextInt();

		try {
			// chamando o método contendo a lógica de contagem
			contar(parametroUm, parametroDois);

		} catch (ParametrosInvalidosException exception) {
			// imprimir a mensagem: O segundo parâmetro deve ser maior que o primeiro
			System.out.println("O segundo parametro deve ser maior que o primeiro");
		}

	}

	static void contar(int parametroUm, int parametroDois) throws ParametrosInvalidosException {
		// validar se parametroUm é MAIOR que parametroDois e lançar a exceção

		if (parametroUm > parametroDois) {
			throw new ParametrosInvalidosException();
		}

		int contagem = parametroDois - parametroUm;

		// realizar o for para imprimir os números com base na variável contagem

		for (int i = 1; i <= contagem; i++) {
			System.out.println("Imprimindo o numero " + i);
		}
	}
}