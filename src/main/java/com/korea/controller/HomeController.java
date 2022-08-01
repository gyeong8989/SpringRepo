package com.korea.controller;

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.korea.domain.TestDTO;

import lombok.extern.log4j.Log4j;
import oracle.jdbc.logging.annotations.Log;

/**
 * Handles requests for the application home page.
 */
@Controller

@Log4j
public class HomeController {
	
	@Autowired
	private TestDTO dto;
	
	
	private static final Logger logger = LoggerFactory.getLogger(HomeController.class);
	
	/**
	 * Simply selects the home view to render by returning its name.
	 */
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String home(Locale locale, Model model) {
		logger.info("Welcome home! The client locale is {}.", locale);
		
		Date date = new Date();
		DateFormat dateFormat = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.LONG, locale);
		
		String formattedDate = dateFormat.format(date);
		
		model.addAttribute("serverTime", formattedDate );
		
		dto.setName("피루기똥");
		dto.setAge("1000");
		dto.setAddr("djfkdjf");
		System.out.println(dto);
		
	log.info("DTO : " + dto); 
		return "home";
	}
	
	@GetMapping("/hello")
	public void test ()
	{
		System.out.println("DTO : " + dto);
	}
	
}
