package co.edu.udea.appempresariales.romanos;

public class RomanosToDecimal {

	public String convert(String romano) {
		
		int intDigit=0;
		int result=0;
		int previous=0;
		int contadorIguales=0;
		int temporal=0;
		int subtracted=0;
		int subtractedPossible1=0;
		int subtractedPossible2=0;
		String strResultado;
		boolean currentIsReplicable = false;
		boolean previousIsReplicable = false;
		boolean wasSubtracted = false;
		
		
		for (Character digito: romano.toUpperCase().toCharArray()){
			currentIsReplicable = false;
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
				subtractedPossible1=1000;				
				break;
			case 'D':
				intDigit = 500;
				break;
			case 'M':
				intDigit = 1000;
				currentIsReplicable = true;
				break;
			default:
				 strResultado= "Error";
				 return strResultado;
					
			}
			
			if (previous == 0){				
				previous = intDigit;
				temporal = intDigit;
				contadorIguales++;
				previousIsReplicable=currentIsReplicable;
				
			}else if (previous == intDigit && contadorIguales<=3){
				if (currentIsReplicable==false || wasSubtracted==true){
					strResultado= "Error";
					return strResultado;
				}
				previous = intDigit;
				temporal += intDigit;
				previousIsReplicable=currentIsReplicable;
				contadorIguales++;
				
			}else if (previous < intDigit){
				if (previousIsReplicable==false || contadorIguales>1 || 
						(subtractedPossible1!=intDigit && subtractedPossible1!=intDigit) ){
					strResultado= "Error";					
					return strResultado;
				}
				subtracted=previous;
				wasSubtracted=true;
				previous = intDigit;
				temporal = intDigit - temporal;
				contadorIguales = 0;
				previousIsReplicable=currentIsReplicable;
				
			}else if (previous > intDigit){
				if (intDigit<subtracted){
					strResultado= "Error";
					return strResultado;
				}
				previous = intDigit;				
				previousIsReplicable=currentIsReplicable;
				contadorIguales=0;				
				result += temporal;				
				temporal = intDigit;
							
			}
		}
		result += temporal; 
		return String.valueOf(result);
	}

}
