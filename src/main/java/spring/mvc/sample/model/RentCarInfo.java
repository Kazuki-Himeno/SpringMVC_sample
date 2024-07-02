package spring.mvc.sample.model;

public class RentCarInfo {
	/** 車両管理番号 */
	private String carManagementNo;
	/** 車種名 */
	private String carModelName;
	/** 店舗名 */
	private String shopName;
	/** ETC設置有無 */
	private String etc;
	/** カーナビ設置有無 */
	private String carNavigation;
	/** 喫煙・禁煙区分 */
	private String smokingKbn;
	/** ETC設置有無(値) */
	private String etcValue;
	/** カーナビ設置有無(値) */
	private String carNavigationValue;
	/** 喫煙・禁煙区分(値) */
	private String smokingKbnValue;

	public String getCarManagementNo() {
		return carManagementNo;
	}
	public void setCarManagementNo(String carManagementNo) {
		this.carManagementNo = carManagementNo;
	}
	public String getCarModelName() {
		return carModelName;
	}
	public void setCarModelName(String carModelName) {
		this.carModelName = carModelName;
	}
	public String getShopName() {
		return shopName;
	}
	public void setShopName(String shopName) {
		this.shopName = shopName;
	}
	public String getEtc() {
		return etc;
	}
	public void setEtc(String etc) {
		this.etc = (etc.equals("0") ? "なし" : "あり");
	}
	public String getCarNavigation() {
		return carNavigation;
	}
	public void setCarNavigation(String carNavigation) {
		this.carNavigation = (carNavigation.equals("0") ? "なし" : "あり");
	}
	public String getSmokingKbn() {
		return smokingKbn;
	}
	public void setSmokingKbn(String smokingKbn) {
		this.smokingKbn = (smokingKbn.equals("1") ? "喫煙" : "禁煙");
	}
	public String getEtcValue() {
		return etcValue;
	}
	public void setEtcValue(String etcValue) {
		this.etcValue = etcValue;
	}
	public String getCarNavigationValue() {
		return carNavigationValue;
	}
	public void setCarNavigationValue(String carNavigationValue) {
		this.carNavigationValue = carNavigationValue;
	}
	public String getSmokingKbnValue() {
		return smokingKbnValue;
	}
	public void setSmokingKbnValue(String smokingKbnValue) {
		this.smokingKbnValue = smokingKbnValue;
	}
}
