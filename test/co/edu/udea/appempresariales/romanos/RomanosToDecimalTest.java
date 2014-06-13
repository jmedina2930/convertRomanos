package co.edu.udea.appempresariales.romanos;

import static org.junit.Assert.*;
import junit.framework.Assert;

import org.junit.Before;
import org.junit.Test;

public class RomanosToDecimalTest {

	@Before
	public void setUp() throws Exception {
	}

	/**
	 * Prueba para el numero romano I
	 */
	@Test	
	public void convertItest() {
		String romano = "I";
		RomanosToDecimal converter = new RomanosToDecimal();
		String result = converter.convert(romano);
		Assert.assertEquals("1", result);		
	}
	
	/**
	 * Prueba para el numero romano V
	 */
	@Test
	public void convertVtest() {
		String romano = "V";
		RomanosToDecimal converter = new RomanosToDecimal();
		String result = converter.convert(romano);
		Assert.assertEquals("5", result);		
	}
	
	/**
	 * Prueba para el numero romano X
	 */
	@Test
	public void convertXtest() {
		String romano = "X";
		RomanosToDecimal converter = new RomanosToDecimal();
		String result = converter.convert(romano);
		Assert.assertEquals("10", result);		
	}
	
	
	/**
	 * Prueba para el numero romano XX
	 */
	@Test
	public void convertXXtest() {
		String romano = "XX";
		RomanosToDecimal converter = new RomanosToDecimal();
		String result = converter.convert(romano);
		Assert.assertEquals("20", result);		
	}
	
	/**
	 * Prueba para el numero romano DD
	 */
	@Test
	public void convertDDtest() {
		String romano = "DD";
		RomanosToDecimal converter = new RomanosToDecimal();
		String result = converter.convert(romano);
		Assert.assertEquals("Error, el numero ingresado es invalido", result);		
	}
	
	/**
	 * Prueba para el numero romano XXC
	 */
	@Test
	public void convertXXCtest() {
		String romano = "XXC";
		RomanosToDecimal converter = new RomanosToDecimal();
		String result = converter.convert(romano);
		Assert.assertEquals("Error, el numero ingresado es invalido", result);		
	}
	
	/**
	 * Prueba para el numero romano XXIII
	 */
	@Test
	public void convertXXIIItest() {
		String romano = "XXIII";
		RomanosToDecimal converter = new RomanosToDecimal();
		String result = converter.convert(romano);
		Assert.assertEquals("23", result);		
	}
	
	/**
	 * Prueba para el numero romano XXLVII
	 */
	@Test
	public void convertXXLVIICtest() {
		String romano = "XXLVII";
		RomanosToDecimal converter = new RomanosToDecimal();
		String result = converter.convert(romano);
		Assert.assertEquals("Error, el numero ingresado es invalido", result);		
	}
	
	/**
	 * Prueba para el numero romano VL
	 */
	@Test
	public void convertVLCtest() {
		String romano = "VL";
		RomanosToDecimal converter = new RomanosToDecimal();
		String result = converter.convert(romano);
		Assert.assertEquals("Error, el numero ingresado es invalido", result);		
	}
	
	/**
	 * Prueba para el numero romano CMM
	 */
	@Test
	public void convertCMMtest() {
		String romano = "CMM";
		RomanosToDecimal converter = new RomanosToDecimal();
		String result = converter.convert(romano);
		Assert.assertEquals("Error, el numero ingresado es invalido", result);		
	}
	
	/**
	 * Prueba para el numero romano IXVI
	 */
	@Test
	public void convertIXVItest() {
		String romano = "IXVI";
		RomanosToDecimal converter = new RomanosToDecimal();
		String result = converter.convert(romano);
		Assert.assertEquals("Error, el numero ingresado es invalido", result);		
	}
	
	/**
	 * Prueba para el numero romano IC
	 */
	@Test
	public void convertICtest() {
		String romano = "IC";
		RomanosToDecimal converter = new RomanosToDecimal();
		String result = converter.convert(romano);
		Assert.assertEquals("Error, el numero ingresado es invalido", result);		
	}
	
	/**
	 * Prueba para el numero romano IXL
	 */
	@Test
	public void convertIXLtest() {
		String romano = "IXL";
		RomanosToDecimal converter = new RomanosToDecimal();
		String result = converter.convert(romano);
		Assert.assertEquals("Error, el numero ingresado es invalido", result);		
	}
	
	/**
	 * Prueba para el numero romano XIL
	 */
	@Test
	public void convertXILtest() {
		String romano = "XIL";
		RomanosToDecimal converter = new RomanosToDecimal();
		String result = converter.convert(romano);
		Assert.assertEquals("Error, el numero ingresado es invalido", result);		
	}
	
	/**
	 * Prueba para el numero romano VIV
	 */
	@Test
	public void convertVIVtest() {
		String romano = "VIV";
		RomanosToDecimal converter = new RomanosToDecimal();
		String result = converter.convert(romano);
		Assert.assertEquals("Error, el numero ingresado es invalido", result);		
	}
	
	/**
	 * Prueba para el numero romano CDXL
	 */
	@Test
	public void convertCDXLtest() {
		String romano = "CDXL";
		RomanosToDecimal converter = new RomanosToDecimal();
		String result = converter.convert(romano);
		Assert.assertEquals("440", result);		
	}

}
