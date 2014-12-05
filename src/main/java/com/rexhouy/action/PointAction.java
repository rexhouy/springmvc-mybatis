package com.rexhouy.action;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.rexhouy.model.Point;
import com.rexhouy.service.PointService;

@Controller
@RequestMapping("/points")
public class PointAction {

	@Autowired
	private PointService pService;
	
	@RequestMapping(method=RequestMethod.GET)
	public String list(Model model) {
		model.addAttribute("points", pService.listPoint());
		return "points/index";
	}
	
	@RequestMapping(value="/{id}",method=RequestMethod.GET)
	public String query(@PathVariable String id, Model model) {
		model.addAttribute("point", pService.getPoint(id));
		return "points/detail";
	}
	
	@RequestMapping(value="/edit/{id}",method=RequestMethod.GET)
	public String editPage(@PathVariable String id, Model model) {
		model.addAttribute("command", pService.getPoint(id));
		return "points/edit";
	}
	
	@RequestMapping(value="/create",method=RequestMethod.GET)
	public String  createPage(Model model) {
		model.addAttribute("command", new Point());
		return "points/create";
	}
	
	@RequestMapping(value="/edit",method=RequestMethod.PUT)
	public String update(@Valid Point point, BindingResult result) {
		if (result.hasErrors()) {
			return "points/edit";
		}
		pService.updatePoint(point);
		return "points/detail";
	}
	
	@RequestMapping(value="/create",method=RequestMethod.POST)
	public String create(@Valid Point point, BindingResult result, Model model) {
		if (result.hasErrors()) {
			model.addAttribute("command", point);
			return "points/create";
		}
		pService.createPoint(point);
		return "redirect:/points";
	}
	
}
