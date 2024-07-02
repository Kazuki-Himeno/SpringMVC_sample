package spring.mvc.sample.model;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import spring.mvc.sample.dao.WorkPatternDao;

public class WorkPattern {
	private String workPatternId;
	private String workPatternName;
	private String startTime;
	private String endTime;
	private String breakTime;

	public WorkPattern() {
	}

	public WorkPattern(String workPatternId, String workPatternName, String startTime, String endTime, String breakTime) {
		this.workPatternId = workPatternId;
		this.workPatternName = workPatternName;
		this.startTime = startTime;
		this.endTime = endTime;
		this.breakTime = breakTime;
	}

	public String getWorkPatternId() {
		return workPatternId;
	}

	public void setWorkPatternId(String workPatternId) {
		this.workPatternId = workPatternId;
	}

	public String getWorkPatternName() {
		return workPatternName;
	}

	public void setWorkPatternName(String workPatternName) {
		this.workPatternName = workPatternName;
	}

	public String getStartTime() {
		return startTime;
	}

	public void setStartTime(String startTime) {
		this.startTime = startTime;
	}

	public String getEndTime() {
		return endTime;
	}

	public void setEndTime(String endTime) {
		this.endTime = endTime;
	}

	public String getBreakTime() {
		return breakTime;
	}

	public void setBreakTime(String breakTime) {
		this.breakTime = breakTime;
	}

	public static List<WorkPattern> getRankSelectList() throws SQLException {
		List<WorkPattern> list = new ArrayList<WorkPattern>();
		list.add(new WorkPattern());
		list.addAll(WorkPatternDao.getWorkPatternList());
		return list;
	}
}
