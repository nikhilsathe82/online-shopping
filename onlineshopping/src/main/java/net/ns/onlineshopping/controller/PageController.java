package net.ns.onlineshopping.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class PageController {
	
	@RequestMapping(value= {"/","/home","/index"})
	public ModelAndView index() 
	{
		ModelAndView mv = new ModelAndView("page");
		mv.addObject("title", "Home");
		mv.addObject("userClickHome",true);
		return mv;
	}
	
	@RequestMapping(value= "/about")
	public ModelAndView about() 
	{
		ModelAndView mv = new ModelAndView("page");
		mv.addObject("title", "About Us");
		mv.addObject("userClickAbout",true);
		return mv;
	}
	
	@RequestMapping(value= "/contact")
	public ModelAndView contact() 
	{
		ModelAndView mv = new ModelAndView("page");
		mv.addObject("title", "Contact Us");
		mv.addObject("userClickContact",true);
		return mv;
	}

//	@RequestMapping (value= "/test")
//	public ModelAndView test(@RequestParam (value="greeting",required=false)String greeting) //if you make required as false it is not mandatory for greeting to be present.
//	{
//   if (greeting == null) {
//     greeting="Hello There!";
//  }
//  ModelAndView mv = new ModelAndView("page");
//     mv.addObject("greeting", greeting);
//     return mv;
//   }
	
//	@RequestMapping (value= "/test/{greeting}")
	//public ModelAndView test(@PathVariable ("greeting")String greeting) //here greeting is dynamic and we can directly access value from path with @pathvariable
	//{
	//	if (greeting == null) {
	//		greeting="Hello There!";
	//	}
	//	ModelAndView mv = new ModelAndView("page");
	//	mv.addObject("greeting", greeting);
	//	return mv;
	//  }
}
