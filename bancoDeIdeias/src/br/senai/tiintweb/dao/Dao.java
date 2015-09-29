package br.senai.tiintweb.dao;

import java.sql.DriverManager;

import com.mysql.jdbc.Connection;


public class Dao {
	private Connection conn;

	public Connection getConnection() {
		if (conn == null) {
			try {
				Class.forName("com.mysql.jdbc.Driver");
				conn = (Connection) DriverManager.getConnection(
						"jdbc:mysql://localhost/bi_db", "root", "");
				System.out.println("Conectou");
			} catch (Exception e) {
				e.printStackTrace();
			}

		}
		return conn;
	}
}
