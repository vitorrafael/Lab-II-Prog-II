
public class ContaPoupanca extends ContaBancaria implements Rentavel {

	private double taxaRendimento;
	
	public ContaPoupanca(String senha) {
		super(senha);
	}
	
	public ContaPoupanca(String senha, double saldo) {
		super(senha);
		this.setSaldo(saldo);
	}
	
	@Override
	public void saca(double valor) {
		this.setSaldo(getSaldo() - valor);
	}

	@Override
	public void deposita(double valor) {
		this.setSaldo(getSaldo() + valor);
	}

	@Override
	public void tiraExtrato() {
		System.out.println(this);
	}
	
	public double getTaxaRendimento() {
		return taxaRendimento;
	}
	
	public void setTaxaRendimento(double taxaRendimento) {
		this.taxaRendimento = taxaRendimento;
	}
	
	@Override
	public double calculaRendimento() {
		return this.getSaldo() * this.getTaxaRendimento();
	}
	
	@Override
	public String toString() {
		return String.format("Conta Poupanca [taxaRendimento=%.2f, toString()=%s]", this.taxaRendimento, super.toString());
	}
}
