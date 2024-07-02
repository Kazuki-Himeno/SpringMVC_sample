package spring.mvc.sample.model;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import spring.mvc.sample.dao.PartDao;

public class Part {
	private String partId = "";
	private String partName = "";
	private String partKind = "";
	private String topPartId = "";

	public Part() {
	}

	public Part(String partId, String partName, String partKind, String topPartId) {
		this.partId = partId;
		this.partName = partName;
		this.partKind = partKind;
		this.topPartId = topPartId;
	}

	public String getPartId() {
		return partId;
	}
	public void setPartId(String partId) {
		this.partId = partId;
	}
	public String getPartName() {
		return partName;
	}
	public void setPartName(String partName) {
		this.partName = partName;
	}
	public String getPartKind() {
		return partKind;
	}
	public void setPartKind(String partKind) {
		this.partKind = partKind;
	}
	public String getTopPartId() {
		return topPartId;
	}
	public void setTopPartId(String topPartId) {
		this.topPartId = topPartId;
	}

	public static List<Part> getPartList() throws SQLException {
		List<Part> list = new ArrayList<Part>();
		list.add(new Part());
		list.addAll(PartDao.getPartList());
		return list;
	}

	public static List<Part> getPartList(String partId) throws SQLException {
		List<Part> list = new ArrayList<Part>();
		list.add(new Part());
		list.addAll(PartDao.getPartList(partId));
		return list;
	}

	public static List<Part> getPartListOfKind(String partKind) throws SQLException {
		List<Part> list = new ArrayList<Part>();
		list.add(new Part());
		list.addAll(PartDao.getPartListOfKind(partKind));
		return list;
	}

	public static List<Part> getPartListOfTop(String topPartId) throws SQLException {
		List<Part> list = new ArrayList<Part>();
		list.add(new Part());
		list.addAll(PartDao.getPartListOfTop(topPartId));
		return list;
	}

}
