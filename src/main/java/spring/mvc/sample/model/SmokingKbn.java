package spring.mvc.sample.model;

import java.util.ArrayList;
import java.util.List;

public class SmokingKbn {
	/** 喫煙・禁煙区分 */
	private String smokingKbn;
	/** 表示ラベル */
	private String label;

	public SmokingKbn(String smokingKbn, String label) {
		this.smokingKbn = smokingKbn;
		this.label = label;
	}

	public String getSmokingKbn() {
		return smokingKbn;
	}
	public void setSmokingKbn(String smokingKbn) {
		this.smokingKbn = smokingKbn;
	}
	public String getLabel() {
		return label;
	}
	public void setLabel(String label) {
		this.label = label;
	}

	public static List<SmokingKbn> getSmokingKbnSelectBox() {
		List<SmokingKbn> list = new ArrayList<SmokingKbn>();
		list.add(new SmokingKbn("",  ""));
		list.add(new SmokingKbn("1",  "喫煙"));
		list.add(new SmokingKbn("2",  "禁煙"));
		return list;
	}
}
