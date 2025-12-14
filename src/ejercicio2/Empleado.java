package ejercicio2;
import java.util.*;

public class Empleado {

	private String nombre;
	private double salario;
	private List<Empleado> subordinados;
	
	public Empleado (String nombre, double salario) {
		
	}
	public double getSalario () { return this.salario; }
	public List<Empleado> getSubordinados () { return this.subordinados; }

	public static double presupuestoEquipo (Empleado jefe) {
		
		if(jefe.subordinados==null) {
			return jefe.getSalario();
		}
		
		double sum=0;
		for(Empleado e: jefe.getSubordinados()) {
			
			sum+=e.getSalario()+presupuestoEquipo(e);
			
		}
		
		return sum;
	}
}
