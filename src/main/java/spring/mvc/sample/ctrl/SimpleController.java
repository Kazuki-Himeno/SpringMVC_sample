package spring.mvc.sample.ctrl;

import static org.springframework.web.bind.annotation.RequestMethod.*;

import java.sql.SQLException;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import spring.mvc.sample.dao.NmrmRentCarDao;
import spring.mvc.sample.model.CarNavigation;
import spring.mvc.sample.model.Etc;
import spring.mvc.sample.model.RentCarInfo;
import spring.mvc.sample.model.SmokingKbn;

@Controller
public class SimpleController {

	@RequestMapping(value = "/", method = GET)
	public String menu(ModelMap modelMap) {
		return "menu";
	}

	@RequestMapping(value = "/rent_car_search_input", method = GET)
	public String rentCarSearch(RentCarInfo rentCarInfo) {
		return "rentCarSearch";
	}

	@RequestMapping(value = "/rent_car_search", method = POST)
	public String rentCarInfo(RentCarInfo rentCarInfo, ModelMap modelMap) throws SQLException {
		modelMap.addAttribute("rentCarInfo", NmrmRentCarDao.getRentCarInfo(rentCarInfo.getCarManagementNo()));
		return "rentCarInfo";
	}

	@RequestMapping(value = "/rent_car_search_list_input", method = GET)
	public String rentCarSearchListInput(RentCarInfo rentCarInfo, ModelMap modelMap) throws SQLException {
		modelMap.addAttribute("etc", Etc.getEtcSelectBox());
		modelMap.addAttribute("carNavigation", CarNavigation.getCarNavigationSelectBox());
		modelMap.addAttribute("smokingKbn", SmokingKbn.getSmokingKbnSelectBox());
		return "rentCarSearchList";
	}

	@RequestMapping(value = "/rent_car_search_list", method = POST)
	public String rentCarSearchList(RentCarInfo rentCarInfo, ModelMap modelMap) throws SQLException {
		modelMap.addAttribute("etc", Etc.getEtcSelectBox());
		modelMap.addAttribute("carNavigation", CarNavigation.getCarNavigationSelectBox());
		modelMap.addAttribute("smokingKbn", SmokingKbn.getSmokingKbnSelectBox());
		modelMap.addAttribute("rentCarInfoList", NmrmRentCarDao.getRentCarInfoList(rentCarInfo));
		return "rentCarSearchList";
	}

}