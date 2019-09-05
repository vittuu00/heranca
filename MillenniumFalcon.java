package nave;

public class MillenniumFalcon extends Apolo11 {

	private float classeHiperpropulsor;

	public float getClasseHiperpropulsor() {
		return classeHiperpropulsor;
	}

	public void setClasseHiperpropulsor(float classeHiperpropulsor) {
		this.classeHiperpropulsor = classeHiperpropulsor;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("MillenniumFalcon [classeHiperpropulsor=");
		builder.append(classeHiperpropulsor);
		builder.append("]");
		builder.append(super.toString());
		return builder.toString();
	}
	
}
