package cdg;

public class menu {
	public static void printMenu() {
		System.out.println("#### - Menu WB - ######### - Cadastro de clientes");
		System.out.println("1 - Inserir cadastro de cliente");
		System.out.println("2 - Editar cadastro existente");
		System.out.println("3 - Remover cadastro existente");
		System.out.println("4 - Exibir informa��es de todos os cadastros existentes");
		System.out.println("5 - Salvar cadastros em disco");
		System.out.println("6 - Ler cadastros em disco");
		
		System.out.println("\n- Menu WB - Informa��es ");
		System.out.println("9 - Listar nome dos clientes j� cadastrados");
		System.out.println("8 - Listar clientes por g�nero");
		System.out.println("7 - Relat�rios gerais");
		System.out.println("0 - Sair");
		
	}
	
	public static void printEdit() {
		System.out.println("5 - Editar nome ");
		System.out.println("4 - Editar telefone");
		System.out.println("3 - Editar data de nascimento");
		System.out.println("2 - Editar genero");
	}

}
