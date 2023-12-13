package com.agencia.database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import com.agencia.utils.Colors;



public class DatabaseConnection {

	private static final String url = "jdbc:mysql://localhost:3306/agencia";

	private static final String user = "root";

	private static final String password = "root";

	public static Connection createConnection() {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println(Colors.GREEN.get() + "Driver encontrado!" + Colors.RESET.get());
		} catch (ClassNotFoundException e) {
			System.out.println(
					Colors.RED.get() + "Driver não encontrado! Mensagem: " + e.getMessage() + Colors.RESET.get());
		}

		try {
			Connection connection = DriverManager.getConnection(url, user, password);
			System.out.println(Colors.GREEN.get() + "Conectado com sucesso!" + Colors.RESET.get());

			return connection;
		} catch (SQLException e) {
			System.out.println(Colors.RED.get() + "Não foi possivel conectar ao banco! Mensagrm: " + e.getMessage()
					+ Colors.RESET.get());
			return null;
		}

	}
}
