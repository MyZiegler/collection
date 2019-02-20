package com.ebzhi.bangdan.mapper;

import com.ebzhi.bangdan.entity.JianchaUnit;
import com.ebzhi.bangdan.entity.JianchaUnitExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface JianchaUnitMapper {
    int countByExample(JianchaUnitExample example);

    int deleteByExample(JianchaUnitExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(JianchaUnit record);

    int insertSelective(JianchaUnit record);

    List<JianchaUnit> selectByExample(JianchaUnitExample example);

    JianchaUnit selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") JianchaUnit record, @Param("example") JianchaUnitExample example);

    int updateByExample(@Param("record") JianchaUnit record, @Param("example") JianchaUnitExample example);

    int updateByPrimaryKeySelective(JianchaUnit record);

    int updateByPrimaryKey(JianchaUnit record);
}