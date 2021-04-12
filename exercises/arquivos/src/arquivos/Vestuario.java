package arquivos;

public class Vestuario extends Produto {
	
	private int qtdeEstoque;
	
	public Vestuario(String nome, String descricao, double preco, int qtdeEstoque) {
		super(nome, descricao, preco);
		this.qtdeEstoque = qtdeEstoque;
	}
	
	public int getQtdeEstoque() {
		return qtdeEstoque;
	}
	
	public void setQtdeEstoque(int qtdeEstoque) {
		this.qtdeEstoque = qtdeEstoque;
	}
}
