package spring.mvc.sample.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import spring.mvc.sample.model.Position;

public class PositionDao {
	private static final String CON_URL = ""
			+ "jdbc:sqlserver://localhost:1433;"
			+ "databaseName=attendance_management_system;"
			+ "user=java_learning;"
			+ "password=java_learning;";

	public static List<Position> getPositionList() throws SQLException {
		String sql = "select position_id, position_name from m_position where invalid_flg = 0;";

		Connection con = DriverManager.getConnection(CON_URL);
		Statement stmt = con.createStatement();
		ResultSet rs = stmt.executeQuery(sql);

		List<Position> positionList = new ArrayList<Position>();
		while (rs.next()) {
			Position position = new Position(
					rs.getString("position_id"),
					rs.getString("position_name"));
			positionList.add(position);
		}

		rs.close();
		stmt.close();
		con.close();

		return positionList;
	}

	public static Position getPosition(String positionId) throws SQLException {
		String sql = "select position_id, position_name from m_position where invalid_flg = 0 and position_id = '" + positionId + "';";

		Connection con = DriverManager.getConnection(CON_URL);
		Statement stmt = con.createStatement();
		ResultSet rs = stmt.executeQuery(sql);

		rs.next();
		Position position = new Position(
				rs.getString("position_id"),
				rs.getString("position_name"));

		rs.close();
		stmt.close();
		con.close();

		return position;
	}

}
