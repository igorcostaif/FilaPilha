import java.util.LinkedList;
import java.util.Queue;

public class Fila {
	
	Queue<String> fila = new LinkedList<String>();
	
	public void inserir(String nome) {
		
		fila.add(nome);
		
	}
	
	public String remover() {
		
		return fila.remove();
		
	}
	
	public boolean verifica() {
		
		return fila.isEmpty();
		
	}
	
	public void mostrar() {
		
		System.out.println(fila.toString());
		
	}

}
