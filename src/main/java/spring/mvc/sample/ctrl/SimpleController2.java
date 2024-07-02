package spring.mvc.sample.ctrl;

import static org.springframework.web.bind.annotation.RequestMethod.*;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import spring.mvc.sample.model.RadiobuttonsModel;
import spring.mvc.sample.model.Sex;
import spring.mvc.sample.model.UserInfo;

@Controller
public class SimpleController2 {

	@RequestMapping(value = "/reg_sample_1", method = GET)
	public String regSample1(UserInfo userInfo, ModelMap modelMap) {
		RadiobuttonsModel rm = new RadiobuttonsModel();
		rm.setSelectedIsbn("0");
		modelMap.addAttribute("radiobuttonsModel", rm);
		modelMap.addAttribute("sexList", Sex.getSexRadionButton());
		return "regSample1";
	}

	@RequestMapping(value = "/reg_sample_1_confirm", method = POST)
	public String regSample1Confirm(@Valid @ModelAttribute UserInfo userInfo, BindingResult result, ModelMap modelMap, RadiobuttonsModel radiobuttonsModel) {
		if (result.hasErrors()) {
			RadiobuttonsModel rm = new RadiobuttonsModel();
			rm.setSelectedIsbn("0");
			modelMap.addAttribute("radiobuttonsModel", rm);
			modelMap.addAttribute("sexList", Sex.getSexRadionButton());
			return "regSample1";
		}
		userInfo.setSex(radiobuttonsModel.getSelectedIsbn());
		return "regSample1Confirm";
	}

	@RequestMapping(value = "/reg_sample_1_completion", method = POST)
	public String regSample1Completion(UserInfo userInfo) {
		return "regSample1Completion";
	}

}