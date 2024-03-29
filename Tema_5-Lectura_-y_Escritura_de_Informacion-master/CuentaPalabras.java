/*
crear una clase cuenta con un método cuentaPalabras() que
cuente las palabras existentes en un archivo de texto pasado como parámetro.
*/
import java.io.*;
import java.util.StringTokenizer;

public class CuentaPalabras
{
	public int cuentaPalabras (String fichero)
	{
		int contador=0;
		try
		{
			File fe=new File(fichero);
			FileReader fr=new FileReader(fe);
			BufferedReader br=new BufferedReader(fr);
			String s;
			while((s=br.readLine())!=null)
			{
				StringTokenizer str;
				str=new StringTokenizer(s);
				contador += str.countTokens();
			}
			if (fr!=null) fr.close();
		}
		catch (FileNotFoundException fnf)
		{
			System.err.println("Fichero no encontrado " + fichero);
		}
		catch (IOException e)
		{
			System.err.println("Se ha producido una IOException");
			e.printStackTrace();
		}
		catch (Throwable e)
		{
			System.err.println("Error de programa" + e);
			e.printStackTrace();
		}
		return contador;
		}
	
	public static void main(String[] args)
	{
		CuentaPalabras c=new CuentaPalabras();
		int d=c.cuentaPalabras("datos.txt");
		System.out.println("El fichero datos.txt tiene "+ d+" palabras");
	}
}
