package com.SpringMVC;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.AbstractController;

public class HelloController extends AbstractController {

	@Override
	protected ModelAndView handleRequestInternal(HttpServletRequest req, HttpServletResponse res) throws Exception {
		ModelAndView mv= new ModelAndView("hello");
		mv.addObject("message","Welcome to Spring MVC");
		mv.addObject("hi","Hi Anubhav,The Shadow");
		return mv;
	}

}
