public class Principal{
	public static void main(String args[]){
		
		ObtenerDatos dato=new ObtenerDatos();
		Calculadora calc=new Calculadora();
		
		
		int valor1;
		int valor2;
		int opc;
		int op;
		int total;
		char signo;
		
		
		System.out.println("**********Bienvenido al menu de opciones**********");
		System.out.println("--------------------------------------------------");
		System.out.println("Elige la operacion que deseas hacer:");
		System.out.println("------------------------------------");
		System.out.println("1...para Calculadora");
		System.out.println("2...para Fibonacci");
		System.out.println("3...para tablas de multiplicar");
		opc=dato.leerNumero();
		switch(opc){
	
		case 1 : 
				System.out.println("**********Bienvenido a la calculadora**********");
				System.out.println("-----------------------------------------------------");
				System.out.println("***Ingresa el simbolo de la operacion que quieres****");
				System.out.println("-----------------------------------------------------");
				System.out.println("+...Suma");
				System.out.println("-...Resta");
				System.out.println("*...Multiplicacion");
				System.out.println("/...Division");
				System.out.println("Ingrese la opcion");
				signo=dato.leerSigno();
				switch(signo){
				case '+':
						System.out.println("Ingrese el primer numero:");
						valor1=dato.leerNumero();
						System.out.println("Ingrese el segundo numero:");
						valor2=dato.leerNumero();
						total=calc.suma(valor1,valor2);
						System.out.println("El resultado de la suma es: "+total);
					break;	
					
				case '-':
						System.out.println("Ingrese el primer numero:");
						valor1=dato.leerNumero();
						System.out.println("Ingrese el segundo numero:");
						valor2=dato.leerNumero();
						total=calc.resta(valor1,valor2);
						System.out.println("El resultado de la resta es: "+total);
					break;
					
				case '*':
						System.out.println("Ingrese el primer numero:");
						valor1=dato.leerNumero();
						System.out.println("Ingrese el segundo numero:");
						valor2=dato.leerNumero();
						total=calc.multiplicacion(valor1,valor2);
						System.out.println("El resultado de la multiplicacion es: "+total);
					break;
					
				case '/':
						System.out.println("Ingrese el primer numero:");
						valor1=dato.leerNumero();
						System.out.println("Ingrese el segundo numero:");
						valor2=dato.leerNumero();
						total=calc.division(valor1,valor2);
						System.out.println("El resultado de la division es: "+total);
					
				}
				break;
				
				
			
		case 2:
			System.out.println("**********Bienvenido a la segunda opcion, Fibonacci**********");
			System.out.println("----------------------------------------------------------------");
			System.out.println("Ingrese el numero de iteracciones que quiere:");
			Fibonacci serie=new Fibonacci();
			break;
			
		case 3: 
			System.out.println("**********Bienvenido a la tercera opcion, tablas de multiplicar**********");
			System.out.println("----------------------------------------------------------------------------");
			TablasDeMultiplicar tablas=new TablasDeMultiplicar();
			break;
			 
			default : System.out.println("Opcion no valida");
					
			
			
		}	
	}
}