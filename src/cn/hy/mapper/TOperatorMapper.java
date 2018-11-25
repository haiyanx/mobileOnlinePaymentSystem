package cn.hy.mapper;

import cn.hy.pojo.TOperator;
import cn.hy.pojo.TOperatorExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TOperatorMapper {
    int countByExample(TOperatorExample example);

    int deleteByExample(TOperatorExample example);

    int deleteByPrimaryKey(String operatorId);

    int insert(TOperator record);

    int insertSelective(TOperator record);

    List<TOperator> selectByExample(TOperatorExample example);

    TOperator selectByPrimaryKey(String operatorId);

    int updateByExampleSelective(@Param("record") TOperator record, @Param("example") TOperatorExample example);

    int updateByExample(@Param("record") TOperator record, @Param("example") TOperatorExample example);

    int updateByPrimaryKeySelective(TOperator record);

    int updateByPrimaryKey(TOperator record);
}