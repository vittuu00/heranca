package contas;

public class ContaEspecial extends Conta {

	public ContaEspecial(String Banco, int agencia, int numeroconta, double saldo) {
		super(Banco, agencia, numeroconta, saldo);
		// TODO Auto-generated constructor stub
	}
	
	private int diassemjuros;
	private double limite;
	public void Especial(int diassemjuros, double limite) {
		setDiassemjuros(diassemjuros); setLimite(limite);
	}
	public int getDiassemjuros() {
		return diassemjuros;
	}
	public void setDiassemjuros(int diassemjuros) {
		if(diassemjuros>0)
		this.diassemjuros = diassemjuros;
	}
	public double getLimite() {
		return limite;
	}
	public void setLimite(double limite) {
		if(limite>0)
		this.limite = limite;
	}
	public void SetDeposito(double deposito) {
		if(deposito>0)
			setSaldo(deposito+this.getSaldo());
		
	}
	public void SetSaque(double saque) {
			setSaldo(getSaldo()-saque);
	}
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("ContaEspecial [diassemjuros=");
		builder.append(diassemjuros);
		builder.append(", limite=");
		builder.append(limite);
		builder.append(", getDiassemjuros()=");
		builder.append(getDiassemjuros());
		builder.append(", getLimite()=");
		builder.append(getLimite());
		builder.append(super.toString());
		return builder.toString();
	}

}
