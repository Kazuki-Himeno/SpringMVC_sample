package spring.mvc.sample.model;

import java.util.ArrayList;
import java.util.List;

public class Sex {
	/** 性別 */
	private String sex;
	/** 表示ラベル */
	private String label;

	public Sex(String sex, String label) {
		this.sex = sex;
		this.label = label;
	}

	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	public String getLabel() {
		return label;
	}
	public void setLabel(String label) {
		this.label = label;
	}

	public static List<Sex> getSexRadionButton() {
		List<Sex> list = new ArrayList<Sex>();
		list.add(new Sex("0",  "男"));
		list.add(new Sex("1",  "女"));
		return list;
	}
}
