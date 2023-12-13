package com.agencia;

import java.util.Scanner;



import com.agencia.database.DatabaseConnection;
import com.agencia.dao.DestinoDAO;
import com.agencia.dao.UsuarioDAO;
import com.agencia.model.Destino;
import com.agencia.model.Usuario;

import com.agencia.utils.Colors;



public class Main {

	public static void main(String[] args) {
	
		//DatabaseConnection.createConnection();
		
		var connection = DatabaseConnection.createConnection();
		UsuarioDAO usuarioDAO = new UsuarioDAO(connection);
		DestinoDAO destinoDAO = new DestinoDAO(connection);
		
		
		
			/*Scanner scanner = new Scanner(System.in);		int option = 0;		do {			System.out.println(Colors.CYAN_BOLD.get() + "Escolha uma opcão de 1 - 5\n " + Colors.RESET.get()					+ "1 - Create\n" + "2 - Read\n" + "3 - Updete\n" + "4 - Delete\n" + "5 - Sair");			option = scanner.nextInt();			switch (option) {			case 1:				scanner.nextLine();				Usuario usuario = new Usuario();				System.out.println("Nome completo: ");				usuario.setNomeUsuario(scanner.nextLine());				System.out.println("CPF: ");				usuario.setCpfUsuario(scanner.nextLine().trim());				System.out.println("Email: ");				usuario.setEmailUsuario(scanner.nextLine());				System.out.println("Telefone: ");				usuario.setTelefone(scanner.next());				usuarioDAO.createUsuario(usuario);

				break;
			case 2:
				usuarioDAO.readAllUsers();
				break;
			case 3:
				Usuario usuarioAtualizado = new Usuario();
				System.out.println("Digite o ID do usuario a ser atualizado: ");
				usuarioAtualizado.setIdUsuario(scanner.nextInt());
				scanner.nextLine();
				System.out.println("Nome completo: ");
				usuarioAtualizado.setNomeUsuario(scanner.nextLine());
				System.out.println("CPF: ");
				usuarioAtualizado.setCpfUsuario(scanner.nextLine().trim());
				System.out.println("Email: ");
				usuarioAtualizado.setEmailUsuario(scanner.nextLine());
				System.out.println("Telefone: ");
				usuarioAtualizado.setTelefone(scanner.next());

				usuarioDAO.updateUser(usuarioAtualizado);
				break;

			case 4:
				System.out
						.println("Digite o ID do usuario a ser " + Colors.RED.get() + "DELETADO" + Colors.RESET.get());
				int idUsuario = scanner.nextInt();
				usuarioDAO.deleteUsuario(idUsuario);

			default:
				break;
			}

		} while (option != 5);
		scanner.close();
		*/
		
		Scanner scanner = new Scanner(System.in);

		int option = 0;

		do {
			System.out.println(Colors.CYAN_BOLD.get() + "Escolha uma opcão de 1 - 5\n " + Colors.RESET.get()
					+ "1 - Create\n" + "2 - Read\n" + "3 - Updete\n" + "4 - Delete\n" + "5 - Sair");
			option = scanner.nextInt();

			switch (option) {
			case 1:
				scanner.nextLine();
				Destino destino = new Destino();
				System.out.println("Destino: ");
				destino.setNomeDestino(scanner.nextLine());
				System.out.println("Valor: ");
				destino.setPrecoDestino(scanner.nextLine().trim());
				
				

				destinoDAO.createDestino(destino);

				break;
			case 2:
				destinoDAO.readAllDestinations();
				break;
			case 3:
				Destino destinoAtualizado = new Destino();
				System.out.println("Digite o ID do destino a ser atualizado: ");
				destinoAtualizado.setIdDestino(scanner.nextInt());
				scanner.nextLine();
				System.out.println("Destino: ");
				destinoAtualizado.setNomeDestino(scanner.nextLine());
				System.out.println("Valor: ");
				destinoAtualizado.setPrecoDestino(scanner.nextLine().trim());
				
				destinoDAO.updateDestiny(destinoAtualizado);
				break;

			case 4:
				System.out
						.println("Digite o ID do destino a ser " + Colors.RED.get() + "DELETADO" + Colors.RESET.get());
				int idDestino = scanner.nextInt();
				destinoDAO.deleteDestino(idDestino);

			default:
				break;
			}

		} while (option != 5);
		scanner.close();
		}
	}
	

