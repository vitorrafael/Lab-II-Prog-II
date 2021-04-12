package arquivos;

public class Eletrodomestico extends Produto {

	private double valorIPI;
	
	public Eletrodomestico(String nome, String descricao, double preco, double valorIPI) {
		super(nome, descricao, preco);
		this.valorIPI = valorIPI;
	}
	
	public double getValorIPI() {
		return valorIPI;
	}
	
	public void setValorIPI(double valorIPI) {
		this.valorIPI = valorIPI;
	}
}
