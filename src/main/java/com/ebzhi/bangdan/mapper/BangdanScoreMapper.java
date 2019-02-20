package com.ebzhi.bangdan.mapper;

import com.ebzhi.bangdan.entity.BangdanScore;
import com.ebzhi.bangdan.entity.BangdanScoreExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface BangdanScoreMapper {
    int countByExample(BangdanScoreExample example);

    int deleteByExample(BangdanScoreExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(BangdanScore record);

    int insertSelective(BangdanScore record);

    List<BangdanScore> selectByExample(BangdanScoreExample example);

    BangdanScore selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") BangdanScore record, @Param("example") BangdanScoreExample example);

    int updateByExample(@Param("record") BangdanScore record, @Param("example") BangdanScoreExample example);

    int updateByPrimaryKeySelective(BangdanScore record);

    int updateByPrimaryKey(BangdanScore record);
}