package com.ebzhi.bangdan.mapper;

import com.ebzhi.bangdan.entity.WeixinBangdan;
import com.ebzhi.bangdan.entity.WeixinBangdanExample;
import com.ebzhi.bangdan.entity.base.WeixinBase;

import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface WeixinBangdanMapper {
    int countByExample(WeixinBangdanExample example);

    int deleteByExample(WeixinBangdanExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(WeixinBangdan record);

    int insertSelective(WeixinBangdan record);

    List<WeixinBangdan> selectByExample(WeixinBangdanExample example);

    WeixinBangdan selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") WeixinBangdan record, @Param("example") WeixinBangdanExample example);

    int updateByExample(@Param("record") WeixinBangdan record, @Param("example") WeixinBangdanExample example);

    int updateByPrimaryKeySelective(WeixinBangdan record);

    int updateByPrimaryKey(WeixinBangdan record);

	WeixinBase getWeixinBaseByYearMonth(@Param("yearMonth") String yearMonth, @Param("list") List<Integer> idList);
}