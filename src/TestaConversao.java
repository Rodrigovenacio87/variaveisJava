
public class TestaConversao {
	
	public static void main(String [] args) {
		
		//isso é um casting uma coversao 
		double salario = 1270.50;
		int valor = (int) salario;
		System.out.println(valor);
		
		//para numeros grandes, por exemplo 2 bilhoes, utilizamos o tipo long
		long numeroGrande = 32432424242l;
		
		// para valores pequenos utilizamos o short
		short valorPequeno = 2131;
		
		//para valores menores ainda utilizamos o byte
		byte b = 127;
		
		//float tambem é do tipo flutuante usando casting:
		float pontoFlutuante = (float) 3.14;
		
		// ou podemos declarar assim:
		float pontoFlutuante2 = 3.14f;
		
	}
}