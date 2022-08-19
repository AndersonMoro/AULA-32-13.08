package listaexercicios10;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.Assert;

public class CalculadoraTestSomar {
	@Test
	@DisplayName("Deveria somar dois n�meros positivos")
	public void deveriaSomarDoisNumerosPositivos() {
		// Cen�rio (arrange)
		Calculadora calc = new Calculadora();
		
		// Execu��o (act)
		int soma = calc.somar(41, 1);
		
		// Verifica��o (assert)
		Assert.assertEquals(42, soma);
	}
	@Test
	@DisplayName("Deveria somar um n�mero positivo com zero")
	public void deveriaSomarUmNumeroPositivoComZero() {
		Calculadora calc = new Calculadora();
		int soma = calc.somar(10, 0);
		Assert.assertEquals(10, soma);
	}
	
	@Test
	@DisplayName("Deveria somar um n�mero positivo com um n�mero negativo")
	public void deveriaSomarUmNumeroPositivoComUmNumeroNegativo() {
		Calculadora calc = new Calculadora();
		int soma = calc.somar(5, -5);
		Assert.assertEquals(0, soma);
	}
	
	@Test
	@DisplayName("Deveria somar dois n�meros negativos")
	public void deveriaSomarDoisNumerosNegativos() {
		Calculadora calc = new Calculadora();
		int soma = calc.somar(-2, -3);
		Assert.assertEquals(-5, soma);
	}
	
	
}	

	
