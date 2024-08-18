package controller;

public class ApareceNumeroController {

	public ApareceNumeroController() {
		super();
	}

	public int ApareceNumero (int n1, int n2) {
		
		//Condição de parada: Quando o número chega a 0, a função retorna 0;
		if (n1 == 0) {
			return 0;
		}
		
		// A função divide n1 por 10, para eliminar o último dígito a cada chamada e verificar se o último dígito de n1 é igual a n2.
	
		if (n1 % 10 == n2) {
			return 1 + ApareceNumero(n1 / 10, n2);
		} else {
			return ApareceNumero(n1 / 10, n2);
		}
	}
}
