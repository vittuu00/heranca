package midias;

public class ItemMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Item item = new Item(666,"Decri�� dnv");
		/* item.setCodigo(666);
		item.setDescricao("Carai de programa ");
		*/
		System.out.println(item);
		System.out.println("------##------");
		
		
		Livro livro = new Livro(777,"Descri��o caraio");
		livro.setAutor("Pedro Ventura");
        System.out.println(livro);
        System.out.println("------##------");
		
		Midia midia = new Midia(555,"Descri��o garaio");
        midia.setDuracao(123);
        midia.setGravadora("Gravadora garaio");
        System.out.println(midia);
        System.out.println("------##------");
        
        CD cd = new CD(666,"Descri��o");
        cd.Midia1(54, "Gravadora Ventura");
        cd.CD1(15, "Los Hermanos", "Ventura");
        System.out.println(cd);
        System.out.println("------##------");
        
        Vhs vhs = new Vhs(333, "Descri��o novamente");
        vhs.Midia1(13, "Brasil Slate");
        vhs.setTitulo("Titulo");
        System.out.println(vhs);
        System.out.println("------##------");
	}

}
