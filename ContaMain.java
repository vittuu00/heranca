package contas;

public class ContaMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Conta conta = new Conta("Santander", 123, 456, 1083.00);
		System.out.println(conta);
		System.out.println("---------####--------");
		
		ContaSimples simples = new ContaSimples("Brasil",321,654,1000.00);
		simples.setSaldopoupanca(1400);
		System.out.println(simples);
		simples.setDeposito(800);
		simples.setSaque(400);
		System.out.println(simples);
		System.out.println("---------####--------");
		
		ContaEspecial especial = new ContaEspecial("Itaú",213,435,1000);
		especial.Especial(140, 800);
		especial.SetDeposito(140);
		especial.SetSaque(1800);
		System.out.println(especial);
		
		
		
	}

}
