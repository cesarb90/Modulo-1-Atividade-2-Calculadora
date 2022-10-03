package br.com.javaoo.ativatades.calculadora;

import java.util.Scanner;

import br.com.javaoo.ativatades.calculadora.entidade.Calculadora;

public class CalculadoraMain {

	public static void main(String[] args) {
		Calculadora calc = new Calculadora();
		Scanner scan = new Scanner(System.in);
		int opcao = 0;
		double[] valor = new double[2];

		while (opcao != 5) {

			calc.imprimir();
			opcao = scan.nextInt();

			switch (opcao) {
			case 1:
				System.out.println("Vamos realizar uma Soma");
				valor = calc.recebeValorOperacao();
				System.out.println(calc.soma(valor[0], valor[1]));
				break;
			case 2:
				System.out.println("Vamos realizar uma Subtração");
				valor = calc.recebeValorOperacao();
				System.out.println(calc.sub(valor[0], valor[1]));
				break;
			case 3:
				System.out.println("Vamos realizar uma Multiplicação");
				valor = calc.recebeValorOperacao();
				System.out.println(calc.mult(valor[0], valor[1]));
				break;
			case 4:
				System.out.println("Vamos realizar uma Divisão");
				valor = calc.recebeValorOperacao();
				calc.dividirSe(valor[0], valor[1]);
				break;
			default:
				System.out.println("Fechando Calculadora.");
				break;
			}
		}
	}

}