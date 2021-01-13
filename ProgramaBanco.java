package modelo.banco;

public class ProgramaBanco {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("********SISTEMA BANCARIO***********");
		
		IConta conta1 = new ContaCorrente("BB", "020", "29-12-2020");
		
		IConta conta2 = new ContaPoupanca( "AB", "010", "29-12-2020");
		IConta conta3 = new ContaSalario( "ADB", "111", "02-04-2019");
		Cliente cliente1 = new Cliente("felipe", "123","12/06/2010");
		
		cliente1.adicionarContaCliente(conta1);
		cliente1.adicionarContaCliente(conta2);
		cliente1.adicionarContaCliente(conta3);
		cliente1.adicionartelefone("89-7626-8767");
		cliente1.adicionartelefone("88-7626-8667");
		System.out.println("********************************************************");
		System.out.println("Contem conta ? "+cliente1.contemContaCliente(conta1));
		cliente1.removerTelefone("88-7626-8667");
		System.out.println(cliente1);
		System.out.println("********************************************************");
		System.out.println("CONTAS CRIADAS SEM SALDO: ");
     	System.out.println(conta1);
		System.out.println(conta2);
		System.out.println(conta3);
		
		conta1.depositar(550f);
		conta2.depositar(200f);
		conta3.depositar(1200f);
		
		System.out.println("********************************************************");
		System.out.println("CONTAS CRIADAS COM SALDO: ");
		System.out.println(conta1);
		System.out.println(conta2);
		System.out.println(conta3);
		
		conta1.transferencia(conta2, 230f);
		conta3.transferencia(null, 230f);
		System.out.println("********************************************************");
		System.out.println("CONTAS APÓS TRANSFERÊNCIA: ");
		System.out.println(conta1);

		System.out.println(conta2);
		System.out.println("********************************************************");
		
		
		
		

		

	}		
		 
}