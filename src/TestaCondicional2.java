
public class TestaCondicional2 {
	
	public static void main(String[] args) {
		System.out.println("Testando Condicionais");
		int idade = 18;
		int quantidadePessoas = 2;
		//boolean acompanhado = true;
		boolean acompanhado = quantidadePessoas >=2;

		if (idade >= 18 &&  acompanhado) {
			System.out.println("Seja Bem vindo !");
		}else {
			System.out.println("Infelizmente voce n�o pode entrar");
		}
	}
}
