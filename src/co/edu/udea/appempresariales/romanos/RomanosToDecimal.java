package co.edu.udea.appempresariales.romanos;

public class RomanosToDecimal {

	public String convert(String romano) {
		
		int intDigito=0;
		int resultado=0;
		int anterior=0;
		int contadorIguales=0;
		int temporal=0;
		String strResultado;
		
		for (Character digito: romano.toUpperCase().toCharArray()){			
			switch (digito){
			case 'I':
				intDigito = 1;
				break;
			case 'V':
				intDigito = 5;
				break;
			case 'X': 
				intDigito = 10;
				break;
			case 'L':
				intDigito = 50;
				break;
			case 'C':
				intDigito = 100;
				break;
			case 'D':
				intDigito = 500;
				break;
			case 'M':
				intDigito = 1000;
				break;
			default:
				 strResultado= "Error";
				 break;
					
			}
			
			if ((anterior == 0 || anterior == intDigito) && contadorIguales<3){
				anterior = intDigito;
				resultado+=intDigito;
				contadorIguales++;
			}else if (anterior < intDigito){
//				reultado=
			}
		}
		return String.valueOf(resultado);
	}

}
