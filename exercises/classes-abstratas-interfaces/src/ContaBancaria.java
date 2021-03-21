import java.util.Scanner;

public abstract class ContaBancaria {
	
	private String senha;
	private int numero;
	private double saldo;

	
	ContaBancaria(String senha) {
		this.senha = senha;
	}
	
	ContaBancaria(String senha, int numero) {
		this(senha);
		this.numero = numero;
	}

	public ContaBancaria(String senha, int numero, double saldo) {
		this(senha, numero);
		this.saldo = saldo;
	}
	
	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	public abstract void saca(double valor);
	public abstract void deposita(double valor);
	public abstract void tiraExtrato();
	
	public boolean alteraSenha(String novaSenha) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Digite sua senha atual: ");
		String senhaAtual = scanner.nextLine();
		if (this.senha.equals(senhaAtual)) {
			this.senha = novaSenha;
			
			scanner.close();
			return true;
		}
		
		scanner.close();
		return false;
	}
	
	@Override
	public String toString() {
		return String.format("Conta Bancaria [senha=%s, numero=%d, saldo=%.2f]", this.senha, this.numero, this.saldo);
	}
}
