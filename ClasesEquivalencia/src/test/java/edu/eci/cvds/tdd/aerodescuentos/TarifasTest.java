package edu.eci.cvds.tdd.aerodescuentos;

import org.junit.Assert;
import org.junit.Test;

public class TarifasTest {

    @Test
    public void validateRate() {
		CalculadorDescuentos calculate= new CalculadorDescuentos();
		double discount=calculate.calculoTarifa(1000000,22,15);
        Assert.assertTrue(discount!=1000000);
    }
	
	@Test
    public void validateRate2() {
		CalculadorDescuentos calculate= new CalculadorDescuentos();
		double discount=calculate.calculoTarifa(1000000,23,68);
        Assert.assertTrue(discount!=1000000);
    }
	
	/*@Test
    public void validateRate3() {
		CalculadorDescuentos calculate= new CalculadorDescuentos();
		double discount=calculate.calculoTarifa(-2,22,15);
        Assert.assertTrue(discount==1000000);
    }*/
	
	@Test
    public void validateRate3() {
		CalculadorDescuentos calculate= new CalculadorDescuentos();
		double discount=calculate.calculoTarifa(1000000,15,18);
        Assert.assertTrue(discount==1000000);
    }
	/*
	@Test
    public void validateRate() {
		CalculadorDescuentos calculate= new CalculadorDescuentos();
		double discount=calculate.calculoTarifa(1000000,22,15);
        Assert.assertTrue(discount!=1000000);
    }
	
	@Test
    public void validateRate() {
		CalculadorDescuentos calculate= new CalculadorDescuentos();
		double discount=calculate.calculoTarifa(1000000,22,15);
        Assert.assertTrue(discount!=1000000);
    }*/

}