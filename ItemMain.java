package midias;

public class ItemMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Item item = new Item(666,"Decriçã dnv");
		/* item.setCodigo(666);
		item.setDescricao("Carai de programa ");
		*/
		System.out.println(item);
		System.out.println("------##------");
		
		
		Livro livro = new Livro(777,"Descrição caraio");
		livro.setAutor("Pedro Ventura");
        System.out.println(livro);
        System.out.println("------##------");
		
		Midia midia = new Midia(555,"Descrição garaio");
        midia.setDuracao(123);
        midia.setGravadora("Gravadora garaio");
        System.out.println(midia);
        System.out.println("------##------");
        
        CD cd = new CD(666,"Descrição");
        cd.Midia1(54, "Gravadora Ventura");
        cd.CD1(15, "Los Hermanos", "Ventura");
        System.out.println(cd);
        System.out.println("------##------");
        
        Vhs vhs = new Vhs(333, "Descrição novamente");
        vhs.Midia1(13, "Brasil Slate");
        vhs.setTitulo("Titulo");
        System.out.println(vhs);
        System.out.println("------##------");
	}

}
