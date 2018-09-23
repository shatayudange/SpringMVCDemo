package com.shatayu;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class AddController2 {
	
	@RequestMapping("/add")
	public String add() {
		return "display.jsp";
	}

}
