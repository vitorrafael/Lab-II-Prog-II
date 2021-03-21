
public class FundosImobiliario implements Rentavel {
	
	private double saldo;
	
	
	public FundosImobiliario() {
		
	}
	
	public FundosImobiliario(double saldo) {
		this.saldo = saldo;
	}
	
	public double getSaldo() {
		return saldo;
	}
	
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	
	@Override
	public String toString() {
		return String.format("FundoImobiliario [saldo=%.2f]", this.saldo);
	}
	
	@Override
	public double calculaRendimento() {
		return this.saldo * (0.25 + Math.random() * 2.0);
	}

}
