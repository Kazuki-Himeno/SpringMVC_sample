package spring.mvc.sample.ctrl;

import static org.springframework.web.bind.annotation.RequestMethod.*;

import java.sql.SQLException;
import java.util.List;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import spring.mvc.sample.dao.WorkPatternDao;
import spring.mvc.sample.model.Part;
import spring.mvc.sample.model.Position;
import spring.mvc.sample.model.RadiobuttonsModel;
import spring.mvc.sample.model.Rank;
import spring.mvc.sample.model.RegEmployee;
import spring.mvc.sample.model.Sex;

@Controller
public class SimpleController3 {

	@RequestMapping(value = "/reg_employee", method = GET)
	public String regEmployee(RegEmployee regEmployee, ModelMap modelMap) throws SQLException {
		setModelMap(modelMap);
		return "regEmployeeInput";
	}

	@RequestMapping(value = "/reg_employee_confirm", method = POST)
	public String regEmployee(@Valid @ModelAttribute RegEmployee regEmployee, BindingResult result, ModelMap modelMap, RadiobuttonsModel radiobuttonsModel) throws SQLException {
		if (result.hasErrors()) {
			setModelMap(modelMap);
			return "regEmployeeInput";
		}
		regEmployee.setSex(radiobuttonsModel.getSelectedIsbn());
		return "regEmployeeConfirm";
	}

	@RequestMapping(value = "/reg_employee_completion", method = POST)
	public String regEmployeeCompletion(RegEmployee regEmployee) {
		return "regEmployeeCompletion";
	}

	@RequestMapping(value = "/part/1to2/{topPartId}", method = GET, produces = "text/plain;charset=UTF8")
	@ResponseBody
	public String getPartList1to2(@PathVariable("topPartId")String topPartId) throws SQLException {
		StringBuilder sb = new StringBuilder();

		List<Part> selectDataList = Part.getPartList(topPartId);
		selectDataList.stream()
		.map(part -> {
			String partId = part.getPartId();
			String partName = part.getPartName();
			return String.format("<option value=\"%s\">%s</option>", partId, partName);
		})
		.forEach(option -> sb.append(option));
		return sb.toString();
	}

	@RequestMapping(value = "/part/1to3/{topPartId}", method = GET, produces = "text/plain;charset=UTF8")
	@ResponseBody
	public String getPartList1to3(@PathVariable("topPartId")String topPartId) throws SQLException {
		StringBuilder sb = new StringBuilder();

		List<Part> selectDataList = Part.getPartListOfTop(topPartId);
		selectDataList.stream()
		.map(part -> {
			String partId = part.getPartId();
			String partName = part.getPartName();
			return String.format("<option value=\"%s\">%s</option>", partId, partName);
		})
		.forEach(option -> sb.append(option));
		return sb.toString();
	}

	@RequestMapping(value = "/part/2to3/{topPartId}", method = GET, produces = "text/plain;charset=UTF8")
	@ResponseBody
	public String getPartList2to3(@PathVariable("topPartId")String topPartId) throws SQLException {
		StringBuilder sb = new StringBuilder();

		List<Part> selectDataList = Part.getPartList(topPartId);
		selectDataList.stream()
		.map(part -> {
			String partId = part.getPartId();
			String partName = part.getPartName();
			return String.format("<option value=\"%s\">%s</option>", partId, partName);
		})
		.forEach(option -> sb.append(option));
		return sb.toString();
	}

	@RequestMapping(value = "/rank/{rankId}", method = GET, produces = "text/plain;charset=UTF8")
	@ResponseBody
	public String getRankName(@PathVariable("rankId")String rankId) throws SQLException {
		return Rank.getRank(rankId).getRankName();
	}

	@RequestMapping(value = "/position/{positionId}", method = GET, produces = "text/plain;charset=UTF8")
	@ResponseBody
	public String getPositionName(@PathVariable("positionId")String positionId) throws SQLException {
		return Position.getPosition(positionId).getPositionName();
	}

	private void setModelMap(ModelMap modelMap) throws SQLException {
		RadiobuttonsModel rm = new RadiobuttonsModel();
		rm.setSelectedIsbn("0");
		modelMap.addAttribute("radiobuttonsModel", rm);
		modelMap.addAttribute("sexList", Sex.getSexRadionButton());
		modelMap.addAttribute("rankList", Rank.getRankSelectList());
		modelMap.addAttribute("positionList", Position.getPositionSelectList());
		modelMap.addAttribute("workPatternList", WorkPatternDao.getWorkPatternList());
		modelMap.addAttribute("part1List", Part.getPartListOfKind("1"));
		modelMap.addAttribute("part2List", Part.getPartListOfKind("2"));
		modelMap.addAttribute("part3List", Part.getPartListOfKind("3"));
	}

}