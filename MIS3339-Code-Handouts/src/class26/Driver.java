package class26;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.util.Scanner;

public class Driver {

	public static void main(String[] args) {
        // JDBC database operations require exception handling (throws SQLException)
        try {
            Connection conn = DriverManager.getConnection("jdbc:oracle:thin:@misdb1.uca.edu:1521/xepdb1","MIS3339","MIS3339");
            // explicitly set transactional processing to be off
            conn.setAutoCommit(true);
            // define SQL statement
            PreparedStatement stmt = conn.prepareStatement("SELECT ID, PAGES, YEAR, AUTHOR, TITLE FROM BOOKS");
            ResultSet rs = stmt.executeQuery();
            ResultSetMetaData md = rs.getMetaData();
            // fixed column width format string
            String fmt = "%1$-25s"; // %1$ argument index, - left align, 25 minimum width, s means it is a string
            // iterate through the ResultSetMetaData column names
            for (int i = 1; i <= md.getColumnCount(); i++) {
            	System.out.print(String.format(fmt, md.getColumnName(i)).toUpperCase());
            } // end for
            System.out.print("\n");
            // iterate through the ResultSet for however many records exist
            while (rs.next()) {
                for (int i = 1; i <= md.getColumnCount(); i++) {
                	// ResultSet indices always start counting at 1 instead of 0!
                	// reading values as String is safest, we can convert using wrapper classes as necessary
                	System.out.print(String.format(fmt, rs.getString(i)));
                } // end for
                System.out.print("\n");
            } // end while
            stmt.close(); // always close the Statement as soon as possible
            rs.close(); // always close the ResultSet as soon as possible
            
            stmt = conn.prepareStatement("SELECT COUNT(ID) FROM BOOKS");
            rs = stmt.executeQuery();
            // no need for the metadata here, we know what we're getting back
            while (rs.next()) {
            	System.out.println("The number of books in the table is: " + rs.getString(1));
            } // end while
            stmt.close();
            rs.close();

            String author = "Frederic Bastiat";
            stmt = conn.prepareStatement("SELECT AVG(PAGES) FROM BOOKS WHERE AUTHOR = ?");
            stmt.setObject(1, author);
            rs = stmt.executeQuery();
            while (rs.next()) {
            	System.out.println("The average number of pages for the author " + author + " is: " + rs.getString(1));
            } // end while
            stmt.close();
            rs.close();

            Scanner in = new Scanner(System.in);
            System.out.println("What author would you like to query the database for?");
            String userProvidedAuthor = in.nextLine();
            stmt = conn.prepareStatement("SELECT AVG(PAGES) FROM BOOKS WHERE AUTHOR = ?");
            stmt.setObject(1, userProvidedAuthor);
            rs = stmt.executeQuery();
            while (rs.next()) {
            	System.out.println("The average number of pages for the author " + userProvidedAuthor + " is: " + rs.getString(1));
            } // end while
            stmt.close();
            rs.close();

            conn.close(); // close the Connection when you're done with it
        } catch (SQLException e) {
	        System.out.println(e.getMessage());
	        e.printStackTrace();
        } // end catch
    } // end method
} // end Driver