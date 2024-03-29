/*
 *  Dise�a una clase con un m�todo que permita averiguar la �ltima cifra de un n�mero
introducido por teclado. Para la resoluci�n de este problema deber�s utilizar wrappers de tipos
num�ricos
 */

import java.io.*;
public class Averiguar
{
	public static int getNumber()
	{
		int dato=0;
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader buff = new BufferedReader(isr);
		try
		{
			System.out.println("Introduzca dato:");
			String ln = buff.readLine();
			dato=Integer.parseInt(ln);
		}
		catch(IOException e)
		{
			System.err.println("Se ha producido una IOException");
			e.printStackTrace();
		}
		catch (Throwable e)
		{
			System.err.println("Error de programa: " + e);
			e.printStackTrace();
		}
		return (dato);
	}
	
	public static int getUltimaCifra(int dato)
	{
		int d=0;
		String cad= String.valueOf(dato);
		d=Integer.parseInt(cad.substring(cad.length()-1,cad.length()));
		return d;
	}
	
	public static void main(String[] args)
	{
		int dato = getNumber();
		dato=getUltimaCifra(dato);
		System.out.println("La �ltima cifra es: "+dato);
	}
}