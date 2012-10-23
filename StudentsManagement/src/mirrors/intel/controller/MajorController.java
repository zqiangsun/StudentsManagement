package mirrors.intel.controller;

import javax.validation.Valid;
import mirrors.intel.domain.Major;
import mirrors.intel.service.MajorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import java.util.List;

@Controller
@RequestMapping(value = "/major")
public class MajorController {

	@Autowired
	MajorService service;

	@RequestMapping(method = RequestMethod.GET)
	String index(Model model) {
		List<Major> list= service.findAll();
		model.addAttribute("majorList", list);
		return "major/index";

	}

	@RequestMapping(method = RequestMethod.POST)
	String create(@Valid Major major) {
		service.save(major);
		return "redirect:/major";
	}

	@RequestMapping(method=RequestMethod.PUT,value="/{id}")
	String update(@PathVariable Long id,@Valid Major major) {
		service.save(major);
		return "redirect:/major";
	}

	@RequestMapping(method=RequestMethod.GET,value="/{id}")
	String show(@PathVariable Long id,Model model) {
		Major major=service.findOne(id);
		model.addAttribute(major);
		return "major/show";
	}

	@RequestMapping(method=RequestMethod.DELETE,value="/{id}")
	String destory(@PathVariable Long id) {
		service.delete(id);
		return "redirect:/major";
	}

	@RequestMapping(method=RequestMethod.GET,value="/{id}/edit")
	String edit(@PathVariable Long id,Model model) {
		Major major=service.findOne(id);
		model.addAttribute(major);
		return "major/edit";
	}
	@RequestMapping(method=RequestMethod.GET,value="/editNew")
	String editNew(Model model) {
		model.addAttribute(new Major());
		return "major/editNew";
		
	}
}
