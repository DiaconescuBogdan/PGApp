package PGApp;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class InsertOperation {

	public void execute() {
		Connection c = null;
		Statement stmt = null;
		try {
			Class.forName("org.postgresql.Driver");
			c = DriverManager.getConnection("jdbc:postgresql://localhost:5432/market", "postgres", "cartofiprajiti");
			c.setAutoCommit(false);
			System.out.println("Opened database successfully");

			stmt = c.createStatement();
			String sql = "INSERT INTO \"Produs\" (\"CodProdus\", \"Pret\", \"NumeProdus\", \"Cantitate\", \"CategorieProdus\")"
					+ "VALUES (33334, 1, 'Creion', 120, 'Rechizite');";
			stmt.executeUpdate(sql);

			stmt.close();
			c.commit();
			c.close();
		} catch (Exception e) {
			System.err.println(e.getClass().getName() + ": " + e.getMessage());
			System.exit(0);
		}
		System.out.println("Records created successfully");
	}

	public void execute(int codProdus, int pret, String numeProdus, int cantitate, CategorieProdus categorieProdus) {
		Connection c = null;
		Statement stmt = null;
		try {
			Class.forName("org.postgresql.Driver");
			c = DriverManager.getConnection("jdbc:postgresql://localhost:5432/market", "postgres", "cartofiprajiti");
			c.setAutoCommit(false);
			System.out.println("Opened database successfully");

			stmt = c.createStatement();
			String sql = "INSERT INTO \"Produs\" (\"CodProdus\", \"Pret\", \"NumeProdus\", \"Cantitate\", \"CategorieProdus\")"
					+ "VALUES (" + codProdus + ", " + pret + " , '" + numeProdus + "', " + cantitate + " , '"
					+ categorieProdus.getNumeCategorie() + "')";
			System.out.println(sql);
			stmt.executeUpdate(sql);

			stmt.close();
			c.commit();
			c.close();
		} catch (Exception e) {
			System.err.println(e.getClass().getName() + ": " + e.getMessage());
			System.exit(0);
		}
		System.out.println("Records created successfully");
	}
}
