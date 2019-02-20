package com.ebzhi.bangdan.mapper;

import com.ebzhi.bangdan.entity.WeixinWeight;
import com.ebzhi.bangdan.entity.WeixinWeightExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface WeixinWeightMapper {
    int countByExample(WeixinWeightExample example);

    int deleteByExample(WeixinWeightExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(WeixinWeight record);

    int insertSelective(WeixinWeight record);

    List<WeixinWeight> selectByExample(WeixinWeightExample example);

    WeixinWeight selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") WeixinWeight record, @Param("example") WeixinWeightExample example);

    int updateByExample(@Param("record") WeixinWeight record, @Param("example") WeixinWeightExample example);

    int updateByPrimaryKeySelective(WeixinWeight record);

    int updateByPrimaryKey(WeixinWeight record);

    WeixinWeight selectByLocalMonth(String yearMonth);
}