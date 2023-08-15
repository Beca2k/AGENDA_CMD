package com.rebeca.agendacmd.home;

import java.util.ArrayList;
import java.util.List;

import com.rebeca.agendacmd.domain.Contato;

public class ContatoHome {
	
	private static List<Contato> contatos = new ArrayList<>();
	private static int codigo = 1;

	/**
	 * Retorna todos os contatos
	 */
	public static List<Contato> getContatos() {
		
		return contatos;
	}

	/**
	 * Adiciona um novo contato
	 * @param cont Novo contato a ser adicionado
	 */
	public static void adicionar(Contato cont) {
		
		cont.setCodigo(codigo++);
		contatos.add(cont);
	}

	/**
	 * Apaga o contato
	 * @param contato Contato a ser apagado
	 */
	public static void apagar(Contato contato) {
		
		contatos.remove(contato);
	}

	/**
	 * Busca contato de acordo com o codigo
	 * @param codContato Codigo do contato a ser buscado
	 * @return retorna copntato de acordo com o codigo, retorna null quando o contato não for encontrado
	 */
	public static Contato getContato(int codContato) {
		
		for (Contato contato : contatos) {
			if (contato.getCodigo() == codContato) {
				return contato;				
			}
		}
		return null;
	}
	
}
