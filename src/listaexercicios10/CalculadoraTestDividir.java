package listaexercicios10;

import org.junit.Assert;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class CalculadoraTestDividir {
	@Test
	@DisplayName("Deveria dividir dois n�meros positivos")
	public void deveriaDividirDoisNumerosPositivos() {
		// Cen�rio (arrange)
		Calculadora calc = new Calculadora();

		// Execu��o (act)
		int divisao = calc.dividir(50, 2);

		// Verifica��o (assert)
		Assert.assertEquals(25, divisao);
	}
	
	@Test
	@DisplayName("Deveria divir um n�mero negativo com um n�mero positivo")
	public void deveriaDividirUmNumeroNegativpComUmNumeroPositivo() {
		Calculadora calc = new Calculadora();
		int divisao = calc.dividir(-4, 2);
		Assert.assertEquals(-2, divisao);
		
	}

	@Test
	@DisplayName("Deveria dividr dois n�meros negativos")
	public void deveriaDividirDoisNumerosNegativos() {
		Calculadora calc = new Calculadora();
		int divisao = calc.dividir(-10, -2);
		Assert.assertEquals(5, divisao);
	}

}
