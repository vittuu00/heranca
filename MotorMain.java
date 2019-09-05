package Veiculos;

public class MotorMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	Veiculos veic =new Veiculos(true);
	System.out.println(veic);
	System.out.println("--------###--------");
	
	Caminhao caminhao = new Caminhao(true);
	caminhao.setEixos(10);
	System.out.println(caminhao);
	System.out.println("--------###--------");
	
	Carros carros =new Carros(true);
	carros.setPortas(4);
	System.out.println(carros);
	System.out.println("--------###--------");
	
	
	Motos moto = new Motos(false);
	moto.setCilindradas(800);
	System.out.println(moto);
	
	}	

}
