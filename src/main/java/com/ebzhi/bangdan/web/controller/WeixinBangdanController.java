package com.ebzhi.bangdan.web.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.ebzhi.bangdan.entity.base.WeixinBase;
import com.ebzhi.bangdan.web.controller.base.BaseController;

@Controller
@RequestMapping("/weixinBangdan")
public class WeixinBangdanController extends BaseController {

	@GetMapping(value = "/base", produces={"application/json;charset=UTF-8"})
	@ResponseBody
	public WeixinBase base() {
		List<Integer> idList = new ArrayList<Integer>();
		return weixinBangdanService.getWeixinBaseByYearMonth("2018-12", idList);
	}
}
