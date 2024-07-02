package spring.mvc.sample.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import spring.mvc.sample.model.WorkPattern;

public class WorkPatternDao {
	private static final String CON_URL = ""
			+ "jdbc:sqlserver://localhost:1433;"
			+ "databaseName=attendance_management_system;"
			+ "user=java_learning;"
			+ "password=java_learning;";

	public static List<WorkPattern> getWorkPatternList() throws SQLException {
		String sql = "select work_pattern_id, work_pattern_name, start_time, end_time, break_time "
				+ "from m_work_pattern "
				+ "where invalid_flg = 0;";

		Connection con = DriverManager.getConnection(CON_URL);
		Statement stmt = con.createStatement();
		ResultSet rs = stmt.executeQuery(sql);

		List<WorkPattern> workPatternList = new ArrayList<WorkPattern>();
		while (rs.next()) {
			WorkPattern workPattern = new WorkPattern(
					rs.getString("work_pattern_id"),
					rs.getString("work_pattern_name"),
					rs.getString("start_time"),
					rs.getString("end_time"),
					rs.getString("break_time"));
			workPatternList.add(workPattern);
		}

		rs.close();
		stmt.close();
		con.close();

		return workPatternList;
	}

}
