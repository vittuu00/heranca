
public class PessoaMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         Pessoa pessoa =new Pessoa("Pedro","Brasil");
        /** pessoa.setNome("Pedro");
         pessoa.setEndereço("Brasil"); **/
         System.out.println(pessoa);
         Pessoa pess = new Pessoa("Rod");
         pess.setEndereço("brasil");
         System.out.println(pess);
         System.out.println("-----------###-----------");     
	
	     Pessoafisica p = new Pessoafisica("pedro","braaaaaaa");
	     p.setCpf("08485949676");
	     p.setEstadocivil("S");
	    System.out.println(p);
	System.out.println("-----------###-----------");
	 
	PessoaJuridica ju = new PessoaJuridica("Pedro","DinBrasil");
	ju.setTipoempresa("Varejista");
	System.out.println(ju);
	
	}
	
	

}
