package com.rebeca.agendacmd.ui;

public class Menu {
	
	public static final int OPCAO_LISTAR = 1;
	public static final int OPCAO_ADICIONAR = 2;
	public static final int OPCAO_EDITAR = 3;
	public static final int OPCAO_APAGAR = 4;
	public static final int OPCAO_SAIR = 5;
	
	public void mostraMenu() {
		
		System.out.println("1 - Listar");
		System.out.println("2 - Adicionar");
		System.out.println("3 - Editar");
		System.out.println("4 - Apagar");
		System.out.println("5 - Sair");
		System.out.print("Selecione uma opção: ");
	}
}
