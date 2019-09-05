package midias;

public class Item {
	private int codigo;
	private String descricao;
	public Item(int codigo, String descricao) {
		// TODO Auto-generated constructor stub
		setCodigo(codigo);
		setDescricao(descricao);
		
	}
	public int getCodigo() {
		return codigo;
	}
	public void setCodigo(int codigo) {
		if(codigo>0)
		this.codigo = codigo;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		if(descricao.length()>0)
		this.descricao = descricao;
	}
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Item [codigo=");
		builder.append(codigo);
		builder.append(", descricao=");
		builder.append(descricao);
		builder.append(", getCodigo()=");
		builder.append(getCodigo());
		builder.append(", getDescricao()=");
		builder.append(getDescricao());
		builder.append(", getClass()=");
		builder.append(getClass());
		builder.append(", hashCode()=");
		builder.append(hashCode());
		builder.append(", toString()=");
		builder.append(super.toString());
		builder.append("]");
		return builder.toString();
	}
	

}
