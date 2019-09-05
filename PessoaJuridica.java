
public class PessoaJuridica extends Pessoa {

public PessoaJuridica(String nome, String endereço) {
		super(nome, endereço);
		// TODO Auto-generated constructor stub
	}
private String cnpj;
 private String Tipoempresa;
public String getCnpj() {
	return cnpj;
}
public void setCnpj(String cnpj) {
	if(cnpj.length()==11)
	this.cnpj = cnpj;
}
public String getTipoempresa() {
	return Tipoempresa;
}
public void setTipoempresa(String tipoempresa) {
	if(tipoempresa.length()!=0)
	Tipoempresa = tipoempresa;
}
@Override
public String toString() {
	StringBuilder builder = new StringBuilder();
	builder.append("PessoaJuridica [cnpj=");
	builder.append(cnpj);
	builder.append(", Tipoempresa=");
	builder.append(Tipoempresa);
	builder.append(", getCnpj()=");
	builder.append(getCnpj());
	builder.append(", getTipoempresa()=");
	builder.append(getTipoempresa());
	builder.append(", getNome()=");
	builder.append(getNome());
	builder.append(", getEndereço()=");
	builder.append(getEndereço());
	builder.append(", toString()=");
	builder.append(super.toString());
	builder.append(", getClass()=");
	builder.append(getClass());
	builder.append(", hashCode()=");
	builder.append(hashCode());
	builder.append("]");
	return builder.toString();
}
 
}
