package com.chiru.security.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class UnsecureController {

	@GetMapping("/")
	public String forAll(Model model) {
		return "home";
	}

	@GetMapping("/admin")
	public String adminPage(Model model) {
		return "admin";
	}

	@GetMapping("/dba")
	public String dbaPage(Model model) {
		return "dba";
	}
}
