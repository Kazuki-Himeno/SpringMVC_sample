package spring.mvc.sample.model;

import java.util.ArrayList;
import java.util.List;

public class Etc {
	/** ETC設置有無 */
	private String etc;
	/** 表示ラベル */
	private String label;

	public Etc(String etc, String label) {
		this.etc = etc;
		this.label = label;
	}

	public String getEtc() {
		return etc;
	}
	public void setEtc(String etc) {
		this.etc = etc;
	}
	public String getLabel() {
		return label;
	}
	public void setLabel(String label) {
		this.label = label;
	}

	public static List<Etc> getEtcSelectBox() {
		List<Etc> list = new ArrayList<Etc>();
		list.add(new Etc("",  ""));
		list.add(new Etc("0",  "なし"));
		list.add(new Etc("1",  "あり"));
		return list;
	}
}
