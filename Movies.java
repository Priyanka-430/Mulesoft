import java.sql.*;
public class Movies {
	public static void main(String args[])throws Exception{
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection connection=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","tiger");
			Statement state=connection.createStatement();
			String k="select * from moviedetails";
			ResultSet result=state.executeQuery(k);
			while(result.next()) {
				System.out.println("Movie Name : "+result.getString(1));
				System.out.println("Lead Actor : "+result.getString(2));
				System.out.println("Actress : "+result.getString(3));
				System.out.println("Year of Release : "+result.getInt(4));
				System.out.println("Director : "+result.getString(5));
			}
		
		connection.close();
		}
	catch(Exception e) {
		System.out.println(e);
	}
	}

}
