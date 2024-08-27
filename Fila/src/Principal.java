

public class Principal {
	
	public static void main(String[] args) {
		
		Fila f = new Fila();

		if(f.verifica()) {
			System.out.println("Lista vazia!");
		}
		
		f.inserir("Igor");
		f.inserir("Fulano");
		f.inserir("Sicrano");
		f.inserir("Beltrano");
		f.inserir("Astrogildo");
		
		
		
		if(!f.verifica()) {
			System.out.println("Lista com elementos");
			System.out.println("====================");
		}
		
		f.mostrar();
		
		System.out.println("====================");
		
		System.out.println("Primeiro elemento removido-->"+f.remover());
		System.out.println("Segundo elemento removido-->"+f.remover());
		
		
		System.out.println("====================");
		
		f.mostrar();
		
		
		
		
	}

}
