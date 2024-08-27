
public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Pilha p = new Pilha();
		
		if(p.verificaPilha()) {
			System.out.println("Pilha vazia");
		}
		
		
		p.inserir("Teste");
		p.inserir("Teste1");
		p.inserir("Teste2");
		p.inserir("Teste3");
		
		System.out.println("========================");
		
		if(!p.verificaPilha()) {
			System.out.println("Pilha com elementos");
		}
		
		System.out.println("========================");
		
		p.mostrar();
		
		System.out.println("========================");
		
		System.out.println(p.pegarElemento());
		System.out.println(p.pegarElemento());
		
		
		System.out.println("========================");
		
		p.mostrar();
		

	}

}
