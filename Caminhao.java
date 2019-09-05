package Veiculos;

public class Caminhao extends Veiculos {

	public Caminhao(boolean motor) {
		super(motor);
		// TODO Auto-generated constructor stub
	}
  private int Eixos;
  
public int getEixos() {
	return Eixos;
}
public void setEixos(int eixos) {
	if(eixos>0)
	Eixos = eixos;
}
@Override
public String toString() {
	StringBuilder builder = new StringBuilder();
	builder.append("Caminhao [Eixos=");
	builder.append(Eixos);
	builder.append("]");
	builder.append(super.toString());
	return builder.toString();
}
  
}
