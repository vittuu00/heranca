package contas;

public class ContaSimples extends Conta {
	public ContaSimples(String Banco, int agencia, int numeroconta, double saldo) {
		super(Banco, agencia, numeroconta, saldo);
		// TODO Auto-generated constructor stub
	}

	private double saldopoupanca;

	public double getSaldopoupanca() {
		return saldopoupanca;
	}

	public void setSaldopoupanca(double saldopoupanca) {
		if(saldopoupanca>0)
		this.saldopoupanca = saldopoupanca;
	}
	public void setDeposito(double deposito) {
		if(deposito>0)
			saldopoupanca+=deposito;
	}

	public void setSaque(double Saque) {
		if(Saque< saldopoupanca) 
			saldopoupanca+= -Saque;
		}
	
  	
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("ContaSimples [saldopoupanca=");
		builder.append(saldopoupanca);
		builder.append(super.toString());
		return builder.toString();
	}
	

}
