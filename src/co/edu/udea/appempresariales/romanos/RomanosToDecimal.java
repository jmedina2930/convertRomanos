package co.edu.udea.appempresariales.romanos;

/**
 * Clase utilizada para convertir numeros romanos a decimales
 * @author Jonathan
 *
 */
public class RomanosToDecimal {

	private boolean currentIsReplicable = false;
	private int subtractedPossible1 = 0;
	private int subtractedPossible2 = 0;
	private String strResultado;

	/**
	 * Metodo principal para convertir los numeros
	 * @param romano
	 * @return el numero convertido a decimal
	 */
	public String convert(String romano) {
		
		int intDigit=0;
		int result=0;
		int previous=0;
		int contadorIguales=0;
		int temporal=0;
		int major=10000;
		int subtracted=10000;				
		boolean previousIsReplicable = false;
		boolean wasSubtracted = false;
		
		
		for (Character digito: romano.toUpperCase().toCharArray()){
			currentIsReplicable = false;			
			intDigit = changeLetterByNumber(digito);
			
			//Si es el primer digito
			if (previous == 0){				
				previous = intDigit;
				temporal = intDigit;
				contadorIguales++;
				previousIsReplicable=currentIsReplicable;
				wasSubtracted=false;
			
			//Si el digito ingresado es igual al anterior
			}else if (previous == intDigit && contadorIguales<=3){
				//Validaciones
				if (currentIsReplicable==false || wasSubtracted==true){
					strResultado= "Error, el numero ingresado es invalido";
					return strResultado;
				}
				previous = intDigit;
				temporal += intDigit;
				previousIsReplicable=currentIsReplicable;
				contadorIguales++;
				wasSubtracted=false;
				
			//Si el numero ingresado es mayor que el anterior
			}else if (previous < intDigit){
				//Validaciones
				if (previousIsReplicable==false || contadorIguales>1 || intDigit >= major ||
						(subtractedPossible1!=intDigit && subtractedPossible2!=intDigit) ){
					strResultado= "Error, el numero ingresado es invalido";					
					return strResultado;
				}
				
				subtracted=previous;
				wasSubtracted=true;
				previous = intDigit;
				temporal = intDigit - temporal;
				contadorIguales = 0;
				previousIsReplicable=currentIsReplicable;
				
			//Si el numero ingresado es menor que el anterior	
			}else if (previous > intDigit){
				//Validaciones
				if (intDigit>subtracted){
					strResultado= "Error, el numero ingresado es invalido";
					return strResultado;
				}
				
				major=previous;
				previous = intDigit;				
				previousIsReplicable=currentIsReplicable;
				contadorIguales=0;				
				result += temporal;				
				temporal = intDigit;
				wasSubtracted=false;	
			}
		}
		result += temporal; 
		return String.valueOf(result);
	}
	
	/**
	 * Metodo para cambiar un caracter por un numero
	 * @param digito
	 * @return retorna el valor decimal correspondiente al carater enviado
	 */
	public int changeLetterByNumber(Character digito){
		int intDigit=0;
		
		switch (digito){
				
		case 'I':
			intDigit = 1;
			currentIsReplicable=true;
			subtractedPossible1=5;
			subtractedPossible2=10;
			break;
		case 'V':
			intDigit = 5;
			break;
		case 'X': 
			intDigit = 10;
			currentIsReplicable=true;
			subtractedPossible1=50;
			subtractedPossible2=100;
			break;
		case 'L':
			intDigit = 50;
			break;
		case 'C':
			intDigit = 100;
			currentIsReplicable=true;
			subtractedPossible1=500;
			subtractedPossible2=1000;				
			break;
		case 'D':
			intDigit = 500;
			break;
		case 'M':
			intDigit = 1000;
			currentIsReplicable = true;
			break;
		default:
			 strResultado= "Error, el numero ingresado es invalido";				
		}
		return intDigit;
	}

}
