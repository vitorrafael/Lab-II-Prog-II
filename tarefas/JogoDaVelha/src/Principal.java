import java.util.Scanner;

public class Principal {

	public static final int JOGAR_NOVAMENTE = 1;
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Digite o nome do jogador: ");
		Jogador jogadorX = new Jogador(scanner.nextLine());
		
		System.out.print("Digite o nome do jogador: ");
		Jogador jogadorO = new Jogador(scanner.nextLine());

		int tamanho = 0;
		while (tamanho <= 0) {
			System.out.print("Digite o tamanho do tabuleiro: ");
			tamanho = Integer.parseInt(scanner.nextLine());
		}
		
		boolean jogarPartida = true;
		while (jogarPartida) {
 			JogoDaVelha jogoDaVelha = new JogoDaVelha(tamanho);
					
			char proximoAJogar = 'X';
			int linha, coluna;
			while (!jogoDaVelha.verificaGanhador() && !jogoDaVelha.verificaTabuleiroCheio()) {
				System.out.println();
				System.out.println(jogoDaVelha);
				
				System.out.printf("Jogador %c - Digite a linha de sua jogada: [0 até %d] ", proximoAJogar, tamanho - 1);
				linha = Integer.parseInt(scanner.nextLine());
				
				System.out.printf("Jogador %c - Digite a coluna de sua jogada: [0 até %d] ", proximoAJogar, tamanho - 1);
				coluna = Integer.parseInt(scanner.nextLine());
				
				boolean jogadaExecutada = jogoDaVelha.realizaJogada(linha, coluna, proximoAJogar);
				
				if (jogadaExecutada) {
					proximoAJogar = proximoAJogar == 'X' ? 'O' : 'X';
				}
			}
			
			if (jogoDaVelha.verificaGanhador()) {
				Jogador ganhador = proximoAJogar == 'X' ? jogadorO : jogadorX;
				ganhador.incrementaPontuacao();
			}
			
			System.out.println("\nJogo Encerrado!\nTabuleiro Final:");
			System.out.println(jogoDaVelha);
			
			int jogarNovamente;
			do {
				System.out.println("Jogar Novamente?\n\t1 - Sim \n\t2 - Não");
				jogarNovamente = Integer.parseInt(scanner.nextLine());
			} while (jogarNovamente < 1 && jogarNovamente > 2);
			
			jogarPartida = jogarNovamente == JOGAR_NOVAMENTE;
		}

		imprimeGanhador(jogadorX, jogadorO);
		
		scanner.close();
	}
	
	public static void imprimeGanhador(Jogador jogadorX, Jogador jogadorO) {
		if (jogadorX.getPontos() > jogadorO.getPontos()) {
			System.out.println("Jogador X Ganhou!");
			System.out.println(jogadorX);
		} else if(jogadorO.getPontos() > jogadorX.getPontos()) {
			System.out.println("Jogador O Ganhou!");
			System.out.println(jogadorO);
		} else {
			System.out.println("Empate");
			System.out.println("Jogador X: " + jogadorX);
			System.out.println("Jogador O: " + jogadorO);
		}
	}
}
