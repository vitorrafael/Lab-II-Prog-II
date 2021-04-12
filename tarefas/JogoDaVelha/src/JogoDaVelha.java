public class JogoDaVelha {
	
	private char[][] tabuleiro;
	private final char CARACTERE_VAZIO = '\u0000';
	
	public JogoDaVelha(int dimensoesTabuleiro) {
		this.tabuleiro = new char[dimensoesTabuleiro][dimensoesTabuleiro];
	}
	
	public char[][] getTabuleiro() {
		return tabuleiro;
	}
	
	public void setTabuleiro(char[][] tabuleiro) {
		this.tabuleiro = tabuleiro;
	}
	
	public char getCaractereVazio() {
		return CARACTERE_VAZIO;
	}
	
	public boolean realizaJogada(int linha, int coluna, char simboloJogador) {
		try {
			if (tabuleiro[linha][coluna] == this.CARACTERE_VAZIO) {
				tabuleiro[linha][coluna] = simboloJogador;
				return true;	
			} else {
				return false;
			}
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Error: Posição Inválida");
		}
		return false;
	}
	
	public boolean verificaGanhador() {
		
		// Verifica Diagonal Principal e Diagonal Secundaria
		int somaDiagonalPrincipal = 0, somaDiagonalSecundaria = 0;
		for(int i = 0; i < this.tabuleiro.length; i++) {
			
			if (this.tabuleiro[i][i] != this.CARACTERE_VAZIO) {
				somaDiagonalPrincipal += this.tabuleiro[i][i] == 'X' ? 1 : -1;
			}
			
			if (this.tabuleiro[i][(tabuleiro.length - 1) - i] != this.CARACTERE_VAZIO) {
				somaDiagonalSecundaria += this.tabuleiro[i][(tabuleiro.length - 1) - i] == 'X' ? 1 : -1;
			}
		
		}
		
		if (somaDiagonalPrincipal == this.tabuleiro.length || somaDiagonalPrincipal == -this.tabuleiro.length ||
			somaDiagonalSecundaria == this.tabuleiro.length || somaDiagonalSecundaria == -this.tabuleiro.length) return true;
		
		// Verifica Linhas e Colunas
		for (int i = 0; i < this.tabuleiro.length; i++) {
			int somaLinha = 0, somaColuna = 0;
			for (int j = 0; j < this.tabuleiro.length; j++) {
				if (this.tabuleiro[i][j] != this.CARACTERE_VAZIO) {
					somaLinha += this.tabuleiro[i][j] == 'X' ? 1 : -1;
				}
				
				if (this.tabuleiro[j][i] != this.CARACTERE_VAZIO) {
					somaColuna += this.tabuleiro[j][i] == 'X' ? 1 : -1;
				}
			}
			
			if (somaLinha == this.tabuleiro.length || somaLinha == -this.tabuleiro.length ||
				somaColuna == this.tabuleiro.length || somaColuna == -this.tabuleiro.length) return true;
		}
		
		return false;
	}
	
	public boolean verificaTabuleiroCheio() {
		for (int i = 0; i < this.tabuleiro.length; i++) {
			for (int j = 0; j < this.tabuleiro.length; j++) {
				if (this.tabuleiro[i][j] == this.CARACTERE_VAZIO) return false;
			}
		}
		
		return true;
	}
	
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		
		for (int i = 0; i < this.tabuleiro.length; i++) {
			String linhaAtual = "";
			String separador = "";
			for (int j = 0; j < this.tabuleiro[i].length; j++) {
				linhaAtual += String.format(" %c ", this.tabuleiro[i][j]);
				separador += "---";
				
				if (j < this.tabuleiro.length - 1) {
					linhaAtual += "|";
					separador += "|";
				} else {
					linhaAtual += "\n";
					separador += "\n";
				}
				
			}
			sb.append(linhaAtual);
			if (i < this.tabuleiro.length - 1) sb.append(separador);
		}
		
		return sb.toString();
	}
}
