package com.example.demo.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(value = "/hanoitower")
public class HanoiController {
	@RequestMapping("/welcome")
	String welcome() {
		return "welcom";
	}
}
