package PGApp;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

public class SelectOperation {
	private String user;
	private String password;
	
	public SelectOperation(String user, String password) {
		this.user = user;
		this.password = password;
	};
	public void execute() {
		Connection c = null;
		Statement stmt = null;
		ArrayList<Produs> lista = new ArrayList<>();
		System.out.println();

		try {
			Class.forName("org.postgresql.Driver");
			c = DriverManager.getConnection("jdbc:postgresql://localhost:5432/market", user, password);
			c.setAutoCommit(false);
			System.out.println("Opened database successfully");

			stmt = c.createStatement();
			ResultSet rs = stmt.executeQuery("SELECT * FROM public.\"Produs\"");

			while (rs.next()) {
				int id = rs.getInt("CodProdus");

				int pret = rs.getInt("Pret");

				String numeProdus = rs.getString(3);

				int cantitate = rs.getInt("Cantitate");

				String categorieProdus = rs.getString("CategorieProdus");
				CategorieProdus cp = new CategorieProdus(categorieProdus);

				Produs p = new Produs(id, pret, numeProdus, cantitate, cp);
				System.out.println(p.toString());
				lista.add(p);

				System.out.println();
			}
			rs.close();
			stmt.close();
			c.close();
		} catch (Exception e) {
			System.err.println(e.getClass().getName() + ": " + e.getMessage());
			System.exit(0);
		}
		// System.out.println(listaCP.toString());
		System.out.println("Operation done successfully");
	}
}
