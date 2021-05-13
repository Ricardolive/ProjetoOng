package Ong;

public class Aluno extends PessoaFisica{

	
	public Aluno(String nome,String cpf, String endereco, String telefone, String celular) {
		super(nome, cpf, endereco, telefone, celular);
		 
	}

	public void imprimir() {
		
		System.out.println("Nome: " + this.getNome());
		System.out.println("CPF: " + this.getCpf());
		System.out.println("Endereço: " + this.getEndereco());
		System.out.println("Telefone: " + this.getTelefone());
		System.out.println("Celular: " + this.getCelular());
	
	}
	


}
