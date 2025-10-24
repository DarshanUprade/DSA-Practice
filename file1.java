class file1{
	private static Connection  con=null;
	private DBConnection() {}
	static {
	 try {
		Class.forName("oracle.jdbc.driver.OracleDriver");
			con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","darshan","core");
		}
		catch(Exception e) {e.printStackTrace();}
		}//end of static block
		public static Connection getCon() {
		return con;
	}
	public static void main(String args[]){
		System.out.println("Database Connection is Added"+con);
		System.out.println("Prepared Statement added");
		System.out.println("Excecuting Query");
		System.out.println("ResultSet Object Created");
		System.out.println("Destory the DB Connection");


		// bug 2010 is fixed
		// Logic to Closed DBConnection
	}
}
