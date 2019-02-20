package com.ebzhi.bangdan.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.ebzhi.bangdan.web.controller.base.BaseController;

@Controller
@RequestMapping("/jianchaUnit")
public class JianchaUnitController extends BaseController {

	@GetMapping(value = "/init", produces={"application/json;charset=UTF-8"})
	public void initUnit() {
		jianchaUnitService.initUnit();
	}
}
