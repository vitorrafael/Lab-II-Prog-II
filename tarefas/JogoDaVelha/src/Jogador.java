
public class Jogador {

	private String nome;
	private int pontos;
	
	public Jogador(String nome) {
		this.nome = nome;
		this.pontos = 0;
	}
	
	public void incrementaPontuacao() {
		this.pontos++;
	}
	
	public String getNome() {
		return nome;
	}
	
	public int getPontos() {
		return pontos;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public void setPontos(int pontos) {
		this.pontos = pontos;
	}
	
	@Override
	public String toString() {
		return "Jogador [nome=" + this.nome + ", pontos=" + this.pontos + "]";
	}
}
