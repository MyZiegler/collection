package com.ebzhi.bangdan.web.controller;

import com.ebzhi.bangdan.entity.WeiboWeight;
import com.ebzhi.bangdan.entity.WeixinWeight;
import com.ebzhi.bangdan.web.controller.base.BaseController;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

@RestController
@RequestMapping("/weight")
public class WeightController extends BaseController {

    @ResponseStatus(HttpStatus.ACCEPTED)
    @PostMapping("/weixin")
    public void weixin(@RequestBody WeixinWeight weixinWeight){
        weightService.insertWeixinWeight(weixinWeight);
    }

    @ResponseStatus(HttpStatus.ACCEPTED)
    @PostMapping("/weibo")
    public void weibo(@RequestBody WeiboWeight weiboWeight){
        weightService.insertWeiboWeight(weiboWeight);
    }
}
