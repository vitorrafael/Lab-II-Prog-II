package arquivos;

public abstract class Produto {
	
	private String nome;
	private String descricao;
	private double preco;
	
	public Produto(String nome, String descricao, double preco) {
		this.nome = nome;
		this.descricao = descricao;
		this.preco = preco;
	}
	
	public String getNome() {
		return nome;
	}
	
	public String getDescricao() {
		return descricao;
	}
	
	public double getPreco() {
		return preco;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	
	public void setPreco(double preco) {
		this.preco = preco;
	}
}
