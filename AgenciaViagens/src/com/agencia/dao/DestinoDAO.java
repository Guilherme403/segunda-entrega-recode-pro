package com.agencia.dao;

import java.sql.Connection;




import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.agencia.model.Destino;
import com.agencia.utils.Colors;

public class DestinoDAO {

	private static String sql;

	private final Connection connection;
	

	public DestinoDAO(Connection connection) {
		this.connection = connection;
	}
	
	// CREATE
		public void createDestino(Destino destino) {
			sql = "INSERT INTO destino(nomeDestino, precoDestino) VALUES (?,?)";
			try (PreparedStatement stmt = connection.prepareStatement(sql)) {
				stmt.setString(1, destino.getNomeDestino());
				stmt.setString(2, destino.getPrecoDestino());
				
				stmt.executeUpdate();
				System.out.println(Colors.GREEN.get() + "Destino criado com sucesso\n" + Colors.RESET.get() + "Nome: "
						+ destino.getNomeDestino() + "\nPreço:" + destino.getPrecoDestino());

			} catch (SQLException e) {
				System.out.println(Colors.RED.get() + "[LOG] Não foi possivel criar o destino." + Colors.RESET.get()
						+ "Mensagem: " + e.getMessage());
			}
		}
		
		// READ
		public void readAllDestinations() {
			sql = "SELECT * FROM Destino";
			try (PreparedStatement stmt = connection.prepareStatement(sql)) {
				ResultSet r = stmt.executeQuery();
				while (r.next()) {
					Destino destino = new Destino(); 
					destino.setNomeDestino(r.getString("nomeDestino"));
					destino.setPrecoDestino(r.getString("precoDestino"));
					

					System.out.printf("Nome: %s/n Preco: %s/n", destino.getNomeDestino(),
							destino.getPrecoDestino());

				}
	            if (!r.next()) {
					System.out.println(Colors.PURPLE_BOLD_BRIGHT.get() + "Não ha dados" + Colors.RESET.get());
				}

			} catch (SQLException e) {
				System.out.println(Colors.RED.get() + "[LOG] Não foi possivel acessar as informações." + Colors.RESET.get()
						+ "Menssage: " + e.getMessage());
			}
		}
		
		// UPDATE
		public void updateDestiny(Destino destino) {
			sql = "UPDATE Destino SET nomeDestino = ?, precoDestino = ?  WHERE idDestino = ?";
			try (PreparedStatement stmt = connection.prepareStatement(sql)) {
				stmt.setString(1, destino.getNomeDestino());
				stmt.setString(2, destino.getPrecoDestino());
				stmt.setInt(3, destino.getIdDestino());

				stmt.executeUpdate();
				System.out.println(Colors.GREEN.get() + "Destino atualizado com sucesso\n" + Colors.RESET.get() + "Nome: "
						+ destino.getNomeDestino() + "\nCPF:" + destino.getPrecoDestino());

			} catch (SQLException e) {
				System.out.println(Colors.RED.get() + "[LOG] Não foi possível atualizar o destino" + Colors.RESET.get()
						+ "Mensagem" + e.getMessage());
			}
		}

		// DELETE
		public void deleteDestino(int id) {
			sql = "DELETE FROM destino WHERE idDestino = ?";
			try (PreparedStatement stmt = connection.prepareStatement(sql)) {
				stmt.setInt(1, id);

				stmt.executeUpdate();
				System.out.println(Colors.GREEN.get() + "Destino deletado com sucesso!" + Colors.RESET.get());
			} catch (SQLException e) {
				System.out.println(Colors.RED.get() + "Não foi possível deletar o destino." + Colors.RESET.get()
						+ "Mensagem" + e.getMessage());
			}
		}
		
}
