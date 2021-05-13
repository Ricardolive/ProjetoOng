package Ong;

public class Main {
	
	public static void main(String[]args) {
		
	 Pessoa pes = new Escola("Escola", "43.888.456/0001.66", "Rua da escola", "31313131", "91919191");
 		
	   pes.imprimir();	
		System.out.println();
		
		pes = new Doador("Doador", "Endereço do doador", "32323232", "92929292");
		pes.imprimir();
		
		pes = new Aluno("Aluno", "45.479.645-03", "Rua do aluno", "3333333333333", "93939393");
		System.out.println();
		pes.imprimir();
				
				
		
	}

}
