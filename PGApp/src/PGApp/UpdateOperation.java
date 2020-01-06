package PGApp;

import java.sql.Statement;
import java.sql.Connection;
import java.sql.DriverManager;

public class UpdateOperation {

	public void execute(int pret, int codProdus) {
		Connection c = null;
		Statement stmt = null;
		try {
			Class.forName("org.postgresql.Driver");
			c = DriverManager.getConnection("jdbc:postgresql://localhost:5432/market", "postgres", "cartofiprajiti");
			c.setAutoCommit(false);
			System.out.println("Opened database successfully");

			stmt = c.createStatement();
			String sql = "UPDATE \"Produs\" set \"Pret\" = " + pret + " where \"Produs\".\"CodProdus\"=" + codProdus + ";";
			System.out.println(sql);
			stmt.executeUpdate(sql);
			c.commit();
			

			stmt.close();
			c.close();
		} catch (Exception e) {
			System.err.println(e.getClass().getName() + ": " + e.getMessage());
			System.exit(0);
		}
		System.out.println("Operation done successfully");
	}
}
