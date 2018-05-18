package br.com.db1.start.test;

import org.junit.Assert;
import org.junit.Test;

import br.com.db1.start.classes.Calculadora;

public class CalculadoraTest {
	@Test
	public void somarTest() {
		Calculadora calculadora = new Calculadora();

		calculadora.setValor1(1d);
		Assert.assertTrue(1 == calculadora.getValor1());

		calculadora.setValor2(23d);
		Assert.assertTrue(23 == calculadora.getValor2());

		Assert.assertTrue(24 == calculadora.somar());

	}

	public void multiplicarTest() {
		Calculadora calculadora = new Calculadora();

		calculadora.setValor1(1d);
		Assert.assertTrue(1 == calculadora.getValor1());

		calculadora.setValor2(12d);
		Assert.assertTrue(23 == calculadora.getValor2());

		Assert.assertTrue(23 == calculadora.multiplicar());

	}
}
