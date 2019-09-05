package contas;

public class Conta {
private String banco;
private int agencia;
private int numeroconta;
private double saldo;
public Conta(String Banco, int agencia, int numeroconta, double saldo) {
	setBanco(Banco); setAgencia(agencia); setNumeroconta(numeroconta); setSaldo(saldo);
}
public String getBanco() {
	return banco;
}
public void setBanco(String banco) {
	this.banco = banco;
}
public int getAgencia() {
	return agencia;
}
public void setAgencia(int agencia) {
	this.agencia = agencia;
}
public int getNumeroconta() {
	return numeroconta;
}
public void setNumeroconta(int numeroconta) {
	this.numeroconta = numeroconta;
}
public double getSaldo() {
	return saldo;
}
public void setSaldo(double saldo) {
	if(saldo>0)
	this.saldo = saldo;
}
public void setSaque(double saque) {
	if(saque<=saldo) {
		saldo-= saque;
	}
}
public void setDeposito(double deposito) {
	if(deposito>0)
		saldo += deposito;
}
@Override
public String toString() {
	StringBuilder builder = new StringBuilder();
	builder.append("Conta [banco=");
	builder.append(banco);
	builder.append(", agencia=");
	builder.append(agencia);
	builder.append(", numeroconta=");
	builder.append(numeroconta);
	builder.append(", saldo=");
	builder.append(saldo);
	builder.append(", getBanco()=");
	builder.append(getBanco());
	builder.append(", getAgencia()=");
	builder.append(getAgencia());
	builder.append(", getNumeroconta()=");
	builder.append(getNumeroconta());
	builder.append(", getSaldo()=");
	builder.append(getSaldo());
	builder.append("]");
	return builder.toString();
}

}
