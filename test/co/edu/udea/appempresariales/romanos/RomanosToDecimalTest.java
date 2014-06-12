package co.edu.udea.appempresariales.romanos;

import static org.junit.Assert.*;
import junit.framework.Assert;

import org.junit.Before;
import org.junit.Test;

public class RomanosToDecimalTest {

	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void convertItest() {
		String romano = "I";
		RomanosToDecimal converter = new RomanosToDecimal();
		String result = converter.convert(romano);
		Assert.assertEquals("1", result);		
	}
	
	@Test
	public void convertVtest() {
		String romano = "V";
		RomanosToDecimal converter = new RomanosToDecimal();
		String result = converter.convert(romano);
		Assert.assertEquals("5", result);		
	}
	
	@Test
	public void convertXtest() {
		String romano = "X";
		RomanosToDecimal converter = new RomanosToDecimal();
		String result = converter.convert(romano);
		Assert.assertEquals("10", result);		
	}
	
	
	@Test
	public void convertXXtest() {
		String romano = "XX";
		RomanosToDecimal converter = new RomanosToDecimal();
		String result = converter.convert(romano);
		Assert.assertEquals("20", result);		
	}
	
	@Test
	public void convertDDtest() {
		String romano = "DD";
		RomanosToDecimal converter = new RomanosToDecimal();
		String result = converter.convert(romano);
		Assert.assertEquals("1000", result);		
	}
	
	@Test
	public void convertXXCtest() {
		String romano = "XXC";
		RomanosToDecimal converter = new RomanosToDecimal();
		String result = converter.convert(romano);
		Assert.assertEquals("80", result);		
	}

}
