package spring.mvc.sample.model;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import spring.mvc.sample.dao.PositionDao;

public class Position {
	private String positionId;
	private String positionName;

	public Position() {
	}

	public Position(String positionId, String positionName) {
		this.positionId = positionId;
		this.positionName = positionName;
	}

	public String getPositionId() {
		return positionId;
	}
	public void setPositionId(String positionId) {
		this.positionId = positionId;
	}
	public String getPositionName() {
		return positionName;
	}
	public void setPositionName(String positionName) {
		this.positionName = positionName;
	}

	public static List<Position> getPositionSelectList() throws SQLException {
		List<Position> list = new ArrayList<Position>();
		list.add(new Position());
		list.addAll(PositionDao.getPositionList());
		return list;
	}

	public static Position getPosition(String positionId) throws SQLException {
		return PositionDao.getPosition(positionId);
	}

}
