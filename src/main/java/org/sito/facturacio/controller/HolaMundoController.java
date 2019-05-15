package org.sito.facturacio.controller;

import org.sito.facturacio.config.views.ViewsApp;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HolaMundoController {

	@RequestMapping("/index")
	public String hello( 
			@RequestParam(value = "name", required = false, defaultValue = "World")
			String name, Model model) {		
		model.addAttribute("name", name);		
		return ViewsApp.INDEX; //thymeleaf
	}
	
	
	@RequestMapping(value = { "/", "/hello**" }, method = RequestMethod.GET)
	public ModelAndView showMessage(
			@RequestParam(value = "name", required = false, defaultValue = "World") String name) {
				ModelAndView mv = new ModelAndView();
		mv.setViewName(ViewsApp.HELLOWORLD); //nom jsp
		mv.addObject("message", "caracola");
		mv.addObject("name", name);
		return mv;
	}
}
