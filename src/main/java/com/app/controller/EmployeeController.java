package com.app.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/emp")
public class EmployeeController {

	@RequestMapping("/reg")
	public String showReg()
	{
		return "EmployeeRegister";
	}
}
