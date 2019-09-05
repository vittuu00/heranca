package Animais;

public class AnimaisMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Animal animal = new Animal(18, "Jaguatirica", 15);
        System.out.println(animal);
        System.out.println("-------###--------");
        
        
        Mamifero mamifero = new Mamifero(13.5 ,"Dog", 2);
        mamifero.Mamifer(5, "cordopelo", true);
        System.out.println(mamifero);
        System.out.println("-------###--------");
        
        Gato gato= new Gato(13.5, "Gato", 5);
        gato.Mamifer(4, "cordopel",true);
        gato.setUnhas(8);
        System.out.println(gato);
        System.out.println("-------###--------");
        
        cao cao = new cao(15, "Doguinho", 5);
        cao.setCordapta("Amarela");
        cao.Mamifer(4, "cordopelo", true);
        System.out.println("-------###--------");
        
        Reptil rep = new Reptil(13,"larg",6);
        rep.Rept("é um reptil verde rastejador com patas azuis laranjas de cor teta", true);
        System.out.println(rep);
        System.out.println("-------###--------");
        
        Tartaruga tar = new Tartaruga(160,"tart",9);
        rep.Rept("é um reptil", true);
        tar.setAquatica("é aquatica");
        tar.setRegiaonasc("Balneario");
        System.out.println(tar);
        System.out.println("-------###--------");
        
        Lagarto lag = new Lagarto(13,"larg",9);
        lag.Rept("é uma reptil venenoso caraio", false);
        lag.setDescricao("O veneno desse lagarto mata uma pessoa em 0.0005 segundos de explosão");
        lag.setVeneno(true);
        System.out.println(lag);
	}

}
