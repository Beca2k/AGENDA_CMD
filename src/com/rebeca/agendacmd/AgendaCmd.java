package com.rebeca.agendacmd;

import java.util.Scanner;

import com.rebeca.agendacmd.domain.Contato;
import com.rebeca.agendacmd.home.ContatoHome;
import com.rebeca.agendacmd.ui.Menu;

public class AgendaCmd {

	public static void main(String[] args) {

		Menu menu = new Menu();
		Scanner read = new Scanner(System.in);

		int opcao = 0;
		while (opcao != Menu.OPCAO_SAIR) {
			
			menu.mostraMenu();
			opcao = read.nextInt();

			if (opcao == Menu.OPCAO_LISTAR) {
				
				for (Contato contato : ContatoHome.getContatos()) {
					System.out.println("Codigo-" + contato.getCodigo() + " " + ":" + contato.getNome() + "-- "
							+ "Telefone - " + contato.getTelefone());
				}
				
			} else if (opcao == Menu.OPCAO_ADICIONAR) {

				Contato cont = new Contato();
				System.out.println("Informe o nome do contato: ");
				cont.setNome(read.next());
				System.out.println("Informe o numero do contato: ");
				cont.setTelefone(read.next());
				System.out.println("Contato adicionado");

				ContatoHome.adicionar(cont);
				
			} else if (opcao == Menu.OPCAO_EDITAR) {

				System.out.println("Informe o código do contato: ");
				int codigo = read.nextInt();

				Contato contato = ContatoHome.getContato(codigo);

				System.out.println(contato.getNome() + contato.getTelefone());
				System.out.println("Edite o nome do contato: ");
				String x = read.next();
				contato.setNome(x);
				System.out.println("Novo nome do contato é: " + contato.getNome());
				System.out.println("Edite o telfone do contato: ");
				String y = read.next();
				contato.setTelefone(y);
				System.out.println("Novo telefone do contato é: " + contato.getTelefone());
				
			} else if (opcao == Menu.OPCAO_APAGAR) {
				
				System.out.println("Informe o código do contato que deseja apagar: ");
				int codigo = read.nextInt();
				Contato contato = ContatoHome.getContato(codigo);
				ContatoHome.apagar(contato);
				
			} else if (opcao == Menu.OPCAO_SAIR) {
				
				System.out.println("*******************************");				
				System.out.println("Adeus!!!");				
				System.out.println("*******************************");
				
			} else {
				
				System.out.println("*******************************");				
				System.out.println("Opção inválida");				
				System.out.println("*******************************");
				System.out.println();
				
			}
		}

		read.close();
	}
}
