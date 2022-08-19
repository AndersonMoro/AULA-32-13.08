package listaexercicios10;

import org.junit.Assert;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class CalculadoraTestDividir {
	@Test
	@DisplayName("Deveria dividir dois números positivos")
	public void deveriaDividirDoisNumerosPositivos() {
		// Cenário (arrange)
		Calculadora calc = new Calculadora();

		// Execução (act)
		int divisao = calc.dividir(50, 2);

		// Verificação (assert)
		Assert.assertEquals(25, divisao);
	}
	
	@Test
	@DisplayName("Deveria divir um número negativo com um número positivo")
	public void deveriaDividirUmNumeroNegativpComUmNumeroPositivo() {
		Calculadora calc = new Calculadora();
		int divisao = calc.dividir(-4, 2);
		Assert.assertEquals(-2, divisao);
		
	}

	@Test
	@DisplayName("Deveria dividr dois números negativos")
	public void deveriaDividirDoisNumerosNegativos() {
		Calculadora calc = new Calculadora();
		int divisao = calc.dividir(-10, -2);
		Assert.assertEquals(5, divisao);
	}

}
