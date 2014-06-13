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
		Assert.assertEquals("Error", result);		
	}
	
	@Test
	public void convertXXCtest() {
		String romano = "XXC";
		RomanosToDecimal converter = new RomanosToDecimal();
		String result = converter.convert(romano);
		Assert.assertEquals("Error", result);		
	}
	
	@Test
	public void convertXXIIItest() {
		String romano = "XXIII";
		RomanosToDecimal converter = new RomanosToDecimal();
		String result = converter.convert(romano);
		Assert.assertEquals("23", result);		
	}
	
	@Test
	public void convertXXLVIICtest() {
		String romano = "XXLVII";
		RomanosToDecimal converter = new RomanosToDecimal();
		String result = converter.convert(romano);
		Assert.assertEquals("Error", result);		
	}
	
	@Test
	public void convertVLCtest() {
		String romano = "VL";
		RomanosToDecimal converter = new RomanosToDecimal();
		String result = converter.convert(romano);
		Assert.assertEquals("Error", result);		
	}
	
	@Test
	public void convertCMMtest() {
		String romano = "CMM";
		RomanosToDecimal converter = new RomanosToDecimal();
		String result = converter.convert(romano);
		Assert.assertEquals("Error", result);		
	}
	
	@Test
	public void convertIXVItest() {
		String romano = "IXVI";
		RomanosToDecimal converter = new RomanosToDecimal();
		String result = converter.convert(romano);
		Assert.assertEquals("Error", result);		
	}
	
	@Test
	public void convertICtest() {
		String romano = "IC";
		RomanosToDecimal converter = new RomanosToDecimal();
		String result = converter.convert(romano);
		Assert.assertEquals("Error", result);		
	}
	
	@Test
	public void convertIXLtest() {
		String romano = "IXL";
		RomanosToDecimal converter = new RomanosToDecimal();
		String result = converter.convert(romano);
		Assert.assertEquals("Error", result);		
	}
	
	public void convertXILtest() {
		String romano = "XIL";
		RomanosToDecimal converter = new RomanosToDecimal();
		String result = converter.convert(romano);
		Assert.assertEquals("Error", result);		
	}
	public void convertVIVtest() {
		String romano = "VIV";
		RomanosToDecimal converter = new RomanosToDecimal();
		String result = converter.convert(romano);
		Assert.assertEquals("Error", result);		
	}

}
