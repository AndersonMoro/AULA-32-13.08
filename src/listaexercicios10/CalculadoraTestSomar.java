package listaexercicios10;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.Assert;

public class CalculadoraTestSomar {
	@Test
	@DisplayName("Deveria somar dois números positivos")
	public void deveriaSomarDoisNumerosPositivos() {
		// Cenário (arrange)
		Calculadora calc = new Calculadora();
		
		// Execução (act)
		int soma = calc.somar(41, 1);
		
		// Verificação (assert)
		Assert.assertEquals(42, soma);
	}
	@Test
	@DisplayName("Deveria somar um número positivo com zero")
	public void deveriaSomarUmNumeroPositivoComZero() {
		Calculadora calc = new Calculadora();
		int soma = calc.somar(10, 0);
		Assert.assertEquals(10, soma);
	}
	
	@Test
	@DisplayName("Deveria somar um número positivo com um número negativo")
	public void deveriaSomarUmNumeroPositivoComUmNumeroNegativo() {
		Calculadora calc = new Calculadora();
		int soma = calc.somar(5, -5);
		Assert.assertEquals(0, soma);
	}
	
	@Test
	@DisplayName("Deveria somar dois números negativos")
	public void deveriaSomarDoisNumerosNegativos() {
		Calculadora calc = new Calculadora();
		int soma = calc.somar(-2, -3);
		Assert.assertEquals(-5, soma);
	}
	
	
}	

	
