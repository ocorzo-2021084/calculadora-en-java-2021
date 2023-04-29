public class Fibonacci{
	{
	 ObtenerDatos dato=new ObtenerDatos();
	 
	 int numero1=0;
	 int numero2=1;
	 int temp;
	 int numeroDeSerie;
	 
	 numeroDeSerie=dato.leerNumero();
	 
	 System.out.println("El resultado es el siguiente:");
	 
	 System.out.println(numero1);
	 System.out.println(numero2);
	 
	 while(numero2+numero1<=numeroDeSerie){
		 temp=numero1;
		 numero1=numero2;
		 numero2=temp+numero1;
		 System.out.println(numero2);
	 }
	 
	 
	 
	}
}