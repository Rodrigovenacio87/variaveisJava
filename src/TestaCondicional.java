
public class TestaCondicional {

	public static void main(String[] args) {
		System.out.println("Testando Condicionais");
		int idade = 16;
		int quantidadePessoas = 3;

		if (idade >= 18) {
			System.out.println("Voc� tem mais de 18 anos");
			System.out.println("Seja Bem vindo !");
		}else {
			if(quantidadePessoas >= 2) {
			System.out.println("Voce n�o 18 anos, mas pode entrar"
					+ " pois esta acompnhando");
		} else {
			System.out.println("Infelizmente voc� n�o pode entrar");
		}
	}
	}
}