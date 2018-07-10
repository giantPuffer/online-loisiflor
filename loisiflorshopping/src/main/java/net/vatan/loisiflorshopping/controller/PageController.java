package net.vatan.loisiflorshopping.controller;

import net.vatan.onlineloisiflor.dao.FamilyDAO;
import net.vatan.onlineloisiflor.dto.Family;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class PageController {
	
	@Autowired
	private FamilyDAO familyDAO;
	
	@RequestMapping(value = {"/", "/home","/index"})
	public ModelAndView index () {
		ModelAndView mv = new ModelAndView("page");
		mv.addObject("title", "Home");
		
		// passing the list of family
		mv.addObject("families", familyDAO.list());
		mv.addObject("userClickHome", true);
		return mv;
	}
	
	@RequestMapping(value = "/about")
	public ModelAndView about () {
		ModelAndView mv = new ModelAndView("page");
		mv.addObject("title", "About us");
		mv.addObject("userClickAbout", true);
		return mv;
	}
	
	@RequestMapping(value = "/contact")
	public ModelAndView contact () {
		ModelAndView mv = new ModelAndView("page");
		mv.addObject("title", "Contact Us");
		mv.addObject("userClickContact", true);
		return mv;
	}
	
	/*
	 * Method to load all the products and based on family
	 */
	
	@RequestMapping(value = {"/show/all/products"})
	public ModelAndView showAllProducts () {
		ModelAndView mv = new ModelAndView("page");
		mv.addObject("title", "All Products");
		
		// passing the list of family
		mv.addObject("families", familyDAO.list());
		mv.addObject("userClickAllProducts", true);
		return mv;
	}
	
	@RequestMapping(value = {"/show/family/{idFamily}/products"})
	public ModelAndView showFamilyProducts (@PathVariable("idFamily") int id) {
		ModelAndView mv = new ModelAndView("page");
		
		// familyDAO to fetch a single family
		Family family = null;
		
		family= familyDAO.get(id);
		
		mv.addObject("title", family.getNameFamily());
		
		// passing the list of family
		mv.addObject("families", familyDAO.list());
		
		// passing the single family object
		mv.addObject("family", family);
		mv.addObject("userClickFamilyProducts", true);
		return mv;
	}
	
//	@RequestMapping(value="/test")
//	public ModelAndView test (@RequestParam(value="greeting", required=false)String greeting) {
//		if(greeting == null) {
//			greeting = "Hello there";
//		}
//		ModelAndView mv = new ModelAndView("page");
//		mv.addObject("greeting", greeting);
//		return mv;
//	}
	
//	@RequestMapping(value="/test/{greeting}")
//	public ModelAndView test (@PathVariable("greeting")String greeting) {
//		if(greeting == null) {
//			greeting = "Hello there";
//		}
//		ModelAndView mv = new ModelAndView("page");
//		mv.addObject("greeting", greeting);
//		return mv;
//	}
	
}
