package excecoes;

public class ArCondicionado {
	
	private double temperaturaAtual;
	
	public ArCondicionado(double temperatura) {
		this.temperaturaAtual = temperatura;
	}
	
	public void aumentaTemperatura(double tempMais) {
	    if (this.temperaturaAtual + tempMais > 32) throw new IllegalArgumentException("Temperatura excedeu o limite máximo de 32 graus"); 
		
	    this.temperaturaAtual += tempMais;
	}

	public void diminuiTemperatura(double tempMenos) {
		if (this.temperaturaAtual - tempMenos < 16) throw new IllegalArgumentException("Temperatura excedeu o limite mínimo de 16 graus");
	    this.temperaturaAtual -= tempMenos;
	}
	
	public void aumentaTemperatura1(double tempMais) {
		try {
			if (this.temperaturaAtual + tempMais > 32 | this.temperaturaAtual + tempMais < 16) throw new IllegalArgumentException();
			this.temperaturaAtual += 32;
		} catch (IllegalArgumentException e) {
			System.out.println("Error: Temperatura inválida.\n A temperatura interior foi mantida em " + this.temperaturaAtual);
		}
	}
	
	public void diminuiTemperatura1(double tempMenos) {
		try {
			if (this.temperaturaAtual - tempMenos > 32 | this.temperaturaAtual - tempMenos < 16) throw new IllegalArgumentException();
			this.temperaturaAtual += 32;
		} catch (IllegalArgumentException e) {
			System.out.println("Error: Temperatura inválida.\n A temperatura interior foi mantida em " + this.temperaturaAtual);
		}
	}
}
