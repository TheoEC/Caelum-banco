import java.util.Scanner;
class teste {
	public static void main(String[] args) {
		Scanner inpt = new Scanner(System.in);
		int num = 1;
		
		conta theo;

		theo = new conta();
		
		System.out.println("Seu nome:");     
		String name = inpt.next();
		theo.titular.nome = name;

		System.out.println("Seu sobrenome:");
		String sobrenom = inpt.next();
		theo.titular.sobrenome = sobrenom;
		
		System.out.println("Seu cpf:");
		String numcpf = inpt.next();
		theo.titular.cpf = numcpf;

		System.out.println("digite seu valor de deposito");
		float y = inpt.nextFloat();
		theo.saldo = y;

		theo.numero = num;
		num += 1;	// ATUALIZA PARA A PROXIMA CONTA A SER CRIADA
		while(1 == 1) {                // Oferece opções de manejo de conta ao usuário
			
			System.out.println("");
			System.out.println("Selecione uma função:");
			System.out.println("Sacar (1)");
			System.out.println("Depositar (2)");
			System.out.println("Sair (3)");
			
			int funcao = inpt.nextInt();

			if (funcao == 1) {		//SACA
				System.out.println("Digite o valor de saque");
				float saque = inpt.nextFloat();
				theo.saca(saque);
			}
			
			else if (funcao == 2) {		// DEPOSITA
				System.out.println("Digite o valor de deposito");
				float dep = inpt.nextFloat();
				theo.deposita(dep);
			}

			else if (funcao == 3) {
				break;
			}
			
			System.out.println("");
			System.out.println("Nome: " + theo.titular.nome + " " + theo.titular.sobrenome);
			System.out.println("Cpf: " + theo.titular.cpf);
			System.out.println("");
			System.out.println("Saldo: " + theo.saldo);
			System.out.println("Numero da conta: " + theo.numero);
		}
	}
	
	// NOVO METODO -------------------------------------------------------------------------

	double imprime(conta alguem) {
		System.out.println("Nome: " + alguem.titular.nome + " " + alguem.titular.sobrenome);
		System.out.println("Cpf: " + alguem.titular.cpf);
		System.out.println("");
		System.out.println("Saldo: " + alguem.saldo);
		System.out.println("Numero da conta: ");
		return alguem.numero;
	}   // BUG ao usar imprime(theo);
}