package nave;

public class NaveMain {

	public static void main(String[] args) {
		
		Nave n = new Nave();
		n.setVelocidadeMaxima(1289.31232);
		System.out.println(n);
		
		Apolo11 apolo = new Apolo11();
		apolo.setTipoCombustível("Gás");
		apolo.setVelocidadeMaxima(1289.31232);
		System.out.println(apolo);
		
		MillenniumFalcon m =  new MillenniumFalcon();
		m.setClasseHiperpropulsor(12);
		m.setTipoCombustível("gás");
		m.setVelocidadeMaxima(1289.31232);
		System.out.println(m);
		
		
	}
}
