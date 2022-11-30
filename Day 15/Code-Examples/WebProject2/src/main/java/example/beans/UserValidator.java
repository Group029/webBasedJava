package example.beans;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class UserValidator {

	public static boolean isValid(User currentUser) {
		// TODO Auto-generated method stub
		boolean validationStatus = false;
		String sqlQuery = "select * from ulogin where UserId=? and password=?";
		try(
				Connection conn = JdbcUtils.obtainConnection();
				PreparedStatement pstmt = conn.prepareStatement(sqlQuery)				
				){
			String currentUid = currentUser.getUsername();
			String currentPwd = currentUser.getPassword();
			pstmt.setString(1, currentUid);
			pstmt.setString(2, currentPwd);
			
			ResultSet rs = pstmt.executeQuery();
			if(rs.next())
				validationStatus = true;
		}
		catch(Exception ex) {
			ex.printStackTrace();
		}
		return validationStatus;
	}

}
