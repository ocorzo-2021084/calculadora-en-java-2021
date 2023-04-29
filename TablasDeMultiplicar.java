public class TablasDeMultiplicar{
	{
	ObtenerDatos dato=new ObtenerDatos();
	int valorIncial;
	int valorLimite;
	int contador=1;
	int total=0;
	
	System.out.println("Ingrese el numero");
	System.out.println("-----------------");
	valorIncial=dato.leerNumero();
	System.out.println("Ingrese el limite");
	System.out.println("-----------------");
	valorLimite=dato.leerNumero();
	
	while(contador<=valorLimite){
			total=valorIncial*contador;
			System.out.println(valorIncial+"*"+contador+"="+total);
			contador++;
			

		}

	}


	}

