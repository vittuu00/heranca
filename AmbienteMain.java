package ambiente;

public class AmbienteMain {

	public static void main(String[] args) {
		
		Ambiente a = new Ambiente();
		
		Quarto q = new Quarto();
		q.setArea(34);
		q.setCapacidade(123);
		System.out.println(q);
		
		Sala s = new Sala();
		s.setArea(23);
		s.setTv(true);
		System.out.println(s);
		
		Banheiro b = new Banheiro();
		b.setArea(12);
		b.setBanheira(true);
		System.out.println(b);
		
		Cozinha c = new Cozinha();
		c.setArea(42);
		c.setMicroondas(true);
		System.out.println(c);
	}

}
