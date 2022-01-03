package chow_eiims_public_form;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;



public class DbConnect {
	static Logger logger = Logger.getLogger(DbConnect.class.getName());
	private static int counter = 0;
	
	private static Connection connection1 = null;/* Connection for MySql  */
	private static Connection connection2 = null;/* Connection for DB2  */
	private static Connection connection3 = null; 
	private static Connection connection4 = null;
	private static Connection connection5 = null;
	
	static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";
	
	
	/********************************************************
	 * CONNECT TO CLOUD DB FROM LOCAL APPLIATION SERVER
	 *********************************************************/
	static final String DB_URL = "jdbc:mysql://35.200.234.184/chow_eiims_public_form"; //default database;
	static final String USER = "chow_eiims";
	static final String PASS = "dFkEqcNsGAgKIEtz";
	
	/********************************************************
	 * CONNECT TO LOCAL DB FROM LOCAL HOST a
	 *********************************************************/
//	static final String DB_URL = "jdbc:mysql://localhost/chow_eiims_public_form"; //default database;
//	static final String USER = "chow_eiims";
//	static final String PASS = "dFkEqcNsGAgKIEtz";
//	static final String USER = "admin";
//	static final String PASS = "abc";

	
	public static Connection getConnection()
	{
		
		//System.out.println("=-----getConnection---------=");
		try {
			//System.out.println("--------------");
			//System.out.println("connecting.");
			//System.out.println("--------------");
			if(connection1==null || connection1.isClosed())
			{
				Class.forName(JDBC_DRIVER);
				connection1 = DriverManager.getConnection(DB_URL,USER,PASS);
				//System.out.println("connection1 defined.");
				//System.out.println("<<<<<<<---- Connected to = "+ DB_URL+"------>>>>>>");
				logger.log(Level.INFO, "<<<<<<<---- Connected to = "+ DB_URL+"------>>>>>>");
				//connection1 = DriverManager.getConnection(core,USER,PASS);
			}
		} catch (SQLException se) {
			// Handle errors for JDBC
			System.out.println("Could not get an connection.");
			se.printStackTrace();
			//log.error(se.toString());
			logger.log(Level.INFO, "Could not get an connection."+se+DB_URL);
		} catch (Exception e) {
			// Handle errors for Class.forName
			System.out.println("Driver not found.");
			logger.log(Level.INFO, "Could not get an connection."+e+DB_URL);
			e.printStackTrace();
		} 
		//System.out.println("=---xxxgetConnectionxxx------=");
		
		return connection1;
	}
	
	public static void counterIncre() {
		counter ++;
	
	}
	public static void counterReleaseConn() {
		counter--;
	}
	
	public static boolean isConnActive() {
		
		return counter>0?true:false;
		
	}	
}
