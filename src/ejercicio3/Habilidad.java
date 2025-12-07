package ejercicio3;
import java.util.*;

public class Habilidad {

	private String id;
	private int costePuntos;
	private List<Habilidad> desbloqueables;
	
	public Habilidad(String id, int costePuntos, List<Habilidad> desbloqueables) {
		
		this.id=id;
		this.costePuntos=costePuntos;
		this.desbloqueables=desbloqueables;
		
	}
	
	public int getCoste() {
		return this.costePuntos;
	}
	
	public List<Habilidad> getDesbloqueables(){
		return this.desbloqueables;
	}
	
	public static int costeRamaCompleta(Habilidad raiz) {
		
		if(raiz.getDesbloqueables()==null) {
			return raiz.getCoste();
		}
		
		List<Habilidad> damn = raiz.getDesbloqueables();
		
		int suma=0;
		for(Habilidad h:damn) {
			
			suma+=raiz.getCoste()+costeRamaCompleta(h);
			
		}
		return suma;
	}
}
