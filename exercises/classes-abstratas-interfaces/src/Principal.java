import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		int numeroContas;
		do {
			System.out.println("Quantas contas você irá criar?");
			numeroContas = Integer.parseInt(scanner.nextLine());
		} while (numeroContas <= 0);

		ContaBancaria[] contas = new ContaBancaria[numeroContas];
		
		int tipoConta;
		int counter = 0;
		
		while (counter < numeroContas) {
			System.out.println("Digite o tipo de conta que você deseja:\n 1 - Conta Poupanca\n 2 - Conta Bancaria");
			tipoConta = Integer.parseInt(scanner.nextLine());
			
			if (tipoConta == 1) {
				contas[counter++] = new ContaPoupanca("123456");
			} else if(tipoConta == 2) {
				contas[counter++] = new ContaCorrente("123456");
			} else {
				System.out.println("Tipo de conta inválido");
			}
		}
		
		scanner.close();
		
		for (ContaBancaria conta : contas) {
			conta.setNumero((int)(1 + Math.random() * 10000));
			if (conta instanceof ContaPoupanca) {
				((ContaPoupanca) conta).setTaxaRendimento(Math.random());
			}
		}
		
		for (ContaBancaria conta : contas) {
			conta.deposita(Math.random() * 600);
			conta.saca(Math.random() * 100);
			conta.tiraExtrato();
		}
		
		for (ContaBancaria conta : contas) {
			if (conta instanceof ContaPoupanca) 
				System.out.println(String.format("Taxa de Rendimento da Conta Poupança %d é %.2f", conta.getNumero(), ((ContaPoupanca) conta).getTaxaRendimento()));
			else if(conta instanceof ContaCorrente)
				System.out.println(String.format("Quantidade de Transações Realizadas da Conta Corrente %d é %d", conta.getNumero(), ((ContaCorrente) conta).getTransacoesRealizadas()));
		}
		
		Rentavel[] rentaveis = new Rentavel[(int)(1 + Math.random() * 15)];
		for (int i = 0; i < rentaveis.length; i++) {
			rentaveis[i] = Math.random() < 0.5 ? new ContaPoupanca("123456", 0.5 + Math.random() * 500) : new FundosImobiliario(0.5 + Math.random() * 500);
		}
		
		for (Rentavel rentavel : rentaveis) {
			System.out.println(rentavel.calculaRendimento());
		}
	}
		
}
