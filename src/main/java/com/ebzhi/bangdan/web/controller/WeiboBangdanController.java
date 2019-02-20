package com.ebzhi.bangdan.web.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.ebzhi.bangdan.entity.base.WeiboBase;
import com.ebzhi.bangdan.web.controller.base.BaseController;

@RestController
@RequestMapping("/weiboBangdan")
public class WeiboBangdanController extends BaseController {

	@GetMapping(value = "/base", produces={"application/json;charset=UTF-8"})
	@ResponseBody
	public WeiboBase base() {
		List<Integer> idList = new ArrayList<Integer>();
		return weiboBangdanService.getWeiboBaseByYearMonth("2018-12", idList);
	}
}
