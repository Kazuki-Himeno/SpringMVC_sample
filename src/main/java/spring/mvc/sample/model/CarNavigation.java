package spring.mvc.sample.model;

import java.util.ArrayList;
import java.util.List;

public class CarNavigation {
	/** カーナビ設置有無 */
	private String carNavigation;
	/** 表示ラベル */
	private String label;

	public CarNavigation(String carNavigation, String label) {
		this.carNavigation = carNavigation;
		this.label = label;
	}

	public String getCarNavigation() {
		return carNavigation;
	}
	public void setCarNavigation(String carNavigation) {
		this.carNavigation = carNavigation;
	}
	public String getLabel() {
		return label;
	}
	public void setLabel(String label) {
		this.label = label;
	}

	public static List<CarNavigation> getCarNavigationSelectBox() {
		List<CarNavigation> list = new ArrayList<CarNavigation>();
		list.add(new CarNavigation("",  ""));
		list.add(new CarNavigation("0",  "なし"));
		list.add(new CarNavigation("1",  "あり"));
		return list;
	}
}
