package spring.mvc.sample.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import spring.mvc.sample.model.Part;

public class PartDao {
	private static final String CON_URL = ""
			+ "jdbc:sqlserver://localhost:1433;"
			+ "databaseName=attendance_management_system;"
			+ "user=java_learning;"
			+ "password=java_learning;";

	public static List<Part> getPartList() throws SQLException {
		String sql = "select part_id, part_name, part_kind, top_part_id from m_part where invalid_flg = 0;";

		Connection con = DriverManager.getConnection(CON_URL);
		Statement stmt = con.createStatement();
		ResultSet rs = stmt.executeQuery(sql);

		List<Part> partList = new ArrayList<Part>();
		while (rs.next()) {
			Part part = new Part(
					rs.getString("part_id"),
					rs.getString("part_name"),
					rs.getString("part_kind"),
					rs.getString("top_part_id"));
			partList.add(part);
		}

		rs.close();
		stmt.close();
		con.close();

		return partList;
	}

	public static List<Part> getPartList(String topPartId) throws SQLException {
		String sql = "select part_id, part_name, part_kind, top_part_id "
				+ "from m_part "
				+ "where invalid_flg = 0 and top_part_id = '" + topPartId + "';";

		Connection con = DriverManager.getConnection(CON_URL);
		Statement stmt = con.createStatement();
		ResultSet rs = stmt.executeQuery(sql);

		List<Part> partList = new ArrayList<Part>();
		while (rs.next()) {
			Part part = new Part(
					rs.getString("part_id"),
					rs.getString("part_name"),
					rs.getString("part_kind"),
					rs.getString("top_part_id"));
			partList.add(part);
		}

		rs.close();
		stmt.close();
		con.close();

		return partList;
	}

	public static List<Part> getPartListOfTop(String topPartId) throws SQLException {
		String sql = "select p1.part_id, p1.part_name, p1.part_kind, p1.top_part_id "
				+ "from m_part p1 "
				+ "inner join m_part p2 "
				+ "on (p1.top_part_id = p2.part_id and p2.part_id = '" + topPartId + "')"
				+ "where p1.invalid_flg = 0;";

		Connection con = DriverManager.getConnection(CON_URL);
		Statement stmt = con.createStatement();
		ResultSet rs = stmt.executeQuery(sql);

		List<Part> partList = new ArrayList<Part>();
		while (rs.next()) {
			Part part = new Part(
					rs.getString("part_id"),
					rs.getString("part_name"),
					rs.getString("part_kind"),
					rs.getString("top_part_id"));
			partList.add(part);
		}

		rs.close();
		stmt.close();
		con.close();

		return partList;
	}

	public static List<Part> getPartListOfKind(String partKind) throws SQLException {
		String sql = "select part_id, part_name, part_kind, top_part_id "
				+ "from m_part "
				+ "where invalid_flg = 0 and part_kind = '" + partKind + "';";

		Connection con = DriverManager.getConnection(CON_URL);
		Statement stmt = con.createStatement();
		ResultSet rs = stmt.executeQuery(sql);

		List<Part> partList = new ArrayList<Part>();
		while (rs.next()) {
			Part part = new Part(
					rs.getString("part_id"),
					rs.getString("part_name"),
					rs.getString("part_kind"),
					rs.getString("top_part_id"));
			partList.add(part);
		}

		rs.close();
		stmt.close();
		con.close();

		return partList;
	}

}
