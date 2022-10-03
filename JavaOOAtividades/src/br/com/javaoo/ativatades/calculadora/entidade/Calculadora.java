package br.com.javaoo.ativatades.calculadora.entidade;

import java.util.Scanner;

public class Calculadora {
	
	// atributos
	private double a;
	private double b;

	// construtores

	public Calculadora() {
	}

	// metodos

	// com retorno
	public double soma(double parcela1, double parcela2) {
		return parcela1 + parcela2;
	}

	public static double sub(double minuendo, double subtraendo) {
		return minuendo - subtraendo;
	}

	public static double mult(double fator1, double fator2) {
		return fator1 * fator2;
	}

	private static double dividir (double dividendo, double divisor) {
		return dividendo / divisor;
	}
	
//	sem retorno
	

	public static void dividirSe (double a, double b) {
		if (b!= 0) {
		System.out.println(dividir(a, b));
		return;
		
		} else {
			System.err.println("Erro!! Divisão por Zero não Existe.");
		}
	}
	public static void imprimir() {
		System.out.println( 
				 "+==========================+\n"
				 + "+== Escolha uma Operação ==+\n"
				 + "+==========================+\n"
				 + "+ 1 - Somar                +\n"
				 + "+ 2 - Subtrair             +\n"
				 + "+ 3 - Multiplicar          +\n"
				 + "+ 4 - Dividir              +\n"
				 + "+ 5 - Sair                 +\n"
				 + "+==========================+"); 
		System.out.print("Opção = ");
	}
	
	public static double[] recebeValorOperacao(){
		Scanner scan = new Scanner(System.in);
		double [] vetor = new double[2];
		System.out.println("Digite o primeiro valor: ");
		vetor[0] = scan.nextDouble();
		System.out.println("Digite o segundo valor: ");
		vetor[1] = scan.nextDouble();
		scan.close();
		return vetor;
	}		
	// getandset

	public double getA() {
		return a;
	}

	public void setA(double a) {
		this.a = a;
	}

	public double getB() {
		return b;
	}

	public void setB(double b) {
		this.b = b;
	}
}
