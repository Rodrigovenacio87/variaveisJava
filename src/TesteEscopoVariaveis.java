
public class TesteEscopoVariaveis {
	
	public static void main(String[] args) {
		
	
	int idade = 20;
	int quantidadePessoas = 1;
	//boolean acompanhado = true;
	//boolean acompanhado = quantidadePessoas >=2;
	
	boolean acompanhado;

	if (quantidadePessoas>=2) {
		acompanhado  = true;
	}else {
		acompanhado = false;
		
		System.out.println("Infelizmente voce não pode entrar");
	}
	
	System.out.println("Seja Bem vindo !");
	}
}