package Ejercicio4;

public class JerarquiaEmpresa
{
	public static void main(String[] args)
	{
		EmpleadoBase emp1=new Comercial("Juan");
		EmpleadoBase emp2=new Comercial("Pepe");
		EmpleadoBase emp3=new Comercial("Carlos");
		EmpleadoBase emp4=new Comercial("Josep");
		
		EmpleadoBase emp5=new Directivo("Josep","Jefe de Zona");
		emp5.add(emp1);
		emp5.add(emp2);
		
		EmpleadoBase emp6=new Directivo("Enrique","Jefe de Zona");
		emp6.add(emp3);
		emp6.add(emp4);
		
		EmpleadoBase emp7=new Directivo("Francisco","Director General");
		emp7.add(emp5);
		emp7.add(emp6);
		emp7.print();
		}

}
