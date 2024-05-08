package curs17;

import java.sql.Connection;

import curs16.DbConnection;
import curs16.DbQuerys;

public class TestDB {

	static String URL = PropertiesFileProcessor.readPropertiesFile("hostname", "db.properties");
	static String USER = PropertiesFileProcessor.readPropertiesFile("user", "db.properties");
	static String PASS = PropertiesFileProcessor.readPropertiesFile("pass", "db.properties");

	public static void main(String[] args) {

		Connection conn = DbConnection.openDbConnection(URL, USER, PASS) ;
		
		String selectQuery = "select * from products;";
		String updateQuery = "update products set ProductName = 'Snikers' where ProductName = 'Mars';";
		String deleteQuery = "delete from products where ProductName = 'Snikers';";
		
		System.out.println(DbQuerys.dbSelectQuery(conn, selectQuery));
		
		System.out.println("--------------------------------------------------------");
		
		DbQuerys.dbUpdateQuery(conn, updateQuery);
		System.out.println(DbQuerys.dbSelectQuery(conn, selectQuery));
		
		System.out.println("--------------------------------------------------------");

		DbQuerys.dbDeleteQuery(conn, deleteQuery);
		System.out.println(DbQuerys.dbSelectQuery(conn, selectQuery));

		
		DbConnection.closeDbConnection(conn);
		
		
		
	}

}
