package com.ebzhi.bangdan.service.impl;

import java.util.List;

import org.apache.commons.lang3.StringUtils;
import org.springframework.stereotype.Service;

import com.ebzhi.bangdan.entity.JianchaUnit;
import com.ebzhi.bangdan.entity.JianchaUnitExample;
import com.ebzhi.bangdan.entity.WeiboBangdan;
import com.ebzhi.bangdan.entity.WeiboBangdanExample;
import com.ebzhi.bangdan.entity.WeixinBangdan;
import com.ebzhi.bangdan.entity.WeixinBangdanExample;
import com.ebzhi.bangdan.service.JianchaUnitService;
import com.ebzhi.bangdan.service.base.BaseService;

@Service
public class JianchaUnitServiceImpl extends BaseService implements JianchaUnitService {

	@Override
	public void initUnit() {
		// 微信3499
		WeixinBangdanExample weixinBangdanExample = new WeixinBangdanExample(); 
		List<WeixinBangdan> weixinBangdans = weixinBangdanMapper.selectByExample(weixinBangdanExample);
		if (null != weixinBangdans && weixinBangdans.size() > 0) {
			for (WeixinBangdan weixinBangdan : weixinBangdans) {
				JianchaUnit jianchaUnit = new JianchaUnit();  
				jianchaUnit.setUnitName(weixinBangdan.getUnitName());
				jianchaUnit.setUnitFunction(weixinBangdan.getUnitFunction());
				jianchaUnit.setUnitType(0);	// 只有微信
				jianchaUnit.setUnitLevel(weixinBangdan.getUnitLevel());
				jianchaUnit.setWeixinName(weixinBangdan.getWeixinName());
				jianchaUnit.setWeixinNum(weixinBangdan.getWeixinNum());
				jianchaUnit.setUnitProvince(weixinBangdan.getUnitProvince());
				// 插入单位
				jianchaUnitMapper.insertSelective(jianchaUnit);
				
				// 微信绑定单位id
				WeixinBangdan record = new WeixinBangdan();
				record.setId(weixinBangdan.getId());
				record.setUnitId(jianchaUnit.getId());
				weixinBangdanMapper.updateByPrimaryKeySelective(record);
			}
		}
		// 
		JianchaUnitExample jianchaUnitExample = new JianchaUnitExample(); 
		List<JianchaUnit> jianchaUnits = jianchaUnitMapper.selectByExample(jianchaUnitExample) ;
		// 微博3306
		WeiboBangdanExample weiboBangdanExample = new WeiboBangdanExample(); 
		List<WeiboBangdan> weiboBangdans = weiboBangdanMapper.selectByExample(weiboBangdanExample);
		if (null != jianchaUnits && jianchaUnits.size() > 0) {
			for (WeiboBangdan weiboBangdan : weiboBangdans) {
				boolean flag = true;
				for (JianchaUnit jianchaUnit : jianchaUnits) {
					// 单位名称
					String unitName = jianchaUnit.getUnitName();
					// 
					if (StringUtils.equals(weiboBangdan.getUnitName(), unitName)) {
						jianchaUnit.setWeiboUid(weiboBangdan.getWeiboUid());
						jianchaUnit.setWeiboNick(weiboBangdan.getNickName());
						jianchaUnit.setUnitType(2);
						jianchaUnitMapper.updateByPrimaryKeySelective(jianchaUnit);
						
						WeiboBangdan bangdan = new WeiboBangdan();
						bangdan.setUnitId(jianchaUnit.getId());
						bangdan.setId(weiboBangdan.getId());
						weiboBangdanMapper.updateByPrimaryKeySelective(bangdan);
						flag = false;
						break;
					}
				}
				if (flag) {
					JianchaUnit jianchaUnit = new JianchaUnit();  
					jianchaUnit.setUnitName(weiboBangdan.getUnitName());
					jianchaUnit.setUnitFunction(weiboBangdan.getUnitFunction());
					jianchaUnit.setUnitType(1);	// 只有微博
					jianchaUnit.setUnitLevel(weiboBangdan.getUnitLevel());
					jianchaUnit.setWeiboUid(weiboBangdan.getWeiboUid());
					jianchaUnit.setWeiboNick(weiboBangdan.getNickName());
					jianchaUnit.setUnitProvince(weiboBangdan.getUnitProvince());
					// 插入单位
					jianchaUnitMapper.insertSelective(jianchaUnit);
					
					// 微博绑定单位id
					WeiboBangdan record = new WeiboBangdan();
					record.setId(weiboBangdan.getId());
					record.setUnitId(jianchaUnit.getId());
					weiboBangdanMapper.updateByPrimaryKeySelective(record);
				}
			}
		}
		System.out.println("初始化结束");
		/*if (null != weiboBangdans && weiboBangdans.size() > 0) {
			for (WeiboBangdan weiboBangdan : weiboBangdans) {
				JianchaUnit jianchaUnit = new JianchaUnit();  
				jianchaUnit.setUnitName(weiboBangdan.getUnitName());
				jianchaUnit.setUnitFunction(weiboBangdan.getFunction());
				jianchaUnit.setUnitLevel(weiboBangdan.getUnitLevel());
				jianchaUnit.setWeiboUid(weiboBangdan.getUid());
				jianchaUnit.setWeiboNick(weiboBangdan.getNickName());
				jianchaUnitMapper.insertSelective(jianchaUnit);
			}
		}*/
	}

}
