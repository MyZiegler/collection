package com.ebzhi.bangdan.web.controller;

import java.util.List;

import com.ebzhi.bangdan.entity.WeixinWeight;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import com.ebzhi.bangdan.entity.BangdanScore;
import com.ebzhi.bangdan.web.controller.base.BaseController;

@Controller
@RequestMapping("/bangdanScore")
public class BangdanScoreController extends BaseController {

	@GetMapping(value = "/init/{yearMonth}", produces={"application/json;charset=UTF-8"})
	public void initScore(@PathVariable String yearMonth) {
		bangdanScoreService.initScore(yearMonth);
	}
	
	@GetMapping(value = "/init1", produces={"application/json;charset=UTF-8"})
	@ResponseBody
	public List<BangdanScore> initUnit1() {
		return bangdanScoreService.regionRankTop20();
	}
}
