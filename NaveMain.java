package nave;

public class NaveMain {

	public static void main(String[] args) {
		
		Nave n = new Nave();
		n.setVelocidadeMaxima(1289.31232);
		System.out.println(n);
		
		Apolo11 apolo = new Apolo11();
		apolo.setTipoCombust�vel("G�s");
		apolo.setVelocidadeMaxima(1289.31232);
		System.out.println(apolo);
		
		MillenniumFalcon m =  new MillenniumFalcon();
		m.setClasseHiperpropulsor(12);
		m.setTipoCombust�vel("g�s");
		m.setVelocidadeMaxima(1289.31232);
		System.out.println(m);
		
		
	}
}
