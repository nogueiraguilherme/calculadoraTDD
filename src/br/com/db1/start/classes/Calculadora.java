package br.com.db1.start.classes;

public class Calculadora {
	private double valor1 = 0d;
	private double valor2 = 0d;

	public double somar() {
		return valor1 + valor2;
	}

	public double multiplicar() {
		return valor1 * valor2;
	}

	public double getValor1() {
		return valor1;
	}

	public void setValor1(Double valor1) {
		this.valor1 = valor1;
	}

	public double getValor2() {
		return valor2;
	}

	public void setValor2(Double valor2) {
		this.valor2 = valor2;
	}
}
