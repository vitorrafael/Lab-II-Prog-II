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
}
