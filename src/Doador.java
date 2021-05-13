package Ong;

public class Doador extends Pessoa{
	
	 
	public Doador(String nome, String endereco, String telefone, String celular) {
		super(nome, endereco, telefone, celular);

	}


	private String doacao;
	private int quanDoacao;
	
 

	public String getDoacao() {
		return doacao;
	}

	public void setDoacao(String doacao) {
		this.doacao = doacao;
	}

	public int getQuanDoacao() {
		return quanDoacao;
	}

	public void setQuanDoacao(int quanDoacao) {
		this.quanDoacao = quanDoacao;
	}
	
	
	public void imprimir() {
		System.out.println("Nome: " + this.getNome());
		System.out.println("Endereço: " + this.getEndereco());
		System.out.println("Telefone: : " + this.getTelefone());
		System.out.println("Celular: " + this.getCelular());
		
	}

}
