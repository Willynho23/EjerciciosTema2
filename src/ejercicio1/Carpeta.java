package ejercicio1;
import java.util.*;
public class Carpeta {
	private String nombre;
	private List<Archivo> archivos; // Archivos directos en esta carpeta
	private List<Carpeta> subcarpetas; // Carpetas dentro de esta carpeta
	public Carpeta (String nombre) { 
		this.nombre=nombre;
		archivos=new ArrayList<>();
		subcarpetas=new ArrayList<>();
	}
	public List<Archivo> getArchivos () { return this.archivos; }
	public List<Carpeta> getSubcarpetas () { return this.subcarpetas; }
	
	public double caluclarPesoTotal(Carpeta carpeta) {
		
		if(this.subcarpetas.size()==0) {
			double sum=0;
			for(Archivo a: this.archivos) {
				sum+=a.getPesoMB();
			}
			return sum;
		}
		double sum=0;
		
		for(Carpeta c: subcarpetas) {
			
			for(Archivo a: this.archivos) {
				sum+=a.getPesoMB();
			}
			
			sum+=c.caluclarPesoTotal(c);
			
		}
		
		return sum;
	}

}
