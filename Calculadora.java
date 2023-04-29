public class Calculadora{
	int total=0;
	char signo;
	public int suma(int PrimerNumero,int SegundoNumero){
		total=PrimerNumero+SegundoNumero;
		return total;
	}
	public int resta(int PrimerNumero,int SegundoNumero){
		total=PrimerNumero-SegundoNumero;
		return total;
	}
	public int multiplicacion(int PrimerNumero,int SegundoNumero){
		total=PrimerNumero*SegundoNumero;
		return total;
	}
	public int division(int PrimerNumero,int SegundoNumero){
		if(SegundoNumero==0){
			System.out.println("No se puede dividir entre cero");
		}else{
			total=PrimerNumero/SegundoNumero;
		}
		return total;
	}	
}
