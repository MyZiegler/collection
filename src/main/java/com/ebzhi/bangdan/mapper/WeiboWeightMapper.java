package com.ebzhi.bangdan.mapper;

import com.ebzhi.bangdan.entity.WeiboWeight;
import com.ebzhi.bangdan.entity.WeiboWeightExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface WeiboWeightMapper {
    int countByExample(WeiboWeightExample example);

    int deleteByExample(WeiboWeightExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(WeiboWeight record);

    int insertSelective(WeiboWeight record);

    List<WeiboWeight> selectByExample(WeiboWeightExample example);

    WeiboWeight selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") WeiboWeight record, @Param("example") WeiboWeightExample example);

    int updateByExample(@Param("record") WeiboWeight record, @Param("example") WeiboWeightExample example);

    int updateByPrimaryKeySelective(WeiboWeight record);

    int updateByPrimaryKey(WeiboWeight record);

    WeiboWeight selectByLocalMonth(String yearMonth);
}