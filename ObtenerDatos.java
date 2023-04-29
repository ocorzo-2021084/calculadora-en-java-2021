import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
public class ObtenerDatos{
	BufferedReader bf=new BufferedReader(new InputStreamReader(System.in));	
	
	public String ingresarTexto(){
	String texto=null;
	try{
		texto=bf.readLine();
	}catch(IOException ioe){
		System.out.println("Error de entrada");
		System.exit(1);
	}
	 return texto;
	}
	public char leerSigno(){
	char signo=0;
	try{
		signo=bf.readLine().charAt(0);
	}catch(IOException ioe){
		System.out.println("Error de entrada");
		System.exit(1);
	}
	return signo;
	}
	public int leerNumero(){
		int numero=0;
	try{
		numero=Integer.parseInt(bf.readLine());
	}catch(IOException ioe){
		System.out.println("Error de entrada");
		System.exit(1);
	}
	 return numero;
	
	}
}