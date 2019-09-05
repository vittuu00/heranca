
public class Pessoafisica extends Pessoa {
	private String cpf;
	private String estadocivil;
	
	public Pessoafisica(String nome, String endereço) {
		super(nome,endereço);
	}
	public Pessoafisica(String nome) {
		super(nome);
		
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
	      if(cpf.length()==11)
		this.cpf = cpf;
	}
	public String getEstadocivil() {
		return estadocivil;
	}
	public void setEstadocivil(String estadocivil) {
		if(estadocivil.length()>0)
		this.estadocivil = estadocivil;
	}
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Pessoafisica [cpf=");
		builder.append(cpf);
		builder.append(", estadocivil=");
		builder.append(estadocivil);
		builder.append("]");
		builder.append(super.toString());
		return builder.toString();
	}
	

}
