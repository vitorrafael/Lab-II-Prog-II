
public class ContaCorrente extends ContaBancaria {
	
	private int transacoesRealizadas;
	
	public ContaCorrente(String senha) {
		super(senha);
	}
	
	@Override
	public void saca(double valor) {
		this.setSaldo(getSaldo() - valor);
		transacoesRealizadas++;
	}

	@Override
	public void deposita(double valor) {
		this.setSaldo(getSaldo() + valor);
		transacoesRealizadas++;
	}

	@Override
	public void tiraExtrato() {
		System.out.println(this);
	}
	
	public int getTransacoesRealizadas() {
		return transacoesRealizadas;
	}

	public void setTransacoesRealizadas(int transacoesRealizadas) {
		this.transacoesRealizadas = transacoesRealizadas;
	}

	@Override
	public String toString() {
		return String.format("Conta Corrente [transacoesRealizadas=%d, toString=%s]", this.transacoesRealizadas, super.toString());
	}

}
