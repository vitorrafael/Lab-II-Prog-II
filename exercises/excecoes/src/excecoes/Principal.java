package excecoes;

public class Principal {

	public static void main(String[] args) {
		ArCondicionado arCondicionado = new ArCondicionado(22.0);
		
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
