package spring.mvc.sample.model;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import spring.mvc.sample.dao.RankDao;

public class Rank {
	private String rankId;
	private String rankName;

	public Rank() {
	}

	public Rank(String rankId, String rankName) {
		this.rankId = rankId;
		this.rankName = rankName;
	}

	public String getRankId() {
		return rankId;
	}
	public void setRankId(String rankId) {
		this.rankId = rankId;
	}
	public String getRankName() {
		return rankName;
	}
	public void setRankName(String rankName) {
		this.rankName = rankName;
	}

	public static List<Rank> getRankSelectList() throws SQLException {
		List<Rank> list = new ArrayList<Rank>();
		list.add(new Rank());
		list.addAll(RankDao.getRankList());
		return list;
	}

	public static Rank getRank(String rankId) throws SQLException {
		return RankDao.getRank(rankId);
	}

}
