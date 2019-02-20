package com.ebzhi.bangdan.mapper;

import com.ebzhi.bangdan.entity.WeiboBangdan;
import com.ebzhi.bangdan.entity.WeiboBangdanExample;
import com.ebzhi.bangdan.entity.base.WeiboBase;

import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface WeiboBangdanMapper {
    int countByExample(WeiboBangdanExample example);

    int deleteByExample(WeiboBangdanExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(WeiboBangdan record);

    int insertSelective(WeiboBangdan record);

    List<WeiboBangdan> selectByExample(WeiboBangdanExample example);

    WeiboBangdan selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") WeiboBangdan record, @Param("example") WeiboBangdanExample example);

    int updateByExample(@Param("record") WeiboBangdan record, @Param("example") WeiboBangdanExample example);

    int updateByPrimaryKeySelective(WeiboBangdan record);

    int updateByPrimaryKey(WeiboBangdan record);

	WeiboBase getWeiboBaseByYearMonth(@Param("yearMonth") String yearMonth, @Param("list") List<Integer> idList);
}