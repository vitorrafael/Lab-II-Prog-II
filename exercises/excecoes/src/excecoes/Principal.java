package excecoes;

public class Principal {

	public static void main(String[] args) {
		ArCondicionado arCondicionado = new ArCondicionado(22.0);
		
		arCondicionado.aumentaTemperatura1(13);
		arCondicionado.diminuiTemperatura1(10);
		
		try {
			arCondicionado.aumentaTemperatura(13);
		} catch (IllegalArgumentException e) {
			System.out.println(e.getMessage());
		}
		
		try {
			arCondicionado.diminuiTemperatura(10);
		} catch (IllegalArgumentException e) {
			System.out.println(e.getMessage());
		}
	}
}
