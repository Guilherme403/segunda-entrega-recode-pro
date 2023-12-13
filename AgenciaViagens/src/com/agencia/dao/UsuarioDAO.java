package com.agencia.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.agencia.model.Usuario;
import com.agencia.utils.Colors;

public class UsuarioDAO {

	private static String sql;

	private final Connection connection;

	public UsuarioDAO(Connection connection) {
		this.connection = connection;
	}

	// CREATE
	public void createUsuario(Usuario usuario) {
		sql = "INSERT INTO usuario(nomeUsuario, cpfUsuario, emailUsuario, telefone) VALUES (?,?,?,?)";
		try (PreparedStatement stmt = connection.prepareStatement(sql)) {
			stmt.setString(1, usuario.getNomeUsuario());
			stmt.setString(2, usuario.getCpfUsuario());
			stmt.setString(3, usuario.getEmailUsuario());
			stmt.setString(4, usuario.getTelefone());

			stmt.executeUpdate();
			System.out.println(Colors.GREEN.get() + "Usuario criado com sucesso\n" + Colors.RESET.get() + "Nome: "
					+ usuario.getNomeUsuario() + "\nCPF:" + usuario.getCpfUsuario());

		} catch (SQLException e) {
			System.out.println(Colors.RED.get() + "[LOG] Não foi possivel criar o usuario." + Colors.RESET.get()
					+ "Mensagem: " + e.getMessage());
		}
	}

	// READ
	public void readAllUsers() {
		sql = "SELECT * FROM Usuario";
		try (PreparedStatement stmt = connection.prepareStatement(sql)) {
			ResultSet r = stmt.executeQuery();
			while (r.next()) {
				Usuario usuario = new Usuario();
				usuario.setNomeUsuario(r.getString("nomeUsuario"));
				usuario.setCpfUsuario(r.getString("cpfUsuario"));
				usuario.setEmailUsuario(r.getString("emailUsuario"));
				usuario.setTelefone(r.getString("telefone"));

				System.out.printf("Nome: %s/n CPF: %s/n Email: %s/n Telefone: %s/n", usuario.getNomeUsuario(),
						usuario.getCpfUsuario(), usuario.getEmailUsuario(), usuario.getTelefone());

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
	public void updateUser(Usuario usuario) {
		sql = "UPDATE usuario SET nomeUsuario = ?, cpfUsuario = ?, emailUsuario = ?, telefone = ?  WHERE idUsuario = ?";
		try (PreparedStatement stmt = connection.prepareStatement(sql)) {
			stmt.setString(1, usuario.getNomeUsuario());
			stmt.setString(2, usuario.getCpfUsuario());
			stmt.setString(3, usuario.getEmailUsuario());
			stmt.setString(4, usuario.getTelefone());
			stmt.setInt(5, usuario.getIdUsuario());

			stmt.executeUpdate();
			System.out.println(Colors.GREEN.get() + "Usuario atualizado com sucesso\n" + Colors.RESET.get() + "Nome: "
					+ usuario.getNomeUsuario() + "\nCPF:" + usuario.getCpfUsuario());

		} catch (SQLException e) {
			System.out.println(Colors.RED.get() + "[LOG] Não foi possível atualizar o usuario" + Colors.RESET.get()
					+ "Mensagem" + e.getMessage());
		}
	}

	// DELETE
	public void deleteUsuario(int id) {
		sql = "DELETE FROM usuario WHERE idUsuario = ?";
		try (PreparedStatement stmt = connection.prepareStatement(sql)) {
			stmt.setInt(1, id);

			stmt.executeUpdate();
			System.out.println(Colors.GREEN.get() + "Usuario deletado com sucesso!" + Colors.RESET.get());
		} catch (SQLException e) {
			System.out.println(Colors.RED.get() + "Não foi possível deletar o usuario." + Colors.RESET.get()
					+ "Mensagem" + e.getMessage());
		}
	}
}
