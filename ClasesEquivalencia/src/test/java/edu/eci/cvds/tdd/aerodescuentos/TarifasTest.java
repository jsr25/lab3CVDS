package edu.eci.cvds.tdd.aerodescuentos;

import org.junit.Assert;
import org.junit.Test;
import java.lang.Exception;
public class TarifasTest {

    @Test
    public void validateAgeLess() {
		CalculadorDescuentos calculate= new CalculadorDescuentos();
		double discount=calculate.calculoTarifa(1000000,8,15);
        Assert.assertTrue(discount!=1000000);
    }
	
	 @Test
    public void validateAgeSame18() {
		CalculadorDescuentos calculate= new CalculadorDescuentos();
		double discount=calculate.calculoTarifa(1000000,8,18);
        Assert.assertTrue(discount==1000000);
    }
	
	@Test
    public void validateAgeGreater() {
		CalculadorDescuentos calculate= new CalculadorDescuentos();
		double discount=calculate.calculoTarifa(1000000,5,68);
        Assert.assertTrue(discount!=1000000);
    }
	
	@Test
    public void validateAgeMiddle() {
		CalculadorDescuentos calculate= new CalculadorDescuentos();
		double discount=calculate.calculoTarifa(1000000,5,30);
        Assert.assertTrue(discount==1000000);
    }
	
	@Test
    public void validateAgeSame65() {
		CalculadorDescuentos calculate= new CalculadorDescuentos();
		double discount=calculate.calculoTarifa(1000000,5,65);
        Assert.assertTrue(discount==1000000);
    }
	
	@Test
    public void validateDaysLess() {
		CalculadorDescuentos calculate= new CalculadorDescuentos();
		double discount=calculate.calculoTarifa(1000000,15,25);
        Assert.assertTrue(discount==1000000);
    }
	
	@Test
    public void validateDaysSame() {
		CalculadorDescuentos calculate= new CalculadorDescuentos();
		double discount=calculate.calculoTarifa(1000000,20,25);
        Assert.assertTrue(discount==1000000);
    }
	
	@Test
    public void validateDaysGreater() {
		CalculadorDescuentos calculate= new CalculadorDescuentos();
		double discount=calculate.calculoTarifa(1000000,22,25);
        Assert.assertTrue(discount!=1000000);
    }
}